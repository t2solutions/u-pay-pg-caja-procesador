package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.namelesscardassignment.DataInput;

@Component(value="namelessCardAssignment")
public class NamelessCardAssignmentRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/namelessCardAssignment")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP NamelessCardAssignment")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:NamelessCardAssignment");	
	    
	    from("direct:NamelessCardAssignment")
	    	.handleFault()
		    .log("${body}")
		    .setProperty("completeRequest",simple("${body}"))
		    .log("(!) post guardado completeRequest")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .log("(!) post serializado")
		    .setBody(simple("${body.header}"))
		    .log("(!) pre envio a procesa header")
		    .process("commonHeaderPrepare")
		    .log("(!) post envio a procesa header")		
		    .setBody(simple("${property.completeRequest}"))
		    .log("BODY PRE VM -> ${body}")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .to("velocity:NamelessCardAssignment_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.NamelessCardAssignment.ep}} ACCION: -> {{soap.remote.NamelessCardAssignment.action}} ")
	    	.to("spring-ws:{{soap.remote.NamelessCardAssignment.ep}}?soapAction={{soap.remote.NamelessCardAssignment.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	
	    	.convertBodyTo(String.class) //Para pasar XML por convertidor XSLT, debe entrar como String
	    	.setHeader("retCode", constant(""))	
	    	.setHeader("retMsg", constant(""))
	    	.to("xslt:NamelessCardAssignment_Body_Rsp.xsl") //Por defecto, output es string
	    	.log("BODY VUELTA POST XSLT-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:NamelessCardAssignment_Aux_Rsp.xsl")
	    	.log("BODY VUELTA POST XSLT 2-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:Remove-Namespaces.xsl")
	    	.log("BODY VUELTA POST XSLT 3-> ${body}")  	
	    	
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")

	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
