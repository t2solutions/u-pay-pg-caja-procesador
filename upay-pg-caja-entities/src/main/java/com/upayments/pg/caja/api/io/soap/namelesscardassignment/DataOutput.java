package com.upayments.pg.caja.api.io.soap.namelesscardassignment;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String failPoint;
	
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

	
}

