package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.activatecard.DataOutput;

@JsonPropertyOrder({ "HeaderResponse", "DATA" })
public class DataResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderResponse header;
	private DataOutput data;
	
	@JsonProperty("Header")
	public HeaderResponse getHeader() {
		return header;
	}
	public void setHeader(HeaderResponse header) {
		this.header = header;
	}
	
	@JsonProperty("DATA")
	public DataOutput getData() {
		return data;
	}

	public void setData(DataOutput data) {
		this.data = data;
	}	
	
	
	
	

}
