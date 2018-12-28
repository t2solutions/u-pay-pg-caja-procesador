package com.upayments.pg.caja.api.io.soap.reissuecard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "PlasticID", "NewCardID", "NewCardNumber", "NewExpiryDate", "NewSequenceNumber", "RetCode", "RetMsg"})
public class ReissueCardResp extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String plasticID;
	private String newCardID;
	private String newCardNumber;
	private String newExpiryDate;
	private String newSequenceNumber;
	
	public ReissueCardResp() {
		super();
	}

	@JsonProperty("PlasticID")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPlasticID() {
		return plasticID;
	}

	public void setPlasticID(String plasticID) {
		this.plasticID = plasticID;
	}

	@JsonProperty("NewCardID")
	@JsonInclude(Include.NON_DEFAULT)
	public String getNewCardID() {
		return newCardID;
	}

	public void setNewCardID(String newCardID) {
		this.newCardID = newCardID;
	}

	@JsonProperty("NewCardNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getNewCardNumber() {
		return newCardNumber;
	}

	public void setNewCardNumber(String newCardNumber) {
		this.newCardNumber = newCardNumber;
	}

	@JsonProperty("NewExpiryDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getNewExpiryDate() {
		return newExpiryDate;
	}

	public void setNewExpiryDate(String newExpiryDate) {
		this.newExpiryDate = newExpiryDate;
	}

	@JsonProperty("NewSequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getNewSequenceNumber() {
		return newSequenceNumber;
	}

	public void setNewSequenceNumber(String newSequenceNumber) {
		this.newSequenceNumber = newSequenceNumber;
	}
	
	
	
	
	
	
	

}
