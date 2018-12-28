package com.upayments.pg.caja.api.io.soap.getclientbyrut;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;

@JsonPropertyOrder({ "Header", "GetClientByRutReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private GetClientByRutReq cliByRutReq;

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
	
	@JsonProperty("GetClientByRutReq")	
	public GetClientByRutReq getClientByRutReq() {
		return cliByRutReq;
	}

	public void setClientByRutReq(GetClientByRutReq req) {
		this.cliByRutReq = req;
	}	

}