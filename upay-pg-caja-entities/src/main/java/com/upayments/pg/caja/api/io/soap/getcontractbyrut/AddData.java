package com.upayments.pg.caja.api.io.soap.getcontractbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Institution", "InstitutionDesc", "Branch", "BranchDesc", 
	"ClientCategory", "ClientCategoryDesc", "ClientType", "ClientTypeDesc", "ReportType",
	"Role", "Leaf", "Client", "ID", "ClientFullName", "AddInfo01", "AddInfo02", "AddInfo03", 
	"AddInfo04", "BehaviourGroup", "BehaviourType", "EnablesItem"})
public class AddData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String institution; //
	private String institutionDesc; //
	private String branch; //
	private String branchDesc; //
	private String clientCategory; //
	private String clientCategoryDesc; //;
	private String clientType; //
	private String clientTypeDesc; //
	private String reportType; //
	private String role; //
	private String leaf; //
	private String client; //
	private String id; //
	private String clientFullName; //
	private String addInfo01; //
	private String addInfo02; //
	private String addInfo03; //
	private String addInfo04; //
	private String behaviourGroup; //
	private String behaviourType; //
	private String enablesItem; //
	
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

	@JsonProperty("BehaviourGroup")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBehaviourGroup() {
		return behaviourGroup;
	}

	public void setBehaviourGroup(String behaviourGroup) {
		this.behaviourGroup = behaviourGroup;
	}

	@JsonProperty("BehaviourType")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBehaviourType() {
		return behaviourType;
	}

	public void setBehaviourType(String behaviourType) {
		this.behaviourType = behaviourType;
	}

	@JsonProperty("EnablesItem")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getEnablesItem() {
		return enablesItem;
	}

	public void setEnablesItem(String enablesItem) {
		this.enablesItem = enablesItem;
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
