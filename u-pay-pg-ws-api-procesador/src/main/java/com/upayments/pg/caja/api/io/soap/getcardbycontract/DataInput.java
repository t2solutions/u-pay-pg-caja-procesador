package com.upayments.pg.caja.api.io.soap.getcardbycontract;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "GetCardByContractReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private GetCardByContractReq getCardByContractReq;

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
	
	@JsonProperty("GetCardByContractReq")
	public GetCardByContractReq getGetCardByContractReq() {
		return getCardByContractReq;
	}
	
	public void setGetCardByContractReq(
			GetCardByContractReq getCardByContractReq) {
		this.getCardByContractReq = getCardByContractReq;
	}

	

	
	

	
}