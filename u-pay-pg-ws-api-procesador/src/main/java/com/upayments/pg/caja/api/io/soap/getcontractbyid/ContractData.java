package com.upayments.pg.caja.api.io.soap.getcontractbyid;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "ProductCategory", "ProductCategoryDesc", "RedefinedProductCategory", "ContractCategory", "ContractCategoryDesc", 
	"ParentProduct", "ParentProductDesc", "MainProduct", "Product", "ProductDesc", "ContractSubtype", 
	"ContractSubtypeDesc", "ContractNumber", "SafeContractNumber", "ContractName", "ContractLevel",
	"ParentContract", "ParentContractDesc", "BillingContract", "BillingContractDesc", "TopContract", "TopContractDesc",
	"OpenDate", "CloseDate", "DueDate", "CheckUsage", "Currency", "CurrencyDesc", "LastBillingDate", 
	"NextBillingDate", "Status", "StatusDesc", "StatusCode", "StatusCodeDesc", 
	"LastApplicationDate", "LastApplicationOfficer", "LastApplicationStatus", 
	"LastActivityDate", "Ready", "ReadyDesc", "AmendmentDate", "LastScan",
	"AccountingParent", "AccountingParentDesc", "LiabilityCategory", "LiabilityContract", 
	"RelationTag", "RelationType", "ServiceGroup"})
