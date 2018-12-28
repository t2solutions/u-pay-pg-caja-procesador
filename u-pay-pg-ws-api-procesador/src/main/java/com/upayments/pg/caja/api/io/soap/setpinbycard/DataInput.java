package com.upayments.pg.caja.api.io.soap.setpinbycard;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "SetPinByCardReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private SetPinByCardReq setPinByCardReq;

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
	
	@JsonProperty("SetPinByCardReq")
	public SetPinByCardReq getSetPinByCardReq() {
		return setPinByCardReq;
	}
	
	public void setSetPinByCardReq(SetPinByCardReq setPinByCardReq) {
		this.setPinByCardReq = setPinByCardReq;
	}
	
	


}