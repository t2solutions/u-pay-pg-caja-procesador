package com.upayments.pg.caja.api.io.soap.getcardbynumber;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "GetCardByRutReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private GetCardByNumberReq getCardByRutReq;

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
	
	@JsonProperty("GetCardByRutReq")
	public GetCardByNumberReq getGetCardByRutReq() {
		return getCardByRutReq;
	}
	
	public void setGetCardByContractReq(
			GetCardByNumberReq getCardByRutReq) {
		this.getCardByRutReq = getCardByRutReq;
	}

	

	
	

	
}