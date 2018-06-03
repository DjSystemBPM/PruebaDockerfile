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
package com.multiva.test;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multiva.dto.request.esb.DatosBasicosRequest;
import com.multiva.dto.request.esb.Ticket;

/**
 *
 * @author : Ing. Alfredo Cuevas Barrera
 * @email : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_Basicos_Cliente
 * @package : com.multiva.test
 * @class : CamelContextXmlTest.java
 * @version : 1.0.0
 * @since : 08/12/2017
 * @doc :
 *
 */
public class CamelContextXmlTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:ruta-inicio")
	protected ProducerTemplate inputEndpoint;

	@EndpointInject(uri = "mock:output")
	protected MockEndpoint outputEndpoint;

	@Test
	public void test_Camel_Route_Complete() throws Exception {
		log.info("Inicia el Test de la Ruta >>>>>>>>> ");
		for (Object expectedBody : jsonObject()) {
			inputEndpoint.sendBody(expectedBody);
		}
		assertMockEndpointsSatisfied();

		assertNotNull(context.hasEndpoint("mock:output"));
		log.info("<<<<<<<<< Termina el Test de la Ruta");
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}

	private static Object[] jsonObject() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		DatosBasicosRequest request = new DatosBasicosRequest();
		request.setIdPersona(TestConstantes.IDPERSONA);
		Ticket ticket = new Ticket();
		ticket.setIdUser(TestConstantes.IDUSER);
		ticket.setIdCreds(TestConstantes.IDCREDS);
		request.setTicket(ticket);
		request.setCanal(TestConstantes.CANAL);
		Object[] expectedBodieRuta = { mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request) };
		return expectedBodieRuta;
	}

}

interface TestConstantes {
	public Long IDPERSONA = 1000457873L;
	public String IDUSER = "1000836363";
	public String IDCREDS = "1_29hRZ4kk4yrXMafE/EUtK2fUy3oYFaTeL/uZ/m4/N04RYXAJ7Zc=_AAAAAAA=_gPexwyII/VK7bJE53u0BFJkagAg=";
	public String CANAL = "MVNET";

}
