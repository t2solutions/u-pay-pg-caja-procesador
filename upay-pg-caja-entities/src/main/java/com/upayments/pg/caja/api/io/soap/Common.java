package com.upayments.pg.caja.api.io.soap;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "ServiceID", "ServiceVersion", "Product", "RequestDate" })
public class Common implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serviceID;
	private String serviceVersion;
	private String product;
	private String requestDate;
	
	public Common() {
		super();
	}

	@JsonProperty("ServiceID")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	@JsonProperty("ServiceVersion")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getServiceVersion() {
		return serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	@JsonProperty("Product")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@JsonProperty("RequestDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

}