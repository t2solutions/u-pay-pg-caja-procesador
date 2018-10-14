package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.util.List;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class MovimientosOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ReturnStatusOutput status;
	private List<MovimientoTarjeta> movimiento;
	
	public MovimientosOutput() {
		super();
	}
	
	public ReturnStatusOutput getStatus() {
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}
	
	public MovimientosOutput(List<MovimientoTarjeta> movements) {
		this.setMovimiento(movements);
	}
	
	public List<MovimientoTarjeta> getMovimiento() {
		return movimiento;
	}
	
	public void setMovimiento(List<MovimientoTarjeta> movimiento) {
		this.movimiento = movimiento;
	}

}
