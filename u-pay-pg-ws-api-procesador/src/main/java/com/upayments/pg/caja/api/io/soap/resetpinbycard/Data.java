package com.upayments.pg.caja.api.io.soap.resetpinbycard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "PAN", "SeqvNumber", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String pan;
	private String seqvNumber;
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
	
	
	@JsonProperty("PAN")
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@JsonProperty("SeqvNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getSeqvNumber() {
		return seqvNumber;
	}

	public void setSeqvNumber(String seqvNumber) {
		this.seqvNumber = seqvNumber;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}