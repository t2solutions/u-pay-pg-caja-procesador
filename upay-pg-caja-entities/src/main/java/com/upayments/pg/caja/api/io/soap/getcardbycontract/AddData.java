package com.upayments.pg.caja.api.io.soap.getcardbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Institution", "InstitutionDesc", "Branch", "BranchDesc", "ClientCategory", "ClientCategoryDesc",
"ClientType",  "ClientTypeDesc", "RedefinedProductCategory", "ContractCategory", "ContractCategoryDesc",
"ParentProduct", "ParentProductDesc", "MainProduct", "ContractSubtype", "ContractSubtypeDesc",
"ReportType", "Role", "Leaf", "Client", "ClientDesc", "ParentContract", "ParentContractDesc",
"BillingContract", "BillingContractDesc", "TopContract", "TopContractDesc", 
"StatusCode", "StatusCodeDesc", "LastApplicationDate", "LastApplicationOfficer", 
"LastApplicationStatus", "LastActivityDate", "ID", "AccountingParent", "AccountingParentDesc",
"ClientFullName", "AddInfo01", "AddInfo02", "AddInfo03", "AddInfo04" })
public class AddData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String institution; //<><xsl:value-of select="resp:XXX" /></Institution>
	private String institutionDesc; //<><xsl:value-of select="resp:XXX" /></InstitutionDesc>
	private String branch; //<><xsl:value-of select="resp:XXX" /></Branch>
	private String branchDesc; //<><xsl:value-of select="resp:XXX" /></BranchDesc>
	private String clientCategory; //<><xsl:value-of select="resp:XXX" /></ClientCategory>
	private String clientCategoryDesc; //<><xsl:value-of select="resp:XXX" /></ClientCategoryDesc>
	private String clientType; //<><xsl:value-of select="resp:XXX" /></ClientType>
	private String clientTypeDesc; //<><xsl:value-of select="resp:XXX" /></ClientTypeDesc>
	private String redefinedProductCategory; //<><xsl:value-of select="resp:XXX" /></RedefinedProductCategory>
	private String contractCategory; //<><xsl:value-of select="resp:XXX" /></ContractCategory>
	private String contractCategoryDesc; //<><xsl:value-of select="resp:XXX" /></ContractCategoryDesc>
	private String parentProduct; //<><xsl:value-of select="resp:XXX" /></ParentProduct>
	private String parentProductDesc; //<><xsl:value-of select="resp:XXX" /></ParentProductDesc>
	private String mainProduct; //<><xsl:value-of select="resp:XXX" /></MainProduct>
	private String contractSubtype; //<><xsl:value-of select="resp:XXX" /></ContractSubtype>
	private String contractSubtypeDesc; //<><xsl:value-of select="resp:XXX" /></ContractSubtypeDesc>
	private String reportType; //<><xsl:value-of select="resp:XXX" /></ReportType>
	private String role; //<><xsl:value-of select="resp:XXX" /></Role>
	private String leaf; //<><xsl:value-of select="resp:XXX" /></Leaf>
	private String client; //<><xsl:value-of select="resp:XXX" /></Client>
	private String clientDesc; //<><xsl:value-of select="resp:XXX" /></ClientDesc>
	private String parentContract; //<><xsl:value-of select="resp:XXX" /></ParentContract>
	private String parentContractDesc; //<><xsl:value-of select="resp:XXX" /></ParentContractDesc>
	private String billingContract; //<><xsl:value-of select="resp:XXX" /></BillingContract>
	private String billingContractDesc; //<><xsl:value-of select="resp:XXX" /></BillingContractDesc>
	private String topContract; //<><xsl:value-of select="resp:XXX" /></TopContract>
	private String topContractDesc; //<><xsl:value-of select="resp:XXX" /></TopContractDesc>
	private String statusCode; //><xsl:value-of select="resp:XXX" /></StatusCode>
	private String statusCodeDesc; //><xsl:value-of select="resp:XXX" /></StatusCodeDesc>
	private String lastApplicationDate; //><xsl:value-of select="resp:XXX" /></LastApplicationDate>
	private String lastApplicationOfficer; //><xsl:value-of select="resp:XXX" /></LastApplicationOfficer>
	private String lastApplicationStatus; //><xsl:value-of select="resp:XXX" /></LastApplicationStatus>
	private String lastActivityDate; //><xsl:value-of select="resp:XXX" /></LastActivityDate>
	private String id; //><xsl:value-of select="resp:XXX" /></ID>
	private String accountingParent; //><xsl:value-of select="resp:XXX" /></AccountingParent>
	private String accountingParentDesc; //><xsl:value-of select="resp:XXX" /></AccountingParentDesc>
	private String clientFullName; //><xsl:value-of select="resp:XXX" /></ClientFullName>
	private String addInfo01; //><xsl:value-of select="resp:XXX" /></AddInfo01>
	private String addInfo02; //AddInfo02><xsl:value-of select="resp:XXX" /></AddInfo02>
	private String addInfo03; //AddInfo03><xsl:value-of select="resp:XXX" /></AddInfo03>
	private String addInfo04; //AddInfo04><xsl:value-of select="resp:XXX" /></AddInfo04>
	
	public AddData() {
		super();
	}

	@JsonProperty("Institution")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	@JsonProperty("InstitutionDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getInstitutionDesc() {
		return institutionDesc;
	}

	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	@JsonProperty("Branch")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@JsonProperty("BranchDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getBranchDesc() {
		return branchDesc;
	}

	public void setBranchDesc(String branchDesc) {
		this.branchDesc = branchDesc;
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

	@JsonProperty("ReportType")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	@JsonProperty("Role")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@JsonProperty("Leaf")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLeaf() {
		return leaf;
	}

	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}

	@JsonProperty("Client")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@JsonProperty("ClientDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getClientDesc() {
		return clientDesc;
	}

	public void setClientDesc(String clientDesc) {
		this.clientDesc = clientDesc;
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

	@JsonProperty("BillingContractDesc")
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

	@JsonProperty("LastActivityDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(String lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
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

	@JsonProperty("ClientFullName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getClientFullName() {
		return clientFullName;
	}

	public void setClientFullName(String clientFullName) {
		this.clientFullName = clientFullName;
	}

	@JsonProperty("AddInfo01")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAddInfo01() {
		return addInfo01;
	}

	public void setAddInfo01(String addInfo01) {
		this.addInfo01 = addInfo01;
	}

	@JsonProperty("AddInfo02")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAddInfo02() {
		return addInfo02;
	}

	public void setAddInfo02(String addInfo02) {
		this.addInfo02 = addInfo02;
	}

	@JsonProperty("AddInfo03")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAddInfo03() {
		return addInfo03;
	}

	public void setAddInfo03(String addInfo03) {
		this.addInfo03 = addInfo03;
	}

	@JsonProperty("AddInfo04")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAddInfo04() {
		return addInfo04;
	}

	public void setAddInfo04(String addInfo04) {
		this.addInfo04 = addInfo04;
	}












	@JsonProperty("LastApplicationOfficer")
	@JsonInclude(Include.NON_DEFAULT)										
	public String getLastApplicationOfficer() {
		return lastApplicationOfficer;
	}

	public void setLastApplicationOfficer(String lastApplicationOfficer) {
		this.lastApplicationOfficer = lastApplicationOfficer;
	}

	@JsonProperty("LastApplicationDate")
	@JsonInclude(Include.NON_DEFAULT)											
	public String getLastApplicationDate() {
		return lastApplicationDate;
	}

	public void setLastApplicationDate(String lastApplicationDate) {
		this.lastApplicationDate = lastApplicationDate;
	}

	@JsonProperty("LastApplicationStatus")
	@JsonInclude(Include.NON_DEFAULT)												
	public String getLastApplicationStatus() {
		return lastApplicationStatus;
	}

	public void setLastApplicationStatus(String lastApplicationStatus) {
		this.lastApplicationStatus = lastApplicationStatus;
	}

	@JsonProperty("ID")
	@JsonInclude(Include.NON_DEFAULT)													
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

}
