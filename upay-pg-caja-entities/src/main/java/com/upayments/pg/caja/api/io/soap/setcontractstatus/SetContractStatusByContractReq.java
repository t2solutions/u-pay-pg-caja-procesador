package com.upayments.pg.caja.api.io.soap.setcontractstatus;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetContractStatusByContractReq implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Data data;
	
	public SetContractStatusByContractReq() {
		super();
	}
	
	@JsonProperty("Data")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}	
	
	

}
