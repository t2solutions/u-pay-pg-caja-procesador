package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;
import java.util.List;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class TarjetaOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ReturnStatusOutput status;
	private List<Tarjeta> listaTarjetas;
	
	public TarjetaOutput() {
	}

	public ReturnStatusOutput getStatus() {
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}

	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	
		
}
