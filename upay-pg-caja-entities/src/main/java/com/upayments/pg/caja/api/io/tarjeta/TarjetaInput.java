package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;

public class TarjetaInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cardNumber; /* filtro opcional que podria ir, pero debe ir el cardholderid y emisorid */
	private Long cardholderId; 
	private Long emisorId;
	
	public TarjetaInput() {
		super();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getCardholderId() {
		return cardholderId;
	}

	public void setCardholderId(Long cardholderId) {
		this.cardholderId = cardholderId;
	}

	public Long getEmisorId() {
		return emisorId;
	}

	public void setEmisorId(Long emisorId) {
		this.emisorId = emisorId;
	}
	

}
