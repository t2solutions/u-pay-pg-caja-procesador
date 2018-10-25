package com.upayments.pg.caja.api.io.soap.getcontractbynumber;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Available", "Balance", "CreditLimit", "AddLimit", "Blocked", 
	"TotalDue", "PastDue", "CreditLimitUSD", "AvailableUSD", "BalanceUSD" })
public class BalancesData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String available;  //
	private String balance; //
	private String creditLimit; //
	private String addLimit; //
	private String blocked; //
	private String totalDue; //
	private String pastDue; //
	private String creditLimitUSD; //
	private String availableUSD; //
	private String balanceUSD; //
	
	public BalancesData() {
		super();
	}

	@JsonProperty("Available")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@JsonProperty("Balance")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@JsonProperty("CreditLimit")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	@JsonProperty("AddLimit")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getAddLimit() {
		return addLimit;
	}

	public void setAddLimit(String addLimit) {
		this.addLimit = addLimit;
	}

	@JsonProperty("Blocked")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	@JsonProperty("TotalDue")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(String totalDue) {
		this.totalDue = totalDue;
	}

	@JsonProperty("PastDue")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getPastDue() {
		return pastDue;
	}

	public void setPastDue(String pastDue) {
		this.pastDue = pastDue;
	}

	@JsonProperty("CreditLimitUSD")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCreditLimitUSD() {
		return creditLimitUSD;
	}

	public void setCreditLimitUSD(String creditLimitUSD) {
		this.creditLimitUSD = creditLimitUSD;
	}

	@JsonProperty("AvailableUSD")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getAvailableUSD() {
		return availableUSD;
	}

	public void setAvailableUSD(String availableUSD) {
		this.availableUSD = availableUSD;
	}

	@JsonProperty("BalanceUSD")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getBalanceUSD() {
		return balanceUSD;
	}

	public void setBalanceUSD(String balanceUSD) {
		this.balanceUSD = balanceUSD;
	}

}
