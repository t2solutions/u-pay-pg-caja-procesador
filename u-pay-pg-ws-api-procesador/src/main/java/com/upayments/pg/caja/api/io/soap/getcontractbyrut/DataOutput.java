package com.upayments.pg.caja.api.io.soap.getcontractbyrut;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint", "IssContractDetailsAPIOutputV2Record"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String failPoint;
	private List<IssContractDetailsAPIOutputV2Record> issClientDetails;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("FailPoint")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getFailPoint() {
		return failPoint;
	}
	public void setFailPoint(String failPoint) {
		this.failPoint = failPoint;
	}
		
	@JsonProperty("IssContractDetailsAPIOutputV2Record")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<IssContractDetailsAPIOutputV2Record> getIssClientDetails() {
		return issClientDetails;
	}
	public void setIssClientDetails(List<IssContractDetailsAPIOutputV2Record> issClientDetails) {
		this.issClientDetails = issClientDetails;
	}
		



	
}

