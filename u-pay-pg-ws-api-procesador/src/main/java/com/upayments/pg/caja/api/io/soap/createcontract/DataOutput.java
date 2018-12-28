package com.upayments.pg.caja.api.io.soap.createcontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "CreatedContract", "RetCode", "RetMsg"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String createdContract;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("CreatedContract")
	public String getCreatedContract() {
		return createdContract;
	}

	public void setCreatedContract(String createdContract) {
		this.createdContract = createdContract;
	}
	
	
	
}

