package com.upayments.pg.caja.api.io.soap.getclientbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ClientData", "AddData" })
public class IssClientDetailsAPIRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ClientData clientData;	
	private AddData addData;
	
	public IssClientDetailsAPIRecord() {
		super();
	}
	
	@JsonProperty("AddData")
	@JsonInclude(Include.NON_DEFAULT)
	public AddData getAddData() {
		return addData;
	}
	
	public void setAddData(AddData addData) {
		this.addData = addData;
	}
	
	@JsonProperty("ClientData")
	@JsonInclude(Include.NON_DEFAULT)
	public ClientData getClientData() {
		return clientData;
	}
	
	public void setClientData(ClientData clientData) {
		this.clientData = clientData;
	}
	
}