public class ContractData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String productCategory; //
	private String productCategoryDesc; //
	private String redefinedProductCategory; //
	private String contractCategory; //
	private String contractCategoryDesc; //
	private String parentProduct; //
	private String parentProductDesc; //
	private String mainProduct; //
	private String product; //
	private String productDesc; //
	private String contractSubtype; //
	private String contractSubtypeDesc; //
	private String contractNumber; //
	private String safeContractNumber; //
	private String contractName; //
	private String contractLevel; //
	private String parentContract; //
	private String parentContractDesc; //
	private String billingContract; //
	private String billingContractDesc; //
	private String topContract; //
	private String topContractDesc; //
	private String openDate; //
	private String closeDate; //
	private String dueDate; //
	private String checkUsage; //
	private String currency; //
	private String currencyDesc; //
	private String lastBillingDate; //
	private String nextBillingDate; //
	private String status; //
	private String statusDesc; //
	private String statusCode; //
	private String statusCodeDesc; //
	private String lastApplicationDate; //
	private String lastApplicationOfficer; //
	private String lastApplicationStatus; //
	private String lastActivityDate; //
	private String ready; //
	private String readyDesc; //
	private String amendmentDate; //
	private String lastScan; //
	private String accountingParent; //
	private String accountingParentDesc; //
	private String liabilityCategory; //
	private String liabilityContract; //
	private String relationTag; //
	private String relationType; //
	private String serviceGroup; //
	
	public ContractData() {
		super();
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

	@JsonProperty("RedefinedProductCategory")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRedefinedProductCategory() {
		return redefinedProductCategory;
	}

	public void setRedefinedProductCategory(String redefinedProductCategory) {
		this.redefinedProductCategory = redefinedProductCategory;
	}


	@JsonProperty("ContractCategory")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContractCategory() {
		return contractCategory;
	}

	public void setContractCategory(String contractCategory) {
		this.contractCategory = contractCategory;
	}


	@JsonProperty("ContractCategoryDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractCategoryDesc() {
		return contractCategoryDesc;
	}

	public void setContractCategoryDesc(String contractCategoryDesc) {
		this.contractCategoryDesc = contractCategoryDesc;
	}

	@JsonProperty("ParentProduct")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getParentProduct() {
		return parentProduct;
	}

	public void setParentProduct(String parentProduct) {
		this.parentProduct = parentProduct;
	}

	@JsonProperty("ParentProductDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getParentProductDesc() {
		return parentProductDesc;
	}

	public void setParentProductDesc(String parentProductDesc) {
		this.parentProductDesc = parentProductDesc;
	}

	@JsonProperty("MainProduct")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getMainProduct() {
		return mainProduct;
	}

	public void setMainProduct(String mainProduct) {
		this.mainProduct = mainProduct;
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

	@JsonProperty("ContractSubtype")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContractSubtype() {
		return contractSubtype;
	}

	public void setContractSubtype(String contractSubtype) {
		this.contractSubtype = contractSubtype;
	}

	@JsonProperty("ContractSubtypeDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContractSubtypeDesc() {
		return contractSubtypeDesc;
	}

	public void setContractSubtypeDesc(String contractSubtypeDesc) {
		this.contractSubtypeDesc = contractSubtypeDesc;
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


	@JsonProperty("ContractName")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}


	@JsonProperty("ContractLevel")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getContractLevel() {
		return contractLevel;
	}

	public void setContractLevel(String contractLevel) {
		this.contractLevel = contractLevel;
	}

	@JsonProperty("ParentContract")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getParentContract() {
		return parentContract;
	}

	public void setParentContract(String parentContract) {
		this.parentContract = parentContract;
	}

	@JsonProperty("ParentContractDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getParentContractDesc() {
		return parentContractDesc;
	}

	public void setParentContractDesc(String parentContractDesc) {
		this.parentContractDesc = parentContractDesc;
	}

	@JsonProperty("BillingContract")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBillingContract() {
		return billingContract;
	}

	public void setBillingContract(String billingContract) {
		this.billingContract = billingContract;
	}

	@JsonProperty("TopContractDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBillingContractDesc() {
		return billingContractDesc;
	}

	public void setBillingContractDesc(String billingContractDesc) {
		this.billingContractDesc = billingContractDesc;
	}

	@JsonProperty("TopContract")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTopContract() {
		return topContract;
	}

	public void setTopContract(String topContract) {
		this.topContract = topContract;
	}

	@JsonProperty("TopContractDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getTopContractDesc() {
		return topContractDesc;
	}

	public void setTopContractDesc(String topContractDesc) {
		this.topContractDesc = topContractDesc;
	}

	@JsonProperty("OpenDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	@JsonProperty("CloseDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	@JsonProperty("DueDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
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

	@JsonProperty("StatusCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@JsonProperty("StatusCodeDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getStatusCodeDesc() {
		return statusCodeDesc;
	}

	public void setStatusCodeDesc(String statusCodeDesc) {
		this.statusCodeDesc = statusCodeDesc;
	}

	@JsonProperty("LastApplicationDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastApplicationDate() {
		return lastApplicationDate;
	}

	public void setLastApplicationDate(String lastApplicationDate) {
		this.lastApplicationDate = lastApplicationDate;
	}

	@JsonProperty("LastApplicationOfficer")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastApplicationOfficer() {
		return lastApplicationOfficer;
	}

	public void setLastApplicationOfficer(String lastApplicationOfficer) {
		this.lastApplicationOfficer = lastApplicationOfficer;
	}

	@JsonProperty("LastApplicationStatus")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastApplicationStatus() {
		return lastApplicationStatus;
	}

	public void setLastApplicationStatus(String lastApplicationStatus) {
		this.lastApplicationStatus = lastApplicationStatus;
	}
	
	@JsonProperty("LastActivityDate")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(String lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
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

	@JsonProperty("AccountingParent")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAccountingParent() {
		return accountingParent;
	}

	public void setAccountingParent(String accountingParent) {
		this.accountingParent = accountingParent;
	}

	@JsonProperty("AccountingParentDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAccountingParentDesc() {
		return accountingParentDesc;
	}

	public void setAccountingParentDesc(String accountingParentDesc) {
		this.accountingParentDesc = accountingParentDesc;
	}

	@JsonProperty("LiabilityCategory")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLiabilityCategory() {
		return liabilityCategory;
	}

	public void setLiabilityCategory(String liabilityCategory) {
		this.liabilityCategory = liabilityCategory;
	}

	@JsonProperty("LiabilityContract")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLiabilityContract() {
		return liabilityContract;
	}

	public void setLiabilityContract(String liabilityContract) {
		this.liabilityContract = liabilityContract;
	}

	@JsonProperty("RelationTag")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRelationTag() {
		return relationTag;
	}

	public void setRelationTag(String relationTag) {
		this.relationTag = relationTag;
	}

	@JsonProperty("RelationType")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	@JsonProperty("ServiceGroup")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getServiceGroup() {
		return serviceGroup;
	}

	public void setServiceGroup(String serviceGroup) {
		this.serviceGroup = serviceGroup;
	}
	

}
