package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class MovimientosTarjetaInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long cardId;
	
	public MovimientosTarjetaInput() {
		super();
	}
	
	public Long getCardId() {
		return cardId;
	}
	
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

}
