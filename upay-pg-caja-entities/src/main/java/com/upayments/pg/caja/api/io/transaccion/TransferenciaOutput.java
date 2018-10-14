package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class TransferenciaOutput implements Serializable {

	private static final long serialVersionUID = -7712011006294003903L;
	
	private Long idEmisor;
	private Long idCardHolder;
	private String codigoContrato;
	private Long idTransferencia;
	private BigDecimal montoTotal;
	private ReturnStatusOutput status;
	
	public TransferenciaOutput() {
		
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

	public ReturnStatusOutput getStatus() {
		if(status == null) {
			status = new ReturnStatusOutput();
		}
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}

	public Long getIdTransferencia() {
		return idTransferencia;
	}

	public void setIdTransferencia(Long idTransferencia) {
		this.idTransferencia = idTransferencia;
	}

}
