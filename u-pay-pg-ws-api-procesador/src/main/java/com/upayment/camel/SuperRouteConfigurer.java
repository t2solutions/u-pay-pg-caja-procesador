package com.upayment.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class SuperRouteConfigurer extends RouteBuilder  {
	
    @Autowired
    CamelContext context;
    
	@Value("${camel.soap.endpoint.hostname}")
	private String hostname;
	
	@Value("${camel.component.soap.port}")
	private String soapPort;

    CamelContext camelContext = getContext();
	
	protected CxfEndpoint cxfConfigurator() throws Exception {		
	    CxfEndpoint cxfEndpoint = new CxfEndpoint();
	    cxfEndpoint.setAddress("http://"+hostname+":"+soapPort+"/interface");
	    cxfEndpoint.setServiceClass(SimpleService.class);
	    cxfEndpoint.setCamelContext(camelContext);
	    cxfEndpoint.setDataFormat(DataFormat.POJO);
	    context.addEndpoint("myEndpoint", cxfEndpoint);
		return cxfEndpoint;				
	}
	
	

}
