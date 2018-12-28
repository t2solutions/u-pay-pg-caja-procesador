package com.upayments.pg.caja.api.io.soap.getcardbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "ContractNumber", "SafeContractNumber", "ContractLevel", 
	"Product", "ProductDesc", "ProductCategory", 
	"ProductCategoryDesc", "OpenDate", "CheckUsage", "Currency", "CurrencyDesc",
	"Available", "Balance", "CreditLimit", "AddLimit", "Blocked", "TotalDue",
	"PastDue", "LastBillingDate", "NextBillingDate", "Status", "StatusDesc",
	"Ready", "ReadyDesc", "AmendmentDate", "LastScan"})
public class CardData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String contractNumber; //
	private String safeContractNumber; //
	private String contractLevel; //
	private String product; //
	private String productDesc; //
	private String productCategory; //
	private String productCategoryDesc; //
	private String openDate; //
	private String checkUsage; //
	private String currency; //
	private String currencyDesc; //
	private String available; //
	private String balance; //
	private String creditLimit; //
	private String addLimit; //
	private String blocked; //
	private String totalDue; //
	private String pastDue; //
	private String lastBillingDate; //
	private String nextBillingDate; //
	private String status; //
	private String statusDesc; //
	private String ready; //
	private String readyDesc; //
	private String amendmentDate; //
	private String lastScan; //
	
	public CardData() {
		super();
	}

	@JsonProperty("ContractNumber")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	@JsonProperty("SafeContractNumber")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getSafeContractNumber() {
		return safeContractNumber;
	}

	public void setSafeContractNumber(String safeContractNumber) {
		this.safeContractNumber = safeContractNumber;
	}

	@JsonProperty("ContractLevel")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractLevel() {
		return contractLevel;
	}

	public void setContractLevel(String contractLevel) {
		this.contractLevel = contractLevel;
	}

	@JsonProperty("Product")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@JsonProperty("ProductDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@JsonProperty("ProductCategory")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@JsonProperty("ProductCategoryDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProductCategoryDesc() {
		return productCategoryDesc;
	}

	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
	}

	@JsonProperty("OpenDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	@JsonProperty("CheckUsage")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getCheckUsage() {
		return checkUsage;
	}

	public void setCheckUsage(String checkUsage) {
		this.checkUsage = checkUsage;
	}

	@JsonProperty("Currency")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("CurrencyDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCurrencyDesc() {
		return currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}

	@JsonProperty("Available")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@JsonProperty("Balance")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@JsonProperty("CreditLimit")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	@JsonProperty("AddLimit")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAddLimit() {
		return addLimit;
	}

	public void setAddLimit(String addLimit) {
		this.addLimit = addLimit;
	}

	@JsonProperty("Blocked")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	@JsonProperty("TotalDue")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(String totalDue) {
		this.totalDue = totalDue;
	}

	@JsonProperty("PastDue")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getPastDue() {
		return pastDue;
	}

	public void setPastDue(String pastDue) {
		this.pastDue = pastDue;
	}

	@JsonProperty("LastBillingDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getLastBillingDate() {
		return lastBillingDate;
	}

	public void setLastBillingDate(String lastBillingDate) {
		this.lastBillingDate = lastBillingDate;
	}

	@JsonProperty("NextBillingDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getNextBillingDate() {
		return nextBillingDate;
	}

	public void setNextBillingDate(String nextBillingDate) {
		this.nextBillingDate = nextBillingDate;
	}

	@JsonProperty("Status")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("StatusDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
	@JsonProperty("Ready")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getReady() {
		return ready;
	}

	public void setReady(String ready) {
		this.ready = ready;
	}

	@JsonProperty("ReadyDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getReadyDesc() {
		return readyDesc;
	}

	public void setReadyDesc(String readyDesc) {
		this.readyDesc = readyDesc;
	}

	@JsonProperty("AmendmentDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAmendmentDate() {
		return amendmentDate;
	}

	public void setAmendmentDate(String amendmentDate) {
		this.amendmentDate = amendmentDate;
	}

	@JsonProperty("LastScan")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastScan() {
		return lastScan;
	}

	public void setLastScan(String lastScan) {
		this.lastScan = lastScan;
	}
	
}
