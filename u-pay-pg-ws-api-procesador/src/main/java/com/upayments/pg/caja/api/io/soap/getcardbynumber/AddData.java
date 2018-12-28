package com.upayments.pg.caja.api.io.soap.getcardbynumber;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Institution", "InstitutionDesc", "Branch", "BranchDesc", "ClientCategory",
	"ClientCategoryDesc", "ProductCategory", "ProductCategoryDesc", "ContractCategory", "ContractCategoryDesc", 
	"RelationType", "LiabilityCategory",
	"ParentProduct", "ParentProductDesc", "CounterpartChannel", "CounterpartChannelDesc", 
	"Product", "ProductDesc", "AvailableProductionAction", "ChipScheme", "RiskScheme", 
	"RiskFactor", "AddInfo01", "AddInfo02", "AddInfo03", "AddInfo04",
	"StatusCode", "StatusCodeDesc", "ID", 
	"Client", "Parent", "ParentDesc", "ServPack", "IdentityCardNumber"})
public class AddData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String institution; 
	private String institutionDesc; 
	private String branch; 
	private String branchDesc; 
	private String clientCategory; 
	private String clientCategoryDesc; 	
	private String productCategory; 
	private String productCategoryDesc; 
	private String contractCategory; 
	private String contractCategoryDesc; 	
	private String relationType;
	private String liabilityCategory;
	private String availableProductionAction;
	private String parentProduct;
	private String parentProductDesc; 
	private String counterpartChannel; 
	private String counterpartChannelDesc; 
	private String product;
	private String productDesc;
	private String chipScheme;
	private String riskScheme;
	private String riskFactor; 
	private String statusCodeDesc; 
	private String id; 
	private String client; 
	private String parent; 
	private String parentDesc; 
	private String servPack; 
	private String addInfo01; 
	private String addInfo02; 
	private String addInfo03; 
	private String addInfo04; 	
	private String identityCardNumber;

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

	@JsonProperty("CounterpartChannel")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCounterpartChannel() {
		return counterpartChannel;
	}

	public void setCounterpartChannel(String counterpartChannel) {
		this.counterpartChannel = counterpartChannel;
	}

	@JsonProperty("CounterpartChannelDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCounterpartChannelDesc() {
		return counterpartChannelDesc;
	}
	
	public void setCounterpartChannelDesc(String counterpartChannelDesc) {
		this.counterpartChannelDesc = counterpartChannelDesc;
	}

	@JsonProperty("RiskFactor")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRiskFactor() {
		return riskFactor;
	}

	public void setRiskFactor(String riskFactor) {
		this.riskFactor = riskFactor;
	}

	@JsonProperty("StatusCodeDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getStatusCodeDesc() {
		return statusCodeDesc;
	}

	public void setStatusCodeDesc(String statusCodeDesc) {
		this.statusCodeDesc = statusCodeDesc;
	}

	@JsonProperty("ID")
	@JsonInclude(Include.NON_DEFAULT)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	@JsonProperty("Client")
	@JsonInclude(Include.NON_DEFAULT)
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}


	@JsonProperty("Parent")
	@JsonInclude(Include.NON_DEFAULT)
	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	@JsonProperty("ParentDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getParentDesc() {
		return parentDesc;
	}

	public void setParentDesc(String parentDesc) {
		this.parentDesc = parentDesc;
	}

	@JsonProperty("ServPack")
	@JsonInclude(Include.NON_DEFAULT)
	public String getServPack() {
		return servPack;
	}

	public void setServPack(String servPack) {
		this.servPack = servPack;
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

	@JsonProperty("RelationType")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	@JsonProperty("LiabilityCategory")
	@JsonInclude(Include.NON_DEFAULT)
	public String getLiabilityCategory() {
		return liabilityCategory;
	}

	public void setLiabilityCategory(String liabilityCategory) {
		this.liabilityCategory = liabilityCategory;
	}

	@JsonProperty("AvailableProductionAction")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAvailableProductionAction() {
		return availableProductionAction;
	}

	public void setAvailableProductionAction(String availableProductionAction) {
		this.availableProductionAction = availableProductionAction;
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

	@JsonProperty("ChipScheme")
	@JsonInclude(Include.NON_DEFAULT)
	public String getChipScheme() {
		return chipScheme;
	}

	public void setChipScheme(String chipScheme) {
		this.chipScheme = chipScheme;
	}

	@JsonProperty("RiskScheme")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRiskScheme() {
		return riskScheme;
	}

	public void setRiskScheme(String riskScheme) {
		this.riskScheme = riskScheme;
	}

	@JsonProperty("IdentityCardNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}
	
	

}
