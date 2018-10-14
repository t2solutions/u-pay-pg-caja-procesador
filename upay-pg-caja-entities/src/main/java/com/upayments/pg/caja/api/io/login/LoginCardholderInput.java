package com.upayments.pg.caja.api.io.login;

import java.io.Serializable;

public class LoginCardholderInput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private Integer emisor;
	private byte[] facialImage;
	
	public LoginCardholderInput() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getFacialImage() {
		return facialImage;
	}

	public void setFacialImage(byte[] facialImage) {
		this.facialImage = facialImage;
	}
	
	public Integer getEmisor() {
		return emisor;
	}
	
	public void setEmisor(Integer emisor) {
		this.emisor = emisor;
	}
	
}
