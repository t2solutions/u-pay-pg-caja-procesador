package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.getaddress.DataInput;

@Component(value="getAddressesRoute")
public class GetAddressesRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/getAddresses")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP GetAddresses")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:GetAddresses");	
	    
	    from("direct:GetAddresses")
	    	.handleFault()
		    .setProperty("completeRequest",simple("${body}"))
		    .log("(!) post guardado completeRequest")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .log("(!) post serializado")
		    .process("emptyHeaderPrepare")
		    .log("(!) post envio a procesa header")		    		    
		    .log("BODY PRE VM -> ${body}")
		    .to("velocity:GetAddresses_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.GetAddressesOp.ep}} ACCION: -> {{soap.remote.GetAddressesOp.action}} ")
	    	.to("spring-ws:{{soap.remote.GetAddressesOp.ep}}?soapAction={{soap.remote.GetAddressesOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")
	    	.to("jolt:GetAddresses_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
	    	.log("BODY REFORMATEADO -> ${body}")
	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
