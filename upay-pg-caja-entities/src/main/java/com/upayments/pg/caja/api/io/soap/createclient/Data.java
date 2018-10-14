package com.upayments.pg.caja.api.io.soap.createclient;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ReasonCode", "Reason", "ApplRegNumber",
		"ApplicationSource", 
		"ClientTypeCode","LanguageCode", "MaritalStatusCode", 
		"SalutationCode","Branch", "ServiceGroup",		
		"ShortName", "Gender", "FirstName",		
		"MiddleName", "LastName", "BirthDate",
		"BirthPlace", "BirthName", "Citizenship",
		 "TaxBracket", "IndividualTaxpayerNumber", "CompanyName",
		 "Trademark", "Department", "Position",
		 "IdentityCardNumber", "IdentityCardDetails", "ClientNumber",
		 "SecretPhrase", "AddInfo01", "AddInfo02", "AddInfo03",
		 "AddInfo04", "AddDate01", "AddDate02", "UserInfo"})
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String reasonCode; //ReasonCode
	private String reason; //Reason
	private String applRegNumber; //ApplRegNumber	
	private String applicationSource; //ApplicationSource
	private String clientTypeCode; //ClientTypeCode
	private String languageCode; //LanguageCode
	private String maritalStatusCode; //MaritalStatusCode
	private String salutationCode; //SalutationCode
	private String branch; //Branch
	private String serviceGroup; //ServiceGroup
	private String shortName; //ShortName
	private String gender; //Gender
	private String firstName; //FirstName
	private String middleName; //MiddleName
	private String lastName; //LastName
	
	private String birthDate; //BirthDate
	private String birthPlace; //BirthPlace
	private String birthName; //BirthName
	private String citizenship; //Citizenship
	private String taxBracket; //TaxBracket
	private String individualTaxpayerNumber; //IndividualTaxpayerNumber
	private String companyName; //CompanyName
	private String trademark; //Trademark
	private String department; //Department
	private String position; //Position
	private String identityCardNumber; //IdentityCardNumber
	private String identityCardDetails; //IdentityCardDetails
	private String clientNumber; //ClientNumber
	private String secretPhrase; //SecretPhrase 
	
	private String addInfo01; //AddInfo01
	private String addInfo02; //AddInfo02
	private String addInfo03; //AddInfo03
	private String addInfo04; //AddInfo04
	
	private String addDate01; //AddDate01 
	private String addDate02; //AddDate02
	
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

	@JsonProperty("ReasonCode")
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@JsonProperty("Reason")
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
	public String getSalutationCode() {
		return salutationCode;
	}

	public void setSalutationCode(String salutationCode) {
		this.salutationCode = salutationCode;
	}

	@JsonProperty("Branch")
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@JsonProperty("ServiceGroup")
	public String getServiceGroup() {
		return serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}

	@JsonProperty("ShortName")
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@JsonProperty("Gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("FirstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("MiddleName")
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("LastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("BirthDate")
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("BirthPlace")
	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@JsonProperty("BirthName")
	public String getBirthName() {
		return birthName;
	}

	public void setBirthName(String birthName) {
		this.birthName = birthName;
	}

	@JsonProperty("Citizenship")
	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@JsonProperty("TaxBracket")
	public String getTaxBracket() {
		return taxBracket;
	}

	public void setTaxBracket(String taxBracket) {
		this.taxBracket = taxBracket;
	}

	@JsonProperty("IndividualTaxpayerNumber")
	public String getIndividualTaxpayerNumber() {
		return individualTaxpayerNumber;
	}

	public void setIndividualTaxpayerNumber(String individualTaxpayerNumber) {
		this.individualTaxpayerNumber = individualTaxpayerNumber;
	}

	@JsonProperty("CompanyName")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("Trademark")
	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	@JsonProperty("Department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@JsonProperty("Position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@JsonProperty("IdentityCardNumber")
	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	@JsonProperty("IdentityCardDetails")
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
	public String getSecretPhrase() {
		return secretPhrase;
	}

	public void setSecretPhrase(String secretPhrase) {
		this.secretPhrase = secretPhrase;
	}

	@JsonProperty("AddInfo01")
	public String getAddInfo01() {
		return addInfo01;
	}

	public void setAddInfo01(String addInfo01) {
		this.addInfo01 = addInfo01;
	}

	@JsonProperty("AddInfo02")
	public String getAddInfo02() {
		return addInfo02;
	}

	public void setAddInfo02(String addInfo02) {
		this.addInfo02 = addInfo02;
	}

	@JsonProperty("AddDate01")
	public String getAddDate01() {
		return addDate01;
	}

	public void setAddDate01(String addDate01) {
		this.addDate01 = addDate01;
	}

	@JsonProperty("AddDate02")
	public String getAddDate02() {
		return addDate02;
	}

	public void setAddDate02(String addDate02) {
		this.addDate02 = addDate02;
	}

	@JsonProperty("ApplicationSource")
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
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