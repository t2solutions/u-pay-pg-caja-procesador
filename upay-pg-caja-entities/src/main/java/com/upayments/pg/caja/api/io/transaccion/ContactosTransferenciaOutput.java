package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.util.List;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class ContactosTransferenciaOutput implements Serializable {

	private static final long serialVersionUID = 467973724016409952L;
	
	private List<ContactosTransferencia> contactos;
	private ReturnStatusOutput status;
	
	public ContactosTransferenciaOutput() {
		
	}

	public List<ContactosTransferencia> getContactos() {
		return contactos;
	}

	public void setContactos(List<ContactosTransferencia> contactos) {
		this.contactos = contactos;
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
