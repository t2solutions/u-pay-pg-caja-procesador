package com.upayments.pg.caja.api.io.soap.getvirtualcard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "Institution", "InstitutionDesc", "ParentProduct",
	"ParentProductDesc", "Product", "ProductDesc", "ContractNumber", "Status", "StatusDesc", "ExpiryDate", "SecurityCode"})
public class IssContractDetailsAPIOutputRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String institution;
	private String institutionDesc;
	private String parentProduct;
	private String parentProductDesc;
	private String product;
	private String productDesc;
	private String contractNumber;
	private String status;
	private String statusDesc;
	private String expiryDate;
	private String securityCode;
	
	public IssContractDetailsAPIOutputRecord() {
		super();
	}

	@JsonProperty("Institution")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	@JsonProperty("InstitutionDesc")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getInstitutionDesc() {
		return institutionDesc;
	}

	public void setInstitutionDesc(String institutionDesc) {
		this.institutionDesc = institutionDesc;
	}

	@JsonProperty("ParentProduct")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getParentProduct() {
		return parentProduct;
	}

	public void setParentProduct(String parentProduct) {
		this.parentProduct = parentProduct;
	}

	@JsonProperty("ParentProductDesc")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getParentProductDesc() {
		return parentProductDesc;
	}

	public void setParentProductDesc(String parentProductDesc) {
		this.parentProductDesc = parentProductDesc;
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

	@JsonProperty("ContractNumber")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
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

	@JsonProperty("ExpiryDate")
	@JsonInclude(Include.NON_DEFAULT)		
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@JsonProperty("SecurityCode")
	@JsonInclude(Include.NON_DEFAULT)	
	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	

	
}

