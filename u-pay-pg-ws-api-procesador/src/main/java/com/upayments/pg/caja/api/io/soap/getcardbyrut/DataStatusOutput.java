package com.upayments.pg.caja.api.io.soap.getcardbyrut;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "CardDetailsAPIRecord"})
public class DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String retCode;
	private String retMsg;	
	private List<CardDetailsAPIRecord> cardDetailsAPIRecord;
	
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
	
	@JsonProperty("CardDetailsAPIRecord")
	@JsonInclude(Include.NON_DEFAULT)		
	public List<CardDetailsAPIRecord> getCardDetailsAPIRecord() {
		return cardDetailsAPIRecord;
	}
	
	public void setCardDetailsAPIRecord(
			List<CardDetailsAPIRecord> cardDetailsAPIRecord) {
		this.cardDetailsAPIRecord = cardDetailsAPIRecord;
	}

	
}