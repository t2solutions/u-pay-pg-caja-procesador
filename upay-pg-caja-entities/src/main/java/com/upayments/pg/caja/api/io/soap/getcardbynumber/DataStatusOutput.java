package com.upayments.pg.caja.api.io.soap.getcardbynumber;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint", "CardData", "AddData"})
public class DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String retCode;
	private String retMsg;	
	private String failPoint;
	private CardData cardData; 
	private AddData addData;
	
	public DataStatusOutput() {
		super();
	}
	
	@JsonProperty("RetCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRetCode() {
		return retCode;
	}
	
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	
	@JsonProperty("RetMsg")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRetMsg() {
		return retMsg;
	}
	
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	@JsonProperty("FailPoint")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getFailPoint() {
		return failPoint;
	}

	public void setFailPoint(String failPoint) {
		this.failPoint = failPoint;
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