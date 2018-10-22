<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetAddresses/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:template match="//resp:DataResp">
<DataResp>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg>1</RetMsg>
	<FailPoint>aaa</FailPoint>
	<Addresses>
		<xsl:for-each select="//resp:AddressDetailsRecord">
			<AddressDetailsRecord>
				<AddressType><xsl:value-of select="resp:AddressType" /></AddressType>
				<DeliveryType><xsl:value-of select="resp:DeliveryType" /></DeliveryType>
				<Region><xsl:value-of select="resp:Region" /></Region>				
				<City><xsl:value-of select="resp:City" /></City>
				<ZipCode><xsl:value-of select="resp:ZipCode" /></ZipCode>
				<Line1><xsl:value-of select="resp:Line1" /></Line1>
				<Line2><xsl:value-of select="resp:Line2" /></Line2>
				<Line3><xsl:value-of select="resp:Line3" /></Line3>
				<Line4><xsl:value-of select="resp:Line4" /></Line4>
				<HomePhone><xsl:value-of select="resp:HomePhone" /></HomePhone>
				<MobilePhone><xsl:value-of select="resp:MobilePhone" /></MobilePhone>
				<Email><xsl:value-of select="resp:Email" /></Email>		
				<ActivationDate><xsl:value-of select="resp:ActivationDate" /></ActivationDate>
				<DeactivationDate><xsl:value-of select="resp:DeactivationDate" /></DeactivationDate>
				<Active><xsl:value-of select="resp:Active" /></Active>
				<AmendmentDate><xsl:value-of select="resp:AmendmentDate" /></AmendmentDate>			
				<Enabled><xsl:value-of select="resp:Enabled" /></Enabled>
			</AddressDetailsRecord>
		</xsl:for-each>
	</Addresses>
</DataResp>
</xsl:template>
</xsl:stylesheet>