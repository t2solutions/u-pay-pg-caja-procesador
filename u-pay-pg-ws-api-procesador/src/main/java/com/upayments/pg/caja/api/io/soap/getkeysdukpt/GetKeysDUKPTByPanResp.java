package com.upayments.pg.caja.api.io.soap.getkeysdukpt;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.upayments.pg.caja.api.io.soap.reissuecard.DataStatusOutput;

@JsonPropertyOrder({ "RetCode", "RetMsg", "IdDukpt", "KeyDukpt"})
public class GetKeysDUKPTByPanResp extends DataStatusOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String idDukpt;
	private String keyDukpt;
	
	public GetKeysDUKPTByPanResp() {
		super();
	}
	
	@JsonProperty("IdDukpt")
	@JsonInclude(Include.NON_DEFAULT)
	public String getIdDukpt() {
		return idDukpt;
	}
	
	public void setIdDukpt(String idDukpt) {
		this.idDukpt = idDukpt;
	}
	
	@JsonProperty("KeyDukpt")	
	@JsonInclude(Include.NON_DEFAULT)
	public String getKeyDukpt() {
		return keyDukpt;
	}
	
	public void setKeyDukpt(String keyDukpt) {
		this.keyDukpt = keyDukpt;
	}

}
