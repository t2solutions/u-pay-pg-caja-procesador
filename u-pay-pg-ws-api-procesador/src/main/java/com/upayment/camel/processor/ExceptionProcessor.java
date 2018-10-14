package com.upayment.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.upayments.pg.caja.api.entity.constants.CodeReturnEnum;
import com.upayments.pg.caja.api.io.soap.activatecard.DataOutput;

@Component(value = "exceptionProcessor")
public class ExceptionProcessor implements Processor {

	@Override
	public void process(Exchange xchg) throws Exception {
	    DataOutput doException = new DataOutput();
	 
        Exception excp = xchg.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        excp.printStackTrace();
        
        //PENDIENTE: Loguear o invocar evento paralelo
        doException.setReturnCode(CodeReturnEnum.ERROR_PROCESADOR.getCodeError());
        doException.setReturnMessage(CodeReturnEnum.ERROR_PROCESADOR.getTextError());
        xchg.getIn().setBody(doException);
		
	}
	
	

}
