package com.upayments.pg.caja.api.io.soap.getcontractbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientSearchCategory", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String bankCode;
	private String clientIdentifier; //ClientIdentifier
    private String clientSearchCategory; //clientSearchCategory
	private String userInfo; //UserInfo	
	
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

	@JsonProperty("ClientIdentifier")
	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	@JsonProperty("ClientSearchCategory")
	@JsonInclude(Include.NON_DEFAULT)
	public String getClientSearchCategory() {
		return clientSearchCategory;
	}

	public void setClientSearchCategory(String clientSearchCategory) {
		this.clientSearchCategory = clientSearchCategory;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}