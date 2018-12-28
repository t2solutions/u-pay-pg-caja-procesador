package com.upayments.pg.caja.api.io.soap.getcontractclassifier;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "ContractClassifierSummaryRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<ContractClassifierSummaryRecord> ccSummaryRecord;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("ContractClassifierSummaryRecord")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<ContractClassifierSummaryRecord> getCcSummaryRecord() {
		return ccSummaryRecord;
	}
	
	public void setCcSummaryRecord(
			List<ContractClassifierSummaryRecord> ccSummaryRecord) {
		this.ccSummaryRecord = ccSummaryRecord;
	}

	
}

