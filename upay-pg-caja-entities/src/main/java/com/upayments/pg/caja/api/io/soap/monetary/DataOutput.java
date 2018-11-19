package com.upayments.pg.caja.api.io.soap.monetary;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "AuthCode", "RetCode", "RetMsg" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String authCode;
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("AuthCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	
}

