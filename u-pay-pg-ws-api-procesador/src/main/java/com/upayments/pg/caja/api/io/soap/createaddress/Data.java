package com.upayments.pg.caja.api.io.soap.createaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientTypeCode",
		"ContractIdentifier", "ContractRelation", "Reason", "ApplRegNumber",
		"AddressTypeCode", "DeliveryTypeCode", "Line1", "Line2", "City",
		"District", "Region", "Country", "ZipCode", "HomePhone", "MobilePhone",
		"Email", "ActivationDate", "DeactivationDate", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String clientIdentifier;
	private String clientTypeCode;
	private String contractIdentifier;
	private String contractRelation;
	private String reason;
	private String applRegNumber;
	private String addressTypeCode;
	private String deliveryTypeCode;
	private String line1;
	private String line2;
	private String city;
	private String district;
	private String region;
	private String country;
	private String zipcode;
	private String homePhone;
	private String mobilePhone;
	private String email;
	private String activationDate;
	private String deactivationDate;
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

	@JsonProperty("Reason")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonProperty("ContractIdentifier")
	@JsonInclude(Include.NON_DEFAULT)
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
	
	
	@JsonProperty("ClientIdentifier")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	@JsonProperty("ClientTypeCode")
	public String getClientTypeCode() {
		return clientTypeCode;
	}

	public void setClientTypeCode(String clientTypeCode) {
		this.clientTypeCode = clientTypeCode;
	}

	@JsonProperty("ContractRelation")
	@JsonInclude(Include.NON_DEFAULT)
	public String getContractRelation() {
		return contractRelation;
	}

	public void setContractRelation(String contractRelation) {
		this.contractRelation = contractRelation;
	}

	@JsonProperty("AddressTypeCode")
	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	@JsonProperty("DeliveryTypeCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getDeliveryTypeCode() {
		return deliveryTypeCode;
	}

	public void setDeliveryTypeCode(String deliveryTypeCode) {
		this.deliveryTypeCode = deliveryTypeCode;
	}

	@JsonProperty("Line1")
	@JsonInclude(Include.NON_DEFAULT)
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@JsonProperty("Line2")
	@JsonInclude(Include.NON_DEFAULT)
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@JsonProperty("City")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("District")
	@JsonInclude(Include.NON_DEFAULT)
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@JsonProperty("Region")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty("Country")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("ZipCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@JsonProperty("HomePhone")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@JsonProperty("MobilePhone")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@JsonProperty("Email")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("ActivationDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	@JsonProperty("DeactivationDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(String deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}