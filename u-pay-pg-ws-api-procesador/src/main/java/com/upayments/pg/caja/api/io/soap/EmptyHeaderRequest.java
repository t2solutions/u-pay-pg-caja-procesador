
package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "HeaderRequest" })
public class EmptyHeaderRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private HeaderRequestEmptyCommon headerRequestCommon;

	public EmptyHeaderRequest() {
		super();
	}
	
	@JsonProperty("HeaderRequest")
	public HeaderRequestEmptyCommon getHeaderRequestCommon() {
		return headerRequestCommon;
	}
	
	public void setHeaderRequestCommon(
			HeaderRequestEmptyCommon headerRequestCommon) {
		this.headerRequestCommon = headerRequestCommon;
	}
	
	
	


}