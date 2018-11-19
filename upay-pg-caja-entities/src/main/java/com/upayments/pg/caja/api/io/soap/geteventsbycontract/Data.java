package com.upayments.pg.caja.api.io.soap.geteventsbycontract;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "BankCode", "ContractIdentifier", "ContractRelation",  
	"StartDate", "EndDate", "EventCode", "UserInfo" })
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
    <req:BankCode>?</req:BankCode>
    <req:ContractIdentifier>?</req:ContractIdentifier>
    <!--Optional:-->
    <req:ContractRelation>?</req:ContractRelation>
    <!--Optional:-->
    <req:StartDate>?</req:StartDate>
    <!--Optional:-->
    <req:EndDate>?</req:EndDate>
    <!--Optional:-->
    <req:EventCode>?</req:EventCode>
    <req:UserInfo>?</req:UserInfo>	
	*/
	
	private String bankCode;
	private String contractIdentifier;
	private String contractRelation; //
	private String startDate; //
	private String endDate; //
	private String eventCode; //
	private String userInfo;
	
	
	public Data() {
		super();
	}
	
	@JsonProperty("BankCode")
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@JsonProperty("ContractIdentifier")
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	public void setContractIdentifier(String contractIdentifier) {
		this.contractIdentifier = contractIdentifier;
	}

	@JsonProperty("ContractRelation")
	@JsonInclude(Include.NON_DEFAULT)
	public String getContractRelation() {
		return contractRelation;
	}

	public void setContractRelation(String contractRelation) {
		this.contractRelation = contractRelation;
	}

	@JsonProperty("StartDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("EndDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("EventCode")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	@JsonProperty("UserInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

}