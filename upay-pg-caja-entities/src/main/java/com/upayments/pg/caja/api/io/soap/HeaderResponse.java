package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "Common" })
public class HeaderResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private CommonResponse headerResponseCommon;

	public HeaderResponse() {
		super();
	}
	
	@JsonProperty("Common")
	public CommonResponse getHeaderResponseCommon() {
		return headerResponseCommon;
	}
	
	public void setHeaderResponseCommon(CommonResponse headerResponseCommon) {
		this.headerResponseCommon = headerResponseCommon;
	}
	
}
