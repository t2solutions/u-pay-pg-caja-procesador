package com.upayments.pg.caja.api.io.soap.reissuecard;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "ReissueCardReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private ReissueCardReq reissueCardReq;

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
	
	@JsonProperty("ReissueCardReq")
	public ReissueCardReq getReissueCardReq() {
		return reissueCardReq;
	}
	
	public void setReissueCardReq(ReissueCardReq reissueCardReq) {
		this.reissueCardReq = reissueCardReq;
	}

}