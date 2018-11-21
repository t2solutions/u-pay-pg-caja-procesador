package com.upayments.pg.caja.api.io.soap.setpinbycard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "CardNumber", "Operation", "Offset", "OldPinBlock", "PinBlockNew", "IdDukpt", "SeqvNumber", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String cardNumber;
	private String operation;
	private String offset; //o
	private String oldPinBlock; //o
	private String pinBlockNew; //o
	private String idDukpt; //o
	private String seqvNumber; // o
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

	@JsonProperty("Operation")
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@JsonProperty("Offset")
	@JsonInclude(Include.NON_DEFAULT)
	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	@JsonProperty("OldPinBlock")
	@JsonInclude(Include.NON_DEFAULT)
	public String getOldPinBlock() {
		return oldPinBlock;
	}

	public void setOldPinBlock(String oldPinBlock) {
		this.oldPinBlock = oldPinBlock;
	}

	@JsonProperty("PinBlockNew")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPinBlockNew() {
		return pinBlockNew;
	}

	public void setPinBlockNew(String pinBlockNew) {
		this.pinBlockNew = pinBlockNew;
	}

	@JsonProperty("IdDukpt")
	@JsonInclude(Include.NON_DEFAULT)
	public String getIdDukpt() {
		return idDukpt;
	}

	public void setIdDukpt(String idDukpt) {
		this.idDukpt = idDukpt;
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