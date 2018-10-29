package com.upayments.pg.caja.api.io.soap.getcontracttransactions;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "RetCode", "RetMsg", "CSWTransactionDetailsRecord"})
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<CSWTransactionDetailsRecord> cswTransactionDetailsRecord;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("ContractBalanceListDetailsRecord")
	@JsonInclude(Include.NON_DEFAULT)		
	public List<CSWTransactionDetailsRecord> getCswTransactionDetailsRecord() {
		return cswTransactionDetailsRecord;
	}

	public void setCswTransactionDetailsRecord(
			List<CSWTransactionDetailsRecord> cswTransactionDetailsRecord) {
		this.cswTransactionDetailsRecord = cswTransactionDetailsRecord;
	}

	

	
}

