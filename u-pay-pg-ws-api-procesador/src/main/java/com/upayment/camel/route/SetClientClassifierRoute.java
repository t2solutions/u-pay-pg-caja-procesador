package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;

import com.upayments.pg.caja.api.io.soap.setclientclassifier.DataInput;

@Component(value="SetClientClassifierRoute")
public class SetClientClassifierRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/setClientClassifier")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP SetClientClassifier")
	    	.type(DataInput.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:SetClientClassifier");	
	    
	    from("direct:SetClientClassifier")
	    	.handleFault()	    	
		    .setProperty("completeRequest",simple("${body}"))
		    
		    //.log("(!) post guardado completeRequest")
		    //.unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    //.log("(!) post serializado")
		    //.setBody(simple("${body.header}"))
		    //.log("(!) pre envio a procesa header")
		    //.process("commonHeaderPrepare")
		    //.log("(!) post envio a procesa header")		    	
		    //.setBody(simple("${property.completeRequest}"))
	    		    	
		    .setProperty("completeRequest",simple("${body}"))
		    .log("(!) post guardado completeRequest")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .log("(!) post serializado")		    
		    .process("emptyHeaderPrepare")
		    .log("(!) post envio a procesa header")		
		    .setBody(simple("${property.completeRequest}"))
		    .log("BODY PRE VM -> ${body}")
		    .unmarshal().json(JsonLibrary.Jackson, DataInput.class)
		    .to("velocity:SetClientClassifier_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.SetClientClassifierOp.ep}} ACCION: -> {{soap.remote.SetClientClassifierOp.action}} ")
	    	.to("spring-ws:{{soap.remote.SetClientClassifierOp.ep}}?soapAction={{soap.remote.SetClientClassifierOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	.convertBodyTo(String.class) //Para pasar XML por convertidor XSLT, debe entrar como String
	    	
	    	.to("xslt:SetClientClassifier_Body_Rsp.xsl") //Por defecto, output es string
	    	.log("BODY VUELTA POST XSLT-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:SetClientClassifier_Aux_Rsp.xsl")
	    	.log("BODY VUELTA POST XSLT 2-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:Remove-Namespaces.xsl")
	    	.log("BODY VUELTA POST XSLT 3-> ${body}")  	
	    	
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")
	    	
	    	//.convertBodyTo(String.class)  //Body is instance of org.apache.camel.StreamCache -> a String B
	    	//.marshal().json(JsonLibrary.Jackson, DataOutput.class) B
	    	//.convertBodyTo(StreamCache.class)  B
	    	
	    	//.convertBodyTo(String.class, ConstantesCamel.UTF_8)
	    	//.convertBodyTo(String.class)  //Body is instance of org.apache.camel.StreamCache -> a String
	    	//.to("jolt:GetAddresses_Body_Rsp.json?inputType=JsonString&outputType=JsonString") //&transformDsl=Shiftr
	    	//.log("BODY REFORMATEADO -> ${body}")
	    	//.setHeader(ConstantesCamel.CONTENT_TYPE,constant(ConstantesCamel.JSON))
	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
