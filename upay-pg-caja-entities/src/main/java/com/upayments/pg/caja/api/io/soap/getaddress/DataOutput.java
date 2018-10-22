package com.upayments.pg.caja.api.io.soap.getaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "@xmlns:resp", "RetMsg", "RetCode", "FailPoint", "Addresses" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String namespace;
	private String failPoint; 
	private Address address;
	
	public DataOutput() {
		super();
	}

	
	//@JsonProperty("@xmlns:resp", )
	@JsonProperty(value = "@xmlns:resp", access = Access.WRITE_ONLY)
	public String getNamespace() {
		return namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
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

