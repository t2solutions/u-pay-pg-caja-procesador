package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.createsupplementarycard.DataInput;

@Component(value="createSupplementaryCardRoute")
public class CreateSupplementaryCardRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/createSupplementaryCard")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP CreateSupplementaryCard")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:CreateSupplementaryCard");	
	    
	    from("direct:CreateSupplementaryCard")
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
		    .to("velocity:CreateSupplementaryCard_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.CreateSupplementaryCardOp.ep}} ACCION: -> {{soap.remote.CreateSupplementaryCardOp.action}} ")
	    	.to("spring-ws:{{soap.remote.CreateSupplementaryCardOp.ep}}?soapAction={{soap.remote.CreateSupplementaryCardOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")
	    	.to("jolt:CreateSupplementaryCard_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
	    	.log("BODY REFORMATEADO -> ${body}")
	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
