package com.upayments.pg.caja.api.io.soap.getaddress;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<AddressDetailsRecord> addresses; //Addresses

	public Address() {
		super();
	}
	
	@JsonProperty("AddressDetailsRecord")
	public List<AddressDetailsRecord> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDetailsRecord> addresses) {
		this.addresses = addresses;
	}
	
	

}
