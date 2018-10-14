package com.upayments.pg.caja.api.io.soap.activatecard;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ReasonCode", "Reason", "ContractIdentifier", "CardSequenceNumber", "ApplRegNumber",
		"ApplicationSource", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;


	private String bankCode;
	private String reasonCode;
	private String reason;
	private String contractIdentifier;
	private String cardSequenceNumber;
	private String applRegNumber;
	private String applicationSource;
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

	@JsonProperty("ReasonCode")
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@JsonProperty("Reason")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonProperty("ContractIdentifier")
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	public void setContractIdentifier(String contractIdentifier) {
		this.contractIdentifier = contractIdentifier;
	}

	@JsonProperty("CardSequenceNumber")
	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}

	@JsonProperty("ApplicationSource")
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}