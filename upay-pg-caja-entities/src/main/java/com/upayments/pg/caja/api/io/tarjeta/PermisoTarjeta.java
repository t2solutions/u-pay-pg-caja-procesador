package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;

public class PermisoTarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tagName;
	private Integer value;
	
	public PermisoTarjeta() {
		super();
	}
	
	public PermisoTarjeta(String tagName, Integer value) {
		super();
		this.tagName = tagName;
		this.value = value;
	}


	public String getTagName() {
		return tagName;
	}
	
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}

}
