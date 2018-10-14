package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.createaddress.DataInput;

@Component(value="createAddressRoute")
public class CreateAddressRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {

	    rest("/createAddress")
    	.post("/")
    	.description("Servicio para invocar a WS SOAP CreateAddress")
    	.type(DataInput.class)
    	.outType(String.class)
    	.consumes("application/json")
    	.produces("text/plain")
    	.to("direct:CreateAddress");	
	    
	    from("direct:CreateAddress")
    	.handleFault()
	    .log("${body}")
	    .setProperty("completeRequest",simple("${body}"))
	    //.log("(!) post guardado completeRequest")
	    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
	    //.log("(!) post serializado")
	    .setBody(simple("${body.header}"))
	    //.log("(!) pre envio a procesa header")
	    .process("commonHeaderPrepare")
	    //.log("(!) post envio a procesa header")		
	    .setBody(simple("${property.completeRequest}"))
	    .log("BODY PRE VM -> ${body}")
	    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
	    .to("velocity:CreateAddress_Req.vm")
	    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
	    .log("BODY IDA -> ${body}")
	    .log("DESTINO: -> {{soap.remote.CreateAddressOp.ep}} ACCION: -> {{soap.remote.CreateAddressOp.action}} ")
    	.to("spring-ws:{{soap.remote.CreateAddressOp.ep}}?soapAction={{soap.remote.CreateAddressOp.action}}")
    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
    	.log("BODY VUELTA -> ${body}")  
    	.marshal().xmljson(super.getXmlJsonOptions())
    	.log("BODY RECONVERTIDO -> ${body}")
    	.to("jolt:CreateAddress_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
    	.log("BODY REFORMATEADO -> ${body}")
        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		    
		
	}

}
