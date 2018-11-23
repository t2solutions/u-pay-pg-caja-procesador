package com.upayments.pg.caja.api.io.soap.getkeysdukpt;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetKeysDUKPTByPanReq implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Data data;
	
	public GetKeysDUKPTByPanReq() {
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
