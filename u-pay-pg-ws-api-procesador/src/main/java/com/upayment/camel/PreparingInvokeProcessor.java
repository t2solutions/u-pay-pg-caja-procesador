package com.upayment.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component(value = "preparingInvoke")
public class PreparingInvokeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		//Setear parametros para el template
		
		exchange.getIn().setBody(new Object());
		
	}
	

}
