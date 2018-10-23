package com.upayments.pg.caja.api.io.soap.getclientbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Institution", "InstitutionDesc", "Branch", "BranchDesc", "ProductCategory", 
	"ProductCategoryDesc", "Trademark", "EmbossedLastName", "EmbossedFirstName", "EmbossedCompanyName",
	"SecretPhrase", "RegistrationDate", "LastApplicationOfficer", "LastApplicationDate",
	"LastApplicationStatus", "Ready", "ReadyDesc", "AmendmentDate", "ID" })
public class AddData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String institution; //
	private String institutionDesc; //
	private String branch; //
	private String branchDesc; //
	private String productCategory; //
	private String productCategoryDesc; //
	private String trademark; //
	private String embossedLastName; //
	private String embossedFirstName; //
	private String embossedCompanyName; //
	private String secretPhrase; //
	private String registrationDate; //
	private String lastApplicationOfficer; //
	private String lastApplicationDate; //
	private String lastApplicationStatus; //
	private String ready; //
	private String readyDesc; //
	private String amendmentDate; //
	private String id; //
	
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

	@JsonProperty("Trademark")
	@JsonInclude(Include.NON_DEFAULT)			
	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	@JsonProperty("EmbossedLastName")
	@JsonInclude(Include.NON_DEFAULT)				
	public String getEmbossedLastName() {
		return embossedLastName;
	}

	public void setEmbossedLastName(String embossedLastName) {
		this.embossedLastName = embossedLastName;
	}

	@JsonProperty("EmbossedFirstName")
	@JsonInclude(Include.NON_DEFAULT)						
	public String getEmbossedFirstName() {
		return embossedFirstName;
	}

	public void setEmbossedFirstName(String embossedFirstName) {
		this.embossedFirstName = embossedFirstName;
	}

	@JsonProperty("EmbossedCompanyName")
	@JsonInclude(Include.NON_DEFAULT)							
	public String getEmbossedCompanyName() {
		return embossedCompanyName;
	}

	public void setEmbossedCompanyName(String embossedCompanyName) {
		this.embossedCompanyName = embossedCompanyName;
	}

	@JsonProperty("SecretPhrase")
	@JsonInclude(Include.NON_DEFAULT)								
	public String getSecretPhrase() {
		return secretPhrase;
	}

	public void setSecretPhrase(String secretPhrase) {
		this.secretPhrase = secretPhrase;
	}

	@JsonProperty("RegistrationDate")
	@JsonInclude(Include.NON_DEFAULT)									
	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
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

	@JsonProperty("ID")
	@JsonInclude(Include.NON_DEFAULT)													
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

}
