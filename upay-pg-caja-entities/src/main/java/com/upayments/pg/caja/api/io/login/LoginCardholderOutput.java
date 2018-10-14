package com.upayments.pg.caja.api.io.login;

import java.io.Serializable;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class LoginCardholderOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ReturnStatusOutput status;
	private Integer idCadPortador;
	private Integer idCadEmissor;
	private String nomePortador;
	private String sobrenomePortador;
	private Integer dtNascimento;
	private Integer codAreaTelCelular;
	private Integer nroTelefoneCelular;
	private String email;
	
	public LoginCardholderOutput() {
		super();
	}

	public ReturnStatusOutput getStatus() {
		return status;
	}

	public void setStatus(ReturnStatusOutput status) {
		this.status = status;
	}

	public Integer getIdCadPortador() {
		return idCadPortador;
	}

	public void setIdCadPortador(Integer idCadPortador) {
		this.idCadPortador = idCadPortador;
	}

	public Integer getIdCadEmissor() {
		return idCadEmissor;
	}

	public void setIdCadEmissor(Integer idCadEmissor) {
		this.idCadEmissor = idCadEmissor;
	}

	public String getNomePortador() {
		return nomePortador;
	}

	public void setNomePortador(String nomePortador) {
		this.nomePortador = nomePortador;
	}

	public String getSobrenomePortador() {
		return sobrenomePortador;
	}

	public void setSobrenomePortador(String sobrenomePortador) {
		this.sobrenomePortador = sobrenomePortador;
	}

	public Integer getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Integer dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Integer getCodAreaTelCelular() {
		return codAreaTelCelular;
	}

	public void setCodAreaTelCelular(Integer codAreaTelCelular) {
		this.codAreaTelCelular = codAreaTelCelular;
	}

	public Integer getNroTelefoneCelular() {
		return nroTelefoneCelular;
	}

	public void setNroTelefoneCelular(Integer nroTelefoneCelular) {
		this.nroTelefoneCelular = nroTelefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
