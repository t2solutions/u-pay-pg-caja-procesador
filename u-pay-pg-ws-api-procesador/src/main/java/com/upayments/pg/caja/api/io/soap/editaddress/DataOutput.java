package com.upayments.pg.caja.api.io.soap.editaddress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "EventID", "RetCode", "RetMsg" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private String eventId; 
	
	public DataOutput() {
		super();
	}

	@JsonProperty("EventID")
	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	
	
	
	
}

