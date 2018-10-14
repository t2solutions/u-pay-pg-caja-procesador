package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class MovimientosCardholderFechaInput extends MovimientosCardholderInput implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fechaMes;
	
	public MovimientosCardholderFechaInput() {
		super();
	}
	
	public String getFechaMes() {
		return fechaMes;
	}
	
	public void setFechaMes(String fechaMes) {
		this.fechaMes = fechaMes;
	}

}
