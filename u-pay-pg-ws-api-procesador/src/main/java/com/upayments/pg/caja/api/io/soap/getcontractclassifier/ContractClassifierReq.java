package com.upayments.pg.caja.api.io.soap.getcontractclassifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.upayments.pg.caja.api.io.soap.getcontractclassifier.Data;

public class ContractClassifierReq  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Data data;

	@JsonProperty("Data")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}	

}
