package com.upayments.pg.caja.api.io.soap.getrutclassifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "ClassifierName", "ValueName", "ValueCode", "Status",
	"StatusDesc", "PreviousValue", "LastUpdated", "Officer", "Description",
	"GroupCode", "Role", "RoleDesc", "ClassifierOwner", 
	"DateFrom", "DateTo", "ID", "Contract", "StatusLogID", "ContractClassifierCode"})
public class ClientClassifierDetailsAPIRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String classifierName; ///
	private String valueName; //
	private String valueCode; //
	private String status; //
	private String statusDesc; //
	private String previousValue; //
	private String lastUpdated; //
	private String officer; //
	private String description; //
	private String groupCode; //
	private String role; //
	private String roleDesc; //
	private String classifierOwner; //
	private String dateFrom; //
	private String dateTo; //
	private String id; //
	private String contract; //
	private String statusLogID; //
	private String contractClassifierCode; //
	
	public ClientClassifierDetailsAPIRecord() {
		super();
	}

	@JsonProperty("ClassifierName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getClassifierName() {
		return classifierName;
	}

	public void setClassifierName(String classifierName) {
		this.classifierName = classifierName;
	}
	
	@JsonProperty("ValueName")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getValueName() {
		return valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	@JsonProperty("ValueCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getValueCode() {
		return valueCode;
	}

	public void setValueCode(String valueCode) {
		this.valueCode = valueCode;
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

	@JsonProperty("PreviousValue")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(String previousValue) {
		this.previousValue = previousValue;
	}

	@JsonProperty("LastUpdated")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@JsonProperty("Officer")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getOfficer() {
		return officer;
	}

	public void setOfficer(String officer) {
		this.officer = officer;
	}

	@JsonProperty("Description")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("GroupCode")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	@JsonProperty("Role")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@JsonProperty("RoleDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@JsonProperty("classifierOwner")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getClassifierOwner() {
		return classifierOwner;
	}

	public void setClassifierOwner(String classifierOwner) {
		this.classifierOwner = classifierOwner;
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

	@JsonProperty("ID")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("Contract")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	@JsonProperty("StatusLogID")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getStatusLogID() {
		return statusLogID;
	}

	public void setStatusLogID(String statusLogID) {
		this.statusLogID = statusLogID;
	}

	@JsonProperty("ContractClassifierCode")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContractClassifierCode() {
		return contractClassifierCode;
	}

	public void setContractClassifierCode(String contractClassifierCode) {
		this.contractClassifierCode = contractClassifierCode;
	}
	

}
