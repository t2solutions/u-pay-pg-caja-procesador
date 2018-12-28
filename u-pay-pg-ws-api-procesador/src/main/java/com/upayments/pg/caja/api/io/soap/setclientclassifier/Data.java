package com.upayments.pg.caja.api.io.soap.setclientclassifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "BankCode", "ClientIdentifier", "ContractRelation", "Classifier",
	"Value", "DateFrom", "DateTo", "ReasonCode", "Reason", "ApplRegNumber", "ApplicationSource", "UserInfo"})

public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String bankCode;
	private String clientIdentifier; //		
	private String contractRelation; 
	private String classifier;
	private String value;
	private String dateFrom;
	private String dateTo;
	private String reasonCode;
	private String reason;
	private String applRegNumber;
	private String applicationSource;
	private String userInfo; //		
	
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

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
	@JsonProperty("Classifier")
	public String getClassifier() {
		return classifier;
	}

	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}

	@JsonProperty("Value")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("DateFrom")
	@JsonInclude(Include.NON_DEFAULT)			
	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	@JsonProperty("DateTo")
	@JsonInclude(Include.NON_DEFAULT)				
	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	@JsonProperty("Reason")
	@JsonInclude(Include.NON_DEFAULT)			
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	@JsonProperty("ReasonCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@JsonProperty("ApplicationSource")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}
	
}