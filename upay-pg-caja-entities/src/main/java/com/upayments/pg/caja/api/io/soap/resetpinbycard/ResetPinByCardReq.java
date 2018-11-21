package com.upayments.pg.caja.api.io.soap.resetpinbycard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResetPinByCardReq implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Data data;
	
	public ResetPinByCardReq() {
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
