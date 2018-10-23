package com.upayments.pg.caja.api.io.soap.getclientbyrut;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "IssClientDetailsAPIRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<IssClientDetailsAPIRecord> issClientDetails;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("IssClientDetailsAPIRecord")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<IssClientDetailsAPIRecord> getIssClientDetails() {
		return issClientDetails;
	}
	public void setIssClientDetails(List<IssClientDetailsAPIRecord> issClientDetails) {
		this.issClientDetails = issClientDetails;
	}
		



	
}

