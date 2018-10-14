package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class MovimientosDetallesInput implements Serializable {

	private static final long serialVersionUID = 7857123035232731695L;
	
	@NotNull(message="El autId necesita ser informado.")
	private Long autId;
	
	@NotNull(message="El dateNegocio necesita ser informado.")
	private String dateNegocio;
	
	public MovimientosDetallesInput () {
		
	}

	public Long getAutId() {
		return autId;
	}

	public void setAutId(Long autId) {
		this.autId = autId;
	}

	public String getDateNegocio() {
		return dateNegocio;
	}

	public void setDateNegocio(String dateNegocio) {
		this.dateNegocio = dateNegocio;
	}
}
