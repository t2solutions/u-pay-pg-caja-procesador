package com.upayments.pg.caja.api.io.soap.createcontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientSearchCategory",
	"ProductCode", "ApplRegNumber", "ApplicationSource",
	"ProductCode2", "ProductCode3", "ServiceGroup",
	"AddInfo01", "AddInfo02", "AddInfo03",
	"CloseDate", "UserInfo"})
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String clientIdentifier; //ClientIdentifier
	private String clientSearchCategory; //ClientSearchCategory
	private String productCode; //ProductCode
	private String applRegNumber; //ApplRegNumber	
	private String applicationSource; //ApplicationSource
	private String productCode2; //ProductCode2
	private String productCode3; //ProductCode3
	private String serviceGroup; //ServiceGroup
	private String addInfo01; //AddInfo01
	private String addInfo02; //AddInfo02
	private String addInfo03; //AddInfo03
	private String closeDate; //CloseDate
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

	@JsonProperty("AddInfo01")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAddInfo01() {
		return addInfo01;
	}

	public void setAddInfo01(String addInfo01) {
		this.addInfo01 = addInfo01;
	}

	@JsonProperty("AddInfo02")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAddInfo02() {
		return addInfo02;
	}

	public void setAddInfo02(String addInfo02) {
		this.addInfo02 = addInfo02;
	}

	@JsonProperty("ApplicationSource")
	@JsonInclude(Include.NON_DEFAULT)
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}
	
	@JsonProperty("ClientIdentifier")
	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	@JsonProperty("ClientSearchCategory")
	public String getClientSearchCategory() {
		return clientSearchCategory;
	}

	public void setClientSearchCategory(String clientSearchCategory) {
		this.clientSearchCategory = clientSearchCategory;
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

	@JsonProperty("ServiceGroup")
	@JsonInclude(Include.NON_DEFAULT)
	public String getServiceGroup() {
		return serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}

	@JsonProperty("CloseDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	@JsonProperty("AddInfo03")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAddInfo03() {
		return addInfo03;
	}

	public void setAddInfo03(String addInfo03) {
		this.addInfo03 = addInfo03;
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