package com.upayments.pg.caja.api.io.transaccion;

import java.math.BigDecimal;

import com.upayments.pg.caja.api.entity.constants.SignoEnum;
import com.upayments.pg.caja.entity.CuentaEntity;
import com.upayments.pg.caja.entity.PortadorEntity;

public class PortadorTransferenciaInput {
	
	private PortadorEntity portador;
	private CuentaEntity cuenta;
	private SignoEnum signo;
	private BigDecimal montoTotal;
	private Long idTransf;
	private Long autid;
	private String origem;
	private String destino;
	
	public PortadorTransferenciaInput() {
		
	}

	public PortadorEntity getPortador() {
		return portador;
	}

	public void setPortador(PortadorEntity portador) {
		this.portador = portador;
	}

	public SignoEnum getSigno() {
		return signo;
	}

	public void setSigno(SignoEnum signo) {
		this.signo = signo;
	}

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Long getIdTransf() {
		return idTransf;
	}

	public void setIdTransf(Long idTransf) {
		this.idTransf = idTransf;
	}

	public Long getAutid() {
		return autid;
	}

	public void setAutid(Long autid) {
		this.autid = autid;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public CuentaEntity getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaEntity cuenta) {
		this.cuenta = cuenta;
	}
}
