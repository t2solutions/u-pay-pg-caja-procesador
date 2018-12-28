package com.upayments.pg.caja.api.io.soap.geteventsbycontract;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "EventLogDetailsRecord" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<EventLogDetailsRecord> eventLogDetailsRecord;
	
	public DataOutput() {
		super();
	}
	
	@JsonProperty("EventLogDetailsRecord")
	@JsonInclude(Include.NON_DEFAULT)
	public List<EventLogDetailsRecord> getEventLogDetailsRecord() {
		return eventLogDetailsRecord;
	}
	
	public void setEventLogDetailsRecord(
			List<EventLogDetailsRecord> eventLogDetailsRecord) {
		this.eventLogDetailsRecord = eventLogDetailsRecord;
	}
	
	
}

