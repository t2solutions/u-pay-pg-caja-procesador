package com.upayments.pg.caja.api.io.soap.getkeysdukpt;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "GetKeysDUKPTByPanResp" })
public class DataOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GetKeysDUKPTByPanResp getKeysDUKPTByPanResp;
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("GetKeysDUKPTByPanResp")
	public GetKeysDUKPTByPanResp getGetKeysDUKPTByPanResp() {
		return getKeysDUKPTByPanResp;
	}
	
	public void setGetKeysDUKPTByPanResp(
			GetKeysDUKPTByPanResp getKeysDUKPTByPanResp) {
		this.getKeysDUKPTByPanResp = getKeysDUKPTByPanResp;
	}
	
	
}

