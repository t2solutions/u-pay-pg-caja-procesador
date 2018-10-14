package com.upayment.camel;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.upayment.camel.util.ConstantesCamel;
import com.upayments.pg.caja.api.io.soap.activatecard.DataOutput;


@Component
public abstract class RestRouteBuilder extends RouteBuilder {

    @Autowired
    CamelContext context;	
    
	@Value("${server.servlet.context-path}")
	private String contextPath;	
	
	@Value("${camel.component.restlet.port}")
	private String contextPort;
	
	@Value("${camel.soap.endpoint.hostname}")
	private String hostname;
	
	@Value("${soap.log.bodystream}")
	private String allowBodyLogging;
	
	private Map<String, String> xmlJsonOptions = new HashMap<>();
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void prepareRestRouteBuilder() {
		/* Prender y apagar log de bodystream */
		context.getProperties().put(Exchange.LOG_DEBUG_BODY_STREAMS, allowBodyLogging);

		System.out.println("Variables entorno a prueba: ");
		System.out.println("hostname="+this.getHostname());
		System.out.println("contextPort="+this.getContextPort());
		System.out.println("contextPath="+this.getContextPath());
		
		/*Workaround en microservice: JsonMappingException: No content to map due to end-of-input */
		context.setStreamCaching(true);
	
		xmlJsonOptions.put(org.apache.camel.model.dataformat.XmlJsonDataFormat.ENCODING, "UTF-8");
		xmlJsonOptions.put(org.apache.camel.model.dataformat.XmlJsonDataFormat.ROOT_NAME, "DATA");
		xmlJsonOptions.put(org.apache.camel.model.dataformat.XmlJsonDataFormat.SKIP_NAMESPACES, "false");
		xmlJsonOptions.put(org.apache.camel.model.dataformat.XmlJsonDataFormat.REMOVE_NAMESPACE_PREFIXES, "false");
		
		restConfiguration()
	        .component("jetty")
	        .host(this.getHostname()).port(this.getContextPort())
	        .contextPath(this.getContextPath())
	        //.dataFormatProperty("prettyPrint", "true")
	        //Permitir que Camel haga automaticamente el bindeo de json <--> pojo
	        //.bindingMode(RestBindingMode.auto)        
	        // Configuracion de Swagger (ojo, sin console)
	        .apiContextPath("/swagger.json")
	        .apiProperty("api.title", "Passthrough REST a SOAP")
	        .apiProperty("api.version", "1.0.0")
	        .apiProperty("api.description", "Microservicio de passthrough entre REST y SOAP externos, como punto de entrada y uso de Camel")
	        .apiProperty("cors", "true");		
		
		onException(org.springframework.ws.soap.SoapMessageCreationException.class, 
				java.lang.NullPointerException.class,	
				Exception.class)
			.handled(true)
			.to("log:GeneralError?level=ERROR")
			.process("exceptionProcessor")
			.marshal().json(JsonLibrary.Jackson, DataOutput.class)
			.to("jolt:Generic_Body_Rsp.json?inputType=JsonString&outputType=JsonString")
			.convertBodyTo(String.class, ConstantesCamel.UTF_8)
			.setHeader(ConstantesCamel.CONTENT_TYPE,constant(ConstantesCamel.JSON))
			.setHeader(ConstantesCamel.HTTP_RESPONSE_CODE, simple(ConstantesCamel.HTTP_500))
			.stop();			
		
		System.out.println("Fin preseteo: ");		
		
	}
	
	public Map<String, String> getXmlJsonOptions() {
		return xmlJsonOptions;
	}
	
	public void setXmlJsonOptions(Map<String, String> xmlJsonOptions) {
		this.xmlJsonOptions = xmlJsonOptions;
	}
	
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public String getContextPort() {
		return contextPort;
	}
	
	public void setContextPort(String contextPort) {
		this.contextPort = contextPort;
	}
	
	public String getHostname() {
		return hostname;
	}
	
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	public String getAllowBodyLogging() {
		return allowBodyLogging;
	}
	
	public void setAllowBodyLogging(String allowBodyLogging) {
		this.allowBodyLogging = allowBodyLogging;
	}
	

}
