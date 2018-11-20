package com.upayments.pg.caja.api.io.soap.getcardpinoffset;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "GetCardPINOffsetByPanReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private GetCardPINOffsetByPanReq getCardPINOffsetByPanReq;

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
	
	@JsonProperty("GetCardPINOffsetByPanReq")
	public GetCardPINOffsetByPanReq getGetCardPINOffsetByPanReq() {
		return getCardPINOffsetByPanReq;
	}
	
	public void setGetCardPINOffsetByPanReq(
			GetCardPINOffsetByPanReq getCardPINOffsetByPanReq) {
		this.getCardPINOffsetByPanReq = getCardPINOffsetByPanReq;
	}
	


}