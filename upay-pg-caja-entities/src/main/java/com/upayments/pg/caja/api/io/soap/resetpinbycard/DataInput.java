package com.upayments.pg.caja.api.io.soap.resetpinbycard;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "ResetPinByCardReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private ResetPinByCardReq resetPinByCardReq;

	public DataInput() {
		super();
	}
	
	@JsonProperty("Header")
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	
	@JsonProperty("ResetPinByCardReq")
	public ResetPinByCardReq getResetPinByCardReq() {
		return resetPinByCardReq;
	}
	
	public void setResetPinByCardReq(ResetPinByCardReq resetPinByCardReq) {
		this.resetPinByCardReq = resetPinByCardReq;
	}
	
	


}