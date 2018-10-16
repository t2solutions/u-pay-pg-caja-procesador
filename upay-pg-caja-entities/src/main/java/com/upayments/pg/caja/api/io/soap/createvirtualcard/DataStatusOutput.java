package com.upayments.pg.caja.api.io.soap.createvirtualcard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder({ "RetCode", "RetMsg"})
public class DataStatusOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer returnCode;	
	private String returnMessage;
	
	public DataStatusOutput() {
		super();
	}
	
	@JsonProperty("resp:RetCode")
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	
	@JsonProperty("resp:RetMsg")
	public String getReturnMessage() {
		return returnMessage;
	}
	
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	
	
}
