package com.upayments.pg.caja.api.io.soap.setcontractstatus;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "SetContractStatusByContractReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private SetContractStatusByContractReq contractStatusByContractReq;

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
	
	@JsonProperty("SetContractStatusByContractReq")
	public SetContractStatusByContractReq getContractStatusByContractReq() {
		return contractStatusByContractReq;
	}
	
	public void setContractStatusByContractReq(
			SetContractStatusByContractReq contractStatusByContractReq) {
		this.contractStatusByContractReq = contractStatusByContractReq;
	}
	
	


}