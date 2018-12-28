package com.upayments.pg.caja.api.io.soap.createnamelesscard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ProductCode",
	"ApplRegNumber", "ProductCode2", "ProductCode3",
	"ChipSchemeCode", "RiskSchemeCode", "RiskFactor",
	"EmbossedFirstName", "EmbossedLastName", "EmbossedCompanyName",
	"UserInfo"})
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String clientIdentifier; //ClientIdentifier
	private String productCode; //ProductCode
	private String applRegNumber; //ApplRegNumber		
	private String productCode2; //ProductCode2
	private String productCode3; //ProductCode3
	private String chipSchemeCode; //ChipSchemeCode
	private String riskSchemeCode; //RiskSchemeCode
	private String riskFactor; //RiskFactor
	private String embossedFirstName; //EmbossedFirstName
	private String embossedLastName; //EmbossedLastName
	private String embossedCompanyName; //EmbossedCompanyName

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
	@JsonInclude(Include.NON_DEFAULT)
	public String getEmbossedFirstName() {
		return embossedFirstName;
	}

	public void setEmbossedFirstName(String embossedFirstName) {
		this.embossedFirstName = embossedFirstName;
	}

	@JsonProperty("EmbossedLastName")
	@JsonInclude(Include.NON_DEFAULT)
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

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}