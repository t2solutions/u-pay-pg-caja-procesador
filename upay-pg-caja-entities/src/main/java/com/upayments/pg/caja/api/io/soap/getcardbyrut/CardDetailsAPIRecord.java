package com.upayments.pg.caja.api.io.soap.getcardbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.getcardbycontract.AddData;
import com.upayments.pg.caja.api.io.soap.getcardbycontract.CardData;

@JsonPropertyOrder({ "CardData", "AddData"})
public class CardDetailsAPIRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private CardData cardData;
	private AddData addData;
	
	public CardDetailsAPIRecord() {
		super();
	}
	
	@JsonProperty("AddData")
	public AddData getAddData() {
		return addData;
	}
	
	public void setAddData(AddData addData) {
		this.addData = addData;
	}
	
	@JsonProperty("CardData")
	public CardData getCardData() {
		return cardData;
	}
	
	public void setCardData(CardData cardData) {
		this.cardData = cardData;
	}
	
	
	
	

}
