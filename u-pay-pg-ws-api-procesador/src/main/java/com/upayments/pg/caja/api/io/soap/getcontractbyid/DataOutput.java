package com.upayments.pg.caja.api.io.soap.getcontractbyid;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "RetCode", "RetMsg", "FailPoint", "ContractData", "BalancesData", "AddData" })
public class DataOutput extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private ContractData contractData;
	private BalancesData balancesData;
	private AddData addData;
	
	public DataOutput() {
		super();
	}

	@JsonProperty("ContractData")
	public ContractData getContractData() {
		return contractData;
	}

	public void setContractData(ContractData contractData) {
		this.contractData = contractData;
	}

	@JsonProperty("BalancesData")
	public BalancesData getBalancesData() {
		return balancesData;
	}

	public void setBalancesData(BalancesData balancesData) {
		this.balancesData = balancesData;
	}

	@JsonProperty("AddData")
	public AddData getAddData() {
		return addData;
	}

	public void setAddData(AddData addData) {
		this.addData = addData;
	}
	
}

