package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class MovimientosDetallesOutput implements Serializable {

	private static final long serialVersionUID = 1938839974655173099L;

	private Long autId;
	private String signo;
	private String dateNegocio;
	private Long accountId;
	private String descNameCommerce;
	private String descCityCommerce;
	private Long mccCode;
	private String descMccGroup;
	private String codProcTransaction;
	private BigDecimal valorTotalLiq;
	private BigDecimal valorTotalDolar;
	private String numeroTarjeta;
	private String pais;
	private String direccion;
	
	private ReturnStatusOutput status;
	
	public MovimientosDetallesOutput() {
		
	}

	public Long getAutId() {
		return autId;
	}

	public void setAutId(Long autId) {
		this.autId = autId;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public String getDateNegocio() {
		return dateNegocio;
	}

	public void setDateNegocio(String dateNegocio) {
		this.dateNegocio = dateNegocio;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getDescNameCommerce() {
		return descNameCommerce;
	}

	public void setDescNameCommerce(String descNameCommerce) {
		this.descNameCommerce = descNameCommerce;
	}

	public String getDescCityCommerce() {
		return descCityCommerce;
	}

	public void setDescCityCommerce(String descCityCommerce) {
		this.descCityCommerce = descCityCommerce;
	}

	public Long getMccCode() {
		return mccCode;
	}

	public void setMccCode(Long mccCode) {
		this.mccCode = mccCode;
	}

	public String getDescMccGroup() {
		return descMccGroup;
	}

	public void setDescMccGroup(String descMccGroup) {
		this.descMccGroup = descMccGroup;
	}

	public String getCodProcTransaction() {
		return codProcTransaction;
	}

	public void setCodProcTransaction(String codProcTransaction) {
		this.codProcTransaction = codProcTransaction;
	}

	public BigDecimal getValorTotalLiq() {
		return valorTotalLiq;
	}

	public void setValorTotalLiq(BigDecimal valorTotalLiq) {
		this.valorTotalLiq = valorTotalLiq;
	}

	public BigDecimal getValorTotalDolar() {
		return valorTotalDolar;
	}

	public void setValorTotalDolar(BigDecimal valorTotalDolar) {
		this.valorTotalDolar = valorTotalDolar;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
