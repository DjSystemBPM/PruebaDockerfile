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

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.multiva.dto.request.esb.DatosBasicosRequest;
import com.multiva.utils.T24;
import com.multiva.ws.client.EnquiryInput;
import com.multiva.ws.client.EnquiryInputCollection;
import com.multiva.ws.client.WSCUSEGETINFOCUSTOMER;
import com.multiva.ws.client.WebRequestCommon;

/**
 * 
 *
 * @author : Ing. Alfredo Cuevas Barrera
 * @email : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_BasicosCliente_Os
 * @package : com.multiva.processors
 * @class : DatosBasicosT24RequestProcessor.java
 * @version : 1.0.0
 * @since : 16/09/2017
 * @doc : Clase que prepara la invocacion al core T24
 *
 */
public class DatosBasicosT24Request implements Processor {

	/**
	 * 
	 * @method : process
	 * @params : @param exchange
	 * @exception :
	 *                Exception
	 * @since : 14/09/2017
	 * @doc : Prepara el request hacia el core T24 desde el ESB
	 *
	 */
	@Override
	public void process(Exchange exchange) throws Exception {

		DatosBasicosRequest requestEsb = exchange.getIn().getBody(DatosBasicosRequest.class);
		WSCUSEGETINFOCUSTOMER request = new WSCUSEGETINFOCUSTOMER();
		request.setWebRequestCommon(
				new WebRequestCommon(null, T24.CONFIG.getPassword(exchange), T24.CONFIG.getUser(exchange)));
		EnquiryInput enquiryInput = new EnquiryInput();
		List<EnquiryInputCollection> listEnquiryInputCollection = new ArrayList<>();
		listEnquiryInputCollection.add(new EnquiryInputCollection(T24.CONFIG.getColumn(exchange),
				requestEsb.getIdPersona().toString(), T24.CONFIG.getOperand(exchange)));
		enquiryInput.setEnquiryInputCollection(listEnquiryInputCollection);
		request.setBMVTWSEINFOGRALCLIENTEType(enquiryInput);

		exchange.getOut().setBody(request);

	}
}
