package com.upayments.pg.caja.api.io.soap.reissuecard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ReissueCardResp" })
public class DataOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ReissueCardResp reissueCardResp;
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("ReissueCardResp")	
	public ReissueCardResp getReissueCardResp() {
		return reissueCardResp;
	}
	
	public void setReissueCardResp(ReissueCardResp reissueCardResp) {
		this.reissueCardResp = reissueCardResp;
	}
	
	
}

