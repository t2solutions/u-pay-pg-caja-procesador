package com.upayments.pg.caja.api.io.soap.reissuecard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "CardNumber", "CurrSequenceNumber", "ProductionReason", "Reason", "ApplRegNumber", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String cardNumber;
	private String currSequenceNumber;
	private String productionReason;
	private String reason;
	private String applRegNumber;
	private String userInfo;
	
	public Data() {
		super();
	}
	
	@JsonProperty("BankCode")
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@JsonProperty("CardNumber")
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@JsonProperty("CurrSequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCurrSequenceNumber() {
		return currSequenceNumber;
	}

	public void setCurrSequenceNumber(String currSequenceNumber) {
		this.currSequenceNumber = currSequenceNumber;
	}

	@JsonProperty("ProductionReason")
	public String getProductionReason() {
		return productionReason;
	}

	public void setProductionReason(String productionReason) {
		this.productionReason = productionReason;
	}

	@JsonProperty("Reason")
	@JsonInclude(Include.NON_DEFAULT)
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}