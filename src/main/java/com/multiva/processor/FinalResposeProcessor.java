/*
 *
 * Copyright (c) 2017, Multiva SA de CV
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are not permitted.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * Developed 2017 by Legosoft www.legosoft.com.mx
 *
 */

package com.multiva.processor;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.multiva.dto.response.esb.DatosBasicosRespose;
import com.multiva.dto.response.esb.ListaDirecciones;
import com.multiva.dto.response.esb.ListaEmails;
import com.multiva.dto.response.esb.ListaTelefonos;
import com.multiva.utils.Constantes;
import com.multiva.utils.Utils;
import com.multiva.ws.client.WSCUSEGETINFOCUSTOMERResponse;

/**
 *
 *
 * @author  : Ing. Alfredo Cuevas Barrera
 * @email   : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_Basicos_Cliente
 * @package : com.multiva.processor
 * @class   : FinalResposeProcessor.java
 * @version : 1.0.0
 * @since   : 08/12/2017
 * @doc     : Clase que procesa la respuesta del servicio
 *
 */
public class FinalResposeProcessor implements Processor{

	/**
	 *
	 * @method    : process
	 * @params    : @param exchange
	 * @exception : Exception
	 * @since     : 14/09/2017
	 * @doc       : Prepara el response con los datos obtenidos desde el core T24
	 *
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		WSCUSEGETINFOCUSTOMERResponse respuestaT24 = exchange.getIn().getBody(WSCUSEGETINFOCUSTOMERResponse.class);

		DatosBasicosRespose response = new DatosBasicosRespose();

		List<ListaDirecciones> direcciones = new ArrayList<>();
		List<ListaTelefonos> telefonos = new ArrayList<>();
		List<ListaEmails> emails = new ArrayList<>();

		respuestaT24.getBMVTWSEINFOGRALCLIENTEType().forEach(loop1 ->
			loop1.getGBMVTWSEINFOGRALCLIENTEDetailType().getMBMVTWSEINFOGRALCLIENTEDetailType().forEach(values -> {
				response.setNumCliente(Long.valueOf(values.getNoCliente().getValue()));
				response.setNombre(values.getNombre().getValue());
				response.setRfc(values.getRFC().getValue());
				response.setTipoPersona(values.getTipoPersona().getValue());
				response.setEstatus(Constantes.ESTATUS.toString());
				response.setSucursal(values.getSucursal().getValue());
				response.setVip(values.getVIP().getValue());
				response.setResponseStatus(Long.valueOf(200));
				response.setResponseError("");


				ListaDirecciones listaDirecciones = new ListaDirecciones();
				StringBuilder direccion = new StringBuilder();
				direccion.append(Constantes.CALLE.toString()).append(values.getCalle().getValue());
				direccion.append(Constantes.NUMEXT.toString()).append(values.getNumExterior().getValue());
				direccion.append(Constantes.NUMINT.toString()).append(values.getNumInterior().getValue());
				listaDirecciones.setDireccion(direccion.toString());
				listaDirecciones.setPoblacion(values.getMunicipio().getValue());
				listaDirecciones.setCiudad(values.getCiudad().getValue());
				listaDirecciones.setEstado(values.getEstado().getValue());
				listaDirecciones.setCp(values.getCodigoPostal().getValue());
				listaDirecciones.setTipoDireccion(Constantes.TIPODIR.toString());
				direcciones.add(listaDirecciones);
				response.setListaDirecciones(direcciones);


				ListaTelefonos listaTelefonosDomicilio = new ListaTelefonos();
				listaTelefonosDomicilio.setCodArea(Integer.valueOf(Utils.substringCadena(values.getCodAreaTelDomicilio().getValue())));
				listaTelefonosDomicilio.setCvePais(Integer.valueOf(Utils.substringCadena(values.getCvePaisTelDomicilio().getValue())));
				listaTelefonosDomicilio.setTelefono(Long.valueOf(Utils.substringCadena(values.getTelDomicilio().getValue())));
				listaTelefonosDomicilio.setTipoTelefono(Constantes.TELDOM.toString());
				telefonos.add(listaTelefonosDomicilio);


				ListaTelefonos listaTelefonosCelular = new ListaTelefonos();
				listaTelefonosCelular.setCvePais(Integer.valueOf(Utils.substringCadena(values.getCvePaisTelCelular().getValue())));
				listaTelefonosCelular.setCodArea(Integer.valueOf(Utils.substringCadena(values.getCodAreaTelCelular().getValue())));
				listaTelefonosCelular.setTelefono(Long.valueOf(Utils.substringCadena(values.getTelCelular().getValue())));
				listaTelefonosCelular.setTipoTelefono(Constantes.TELCEL.toString());
				telefonos.add(listaTelefonosCelular);


				ListaTelefonos listaTelefonosOficina = new ListaTelefonos();
				listaTelefonosOficina.setCvePais(Integer.valueOf(Utils.substringCadena(values.getCvePaisTelOficina().getValue())));
				listaTelefonosOficina.setCodArea(Integer.valueOf(Utils.substringCadena(values.getCodAreaTelOficina().getValue())));
				listaTelefonosOficina.setTelefono(Long.valueOf(Utils.substringCadena(values.getTelOficina().getValue())));
				listaTelefonosOficina.setTipoTelefono(Constantes.TELOFC.toString());
				telefonos.add(listaTelefonosOficina);
				response.setListaTelefonos(telefonos);

				ListaEmails listaEmails = new ListaEmails();
				listaEmails.setMail(values.getEmail().getValue());
				listaEmails.setActivo(true);
				listaEmails.setTipoEmail(Constantes.TIPOEMAIL.toString());
				emails.add(listaEmails);
				response.setListaEmails(emails);
			}));

		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, MediaType.APPLICATION_JSON);
		exchange.getOut().setHeader(Exchange.HTTP_METHOD, "POST");
		exchange.getOut().setBody(response);
	}

}
