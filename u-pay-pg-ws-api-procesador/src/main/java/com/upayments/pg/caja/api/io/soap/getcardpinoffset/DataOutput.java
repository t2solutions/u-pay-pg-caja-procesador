package com.upayments.pg.caja.api.io.soap.getcardpinoffset;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "CardOffset" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cardOffset;
	
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("CardOffset")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCardOffset() {
		return cardOffset;
	}
	
	public void setCardOffset(String cardOffset) {
		this.cardOffset = cardOffset;
	}
	
}

