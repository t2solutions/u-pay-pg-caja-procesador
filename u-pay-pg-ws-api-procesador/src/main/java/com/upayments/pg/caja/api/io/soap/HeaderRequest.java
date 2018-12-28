
package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "HeaderRequest" })
public class HeaderRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private HeaderRequestCommon headerRequestCommon;

	public HeaderRequest() {
		super();
	}
	
	@JsonProperty("HeaderRequest")
	public HeaderRequestCommon getHeaderRequestCommon() {
		return headerRequestCommon;
	}

	public void setHeaderRequest(HeaderRequestCommon headerRequest) {
		this.headerRequestCommon = headerRequest;
	}

}