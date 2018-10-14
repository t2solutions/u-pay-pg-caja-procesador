package com.upayments.pg.caja.api.io.login;

import java.io.Serializable;

public class PortadorTokenInput implements Serializable{

	private static final long serialVersionUID = -2794016059093015215L;
	
	private Long idCardholder;
	private Integer sistemaOperacional;
	private String token;
	
	public PortadorTokenInput() {
		
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
}
