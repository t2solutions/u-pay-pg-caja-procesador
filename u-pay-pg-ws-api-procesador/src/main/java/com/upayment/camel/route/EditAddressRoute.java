package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.editaddress.DataInput;

@Component(value="editAddressRoute")
public class EditAddressRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/editAddress")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP EditAddress")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:EditAddress");	
	    
	    from("direct:EditAddress")
	    	.handleFault()
		    .setProperty("completeRequest",simple("${body}"))
		    .log("(!) post guardado completeRequest")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .log("(!) post serializado")
		    .process("emptyHeaderPrepare")
		    .log("(!) post envio a procesa header")		    		    
		    .log("BODY PRE VM -> ${body}")
		    .to("velocity:EditAddress_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.EditAddressOp.ep}} ACCION: -> {{soap.remote.EditAddressOp.action}} ")
	    	.to("spring-ws:{{soap.remote.EditAddressOp.ep}}?soapAction={{soap.remote.EditAddressOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")
	    	.to("jolt:EditAddress_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
	    	.log("BODY REFORMATEADO -> ${body}")
	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
