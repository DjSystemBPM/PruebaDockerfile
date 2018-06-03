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

package com.multiva.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;

import com.multiva.dto.request.esb.DatosBasicosRequest;
import com.multiva.dto.response.esb.DatosBasicosRespose;
import com.multiva.dto.response.esb.ListaDirecciones;
import com.multiva.dto.response.esb.ListaEmails;
import com.multiva.dto.response.esb.ListaTelefonos;
import com.multiva.ticket.TicketResponse;
import com.multiva.ws.client.WSCUSEGETINFOCUSTOMERResponse;

/**
 * 
 * @author : Ing. Alfredo Cuevas Barrera
 * @email : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_Basicos_Cliente
 * @package : com.multiva.beans
 * @class : RequestFactory.java
 * @version : 1.0.0
 * @since : 09/01/2018
 * @doc : Clase de utilidades y de recuperacion de request y response de las
 *      invocaciones de las rutas camel
 *
 */
public class RequestFactory {

	/**
	 * 
	 * @method : saveBodyOnProps
	 * @params : @param message
	 * @params : @return
	 * @retorn : DatosBasicosRequest
	 * @exception :
	 * @since : 09/01/2018
	 * @doc : Salva el request en un properties del exchange
	 *
	 */
	public DatosBasicosRequest saveBodyOnProps(Exchange message) {

		DatosBasicosRequest request = message.getIn().getBody(DatosBasicosRequest.class);

		message.setProperty("request", request);

		return request;
	}

	/**
	 * 
	 * @method : restoreRequest
	 * @params : @param message
	 * @params : @return
	 * @retorn : DatosBasicosRequest
	 * @exception :
	 * @since : 09/01/2018
	 * @doc : Regresa el request a la clase que lo invoca
	 *
	 */
	public DatosBasicosRequest restoreRequest(Exchange message) {

		return (DatosBasicosRequest) message.getProperty("request");
	}

	/**
	 * 
	 * @method : errorResponse
	 * @params : @param exchange
	 * @retorn : void
	 * @exception :
	 * @since : 08/01/2018
	 * @doc : Atrapa los mensajes de error y los prepara al cliente dependiendo
	 *      de donde provengan.
	 *
	 */
	public void errorResponse(Exchange exchange) {

		Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		DatosBasicosRespose datosBasicosResponse = new DatosBasicosRespose();
		datosBasicosResponse.setEstatus("");
		datosBasicosResponse.setNombre("");
		datosBasicosResponse.setNumCliente(0L);
		List<ListaDirecciones> listaDirecciones = new ArrayList<>();
		datosBasicosResponse.setListaDirecciones(listaDirecciones);
		List<ListaEmails> listaEmails = new ArrayList<>();
		datosBasicosResponse.setListaEmails(listaEmails);
		List<ListaTelefonos> listaTelefonos = new ArrayList<>();
		datosBasicosResponse.setListaTelefonos(listaTelefonos);
		if (cause instanceof Exception) {
			datosBasicosResponse.setResponseStatus(400L);
			datosBasicosResponse.setResponseError("Excepcion: " + cause.getMessage());
		} else if (exchange.getIn().getBody() instanceof TicketResponse) {
			TicketResponse ticketResponse = exchange.getIn().getBody(TicketResponse.class);
			datosBasicosResponse.setResponseStatus(ticketResponse.getResponseStatus());
			datosBasicosResponse.setResponseError(ticketResponse.getResponseError());
		} else if (exchange.getIn().getBody() instanceof WSCUSEGETINFOCUSTOMERResponse) {
			datosBasicosResponse.setResponseStatus(400L);
			datosBasicosResponse.setResponseError("No se encontraron registros.");
		}

		exchange.getOut().setHeader("Content-Type", "application/json");
		exchange.getOut().setHeader(Exchange.HTTP_METHOD, "POST");
		exchange.getOut().setBody(datosBasicosResponse);
	}

}
