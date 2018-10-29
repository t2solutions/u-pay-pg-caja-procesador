package com.upayments.pg.caja.api.io.soap.getcontracttransactions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "TransactionAmount", "TransactionCurrency", 
	"TransactionCurrencyDesc", "SettlementAmount", "SettlementCurrency",
	"SettlementCurrencyDesc", "BaseAmount", "FeeAmount", "FeeDescription", "AccountCurrency",
	"AccountCurrencyDesc", "FXRate", "TransactionType", "TransactionTypeDesc", "TransactionTypeCode",
	"TransactionDate", "PostingDate", "SIC", "TransDetails", "TransDescription", "AuthCode",
	"ResponseCode", "ResponseCodeDesc", "TransactionStatus", "Category", "CategoryDesc",
	"IsAuthorisation", "RRN", "Macrotransaction", "Document", "AuthDocID", "FinDocID"})
public class CSWTransactionDetailsRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String transactionAmount; //TransactionAmount
	private String transactionCurrency; //TransactionCurrency
	private String transactionCurrencyDesc; //TransactionCurrencyDesc
	private String settlementAmount; //SettlementAmount	 
	private String settlementCurrency; //SettlementCurrency
	private String settlementCurrencyDesc; //SettlementCurrencyDesc
	private String baseAmount; //BaseAmount
	private String feeAmount; //FeeAmount
	private String feeDescription; //FeeDescription
	private String accountCurrency; //AccountCurrency
	private String accountCurrencyDesc; //AccountCurrencyDesc
	private String fxRate; //FXRate
	private String transactionType; //TransactionType
	private String transactionTypeDesc; //TransactionTypeDesc
	private String transactionTypeCode; //TransactionTypeCode
	private String transactionDate; //TransactionDate
	private String postingDate; //PostingDate
	private String sic; //SIC
	private String transDetails; //TransDetails
	private String transDescription; //TransDescription
	private String authCode; //AuthCode
	private String responseCode; //ResponseCode
	private String responseCodeDesc; //ResponseCodeDesc
	private String transactionStatus; //TransactionStatus
	private String category; //Category
	private String categoryDesc; //CategoryDesc
	private String isAuthorisation; //IsAuthorisation
	private String rrn; //RRN
	private String macrotransaction; //Macrotransaction
	private String document; //Document
	private String authDocID; //AuthDocID
	private String finDocID; //FinDocID
	
	public CSWTransactionDetailsRecord() {
		super();
	}

	@JsonProperty("TransactionAmount")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@JsonProperty("TransactionCurrency")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	@JsonProperty("TransactionCurrencyDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransactionCurrencyDesc() {
		return transactionCurrencyDesc;
	}

	public void setTransactionCurrencyDesc(String transactionCurrencyDesc) {
		this.transactionCurrencyDesc = transactionCurrencyDesc;
	}

	@JsonProperty("SettlementAmount")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@JsonProperty("SettlementCurrency")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@JsonProperty("SettlementCurrencyDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSettlementCurrencyDesc() {
		return settlementCurrencyDesc;
	}

	public void setSettlementCurrencyDesc(String settlementCurrencyDesc) {
		this.settlementCurrencyDesc = settlementCurrencyDesc;
	}

	@JsonProperty("BaseAmount")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	@JsonProperty("FeeAmount")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	@JsonProperty("FeeDescription")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	@JsonProperty("AccountCurrency")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	@JsonProperty("AccountCurrencyDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAccountCurrencyDesc() {
		return accountCurrencyDesc;
	}

	public void setAccountCurrencyDesc(String accountCurrencyDesc) {
		this.accountCurrencyDesc = accountCurrencyDesc;
	}

	@JsonProperty("FxRate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getFxRate() {
		return fxRate;
	}

	public void setFxRate(String fxRate) {
		this.fxRate = fxRate;
	}

	@JsonProperty("TransactionType")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@JsonProperty("TransactionTypeDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransactionTypeDesc() {
		return transactionTypeDesc;
	}
	
	public void setTransactionTypeDesc(String transactionTypeDesc) {
		this.transactionTypeDesc = transactionTypeDesc;
	}

	@JsonProperty("TransactionTypeCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}
	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}

	@JsonProperty("TransactionDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@JsonProperty("PostingDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	@JsonProperty("SIC")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSic() {
		return sic;
	}

	public void setSic(String sic) {
		this.sic = sic;
	}

	@JsonProperty("TransDetails")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getTransDetails() {
		return transDetails;
	}

	public void setTransDetails(String transDetails) {
		this.transDetails = transDetails;
	}

	@JsonProperty("TransDescription")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTransDescription() {
		return transDescription;
	}

	public void setTransDescription(String transDescription) {
		this.transDescription = transDescription;
	}

	@JsonProperty("TransDescription")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@JsonProperty("ResponseCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	@JsonProperty("ResponseCodeDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getResponseCodeDesc() {
		return responseCodeDesc;
	}

	public void setResponseCodeDesc(String responseCodeDesc) {
		this.responseCodeDesc = responseCodeDesc;
	}

	@JsonProperty("TransactionStatus")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@JsonProperty("Category")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("CategoryDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	@JsonProperty("IsAuthorisation")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getIsAuthorisation() {
		return isAuthorisation;
	}

	public void setIsAuthorisation(String isAuthorisation) {
		this.isAuthorisation = isAuthorisation;
	}

	@JsonProperty("RRN")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	@JsonProperty("Macrotransaction")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getMacrotransaction() {
		return macrotransaction;
	}

	public void setMacrotransaction(String macrotransaction) {
		this.macrotransaction = macrotransaction;
	}

	@JsonProperty("Document")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	@JsonProperty("AuthDocID")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAuthDocID() {
		return authDocID;
	}

	public void setAuthDocID(String authDocID) {
		this.authDocID = authDocID;
	}

	@JsonProperty("FinDocID")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getFinDocID() {
		return finDocID;
	}

	public void setFinDocID(String finDocID) {
		this.finDocID = finDocID;
	}

}
