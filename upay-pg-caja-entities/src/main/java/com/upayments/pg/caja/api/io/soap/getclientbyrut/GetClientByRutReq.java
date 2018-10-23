package com.upayments.pg.caja.api.io.soap.getclientbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetClientByRutReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private Data data;

	@JsonProperty("DATA")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}	

}
