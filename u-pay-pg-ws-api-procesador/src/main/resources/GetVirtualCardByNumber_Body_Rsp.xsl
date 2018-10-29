<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetVirtualCardByNumber/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:param name="failPoint" />
<xsl:template match="//resp:DATA">
<Data>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <FailPoint><xsl:value-of select="$failPoint" /></FailPoint>
    <xsl:for-each select="//resp:IssContractDetailsAPIOutputRecord">
	    <resp:IssContractDetailsAPIOutputRecord>
				<Institution><xsl:value-of select="resp:Institution" /></Institution>
				<InstitutionDesc><xsl:value-of select="resp:InstitutionDesc" /></InstitutionDesc>
				<ParentProduct><xsl:value-of select="resp:ParentProduct" /></ParentProduct>
				<ParentProductDesc><xsl:value-of select="resp:ParentProductDesc" /></ParentProductDesc>
				<Product><xsl:value-of select="resp:Product" /></Product>
				<ProductDesc><xsl:value-of select="resp:ProductDesc" /></ProductDesc>
				<ContractNumber><xsl:value-of select="resp:ContractNumber" /></ContractNumber>
				<Status><xsl:value-of select="resp:Status" /></Status>
				<StatusDesc><xsl:value-of select="resp:StatusDesc" /></StatusDesc>
				<StatusCode><xsl:value-of select="resp:StatusCode" /></StatusCode>
				<StatusCodeDesc><xsl:value-of select="resp:StatusCodeDesc" /></StatusCodeDesc>
				<ExpiryDate><xsl:value-of select="resp:ExpiryDate" /></ExpiryDate>
				<SecurityCode><xsl:value-of select="resp:SecurityCode" /></SecurityCode>
	    </resp:IssContractDetailsAPIOutputRecord>
    </xsl:for-each>
</Data>
</xsl:template>
</xsl:stylesheet>