package com.upayments.pg.caja.api.io.soap.setcontractstatus;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ContractIdentifier", "NewStatus", "Reason", "ApplRegNumber", "ApplicationSource", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String contractIdentifier;
	private String newStatus;
	private String reason;
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

	@JsonProperty("ContractIdentifier")
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	public void setContractIdentifier(String contractIdentifier) {
		this.contractIdentifier = contractIdentifier;
	}

	@JsonProperty("NewStatus")
	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
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

	@JsonProperty("ApplicationSource")
	@JsonInclude(Include.NON_DEFAULT)
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