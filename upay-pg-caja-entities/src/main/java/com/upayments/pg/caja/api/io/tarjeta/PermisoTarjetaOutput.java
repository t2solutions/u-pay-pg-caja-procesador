package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class PermisoTarjetaOutput implements Serializable{

	private static final long serialVersionUID = 8755181695446096554L;
	
	private ReturnStatusOutput status;
	private Long idTarjeta;
	private String tag;
	private Integer valor;
	
	public PermisoTarjetaOutput() {
		
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

	public ReturnStatusOutput getStatus() {
		if(status == null) {
			status = new ReturnStatusOutput();
		}
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}
}
