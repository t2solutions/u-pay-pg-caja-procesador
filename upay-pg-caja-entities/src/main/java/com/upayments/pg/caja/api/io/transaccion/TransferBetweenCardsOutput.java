package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class TransferBetweenCardsOutput implements Serializable {

	private static final long serialVersionUID = 1938839974655173099L;

	private Long idTransfer;
	private String descripcion;
	
	private ReturnStatusOutput status;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public ReturnStatusOutput getStatus() {
		if(status == null) {
			status = new ReturnStatusOutput();
		}
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}



}
