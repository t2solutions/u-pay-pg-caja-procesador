package com.upayments.pg.caja.api.io.soap.getrutclassifier;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;

@JsonPropertyOrder({ "Header", "ClientClassifierReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private ClientClassifierReq cntByClassReq;

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
	
	@JsonProperty("ClientClassifierReq")
	public ClientClassifierReq getCntByClassReq() {
		return cntByClassReq;
	}
	
	public void setCntByClassReq(ClientClassifierReq cntByClassReq) {
		this.cntByClassReq = cntByClassReq;
	}

	
}