package com.upayments.pg.caja.api.io.soap.geteventsbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ContractCategory", "ContractCategoryDesc", "EventType", "EventTypeDesc", 
	"EventDetails", "PostingStatus", "PostingStatusDesc", "RecordDate", "StartDate", "EndDate", "ID",
	"Contract", "ContractNum", "TargetDoc"})
public class EventLogDetailsRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String contractCategory;
	private String contractCategoryDesc;
	private String eventType;
	private String eventTypeDesc;
	private String eventDetails;
	private String postingStatus;
	private String postingStatusDesc;
	private String recordDate;
	private String startDate;
	private String endDate;
	private String id;
	private String contract;
	private String contractNum;
	private String targetDoc;
	
	public EventLogDetailsRecord() {
		super();
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

	@JsonProperty("EventType")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@JsonProperty("EventTypeDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEventTypeDesc() {
		return eventTypeDesc;
	}

	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}

	@JsonProperty("EventDetails")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	@JsonProperty("PostingStatus")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPostingStatus() {
		return postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	@JsonProperty("PostingStatusDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPostingStatusDesc() {
		return postingStatusDesc;
	}

	public void setPostingStatusDesc(String postingStatusDesc) {
		this.postingStatusDesc = postingStatusDesc;
	}

	@JsonProperty("RecordDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	@JsonProperty("StartDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("EndDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	@JsonProperty("ContractNum")
	@JsonInclude(Include.NON_DEFAULT)
	public String getContractNum() {
		return contractNum;
	}

	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}

	@JsonProperty("TargetDoc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getTargetDoc() {
		return targetDoc;
	}

	public void setTargetDoc(String targetDoc) {
		this.targetDoc = targetDoc;
	}
	
	
	/*
              <!--Optional:-->
               <resp:ContractCategory>?</resp:ContractCategory>
               <!--Optional:-->
               <resp:ContractCategoryDesc>?</resp:ContractCategoryDesc>
               <!--Optional:-->
               <resp:EventType>?</resp:EventType>
               <!--Optional:-->
               <resp:EventTypeDesc>?</resp:EventTypeDesc>
               <!--Optional:-->
               <resp:EventDetails>?</resp:EventDetails>
               <!--Optional:-->
               <resp:PostingStatus>?</resp:PostingStatus>
               <!--Optional:-->
               <resp:PostingStatusDesc>?</resp:PostingStatusDesc>
               <!--Optional:-->
               <resp:RecordDate>?</resp:RecordDate>
               <!--Optional:-->
               <resp:StartDate>?</resp:StartDate>
               <!--Optional:-->
               <resp:EndDate>?</resp:EndDate>
               <!--Optional:-->
               <resp:ID>?</resp:ID>
               <!--Optional:-->
               <resp:Contract>?</resp:Contract>
               <!--Optional:-->
               <resp:ContractNum>?</resp:ContractNum>
               <!--Optional:-->
               <resp:TargetDoc>?</resp:TargetDoc>	 
	 */

}
