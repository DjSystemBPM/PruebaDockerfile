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

package com.multiva.utils;

/**
 * 
 * @author : Ing. Alfredo Cuevas Barrera
 * @project : Multiva_ESB_01_Consulta_Datos_Basicos_Cliente
 * @package : com.multiva.utils
 * @class : Constantes.java
 * @version : 1.0.0
 * @since : 09/03/2018
 * @doc : Interfaz de constantes
 *
 */
public enum Constantes {
	
	ESTATUS("CLIENTE"), CALLE("CALLE: "), NUMEXT(" NUMERO EXTERIOR: "), NUMINT(" NUMERO INTERIOR: "), TIPODIR(
			"TIPO DIRECCION"), TELDOM("DOMICILIO"), TELCEL("CELULAR"), TELOFC("OFICINA"), TIPOEMAIL("PERSONAL");

	private final String text;

	/**
	 * @param text
	 */
	Constantes(final String text) {
		this.text = text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return text;
	}
}
