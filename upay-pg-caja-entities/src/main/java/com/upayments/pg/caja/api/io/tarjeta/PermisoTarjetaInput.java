package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;

public class PermisoTarjetaInput implements Serializable {

	private static final long serialVersionUID = 7058581828701094765L;
	
	private Long idTarjeta;
	private String tag;
	private Integer valor;
	
	public PermisoTarjetaInput() {
		
	}

	public Long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
