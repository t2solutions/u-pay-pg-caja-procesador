package com.upayment.camel;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component(value="soapRoute")
public class CxfRouteBuilder extends SuperRouteConfigurer {

    @Autowired
    CamelContext context;

    @Override
    public void configure() throws Exception {
    	/*
        CamelContext camelContext = getContext();

        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8088/interface");
        cxfEndpoint.setServiceClass(SimpleService.class);
        cxfEndpoint.setCamelContext(camelContext);
        cxfEndpoint.setDataFormat(DataFormat.POJO);
        context.addEndpoint("myEndpoint", cxfEndpoint);
        */

        from(super.cxfConfigurator())
            .process("preparingInvoke")
            .to("velocity:ActivateCard_Req.vm")
        	.to("spring-ws:http://localhost:8888/mockActiveCardBinding?soapAction=http://ws.nexuschile.cl/Prepaid/ActivateCard/v1.0/Op")
        	.log("${body}")        
        	.setBody(constant("Hi!"));

    }

}

