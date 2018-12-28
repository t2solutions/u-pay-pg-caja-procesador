package com.upayments.pg.caja.api.io.soap.createvirtualcard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "CardNumber", "ExpiryDate", "CardholderName", "RetCode", "RetMsg" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cardNumber; //CardNumber
	private String expiryDate; //ExpiryDate
	private String cardholderName; //CardholderName
	
	public DataOutput() {
		super();
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

	@JsonProperty("CardholderName")
	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	
	
}

