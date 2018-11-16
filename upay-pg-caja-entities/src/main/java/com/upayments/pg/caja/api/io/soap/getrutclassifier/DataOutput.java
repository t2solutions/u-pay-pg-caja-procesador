package com.upayments.pg.caja.api.io.soap.getrutclassifier;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "ClientClassifierDetailsAPIRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<ClientClassifierDetailsAPIRecord> ccSummaryRecord;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("ClientClassifierDetailsAPIRecord")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<ClientClassifierDetailsAPIRecord> getCcSummaryRecord() {
		return ccSummaryRecord;
	}
	
	public void setCcSummaryRecord(
			List<ClientClassifierDetailsAPIRecord> ccSummaryRecord) {
		this.ccSummaryRecord = ccSummaryRecord;
	}

	
}

