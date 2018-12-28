package com.upayments.pg.caja.api.io.soap.setcontractclassifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg"})
public class DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String retCode;
	private String retMsg;	
	
	public DataStatusOutput() {
		super();
	}
	
	@JsonProperty("RetCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRetCode() {
		return retCode;
	}
	
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	
	@JsonProperty("RetMsg")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRetMsg() {
		return retMsg;
	}
	
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

}