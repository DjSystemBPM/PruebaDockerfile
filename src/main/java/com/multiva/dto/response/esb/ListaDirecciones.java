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

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 *
 * @author  : Ing. Alfredo Cuevas Barrera
 * @email   : acuevas@legosoft.com.mx
 * @project : Multiva_ESB_01_Consulta_Datos_BasicosCliente_Os
 * @package : com.multiva.model.response.pojo
 * @class   : ListaDirecciones.java
 * @version : 1.0.0
 * @since   : 16/09/2017
 * @doc     : Pojo de response desde el ESB. 
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListaDirecciones {
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("poblacion")
	private String poblacion;
	@JsonProperty("ciudad")
	private String ciudad;
	@JsonProperty("estado")
	private String estado;
	@JsonProperty("cp")
	private String cp;
	@JsonProperty("tipoDireccion")
	private String tipoDireccion;

}
