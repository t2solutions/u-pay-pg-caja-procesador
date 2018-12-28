package com.upayments.pg.caja.api.io.soap.openevent;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;

@JsonPropertyOrder({ "Header", "DATA" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private Data data;

	public DataInput() {
		super();
	}
	
	@JsonProperty("Header")
	public EmptyHeaderRequest getHeader() {
		return header;
	}
	public void setHeader(EmptyHeaderRequest header) {
		this.header = header;
	}	
	
	@JsonProperty("DATA")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}