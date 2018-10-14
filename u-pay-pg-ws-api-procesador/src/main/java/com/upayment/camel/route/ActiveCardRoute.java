package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.activatecard.DataInput;

@Component(value="activeCardRoute")
public class ActiveCardRoute extends RestRouteBuilder {
	
	@Override
	public void configure() throws Exception {
		
    rest("/activeCard")
    	.post("/")
    	.description("Servicio para invocar a WS SOAP ActiveCard")
    	.type(DataInput.class)
    	.outType(String.class)
    	.consumes("application/json")
    	.produces("text/plain")
    	.to("direct:ActiveCard");
    

    from("direct:ActiveCard")
    	.handleFault()
	    .log("${body}")
	    .setProperty("completeRequest",simple("${body}"))
	    //.log("(!) post guardado completeRequest")
	    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
	    //.log("(!) post serializado")
	    .setBody(simple("${body.header}"))
	    //.log("(!) pre envio a procesa header"
	    .process("commonHeaderPrepare")
	    //.log("(!) post envio a procesa header")		
	    .setBody(simple("${property.completeRequest}"))
	    .log("BODY PRE VM -> ${body}")
	    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
	    .to("velocity:ActivateCard_Req.vm")
	    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
	    .log("BODY IDA -> ${body}")
	    .log("DESTINO: -> {{soap.remote.activeCard.ep}} ACCION: -> {{soap.remote.activeCard.action}} ")
    	.to("spring-ws:{{soap.remote.activeCard.ep}}?soapAction={{soap.remote.activeCard.action}}")
    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
    	.log("BODY VUELTA -> ${body}")  
    	//.marshal().xmljson()
    	.marshal().xmljson(super.getXmlJsonOptions())
    	.log("BODY RECONVERTIDO -> ${body}")
    	.to("jolt:ActivateCard_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
    	.log("BODY REFORMATEADO -> ${body}")
    	//DataOutput
    	//.unmarshal(new JacksonDataFormat(DataOutput.class))
    	
    	//.setBody(constant("Hi!"));
    	//.setBody(simple("${body.respuesta}"))
    	//.marshal().json(JsonLibrary.Jackson)	    	
    	//.setProperty("retCode", jsonpath("resp:RetCode", true))
    	
        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		
		
	}
	
	
	
	
	
	

}
