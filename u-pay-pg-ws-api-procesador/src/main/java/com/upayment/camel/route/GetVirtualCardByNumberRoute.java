package com.upayment.camel.route;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;
import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.getvirtualcard.DataInputByContract;
import com.upayments.pg.caja.api.io.soap.getvirtualcard.DataInputByNumber;

@Component(value="getVirtualCardByNumberRoute")
public class GetVirtualCardByNumberRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
		
	    rest("/getVirtualCard/number")
	    	.post("/")
	    	.description("Servicio para invocar a WS SOAP GetVirtualCard (ByNumber)")
	    	.type(DataInputByNumber.class)
	    	.outType(String.class)
	    	.consumes("application/json")
	    	.produces("text/plain")
	    	.to("direct:GetVirtualCardByNumber");	
	    
	    from("direct:GetVirtualCardByNumber")
	    	.handleFault()
		    .log("${body}")
		    .setProperty("completeRequest",simple("${body}"))
		    .log("(!) post guardado completeRequest")
		    .unmarshal().json(JsonLibrary.Jackson, DataInputByNumber.class)
		    .log("(!) post serializado")
		    .setBody(simple("${body.header}"))
		    .log("(!) pre envio a procesa header")
		    .process("commonHeaderPrepare")
		    .log("(!) post envio a procesa header")		
		    .setBody(simple("${property.completeRequest}"))
		    .log("BODY PRE VM -> ${body}")
		    .unmarshal().json(JsonLibrary.Jackson, DataInputByNumber.class)
		    .to("velocity:GetVirtualCardByNumber_Req.vm")
		    .log("HEADER IDA -> ${in.header.CamelSpringWebServiceSoapHeader}")
		    .log("BODY IDA -> ${body}")
		    .log("DESTINO: -> {{soap.remote.GetVirtualCardByNumberOp.ep}} ACCION: -> {{soap.remote.GetVirtualCardByNumberOp.action}} ")
	    	.to("spring-ws:{{soap.remote.GetVirtualCardByNumberOp.ep}}?soapAction={{soap.remote.GetVirtualCardByNumberOp.action}}")
	    	.log("HTTP RESPONSE DE VUELTA -> ${header.CamelHttpResponseCode} ")
	    	.log("BODY VUELTA -> ${body}")  
	    	
	    	.convertBodyTo(String.class) //Para pasar XML por convertidor XSLT, debe entrar como String
	    	.setHeader("retCode", constant("ASDF"))	
	    	.setHeader("retMsg", constant("ASDF"))
	    	.setHeader("failPoint", constant("ASDF"))
	    	.to("xslt:GetVirtualCardByNumber_Body_Rsp.xsl") //Por defecto, output es string
	    	.log("BODY VUELTA POST XSLT-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:GetVirtualCardByNumber_Aux_Rsp.xsl")
	    	.log("BODY VUELTA POST XSLT 2-> ${body}")  	
	    	
	    	.convertBodyTo(String.class)
	    	.to("xslt:Remove-Namespaces.xsl")
	    	.log("BODY VUELTA POST XSLT 3-> ${body}")  	
	    	
	    	.marshal().xmljson(super.getXmlJsonOptions())
	    	.log("BODY RECONVERTIDO -> ${body}")

	        .setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_200));		   	    
		
	}

}
