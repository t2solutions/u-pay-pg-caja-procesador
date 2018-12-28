package com.upayments.pg.caja.api.io.soap.createaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "CreatedAddress", "RetCode", "RetMsg", "FailPoint"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public DataOutput() {
		super();
	}
	
}
