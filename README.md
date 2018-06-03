# Documentacion 

## 1. ESB Arquitectura - Ruta Datos Basicos T24

![Datos Basicos](http://10.160.83.76/ESB/multiva-esb-hlds/raw/master/Multiva_ESB_01_Consulta_Datos_Basicos_Cliente/src/main/resources/docs/CamelContext.jpg)

**Figura 1.1 - Interfaz que le permite consultar información de los clientes del core bancario T24 de Multiva.**

En esta documento se describe un servicio que se publicara para el uso de los diferentes clientes front del banco, el cual funciona de la siguiente manera:

 * El ESB recibe una peticion **JSon** del lado del cliente.
 * El ESB transforma esa peticion a **Object** para manejar los datos de entrada.
 * El ESB arma la peticion al servicio de **Tam** que valida el ticket de sesion.
 * Tam valida la sesion y regresa una respuesta de que tiene session el usuario.
 * Si la sesion es correcta el ESB continua si no se detiene, regresando una respuesta al cliente.
 * El ESB arma la peticion al servicio que va a invocar.
 * El ESB mediante el componente de **Camel "cxf:rsClient"** envia la peticion al servicio indicado.
 * T24 recibe la peticion y nos regresa la respuesta en formato **Soap Envelop**.
 * El ESB recibe esa respuesta y la convierte a un tipo **Object**.
 * El ESB procesa la respuesta y genera el **Response** indicado por el cliente.

## 2. Requests y Responses

 * **URL:** <HOST>:<PORT>/persona/consultaDatosBasicos
 * **Content-Type:** application/json
 * **HTTP Method:** POST

### 2.1. Request Client
**Ejemplo de Request hacia el ESB:**
```json
{
	"idPersona": 1000104401,
	"ticket": {
		"id_user"  : "1000104401",
		"id_creds" : "1_3UJz9XuZPevvpe/vrOHRz11LXXBqWxiWtEKxpUuAKkT8MttCu90=_AAAAAAA=_ZoNtQv04iJKGAMFDUrThZ/mIyhw="
	},
	"canal": "MVNET"
}
```

### 2.2. Request Core [Tam]
**Ejemplo de Request hacia Tam:**
```json
{
    "id_user":"1000104401",
    "id_creds":"1_3UJz9XuZPevvpe/vrOHRz11LXXBqWxiWtEKxpUuAKkT8MttCu90=_AAAAAAA=_ZoNtQv04iJKGAMFDUrThZ/mIyhw="
}
```

### 2.3. Response Core [Tam]
**Ejemplo de Response de Tam:**
```json
{
    "responseStatus":200,
    "responseError":""
}
```

### 2.4. Request Core [T24]
**Ejemplo de Request hacia T24:**
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ns2:Envelope xmlns:ns2="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns3="http://temenos.com/T24.TWS.CUSTOMER">
    <ns2:Body>
        <ns3:WSCUSEGETINFOCUSTOMER>
            <WebRequestCommon>
                <password>AB123456</password>
                <userName>ESBUSER</userName>
            </WebRequestCommon>
            <BMVTWSEINFOGRALCLIENTEType>
                <enquiryInputCollection>
                    <columnName>CUSTOMER.CODE</columnName>
                    <criteriaValue>1000457873</criteriaValue>
                    <operand>EQ</operand>
                </enquiryInputCollection>
            </BMVTWSEINFOGRALCLIENTEType>
        </ns3:WSCUSEGETINFOCUSTOMER>
    </ns2:Body>
</ns2:Envelope>
```


### 2.5. Response Core [T24]
**Ejemplo de Response de T24:**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:WSCUSEGETINFOCUSTOMERResponse xmlns:ns2="http://temenos.com/T24.TWS.CUSTOMER">
         <Status>
            <successIndicator>Success</successIndicator>
         </Status>
         <BMVTWSEINFOGRALCLIENTEType>
            <gBMVTWSEINFOGRALCLIENTEDetailType>
               <mBMVTWSEINFOGRALCLIENTEDetailType>
                  <NoCliente>1000457873</NoCliente>
                  <ApPaterno>SANDOVAL</ApPaterno>
                  <ApMaterno>TORRES</ApMaterno>
                  <Nombre>CARLOS ARTURO</Nombre>
                  <FecNacimiento>19851107</FecNacimiento>
                  <RFC>SATC851107BG1</RFC>
                  <LugNacimiento>DISTRITO FEDERAL</LugNacimiento>
                  <Calle>JAVIER MARTINEZ</Calle>
                  <NumExterior>716</NumExterior>
                  <NumInterior />
                  <Colonia>ESCUADRON 201</Colonia>
                  <Municipio>IZTAPALAPA</Municipio>
                  <CodigoPostal>09060</CodigoPostal>
                  <Estado>DISTRITO FEDERAL</Estado>
                  <Ciudad>CIUDAD DE MEXICO</Ciudad>
                  <Pais>Mexico</Pais>
                  <CvePaisTelDomicilio>52|52</CvePaisTelDomicilio>
                  <CodAreaTelDomicilio>55|55</CodAreaTelDomicilio>
                  <TelDomicilio>56578089|70376979</TelDomicilio>
                  <CvePaisTelOficina>52|52</CvePaisTelOficina>
                  <CodAreaTelOficina>55|55</CodAreaTelOficina>
                  <TelOficina>52846200|52845026</TelOficina>
                  <CvePaisTelCelular>52|52</CvePaisTelCelular>
                  <CodAreaTelCelular>55|55</CodAreaTelCelular>
                  <TelCelular>40850470|70402030</TelCelular>
                  <Email />
                  <TipoPersona>PF</TipoPersona>
                  <CodigoPromotor>101051742103003</CodigoPromotor>
                  <NombrePromotor>Ejecutivos Suc Corp Tecamachalco</NombrePromotor>
                  <VIP>0</VIP>
                  <IdSucursal>10105</IdSucursal>
                  <Sucursal>SUC TECAMACHALCO</Sucursal>
               </mBMVTWSEINFOGRALCLIENTEDetailType>
            </gBMVTWSEINFOGRALCLIENTEDetailType>
         </BMVTWSEINFOGRALCLIENTEType>
      </ns2:WSCUSEGETINFOCUSTOMERResponse>
   </S:Body>
</S:Envelope>
```

### 2.6. Response Client
**Ejemplo de Response del ESB:**
```json
{
   "numCliente": 1000457873,
   "nombre": "CARLOS ARTURO",
   "listaDirecciones": [
      {
         "direccion": "CALLE: JAVIER MARTINEZ NUMERO EXTERIOR: 716 NUMERO INTERIOR: ",
         "poblacion": "IZTAPALAPA",
         "ciudad": "CIUDAD DE MEXICO",
         "estado": "DISTRITO FEDERAL",
         "cp": "09060",
         "tipoDireccion": "TIPO DIRECCION"
      }
   ],
   "rfc": "SATC851107BG1",
   "listaTelefonos": [
      {
         "cvePais": 52,
         "codArea": 55,
         "telefono": 56578089,
         "tipoTelefono": "DOMICILIO"
      },
      {
         "cvePais": 52,
         "codArea": 55,
         "telefono": 40850470,
         "tipoTelefono": "CELULAR"
      },
      {
         "cvePais": 52,
         "codArea": 55,
         "telefono": 52846200,
         "tipoTelefono": "OFICINA"
      }
   ],
   "listaEmails": [
      {
         "mail": "",
         "activo": true,
         "tipoEmail": "PERSONAL"
      }
   ],
   "tipoPersona": "PF",
   "estatus": "CLIENTE",
   "sucursal": "SUC TECAMACHALCO",
   "vip": "0",
   "responseStatus": 200,
   "responseError": ""
}
```
## 3. Tecnologias

Fuse utiliza una serie de proyectos de código abierto para funcionar correctamente:

* **[Apache Camel]** - Es un motor de enrutamiento y mediación basado en reglas que provee una implementación basada en objetos Java de los patrones propuestos en _"Enterprise Integration Patterns"_, ya sea empleando una API o bien un lenguaje específico del dominio declarativo expresado en Java, para configurar las reglas de ruteo y mediación.
* **[Spring Boot]** - Spring Boot es la solución de convención sobre configuración de Spring para la creación de microservicios, en un esquema productivo.
* **[Red Hat JBoss Fuse Integration Services]** - Proporciona un conjunto de herramientas y de imágenes xPaaS en contenedores que permiten el desarrollo, la implementación y la administración de microservicios de integración dentro de OpenShift.
* **[Maven]** - Es una herramienta de automatización de compilación utilizada principalmente para proyectos de Java. Maven aborda dos aspectos de la construcción de software: primero, describe cómo se construye el software, y segundo, describe sus dependencias.

## 4. Instalacion

Fuse Standalone requiere [JDK 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) y tambien [Maven](https://maven.apache.org/download.cgi) para ejecutarse de forma correcta.

**Para ambientes de desarrollo:**
Levantar la interfaz dentro de la carpeta del proyecto donde se encuentra el archivo **Pom.xml**. ejecuta la siguiente instruccion:
```
$ mvn clean spring-boot:run
```
**Para ambientes productivos:**
Ingresar al server de Openshift de Multiva y sigue los siguientes pasos:

```
 $ oc login https://mmxmtzmaster1:8443  
 $ oc new-project nombreproyecto --display-name="Nombre Proyecto" --description="Descripcion Proyecto"  
 $ oc project nombreproyecto 
 $ oc secrets new misecretgitlab ssh-privatekey=/home/user/.ssh/llave_git 
 $ oc secrets add serviceaccount/builder secret/misecretgitlab   
 $ oc secrets link builder misecretgitlab 
 $ oc new-app registry.access.redhat.com/jboss-fuse-6/fis-java-openshift~git@<IP>:<Grupo>/<repositorio>.git --name=fis-nombre-proyecto --context-dir=Proyecto 
 $ oc set build-secret --source bc/fis-nombre-proyecto 	 
 $ oc start-build fis-nombre-proyecto 
 $ oc logs -f bc/fis-nombre-proyecto 
```

### Dependencias

Esta interfaz utiliza las dependencias que se describen a continuacion:

| Dependencia | Version |
| ------ | ------ |
| fabric8-project-bom-camel-spring-boot | 2.2.170.redhat-000010 |
| javax.inject | 1 |
| camel-spring-boot-starter | 2.18.1.redhat-000012 |
| spring-boot-starter-web | 1.4.1.RELEASE |
| spring-boot-starter-actuator | 1.4.1.RELEASE |
| camel-servlet-starter | camel-servlet-starter |
| camel-swagger-java-starter | 2.18.1.redhat-000012 |
| camel-jackson | 2.18.1.redhat-000012 | 
| camel-soap | 2.18.1.redhat-000012 |
| camel-gson | 2.18.1.redhat-000012 |
| camel-jaxb | 2.18.1.redhat-000012 |
| camel-cxf | 2.18.1.redhat-000012 |
| junit | 4.12 |
| spring-test | 4.3.3.RELEASE |
| spring-boot-starter-test | 1.4.1.RELEASE |
| arquillian-junit-container | 1.1.11.Final |
| fabric8-arquillian | 2.2.170.redhat-000010 |
| camel-netty-http | 2.18.1.redhat-000012 |
| lombok | 1.16.18 |

### ToDo

- Catalogo de Errores
- Corregir Swagger swagger.api.host
- Corregir Imagen Ruta

**Develop By:**  Legosoft S.A. de C.V.