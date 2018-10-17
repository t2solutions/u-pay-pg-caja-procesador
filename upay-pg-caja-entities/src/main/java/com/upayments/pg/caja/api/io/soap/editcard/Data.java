package com.upayments.pg.caja.api.io.soap.editcard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode","ContractIdentifier","Reason","ApplRegNumber","EmbossedTitleCode",
	"EmbossedFirstName","EmbossedLastName","EmbossedCompanyName",
	"Afinity","AddInfo02","AddInfo03","AddInfo04","UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
		
	private String bankCode;
    private String contractIdentifier; //ContractIdentifier
	private String reason; //Reason
    private String applRegNumber; //ApplRegNumber
    private String embossedTitleCode; //EmbossedTitleCode
    private String embossedFirstName; //EmbossedFirstName
    private String embossedLastName; //EmbossedLastName
    private String embossedCompanyName; //EmbossedCompanyName
    private String afinity; //Afinity
    private String addInfo02; //AddInfo02
    private String addInfo03; //AddInfo03
    private String addInfo04; //AddInfo04
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
	
	@JsonProperty("EmbossedTitleCode")
	public String getEmbossedTitleCode() {
		return embossedTitleCode;
	}

	public void setEmbossedTitleCode(String embossedTitleCode) {
		this.embossedTitleCode = embossedTitleCode;
	}

	@JsonProperty("EmbossedFirstName")
	public String getEmbossedFirstName() {
		return embossedFirstName;
	}

	public void setEmbossedFirstName(String embossedFirstName) {
		this.embossedFirstName = embossedFirstName;
	}

	@JsonProperty("EmbossedLastName")
	public String getEmbossedLastName() {
		return embossedLastName;
	}

	public void setEmbossedLastName(String embossedLastName) {
		this.embossedLastName = embossedLastName;
	}

	@JsonProperty("EmbossedCompanyName")
	public String getEmbossedCompanyName() {
		return embossedCompanyName;
	}

	public void setEmbossedCompanyName(String embossedCompanyName) {
		this.embossedCompanyName = embossedCompanyName;
	}

	@JsonProperty("Afinity")
	public String getAfinity() {
		return afinity;
	}

	public void setAfinity(String afinity) {
		this.afinity = afinity;
	}

	@JsonProperty("AddInfo02")
	public String getAddInfo02() {
		return addInfo02;
	}

	public void setAddInfo02(String addInfo02) {
		this.addInfo02 = addInfo02;
	}

	@JsonProperty("AddInfo03")
	public String getAddInfo03() {
		return addInfo03;
	}

	public void setAddInfo03(String addInfo03) {
		this.addInfo03 = addInfo03;
	}

	@JsonProperty("AddInfo04")
	public String getAddInfo04() {
		return addInfo04;
	}

	public void setAddInfo04(String addInfo04) {
		this.addInfo04 = addInfo04;
	}

	@JsonProperty("ContractIdentifier")
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	public void setContractIdentifier(String contractIdentifier) {
		this.contractIdentifier = contractIdentifier;
	}

	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}

	@JsonProperty("Reason")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}