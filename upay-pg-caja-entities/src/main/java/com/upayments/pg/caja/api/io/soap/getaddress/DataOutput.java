package com.upayments.pg.caja.api.io.soap.getaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint", "Addresses" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String failPoint; 
	private Address address;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("FailPoint")
	public String getFailPoint() {
		return failPoint;
	}

	public void setFailPoint(String failPoint) {
		this.failPoint = failPoint;
	}

	@JsonProperty("Addresses")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}

