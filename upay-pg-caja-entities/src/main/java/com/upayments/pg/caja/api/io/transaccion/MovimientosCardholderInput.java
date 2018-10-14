package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class MovimientosCardholderInput implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long cardholderId;
	
	public MovimientosCardholderInput() {
		super();
	}
	
	public Long getCardholderId() {
		return cardholderId;
	}
	
	public void setCardholderId(Long cardholderId) {
		this.cardholderId = cardholderId;
	}
	
}

