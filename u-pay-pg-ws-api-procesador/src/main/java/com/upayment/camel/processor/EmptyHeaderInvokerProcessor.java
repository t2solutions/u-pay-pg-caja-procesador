package com.upayment.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.spring.ws.SpringWebserviceConstants;
import org.springframework.stereotype.Component;

import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@Component(value = "emptyHeaderPrepare")
public class EmptyHeaderInvokerProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setHeader(SpringWebserviceConstants.SPRING_WS_SOAP_HEADER, new HeaderRequest());	
	}
	
	

}
