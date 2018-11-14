package com.upayments.pg.caja.api.io.soap.getcardbyrut;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonPropertyOrder({ "CardNumber", "CardName", "Product", "ProductDesc", "ExpirationDate", 
	"Available", "Currency", "CurrencyDesc", "AvailableProductionAction", "MaxPinAttempts",
	"PinAttemptsCounter", "EmbossedTitle", "EmbossedFirstName", "EmbossedLastName", "Status",
	"StatusDesc", "StatusCode", "ProductionStatus", "ProductionStatusDesc", "Ready", "ReadyDesc"})
public class CardData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cardNumber; //<><xsl:value-of select="resp:XXX" /></CardNumber>
	private String cardName; //<><xsl:value-of select="resp:XXX" /></CardName>
	private String product; //<xsl:value-of select="resp:XXX" /></>
	private String productDesc; //<><xsl:value-of select="resp:XXX" /></>	
	private String expirationDate; //<><xsl:value-of select="resp:XXX" /></>
	private String available; //<><xsl:value-of select="resp:XXX" /></>
	private String currency; //<><xsl:value-of select="resp:XXX" /></>
	private String currencyDesc; //<><xsl:value-of select="resp:XXX" /></>
	private String availableProductionAction;//<><xsl:value-of select="resp:XXX" /></>
	private String maxPinAttempts; //<><xsl:value-of select="resp:XXX" /></>
	private String pinAttemptsCounter; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedTitle; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedFirstName; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedLastName; //<><xsl:value-of select="resp:XXX" /></>
	private String status; //<><xsl:value-of select="resp:XXX" /></>
	private String statusDesc; //<><xsl:value-of select="resp:XXX" /></>
	private String statusCode;//><xsl:value-of select="resp:XXX" /></>
	private String productionStatus;//<><xsl:value-of select="resp:XXX" /></>
	private String productionStatusDesc; //;<><xsl:value-of select="resp:XXX" /></>
	private String ready; //<><xsl:value-of select="resp:XXX" /></>
	private String readyDesc;//<><xsl:value-of select="resp:XXX" /></>
	
	public CardData() {
		super();
	}
	
	@JsonProperty("CardNumber")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@JsonProperty("CardName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@JsonProperty("Product")
	@JsonInclude(Include.NON_DEFAULT)
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@JsonProperty("ProductDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	@JsonProperty("ExpirationDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@JsonProperty("Available")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@JsonProperty("Currency")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("CurrencyDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getCurrencyDesc() {
		return currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}

	@JsonProperty("AvailableProductionAction")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAvailableProductionAction() {
		return availableProductionAction;
	}

	public void setAvailableProductionAction(String availableProductionAction) {
		this.availableProductionAction = availableProductionAction;
	}

	@JsonProperty("MaxPinAttempts")
	@JsonInclude(Include.NON_DEFAULT)
	public String getMaxPinAttempts() {
		return maxPinAttempts;
	}

	public void setMaxPinAttempts(String maxPinAttempts) {
		this.maxPinAttempts = maxPinAttempts;
	}

	@JsonProperty("PinAttemptsCounter")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPinAttemptsCounter() {
		return pinAttemptsCounter;
	}

	public void setPinAttemptsCounter(String pinAttemptsCounter) {
		this.pinAttemptsCounter = pinAttemptsCounter;
	}

	@JsonProperty("EmbossedTitle")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getEmbossedTitle() {
		return embossedTitle;
	}

	public void setEmbossedTitle(String embossedTitle) {
		this.embossedTitle = embossedTitle;
	}

	@JsonProperty("EmbossedFirstName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEmbossedFirstName() {
		return embossedFirstName;
	}

	public void setEmbossedFirstName(String embossedFirstName) {
		this.embossedFirstName = embossedFirstName;
	}

	@JsonProperty("EmbossedLastName")
	@JsonInclude(Include.NON_DEFAULT)
	public String getEmbossedLastName() {
		return embossedLastName;
	}

	public void setEmbossedLastName(String embossedLastName) {
		this.embossedLastName = embossedLastName;
	}

	@JsonProperty("Status")
	@JsonInclude(Include.NON_DEFAULT)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("StatusDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getStatusDesc() {
		return statusDesc;
	}


	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}


	@JsonProperty("ProductionStatus")
	@JsonInclude(Include.NON_DEFAULT)
	public String getProductionStatus() {
		return productionStatus;
	}



	public void setProductionStatus(String productionStatus) {
		this.productionStatus = productionStatus;
	}


	@JsonProperty("ProductionStatusDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getProductionStatusDesc() {
		return productionStatusDesc;
	}



	public void setProductionStatusDesc(String productionStatusDesc) {
		this.productionStatusDesc = productionStatusDesc;
	}


	@JsonProperty("Ready")
	@JsonInclude(Include.NON_DEFAULT)
	public String getReady() {
		return ready;
	}



	public void setReady(String ready) {
		this.ready = ready;
	}


	@JsonProperty("ReadyDesc")
	@JsonInclude(Include.NON_DEFAULT)
	public String getReadyDesc() {
		return readyDesc;
	}

	public void setReadyDesc(String readyDesc) {
		this.readyDesc = readyDesc;
	}


	@JsonProperty("StatusCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
}
