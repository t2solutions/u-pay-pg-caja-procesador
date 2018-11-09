package com.upayments.pg.caja.api.io.soap.getcardbycontract;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DataOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private DataStatusOutput data; 
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("Data")
	public DataStatusOutput getData() {
		return data;
	}
	
	public void setData(DataStatusOutput data) {
		this.data = data;
	}

	
}

