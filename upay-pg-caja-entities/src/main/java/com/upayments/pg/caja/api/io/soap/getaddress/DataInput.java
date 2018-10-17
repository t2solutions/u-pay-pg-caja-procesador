package com.upayments.pg.caja.api.io.soap.getaddress;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "DATA" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Data data;

	public DataInput() {
		super();
	}
	
	@JsonProperty("DATA")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}