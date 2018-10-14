package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.util.List;

public class ContactosTransferenciaInput implements Serializable {

	private static final long serialVersionUID = 467973724016409952L;
	
	private List<ContactosTransferencia> contactos;
	
	public ContactosTransferenciaInput() {
		
	}

	public List<ContactosTransferencia> getContactos() {
		return contactos;
	}

	public void setContactos(List<ContactosTransferencia> contactos) {
		this.contactos = contactos;
	}

}
