package com.upayment.camel.route;

import org.apache.camel.LoggingLevel;
import org.springframework.stereotype.Component;

import com.upayment.camel.RestRouteBuilder;

@Component(value="pingRoute")
public class PingRoute extends RestRouteBuilder {

	@Override
	public void configure() throws Exception {
	    rest("/ping") 
	      .get("/")
	      .description("Servicio de ping")
	      .outType(String.class)
	      .consumes("text/plain")
	      .produces("text/plain") 
	      .to("direct:hello");
	 
	    from("direct:hello")
	      .log(LoggingLevel.INFO, "PING")
	      .setBody(simple("PING"));
		
	}

	
}
