package com.upayments.pg.caja.api.io.soap.monetary;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "TransactionID", "UniqueRefNumber",  "MsgCode", "RRN", "PayerContractScope", "PayerContractIdentifier", "PayerContractRelation",
	"PayerCardSequenceNumber", "PayerExpirationDate","PayeeContractScope", "PayeeContractIdentifier", "PayeeContractRelation", "PayeeCardSequenceNumber",
	"PayeeExpirationDate", "Amount", "Currency", "TransactionAttributes", "TransactionDetails", "TransactionDate", "OperatorID", "PostingDate",
	"UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bankCode;
	private String transactionId;
	private String uniqueRefNumber;
	private String msgCode;
	private String rrn;
	private String payerContractScope;
	private String payerContractIdentifier;
	private String payerContractRelation;	
	private String payerCardSequenceNumber;
	private String payerExpirationDate;
	private String payeeContractScope;
	private String payeeContractIdentifier;
	private String payeeContractRelation;
	private String payeeCardSequenceNumber;
	private String payeeExpirationDate;
	private String amount;
	private String currency;
	private String transactionAttributes;
	private String transactionDetails;
	private String transactionDate;
	private String operatorID;
	private String postingDate;
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

	
	@JsonProperty("TransactionID")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@JsonProperty("UniqueRefNumber")
	public String getUniqueRefNumber() {
		return uniqueRefNumber;
	}

	public void setUniqueRefNumber(String uniqueRefNumber) {
		this.uniqueRefNumber = uniqueRefNumber;
	}

	@JsonProperty("MsgCode")
	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	@JsonProperty("RRN")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	@JsonProperty("PayerContractScope")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayerContractScope() {
		return payerContractScope;
	}

	public void setPayerContractScope(String payerContractScope) {
		this.payerContractScope = payerContractScope;
	}

	@JsonProperty("PayerContractIdentifier")
	public String getPayerContractIdentifier() {
		return payerContractIdentifier;
	}

	public void setPayerContractIdentifier(String payerContractIdentifier) {
		this.payerContractIdentifier = payerContractIdentifier;
	}

	@JsonProperty("PayerContractRelation")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayerContractRelation() {
		return payerContractRelation;
	}

	public void setPayerContractRelation(String payerContractRelation) {
		this.payerContractRelation = payerContractRelation;
	}

	@JsonProperty("PayerCardSequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayerCardSequenceNumber() {
		return payerCardSequenceNumber;
	}

	public void setPayerCardSequenceNumber(String payerCardSequenceNumber) {
		this.payerCardSequenceNumber = payerCardSequenceNumber;
	}

	@JsonProperty("PayerExpirationDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayerExpirationDate() {
		return payerExpirationDate;
	}

	public void setPayerExpirationDate(String payerExpirationDate) {
		this.payerExpirationDate = payerExpirationDate;
	}

	@JsonProperty("PayeeContractScope")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayeeContractScope() {
		return payeeContractScope;
	}

	public void setPayeeContractScope(String payeeContractScope) {
		this.payeeContractScope = payeeContractScope;
	}

	@JsonProperty("PayeeContractIdentifier")
	public String getPayeeContractIdentifier() {
		return payeeContractIdentifier;
	}

	public void setPayeeContractIdentifier(String payeeContractIdentifier) {
		this.payeeContractIdentifier = payeeContractIdentifier;
	}

	@JsonProperty("PayeeContractRelation")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayeeContractRelation() {
		return payeeContractRelation;
	}

	public void setPayeeContractRelation(String payeeContractRelation) {
		this.payeeContractRelation = payeeContractRelation;
	}

	@JsonProperty("PayeeCardSequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayeeCardSequenceNumber() {
		return payeeCardSequenceNumber;
	}

	public void setPayeeCardSequenceNumber(String payeeCardSequenceNumber) {
		this.payeeCardSequenceNumber = payeeCardSequenceNumber;
	}

	@JsonProperty("PayeeExpirationDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPayeeExpirationDate() {
		return payeeExpirationDate;
	}

	public void setPayeeExpirationDate(String payeeExpirationDate) {
		this.payeeExpirationDate = payeeExpirationDate;
	}

	@JsonProperty("Amount")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@JsonProperty("Currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("TransactionAttributes")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTransactionAttributes() {
		return transactionAttributes;
	}

	public void setTransactionAttributes(String transactionAttributes) {
		this.transactionAttributes = transactionAttributes;
	}

	@JsonProperty("TransactionDetails")
	public String getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	@JsonProperty("TransactionDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@JsonProperty("OperatorID")
	@JsonInclude(Include.NON_DEFAULT)
	public String getOperatorID() {
		return operatorID;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	@JsonProperty("PostingDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}