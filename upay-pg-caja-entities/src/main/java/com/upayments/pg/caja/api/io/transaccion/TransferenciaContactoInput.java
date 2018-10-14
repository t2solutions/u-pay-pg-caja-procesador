package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransferenciaContactoInput implements Serializable {

	private static final long serialVersionUID = 4940794675375870070L;

	private String nroTelefono;
	private BigDecimal montoIndividual;
	
	public TransferenciaContactoInput() {
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	public BigDecimal getMontoIndividual() {
		return montoIndividual;
	}

	public void setMontoIndividual(BigDecimal montoIndividual) {
		this.montoIndividual = montoIndividual;
	}

}
