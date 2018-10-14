package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;

public class TransferBetweenCardsInput  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long  id_cardholder_origin;
	private String monto;
	private String fecha;
	private long movilDestinatario;
	
	public String getMonto () {
		return monto;
	}
	
	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getFecha () {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public long movilDestinatario () {
		return movilDestinatario;
	}

	public void setFecha(long movilDestinatario) {
		this.movilDestinatario = movilDestinatario;
	}

}
