package com.upayments.pg.caja.api.io.soap.getcontracttransactions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "BankCode", "ContractIdentifier", "ContractRelation",
	"StartDate", "EndDate", "AuthFilterMode", "IsAuthorisation", "UserInfo"})
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String bankCode;
	private String contractIdentifier; //	
	private String contractRelation;
	private String startDate;
	private String endDate;
	private String authFilterMode;
	private String isAuthorisation;
	private String userInfo; //		
	
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

	@JsonProperty("ContractRelation")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractRelation() {
		return contractRelation;
	}

	public void setContractRelation(String contractRelation) {
		this.contractRelation = contractRelation;
	}

	@JsonProperty("StartDate")
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("EndDate")
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("AuthFilterMode")
	public String getAuthFilterMode() {
		return authFilterMode;
	}

	public void setAuthFilterMode(String authFilterMode) {
		this.authFilterMode = authFilterMode;
	}

	@JsonProperty("IsAuthorisation")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getIsAuthorisation() {
		return isAuthorisation;
	}

	public void setIsAuthorisation(String isAuthorisation) {
		this.isAuthorisation = isAuthorisation;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}