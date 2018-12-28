package com.upayments.pg.caja.api.io.soap.getaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "AddressType", "DeliveryType", "Region",
	"City", "ZipCode", "Line1", "Line2", "Line3", "Line4",
	"HomePhone", "MobilePhone", "Email",
	"ActivationDate", "DeactivationDate", "Active",
	"AmendmentDate", "Enabled", "ID" })
public class AddressDetailsRecord implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String addressType; //AddressType
	private String deliveryType; //DeliveryType
	private String region; //Region
	private String city; //City
	private String zipCode; //ZipCode
	private String line1; //Line1
	private String line2; //Line2
	private String line3; //Line3
	private String line4; //Line4
	private String homePhone; //HomePhone
	private String mobilePhone; //MobilePhone
	private String email; //Email
	private String activationDate; //ActivationDate
	private String deactivationDate; //DeactivationDate
	private String active; //Active
	private String ammendmentDate; //AmendmentDate
	private String enabled; //Enabled
	private String id; //ID

	public AddressDetailsRecord() {
		super();
	}

	@JsonProperty("AddressType")
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	@JsonProperty("DeliveryType")
	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	@JsonProperty("Region")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("ZipCode")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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

	@JsonProperty("Line3")
	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	@JsonProperty("Line4")
	public String getLine4() {
		return line4;
	}

	public void setLine4(String line4) {
		this.line4 = line4;
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
		return deactivationDate;
	}

	public void setDeactivationDate(String deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	@JsonProperty("Active")
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@JsonProperty("AmmendmentDate")
	public String getAmmendmentDate() {
		return ammendmentDate;
	}

	public void setAmmendmentDate(String ammendmentDate) {
		this.ammendmentDate = ammendmentDate;
	}

	@JsonProperty("Enabled")
	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	@JsonProperty("ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

	

}
