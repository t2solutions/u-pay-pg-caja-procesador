package com.upayments.pg.caja.api.io.soap.editclient;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ClientSearchCategory",
		"ReasonCode", "Reason", "ApplRegNumber", "ApplicationSource",
		"LanguageCode", "ShortName", "Gender", "SalutationCode", "Branch",
		"ServiceGroup", "FirstName", "MiddleName", "LastName", "BirthDate",
		"BirthPlace", "BirthName", "Citizenship", "MaritalStatusCode",
		"TaxBracket", "IndividualTaxpayerNumber", "CompanyName", "Trademark",
		"Department", "Position", "IdentityCardDetails", "ClientNumber",
		"SecretPhrase", "AdditionalDate01", "AdditionalDate02", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;	
	private String clientIdentifier; //ClientIdentifier
	private String clientSearchCategory; //ClientSearchCategory	
	private String reasonCode; //ReasonCode
	private String reason; //Reason
	private String applRegNumber; //ApplRegNumber	
	private String applicationSource; //ApplicationSource
	private String clientTypeCode; //ClientTypeCode
	private String languageCode; //LanguageCode
	private String shortName; //ShortName
	private String gender; //Gender
	private String salutationCode; //SalutationCode
	private String branch; //Branch
	private String serviceGroup; //ServiceGroup
	private String firstName; //FirstName
	private String middleName; //MiddleName
	private String lastName; //LastName	
	private String birthDate; //BirthDate
	private String birthPlace; //BirthPlace
	private String birthName; //BirthName	
	private String citizenship; //Citizenship
	private String maritalStatusCode; //MaritalStatusCode	
	private String taxBracket; //TaxBracket
	private String individualTaxpayerNumber; //IndividualTaxpayerNumber
	private String companyName; //CompanyName
	private String trademark; //Trademark
	private String department; //Department
	private String position; //Position
	private String identityCardDetails; //IdentityCardDetails
	private String clientNumber; //ClientNumber
	private String secretPhrase; //SecretPhrase 
	private String additionalDate01; //AdditionalDate01
	private String additionalDate02; //AdditionalDate02
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

	@JsonProperty("ReasonCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@JsonProperty("Reason")
	@JsonInclude(Include.NON_DEFAULT)
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@JsonProperty("ClientTypeCode")
	public String getClientTypeCode() {
		return clientTypeCode;
	}

	public void setClientTypeCode(String clientTypeCode) {
		this.clientTypeCode = clientTypeCode;
	}

	@JsonProperty("LanguageCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@JsonProperty("MaritalStatusCode")
	public String getMaritalStatusCode() {
		return maritalStatusCode;
	}

	public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}

	@JsonProperty("SalutationCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getSalutationCode() {
		return salutationCode;
	}

	public void setSalutationCode(String salutationCode) {
		this.salutationCode = salutationCode;
	}

	@JsonProperty("Branch")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@JsonProperty("ServiceGroup")
	@JsonInclude(Include.NON_DEFAULT)
	public String getServiceGroup() {
		return serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}

	@JsonProperty("ShortName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@JsonProperty("Gender")
	@JsonInclude(Include.NON_DEFAULT)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("FirstName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("MiddleName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("LastName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("BirthDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("BirthPlace")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@JsonProperty("BirthName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBirthName() {
		return birthName;
	}

	public void setBirthName(String birthName) {
		this.birthName = birthName;
	}

	@JsonProperty("Citizenship")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@JsonProperty("TaxBracket")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTaxBracket() {
		return taxBracket;
	}

	public void setTaxBracket(String taxBracket) {
		this.taxBracket = taxBracket;
	}

	@JsonProperty("IndividualTaxpayerNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getIndividualTaxpayerNumber() {
		return individualTaxpayerNumber;
	}

	public void setIndividualTaxpayerNumber(String individualTaxpayerNumber) {
		this.individualTaxpayerNumber = individualTaxpayerNumber;
	}

	@JsonProperty("CompanyName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("Trademark")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
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

	@JsonProperty("IdentityCardDetails")
	@JsonInclude(Include.NON_DEFAULT)
	public String getIdentityCardDetails() {
		return identityCardDetails;
	}

	public void setIdentityCardDetails(String identityCardDetails) {
		this.identityCardDetails = identityCardDetails;
	}

	@JsonProperty("ClientNumber")
	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	@JsonProperty("SecretPhrase")
	@JsonInclude(Include.NON_DEFAULT)
	public String getSecretPhrase() {
		return secretPhrase;
	}

	public void setSecretPhrase(String secretPhrase) {
		this.secretPhrase = secretPhrase;
	}

	@JsonProperty("ApplicationSource")
	@JsonInclude(Include.NON_DEFAULT)
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}


	@JsonProperty("ApplRegNumber")
	public String getApplRegNumber() {
		return applRegNumber;
	}

	public void setApplRegNumber(String applRegNumber) {
		this.applRegNumber = applRegNumber;
	}
	
	@JsonProperty("AdditionalDate01")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAdditionalDate01() {
		return additionalDate01;
	}
	public void setAdditionalDate01(String additionalDate01) {
		this.additionalDate01 = additionalDate01;
	}
	
	@JsonProperty("AdditionalDate02")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAdditionalDate02() {
		return additionalDate02;
	}
	
	public void setAdditionalDate02(String additionalDate02) {
		this.additionalDate02 = additionalDate02;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}