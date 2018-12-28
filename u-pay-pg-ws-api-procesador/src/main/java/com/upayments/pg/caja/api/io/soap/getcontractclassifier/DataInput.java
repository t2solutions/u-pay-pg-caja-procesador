package com.upayments.pg.caja.api.io.soap.getcontractclassifier;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;

@JsonPropertyOrder({ "Header", "ContractClassifierReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private ContractClassifierReq cntByClassReq;

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
	
	@JsonProperty("ContractClassifierReq")
	public ContractClassifierReq getCntByClassReq() {
		return cntByClassReq;
	}
	
	public void setCntByClassReq(ContractClassifierReq cntByClassReq) {
		this.cntByClassReq = cntByClassReq;
	}
	
	
/*	
	@JsonProperty("GetContractByRutReq")	
	public GetContractByRutReq getCntByRutReq() {
		return cntByRutReq;
	}

	public void setCntByRutReq(GetContractByRutReq req) {
		this.cntByRutReq = req;
	}	
*/
	
}