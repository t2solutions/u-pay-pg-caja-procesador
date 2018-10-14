package com.upayments.pg.caja.api.io.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Clase que proyecta a un movimiento transaccional de una tarjeta
 * @author Tomas Thoms Huerta
 *
 */
public class MovimientoTarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String autId;
	private String signo;
	private String dateNegocio;
	private Long cardId;
	private Long cardholderId;
	private Long accountId;
	private String descNameCommerce;
	private String descCityCommerce;
	private Long mccCode;
	private String descMccGroup;
	private String codProcTransaction;
	private BigDecimal valorTotalLiq;
	private BigDecimal valorTotalDolar;
	private String numeroTarjeta;
	private String direccion;
	
	public MovimientoTarjeta() {
	}

	public MovimientoTarjeta(String autId, String signo, String dateNegocio, Long cardId, Long cardholderId, Long accountId,
			String descNameCommerce, String descCityCommerce, Long mccCode, String descMccGroup,
			String codProcTransaction, BigDecimal valorTotalLiq) {
		super();
		this.autId = autId;
		this.signo = signo;
		this.dateNegocio = dateNegocio;
		this.cardId = cardId;
		this.cardholderId = cardholderId;
		this.accountId = accountId;
		this.descNameCommerce = descNameCommerce;
		this.descCityCommerce = descCityCommerce;
		this.mccCode = mccCode;
		this.descMccGroup = descMccGroup;
		this.codProcTransaction = codProcTransaction;
		this.valorTotalLiq = valorTotalLiq;
	}

	public String getAutId() {
		return autId;
	}

	public void setAutId(String autId) {
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

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
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
	
	public Long getCardholderId() {
		return cardholderId;
	}
	
	public void setCardholderId(Long cardholderId) {
		this.cardholderId = cardholderId;
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

}
