package com.upayments.pg.caja.api.io.soap.getcardbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "CardData", "AddData"})
public class IssContractDetailsAPIOutputRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private CardData cardData;
	private AddData addData;
	
	public IssContractDetailsAPIOutputRecord() {
		super();
	}

	@JsonProperty("CardData")
	public CardData getCardData() {
		return cardData;
	}

	public void setCardData(CardData cardData) {
		this.cardData = cardData;
	}

	@JsonProperty("AddData")
	public AddData getAddData() {
		return addData;
	}

	public void setAddData(AddData addData) {
		this.addData = addData;
	}
	

}
