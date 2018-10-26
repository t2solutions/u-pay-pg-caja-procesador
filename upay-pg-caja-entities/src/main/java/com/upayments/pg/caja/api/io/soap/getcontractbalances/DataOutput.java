package com.upayments.pg.caja.api.io.soap.getcontractbalances;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "ContractBalanceListDetailsRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<ContractBalanceListDetailsRecord> cblDetailsRecord;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("ContractBalanceListDetailsRecord")
	@JsonInclude(Include.NON_DEFAULT)	
	public List<ContractBalanceListDetailsRecord> getCblDetailsRecord() {
		return cblDetailsRecord;
	}
	
	public void setCblDetailsRecord(
			List<ContractBalanceListDetailsRecord> cblDetailsRecord) {
		this.cblDetailsRecord = cblDetailsRecord;
	}

	
}

