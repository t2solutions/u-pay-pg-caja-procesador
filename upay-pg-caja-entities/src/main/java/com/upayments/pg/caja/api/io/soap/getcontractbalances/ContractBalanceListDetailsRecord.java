package com.upayments.pg.caja.api.io.soap.getcontractbalances;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "BalanceCode", "BalanceCurrency", "BalanceValue"})
public class ContractBalanceListDetailsRecord implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String balanceCode;
	private String balanceCurrency;
	private String balanceValue;
	
	/*
    <!--Optional:-->
    <resp:BalanceCode>?</resp:BalanceCode>
    <!--Optional:-->
    <resp:BalanceCurrency>?</resp:BalanceCurrency>
    <!--Optional:-->
    <resp:BalanceValue>?</resp:BalanceValue>	
	*/
	
	public ContractBalanceListDetailsRecord() {
		super();
	}
	
	@JsonProperty("BalanceCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBalanceCode() {
		return balanceCode;
	}

	public void setBalanceCode(String balanceCode) {
		this.balanceCode = balanceCode;
	}


	@JsonProperty("BalanceCurrency")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBalanceCurrency() {
		return balanceCurrency;
	}

	public void setBalanceCurrency(String balanceCurrency) {
		this.balanceCurrency = balanceCurrency;
	}


	@JsonProperty("BalanceValue")
	@JsonInclude(Include.NON_DEFAULT)
	public String getBalanceValue() {
		return balanceValue;
	}

	public void setBalanceValue(String balanceValue) {
		this.balanceValue = balanceValue;
	}

}
