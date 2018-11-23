package com.upayments.pg.caja.api.io.soap.getkeysdukpt;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "GetKeysDUKPTByPanReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private GetKeysDUKPTByPanReq getKeysDUKPTByPanReq;

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
	
	@JsonProperty("GetKeysDUKPTByPanReq")
	public GetKeysDUKPTByPanReq getGetKeysDUKPTByPanReq() {
		return getKeysDUKPTByPanReq;
	}
	
	public void setGetKeysDUKPTByPanReq(
			GetKeysDUKPTByPanReq getKeysDUKPTByPanReq) {
		this.getKeysDUKPTByPanReq = getKeysDUKPTByPanReq;
	}

}