package com.upayments.pg.caja.api.io.soap.getclientbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "IdentityCardNumber", "Name", "FullName", "ShortName", "FirstName", 
	"LastName", "Salutation", "Gender", "GenderDesc", "BirthDate", "Citizenship",
	"CitizenshipDesc", "MaritalStatus", "MaritalStatusDesc", "CompanyName",
	"Department", "Position", "ClientCategory", "ClientCategoryDesc",
	"ClientType", "ClientTypeDesc"})
public class ClientData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String identityCardNumber; //
	private String name; //
	private String fullName; //
	private String shortName; //
	private String firstName; //
	private String lastName; //
	private String salutation; //
	private String gender; //
	private String genderDesc; //
	private String birthDate; //
	private String citizenship; //
	private String citizenshipDesc; //
	private String maritalStatus; //
	private String maritalStatusDesc; //
	private String companyName; //
	private String department; //
	private String position; //
	private String clientCategory; //
	private String clientCategoryDesc; //
	private String clientType; //
	private String clientTypeDesc; //
	
	public ClientData() {
		super();
	}

	@JsonProperty("IdentityCardNumber")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	@JsonProperty("Name")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("FullName")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@JsonProperty("ShortName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@JsonProperty("FirstName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("LastName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("Salutation")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	@JsonProperty("Gender")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("GenderDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getGenderDesc() {
		return genderDesc;
	}

	public void setGenderDesc(String genderDesc) {
		this.genderDesc = genderDesc;
	}

	@JsonProperty("BirthDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("Citizenship")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@JsonProperty("CitizenshipDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCitizenshipDesc() {
		return citizenshipDesc;
	}

	public void setCitizenshipDesc(String citizenshipDesc) {
		this.citizenshipDesc = citizenshipDesc;
	}

	@JsonProperty("MaritalStatus")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@JsonProperty("MaritalStatusDesc")
	@JsonInclude(Include.NON_DEFAULT)			
	public String getMaritalStatusDesc() {
		return maritalStatusDesc;
	}

	public void setMaritalStatusDesc(String maritalStatusDesc) {
		this.maritalStatusDesc = maritalStatusDesc;
	}

	@JsonProperty("CompanyName")
	@JsonInclude(Include.NON_DEFAULT)				
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("Department")
	@JsonInclude(Include.NON_DEFAULT)					
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@JsonProperty("Position")
	@JsonInclude(Include.NON_DEFAULT)						
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@JsonProperty("ClientCategory")
	@JsonInclude(Include.NON_DEFAULT)							
	public String getClientCategory() {
		return clientCategory;
	}

	public void setClientCategory(String clientCategory) {
		this.clientCategory = clientCategory;
	}

	@JsonProperty("ClientCategoryDesc")
	@JsonInclude(Include.NON_DEFAULT)								
	public String getClientCategoryDesc() {
		return clientCategoryDesc;
	}

	public void setClientCategoryDesc(String clientCategoryDesc) {
		this.clientCategoryDesc = clientCategoryDesc;
	}

	@JsonProperty("ClientType")
	@JsonInclude(Include.NON_DEFAULT)									
	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	@JsonProperty("ClientTypeDesc")
	@JsonInclude(Include.NON_DEFAULT)										
	public String getClientTypeDesc() {
		return clientTypeDesc;
	}

	public void setClientTypeDesc(String clientTypeDesc) {
		this.clientTypeDesc = clientTypeDesc;
	}
	

}
