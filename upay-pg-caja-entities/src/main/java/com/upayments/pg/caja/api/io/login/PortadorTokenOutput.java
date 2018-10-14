package com.upayments.pg.caja.api.io.login;

import java.io.Serializable;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class PortadorTokenOutput implements Serializable{

	private static final long serialVersionUID = -2794016059093015215L;
	
	private Long idCardholder;
	private Integer sistemaOperacional;
	private String token;
	private ReturnStatusOutput status;
	private Long idToken;
	
	public PortadorTokenOutput() {
		
	}

	public Long getIdCardholder() {
		return idCardholder;
	}

	public void setIdCardholder(Long idCardholder) {
		this.idCardholder = idCardholder;
	}

	public Integer getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(Integer sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ReturnStatusOutput getStatus() {
		if(status == null) {
			status = new ReturnStatusOutput();
		}
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}

	public Long getIdToken() {
		return idToken;
	}

	public void setIdToken(Long idToken) {
		this.idToken = idToken;
	}
}
