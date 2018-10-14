package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.createclient.DataInput;

@Component(value="createClientRoute")
public class CreateClientRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/createClient")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP CreateClient")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:CreateClient");	
	    
	    from("direct:CreateClient")
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
		    .to("velocity:CreateClient_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.CreateClientOp.ep}} ACCION: -> {{soap.remote.CreateClientOp.action}} ")
	    	.to("spring-ws:{{soap.remote.CreateClientOp.ep}}?soapAction={{soap.remote.CreateClientOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")
	    	.to("jolt:CreateClient_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
	    	.log("BODY REFORMATEADO -> ${body}")
	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
