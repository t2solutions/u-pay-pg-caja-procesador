package com.upayments.pg.caja.api.io.tarjeta;

import java.io.Serializable;
import java.util.List;


public class Tarjeta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long tarjetaId;
	private Long emisorId;
	private Long cardholderId;
	private byte[] cardImage;	
	private String cardNumber;
	private Integer cvv2;
	private String dtVigencia;
	private String embossing;
	private String hash;
	private List<PermisoTarjeta> tagList;
	private String cardProductName;
	
	
	public Tarjeta() {
		super();
	}
	
	public Tarjeta(Long tarjetaId,Long emisorId, Long cardholderId, byte[] cardImage, String cardNumber, Integer cvv2,
			String dtVigencia, String embossing, String hash, String cardProductName, List<PermisoTarjeta> tags) {
		super();
		this.tarjetaId = tarjetaId;
		this.emisorId = emisorId;
		this.cardholderId = cardholderId;
		this.cardImage = cardImage;
		this.cardNumber = cardNumber;
		this.cvv2 = cvv2;
		this.dtVigencia = dtVigencia;
		this.embossing = embossing;
		this.hash = hash;
		this.cardProductName = cardProductName;
		this.tagList = tags;
	}


	public List<PermisoTarjeta> getTagList() {
		return tagList;
	}
	
	public void setTagList(List<PermisoTarjeta> tagList) {
		this.tagList = tagList;
	}
	

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public byte[] getCardImage() {
		return cardImage;
	}
	
	public void setCardImage(byte[] cardImage) {
		this.cardImage = cardImage;
	}

	public Long getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	public Long getEmisorId() {
		return emisorId;
	}

	public void setEmisorId(Long emisorId) {
		this.emisorId = emisorId;
	}

	public Long getCardholderId() {
		return cardholderId;
	}

	public void setCardholderId(Long cardholderId) {
		this.cardholderId = cardholderId;
	}

	public Integer getCvv2() {
		return cvv2;
	}

	public void setCvv2(Integer cvv2) {
		this.cvv2 = cvv2;
	}

	public String getDtVigencia() {
		return dtVigencia;
	}

	public void setDtVigencia(String dtVigencia) {
		this.dtVigencia = dtVigencia;
	}

	public String getEmbossing() {
		return embossing;
	}

	public void setEmbossing(String embossing) {
		this.embossing = embossing;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getCardProductName() {
		return cardProductName;
	}

	public void setCardProductName(String cardProductName) {
		this.cardProductName = cardProductName;
	}


}
