package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class MovimientosFechaIdInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String idTransaction;
	private String dateTransaction;
	
	public MovimientosFechaIdInput() {
	}
		
	public String getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	

}
