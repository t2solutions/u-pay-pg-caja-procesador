package com.upayments.pg.caja.api.io.soap.createcard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ContractScope", "ContractIdentifier",
		"ContractRelation", "ProductIdentifier", "ProductCode", "ProductCode2",
		"ProductCode3", "CardSequenceNumber", "ApplRegNumber",
		"ApplicationSource", "EmbossedTitleCode", "ChipSchemeCode",
		"RiskSchemeCode", "RiskFactor", "EmbossedFirstName",
		"EmbossedLastName", "EmbossedCompanyName", "Afinity", "AddInfo02",
		"AddInfo03", "AddInfo04", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String contractScope;
	private String contractIdentifier;
	private String contractRelation;
	private String productIdentifier;
	private String productCode;
	private String productCode2;
	private String productCode3;
	private String cardSequenceNumber;
	private String applRegNumber;
	private String applicationSource;
	private String embossedTitleCode;
	private String chipSchemeCode;
	private String riskSchemeCode;
	private String riskFactor;
	private String embossedFirstName;
	private String embossedLastName;
	private String embossedCompanyName;
	private String afinity;
	private String addInfo02;
	private String addInfo03;
	private String addInfo04;
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
	
	@JsonProperty("ContractScope")
	@JsonInclude(Include.NON_DEFAULT)
	public String getContractScope() {
		return contractScope;
	}

	public void setContractScope(String contractScope) {
		this.contractScope = contractScope;
	}

	@JsonProperty("ProductIdentifier")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductIdentifier() {
		return productIdentifier;
	}

	public void setProductIdentifier(String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	@JsonProperty("ProductCode")
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@JsonProperty("ProductCode2")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductCode2() {
		return productCode2;
	}

	public void setProductCode2(String productCode2) {
		this.productCode2 = productCode2;
	}

	@JsonProperty("ProductCode3")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductCode3() {
		return productCode3;
	}

	public void setProductCode3(String productCode3) {
		this.productCode3 = productCode3;
	}

	@JsonProperty("CardSequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	@JsonProperty("ApplicationSource")
	@JsonInclude(Include.NON_DEFAULT)
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}

	@JsonProperty("EmbossedTitleCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEmbossedTitleCode() {
		return embossedTitleCode;
	}

	public void setEmbossedTitleCode(String embossedTitleCode) {
		this.embossedTitleCode = embossedTitleCode;
	}

	@JsonProperty("ChipSchemeCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getChipSchemeCode() {
		return chipSchemeCode;
	}

	public void setChipSchemeCode(String chipSchemeCode) {
		this.chipSchemeCode = chipSchemeCode;
	}

	@JsonProperty("RiskSchemeCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRiskSchemeCode() {
		return riskSchemeCode;
	}

	public void setRiskSchemeCode(String riskSchemeCode) {
		this.riskSchemeCode = riskSchemeCode;
	}

	@JsonProperty("RiskFactor")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRiskFactor() {
		return riskFactor;
	}

	public void setRiskFactor(String riskFactor) {
		this.riskFactor = riskFactor;
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
	@JsonInclude(Include.NON_DEFAULT)	
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
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAddInfo02() {
		return addInfo02;
	}

	public void setAddInfo02(String addInfo02) {
		this.addInfo02 = addInfo02;
	}
	
	@JsonProperty("AddInfo03")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAddInfo03() {
		return addInfo03;
	}

	public void setAddInfo03(String addInfo03) {
		this.addInfo03 = addInfo03;
	}

	@JsonProperty("AddInfo04")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAddInfo04() {
		return addInfo04;
	}

	public void setAddInfo04(String addInfo04) {
		this.addInfo04 = addInfo04;
	}

	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}
	

	@JsonProperty("ContractRelation")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractRelation() {
		return contractRelation;
	}

	public void setContractRelation(String contractRelation) {
		this.contractRelation = contractRelation;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}