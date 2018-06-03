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

package com.multiva.dto.response.esb;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 *
 * @author  : Ing. Alfredo Cuevas Barrera
 * @email   : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_Basicos_Cliente
 * @package : com.multiva.dto.response.esb
 * @class   : DatosBasicosRespose.java
 * @version : 1.0.0
 * @since   : 08/01/2018
 * @doc     : Pojo de response desde el ESB.
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatosBasicosRespose {
	@JsonProperty("numCliente")
	private Long numCliente;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("listaDirecciones")
	private List<ListaDirecciones> listaDirecciones;
	@JsonProperty("rfc")
	private String rfc;
	@JsonProperty("listaTelefonos")
	private List<ListaTelefonos> listaTelefonos;
	@JsonProperty("listaEmails")
	private List<ListaEmails> listaEmails;
	@JsonProperty("tipoPersona")
	private String tipoPersona;
	@JsonProperty("estatus")
	private String estatus;
	@JsonProperty("sucursal")
	private String sucursal;
	@JsonProperty("vip")
	private String vip;
	@JsonProperty("responseStatus")
	private Long responseStatus;
	@JsonProperty("responseError")
	private String responseError;

}
