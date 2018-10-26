package com.upayments.pg.caja.api.io.soap.getvirtualcard;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint", "IssContractDetailsAPIOutputRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String failPoint; //FailPoint
	private List<IssContractDetailsAPIOutputRecord> issRecord;
	
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

	@JsonProperty("IssContractDetailsAPIOutputRecord")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<IssContractDetailsAPIOutputRecord> getIssRecord() {
		return issRecord;
	}

	public void setIssRecord(List<IssContractDetailsAPIOutputRecord> issRecord) {
		this.issRecord = issRecord;
	}
	
	
	
	
	
}

