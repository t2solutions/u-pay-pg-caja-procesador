package com.upayments.pg.caja.api.io.soap;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "Common" })
public class HeaderRequestCommon implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Common common;
	
	public HeaderRequestCommon() {
		super();
	}

	@JsonProperty("Common")
	public Common getCommon() {
		return common;
	}

	public void setCommon(Common common) {
		this.common = common;
	}

}