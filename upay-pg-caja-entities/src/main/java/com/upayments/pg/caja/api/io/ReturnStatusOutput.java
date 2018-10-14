package com.upayments.pg.caja.api.io;

import java.io.Serializable;

public class ReturnStatusOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer returnCode;
	private String description;
	
	public ReturnStatusOutput() {
		super();
	}

	public ReturnStatusOutput(int code, String desc) {
		this.returnCode = code;
		this.description = desc;
	}

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
