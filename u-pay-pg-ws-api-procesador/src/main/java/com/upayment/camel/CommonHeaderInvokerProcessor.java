package com.upayment.camel;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.spring.ws.SpringWebserviceConstants;
import org.springframework.stereotype.Component;

import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@Component(value = "commonHeaderPrepare")
public class CommonHeaderInvokerProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("INICIO PRE-PROCESADOR DE HEADER");
		
		//Recibir la ristra JSON serializada del objeto Common de cabecera
		HeaderRequest rqst = exchange.getIn().getBody(HeaderRequest.class);
		//Cargar header generado con los datos recibidos
		exchange.getIn().setHeader(SpringWebserviceConstants.SPRING_WS_SOAP_HEADER, createCommonHeader(rqst));

		System.out.println("FIN PRE-PROCESADOR DE HEADER");
		
	}
	
	private Map<String, Object> createCommonHeader(HeaderRequest gottenRequest) {
		StringBuffer sbHeader = new StringBuffer();
        Map<String, Object> headers = new HashMap<>();
        sbHeader.append("<ns:HeaderRequest xmlns:ns=\"http://xsd.nexuschile.cl/Credit/Common/Enterprise/HeaderRequest/201707\">");
        sbHeader.append("<ns:Common>");
	        sbHeader.append("<ns:ServiceID>");
	        sbHeader.append(gottenRequest.getHeaderRequestCommon().getCommon().getServiceID());
	        sbHeader.append("</ns:ServiceID>");
	        sbHeader.append("<ns:ServiceVersion>");
	        sbHeader.append(gottenRequest.getHeaderRequestCommon().getCommon().getServiceVersion());
	        sbHeader.append("</ns:ServiceVersion>");	        
	        sbHeader.append("<ns:Product>");
	        sbHeader.append(gottenRequest.getHeaderRequestCommon().getCommon().getProduct());
	        sbHeader.append("</ns:Product>");	        
	        sbHeader.append("<ns:RequestDate>");
	        sbHeader.append(gottenRequest.getHeaderRequestCommon().getCommon().getRequestDate());
	        sbHeader.append("</ns:RequestDate>");        
	     sbHeader.append("</ns:Common>");
	     sbHeader.append("</ns:HeaderRequest>");
        headers.put("CamelSpringWebserviceSoapHeader", sbHeader.toString());
        return headers;
}
	

}
