package com.upayments.pg.caja.api.io.soap.getcardbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "Data" })
public class GetCardByRutReq implements Serializable {

	private static final long serialVersionUID = 1L; 
	
	public GetCardByRutReq() {
		super();
	}
	
	private Data data;
		
	@JsonProperty("Data")
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}		


}
