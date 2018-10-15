package com.upayments.pg.caja.api.io.soap.createnamelesscard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "CreatedCard", "CardNumber", "ExpiryDate", "SequenceNumber", "RetCode", "RetMsg"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String createdCard;
	private String cardNumber;
	private String expiryDate;
	private String sequenceNumber;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("CreatedCard")
	public String getCreatedCard() {
		return createdCard;
	}

	public void setCreatedCard(String createdCard) {
		this.createdCard = createdCard;
	}

	@JsonProperty("CardNumber")
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@JsonProperty("ExpiryDate")
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@JsonProperty("SequenceNumber")
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	
}

