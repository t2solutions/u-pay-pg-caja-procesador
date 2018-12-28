package com.upayments.pg.caja.api.io.soap.getcardbycontract;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "IssContractDetailsAPIOutputRecord"})
public class DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String retCode;
	private String retMsg;	
	private List<IssContractDetailsAPIOutputRecord> issContractDetailsAPIOutput;
	
	public DataStatusOutput() {
		super();
	}
	
	@JsonProperty("RetCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getRetCode() {
		return retCode;
	}
	
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	
	@JsonProperty("RetMsg")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getRetMsg() {
		return retMsg;
	}
	
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	
	@JsonProperty("IssContractDetailsAPIOutputRecord")
	@JsonInclude(Include.NON_DEFAULT)		
	public List<IssContractDetailsAPIOutputRecord> getIssContractDetailsAPIOutput() {
		return issContractDetailsAPIOutput;
	}
	
	public void setIssContractDetailsAPIOutput(
			List<IssContractDetailsAPIOutputRecord> issContractDetailsAPIOutput) {
		this.issContractDetailsAPIOutput = issContractDetailsAPIOutput;
	}

}