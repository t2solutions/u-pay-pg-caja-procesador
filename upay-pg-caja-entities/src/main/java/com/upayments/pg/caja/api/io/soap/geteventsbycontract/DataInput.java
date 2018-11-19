package com.upayments.pg.caja.api.io.soap.geteventsbycontract;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "EventsByContractReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private EventsByContractReq eventsByContractReq;

	public DataInput() {
		super();
	}
	
	@JsonProperty("Header")
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	
	@JsonProperty("EventsByContractReq")
	public EventsByContractReq getEventsByContractReq() {
		return eventsByContractReq;
	}
	
	public void setEventsByContractReq(EventsByContractReq eventsByContractReq) {
		this.eventsByContractReq = eventsByContractReq;
	}
	


}