package com.upayments.pg.caja.api.io.soap.geteventsbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventsByContractReq implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Data data;
	
	public EventsByContractReq() {
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
