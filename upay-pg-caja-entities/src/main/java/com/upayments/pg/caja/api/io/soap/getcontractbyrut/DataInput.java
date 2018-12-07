package com.upayments.pg.caja.api.io.soap.getcontractbyrut;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "GetContractByRutReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private GetContractByRutReq cntByRutReq;

	public DataInput() {
		super();
	}

	@JsonProperty("Header")
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	
	@JsonProperty("GetContractByRutReq")	
	public GetContractByRutReq getCntByRutReq() {
		return cntByRutReq;
	}

	public void setCntByRutReq(GetContractByRutReq req) {
		this.cntByRutReq = req;
	}	

}