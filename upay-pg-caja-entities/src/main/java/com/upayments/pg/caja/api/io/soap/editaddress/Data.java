package com.upayments.pg.caja.api.io.soap.editaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientTypeCode",
	"ContractIdentifier", "ContractRelation", "Reason",
	"ApplRegNumber", "AddressTypeCode", "DeliveryTypeCode",
	"Line1", "Line2", "City",
	"District", "Region", "Country", "ZipCode",
	"HomePhone","MobilePhone","Email","ActivationDate",
	"DeactivationDate","UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String bankCode;
	private String clientIdentifier; //ClientIdentifier
	private String clientTypeCode; //ClientTypeCode
    private String contractIdentifier; //ContractIdentifier
    private String contractRelation; //ContractRelation
	private String reason; //Reason
    private String applRegNumber; //ApplRegNumber
    private String addressTypeCode; //AddressTypeCode
	private String deliveryTypeCode; //DeliveryTypeCode
	private String line1; //Line1
	private String line2; //Line2
	private String city; //City
	private String district; //District
	private String region; //Region
	private String country; //Country
	private String zipCode; //ZipCode
	private String homePhone; //HomePhone
	private String mobilePhone; //MobilePhone
	private String email; //Email
	private String activationDate; //ActivationDate
	private String DeactivationDate; //DeactivationDate
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

	@JsonProperty("ClientTypeCode")
	public String getClientTypeCode() {
		return clientTypeCode;
	}

	public void setClientTypeCode(String clientTypeCode) {
		this.clientTypeCode = clientTypeCode;
	}

	@JsonProperty("ContractRelation")
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
	public String getDeliveryTypeCode() {
		return deliveryTypeCode;
	}

	public void setDeliveryTypeCode(String deliveryTypeCode) {
		this.deliveryTypeCode = deliveryTypeCode;
	}

	@JsonProperty("Line1")
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@JsonProperty("Line2")
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
		
	@JsonProperty("District")
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	@JsonProperty("Region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty("Country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("ZipCode")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@JsonProperty("HomePhone")
	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@JsonProperty("MobilePhone")
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@JsonProperty("Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("ActivationDate")
	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	@JsonProperty("DeactivationDate")
	public String getDeactivationDate() {
		return DeactivationDate;
	}

	public void setDeactivationDate(String deactivationDate) {
		DeactivationDate = deactivationDate;
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