package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class ContactosTransferencia implements Serializable {

	private static final long serialVersionUID = 8058162591736346173L;
	
	private Long idEmisor;
	private String telefono;
	
	public ContactosTransferencia() {
		
	}

	public Long getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(Long idEmisor) {
		this.idEmisor = idEmisor;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
