package com.upayments.pg.caja.api.io.soap.getcardbynumber;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "CardNumber", "CardName", 
	"ExpirationDate", "Available", "Currency", "CurrencyDesc", 
	"PreviousCard", "SequenceNumber", "OrderDate", "OrderReason", 
	"MaxPinAttempts", "PinAttemptsCounter", "EmbossedTitle", "EmbossedFirstName", "EmbossedLastName", 
	"EmbossedCompanyName", "Status", "StatusDesc", 
	"ProductionStatus", "ProductionStatusDesc", "Ready", "ReadyDesc", "AmendmentDate"})
public class CardData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cardNumber; //<><xsl:value-of select="resp:XXX" /></CardNumber>
	private String cardName; //<><xsl:value-of select="resp:XXX" /></CardName>	
	private String expirationDate; //<><xsl:value-of select="resp:XXX" /></>
	private String available; //<><xsl:value-of select="resp:XXX" /></>
	private String currency; //<><xsl:value-of select="resp:XXX" /></>
	private String currencyDesc; //<><xsl:value-of select="resp:XXX" /></>
	
	private String previousCard;
	private String sequenceNumber;
	private String orderDate;
	private String orderReason;
	
	private String maxPinAttempts; //<><xsl:value-of select="resp:XXX" /></>
	private String pinAttemptsCounter; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedTitle; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedFirstName; //<><xsl:value-of select="resp:XXX" /></>
	private String embossedLastName; //<><xsl:value-of select="resp:XXX" /></>
	private String status; //<><xsl:value-of select="resp:XXX" /></>
	private String statusDesc; //<><xsl:value-of select="resp:XXX" /></>
	
	private String productionStatus;//<><xsl:value-of select="resp:XXX" /></>
	private String productionStatusDesc; //;<><xsl:value-of select="resp:XXX" /></>
	private String ready; //<><xsl:value-of select="resp:XXX" /></>
	private String readyDesc;//<><xsl:value-of select="resp:XXX" /></>
	private String amendmentDate;
	
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

	@JsonProperty("PreviousCard")
	@JsonInclude(Include.NON_DEFAULT)
	public String getPreviousCard() {
		return previousCard;
	}

	public void setPreviousCard(String previousCard) {
		this.previousCard = previousCard;
	}

	@JsonProperty("SequenceNumber")
	@JsonInclude(Include.NON_DEFAULT)
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@JsonProperty("OrderDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@JsonProperty("OrderReason")
	@JsonInclude(Include.NON_DEFAULT)
	public String getOrderReason() {
		return orderReason;
	}

	public void setOrderReason(String orderReason) {
		this.orderReason = orderReason;
	}

	@JsonProperty("AmendmentDate")
	@JsonInclude(Include.NON_DEFAULT)
	public String getAmendmentDate() {
		return amendmentDate;
	}

	public void setAmendmentDate(String amendmentDate) {
		this.amendmentDate = amendmentDate;
	}

	
}
