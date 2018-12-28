package com.upayments.pg.caja.api.io.soap.namelesscardassignment;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonPropertyOrder({ "RetCode", "RetMsg"})
public class DataStatusOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer returnCode;	
	private String returnMessage;
	
	public DataStatusOutput() {
		super();
	}
	
	@JsonProperty("resp:RetCode")
	@JsonInclude(Include.NON_DEFAULT)
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	
	@JsonProperty("resp:RetMsg")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getReturnMessage() {
		return returnMessage;
	}
	
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	
	
}
