package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class TransferenciaInput implements Serializable {

	private static final long serialVersionUID = -7712011006294003903L;
	
	private Long idEmisor;
	private Long idCardHolder;
	private String codigoContrato;
	private BigDecimal montoTotal;
	private List<TransferenciaContactoInput> listaContactos;
	
	public TransferenciaInput() {
		
	}

	public Long getIdEmisor() {
		return idEmisor;
	}

	public void setIdEmisor(Long idEmisor) {
		this.idEmisor = idEmisor;
	}

	public Long getIdCardHolder() {
		return idCardHolder;
	}

	public void setIdCardHolder(Long idCardHolder) {
		this.idCardHolder = idCardHolder;
	}

	public String getCodigoContrato() {
		return codigoContrato;
	}

	public void setCodigoContrato(String codigoContrato) {
		this.codigoContrato = codigoContrato;
	}

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<TransferenciaContactoInput> getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(List<TransferenciaContactoInput> listaContactos) {
		this.listaContactos = listaContactos;
	}
}
