package com.upayments.pg.caja.api.io.soap.getvirtualcard;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "DATA" })
public class DataInputByNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private DataByNumber data;

	public DataInputByNumber() {
		super();
	}
	
	@JsonProperty("Header")
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	
	@JsonProperty("DATA")
	public DataByNumber getData() {
		return data;
	}

	public void setData(DataByNumber data) {
		this.data = data;
	}

}