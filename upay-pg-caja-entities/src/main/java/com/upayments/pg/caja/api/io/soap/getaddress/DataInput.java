package com.upayments.pg.caja.api.io.soap.getaddress;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.EmptyHeaderRequest;

@JsonPropertyOrder({ "Header", "GetAddressesReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmptyHeaderRequest header;
	private GetAddressesReq addrReq;

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
	
	@JsonProperty("GetAddressesReq")	
	public GetAddressesReq getAddrReq() {
		return addrReq;
	}

	public void setAddrReq(GetAddressesReq addrReq) {
		this.addrReq = addrReq;
	}	

}