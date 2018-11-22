package com.upayments.pg.caja.api.io.soap.editclient;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.HeaderRequest;

@JsonPropertyOrder({ "Header", "EditClientReq" })
public class DataInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HeaderRequest header;
	private EditClientReq editClientReq;

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
	
	@JsonProperty("EditClientReq")
	public EditClientReq getEditClientReq() {
		return editClientReq;
	}
	
	public void setEditClientReq(EditClientReq editClientReq) {
		this.editClientReq = editClientReq;
	}


}