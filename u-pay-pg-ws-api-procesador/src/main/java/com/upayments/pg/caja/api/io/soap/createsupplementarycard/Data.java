package com.upayments.pg.caja.api.io.soap.createsupplementarycard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientSearchCategory", "ContractIdentifier",
	"ProductCode", "ApplRegNumber", "ApplicationSource",  "EmbossedTitleCode",
	"ProductCode2", "ProductCode3", "ChipSchemeCode",
	"RiskSchemeCode", "RiskFactor", "EmbossedTitle", "EmbossedFirstName",
	"EmbossedLastName", "EmbossedCompanyName", "Afinity", "AddInfo02",
	"AddInfo03", "AddInfo04", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String clientIdentifier; //ClientIdentifier
	private String clientSearchCategory; //ClientSearchCategory
	private String contractIdentifier; //ContractIdentifier
	private String productCode; //ProductCode
	private String applRegNumber; //ApplRegNumber	
	private String applicationSource; //ApplicationSource
	private String embossedTitleCode; //EmbossedTitleCode
	private String productCode2; //ProductCode2
	private String productCode3; //ProductCode3
	private String chipSchemeCode; //ChipSchemeCode
	private String riskSchemeCode; //RiskSchemeCode
	private String riskFactor; //RiskFactor
	private String embossedTitle; //EmbossedTitle
	private String embossedFirstName; //EmbossedFirstName
	private String embossedLastName; //EmbossedLastName
	private String embossedCompanyName; //EmbossedCompanyName
	private String affinity;  //Afinity
	private String addInfo02; //AddInfo02
	private String addInfo03; //AddInfo03
	private String addInfo04; //AddInfo04
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

	@JsonProperty("ClientIdentifier")
	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
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

	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}
	
	@JsonProperty("ClientSearchCategory")
	public String getClientSearchCategory() {
		return clientSearchCategory;
	}

	public void setClientSearchCategory(String clientSearchCategory) {
		this.clientSearchCategory = clientSearchCategory;
	}

	@JsonProperty("ContractIdentifier")
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	public void setContractIdentifier(String contractIdentifier) {
		this.contractIdentifier = contractIdentifier;
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

	@JsonProperty("EmbossedTitle")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getEmbossedTitle() {
		return embossedTitle;
	}

	public void setEmbossedTitle(String embossedTitle) {
		this.embossedTitle = embossedTitle;
	}

	@JsonProperty("Affinity")
	public String getAffinity() {
		return affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
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

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}