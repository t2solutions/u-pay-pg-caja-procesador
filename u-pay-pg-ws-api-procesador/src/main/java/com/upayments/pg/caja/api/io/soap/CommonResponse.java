package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ServiceID", "ResponseDate" })
public class CommonResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serviceID;
	private String responseDate;
	
	public CommonResponse() {
		super();
	}

	@JsonProperty("ServiceID")
	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	@JsonProperty("ResponseDate")
	public String getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

}