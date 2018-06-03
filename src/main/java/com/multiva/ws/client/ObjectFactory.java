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

package com.multiva.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.multiva.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _WSCUSEGETINFOCUSTOMER_QNAME = new QName("http://temenos.com/T24.TWS.CUSTOMER", "WSCUSEGETINFOCUSTOMER");
    private static final QName _WSCUSEGETINFOCUSTOMERResponse_QNAME = new QName("http://temenos.com/T24.TWS.CUSTOMER", "WSCUSEGETINFOCUSTOMERResponse");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombre_QNAME = new QName("", "Nombre");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelDomicilio_QNAME = new QName("", "TelDomicilio");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApMaterno_QNAME = new QName("", "ApMaterno");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEmail_QNAME = new QName("", "Email");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelOficina_QNAME = new QName("", "CvePaisTelOficina");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeColonia_QNAME = new QName("", "Colonia");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPostal_QNAME = new QName("", "CodigoPostal");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPromotor_QNAME = new QName("", "CodigoPromotor");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumInterior_QNAME = new QName("", "NumInterior");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelCelular_QNAME = new QName("", "TelCelular");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeRFC_QNAME = new QName("", "RFC");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEstado_QNAME = new QName("", "Estado");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelDomicilio_QNAME = new QName("", "CvePaisTelDomicilio");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNoCliente_QNAME = new QName("", "NoCliente");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypePais_QNAME = new QName("", "Pais");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeIdSucursal_QNAME = new QName("", "IdSucursal");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCiudad_QNAME = new QName("", "Ciudad");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApPaterno_QNAME = new QName("", "ApPaterno");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelOficina_QNAME = new QName("", "CodAreaTelOficina");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelDomicilio_QNAME = new QName("", "CodAreaTelDomicilio");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelCelular_QNAME = new QName("", "CvePaisTelCelular");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeMunicipio_QNAME = new QName("", "Municipio");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelCelular_QNAME = new QName("", "CodAreaTelCelular");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeSucursal_QNAME = new QName("", "Sucursal");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumExterior_QNAME = new QName("", "NumExterior");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeLugNacimiento_QNAME = new QName("", "LugNacimiento");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelOficina_QNAME = new QName("", "TelOficina");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombrePromotor_QNAME = new QName("", "NombrePromotor");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCalle_QNAME = new QName("", "Calle");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeVIP_QNAME = new QName("", "VIP");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTipoPersona_QNAME = new QName("", "TipoPersona");
    private static final QName _BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeFecNacimiento_QNAME = new QName("", "FecNacimiento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.multiva.ws.client
     * 
     */
    public ObjectFactory() {
		super();
	}

    /**
     * Create an instance of {@link BMVTWSEINFOGRALCLIENTEType }
     * 
     */
    public BMVTWSEINFOGRALCLIENTEType createBMVTWSEINFOGRALCLIENTEType() {
        return new BMVTWSEINFOGRALCLIENTEType();
    }

   

	/**
     * Create an instance of {@link BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType }
     * 
     */
    public BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailType() {
        return new BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType();
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link WSCUSEGETINFOCUSTOMER }
     * 
     */
    public WSCUSEGETINFOCUSTOMER createWSCUSEGETINFOCUSTOMER() {
        return new WSCUSEGETINFOCUSTOMER();
    }

    /**
     * Create an instance of {@link WSCUSEGETINFOCUSTOMERResponse }
     * 
     */
    public WSCUSEGETINFOCUSTOMERResponse createWSCUSEGETINFOCUSTOMERResponse() {
        return new WSCUSEGETINFOCUSTOMERResponse();
    }

    /**
     * Create an instance of {@link WebRequestCommon }
     * 
     */
    public WebRequestCommon createWebRequestCommon() {
        return new WebRequestCommon();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link EnquiryInputCollection }
     * 
     */
    public EnquiryInputCollection createEnquiryInputCollection() {
        return new EnquiryInputCollection();
    }

    /**
     * Create an instance of {@link EnquiryInput }
     * 
     */
    public EnquiryInput createEnquiryInput() {
        return new EnquiryInput();
    }

    /**
     * Create an instance of {@link BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType }
     * 
     */
    public BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailType() {
        return new BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCUSEGETINFOCUSTOMER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/T24.TWS.CUSTOMER", name = "WSCUSEGETINFOCUSTOMER")
    public JAXBElement<WSCUSEGETINFOCUSTOMER> createWSCUSEGETINFOCUSTOMER(WSCUSEGETINFOCUSTOMER value) {
        return new JAXBElement<>(_WSCUSEGETINFOCUSTOMER_QNAME, WSCUSEGETINFOCUSTOMER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCUSEGETINFOCUSTOMERResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/T24.TWS.CUSTOMER", name = "WSCUSEGETINFOCUSTOMERResponse")
    public JAXBElement<WSCUSEGETINFOCUSTOMERResponse> createWSCUSEGETINFOCUSTOMERResponse(WSCUSEGETINFOCUSTOMERResponse value) {
        return new JAXBElement<>(_WSCUSEGETINFOCUSTOMERResponse_QNAME, WSCUSEGETINFOCUSTOMERResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nombre", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombre(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombre_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelDomicilio", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelDomicilio(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelDomicilio_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ApMaterno", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApMaterno(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApMaterno_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEmail(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEmail_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CvePaisTelOficina", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelOficina(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelOficina_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Colonia", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeColonia(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeColonia_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodigoPostal", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPostal(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPostal_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodigoPromotor", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPromotor(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodigoPromotor_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumInterior", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumInterior(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumInterior_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelCelular", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelCelular(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelCelular_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RFC", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeRFC(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeRFC_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Estado", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEstado(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeEstado_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CvePaisTelDomicilio", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelDomicilio(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelDomicilio_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NoCliente", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNoCliente(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNoCliente_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pais", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypePais(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypePais_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IdSucursal", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeIdSucursal(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeIdSucursal_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ciudad", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCiudad(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCiudad_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ApPaterno", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApPaterno(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeApPaterno_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodAreaTelOficina", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelOficina(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelOficina_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodAreaTelDomicilio", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelDomicilio(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelDomicilio_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CvePaisTelCelular", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelCelular(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCvePaisTelCelular_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Municipio", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeMunicipio(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeMunicipio_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodAreaTelCelular", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelCelular(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCodAreaTelCelular_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sucursal", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeSucursal(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeSucursal_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumExterior", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumExterior(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNumExterior_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LugNacimiento", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeLugNacimiento(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeLugNacimiento_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TelOficina", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelOficina(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTelOficina_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NombrePromotor", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombrePromotor(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeNombrePromotor_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Calle", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCalle(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeCalle_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VIP", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeVIP(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeVIP_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TipoPersona", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTipoPersona(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeTipoPersona_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FecNacimiento", scope = BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class)
    public JAXBElement<String> createBMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeFecNacimiento(String value) {
        return new JAXBElement<>(_BMVTWSEINFOGRALCLIENTETypeGBMVTWSEINFOGRALCLIENTEDetailTypeMBMVTWSEINFOGRALCLIENTEDetailTypeFecNacimiento_QNAME, String.class, BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType.class, value);
    }

}
