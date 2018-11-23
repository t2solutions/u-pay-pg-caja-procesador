<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/ReissueCard/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:template match="//resp:Data">
<Data>
  <xsl:if test="resp:PlasticID">
  	 <!--Optional:-->
  	<PlasticID><xsl:value-of select="resp:PlasticID" /></PlasticID> 
  </xsl:if>
  <xsl:if test="resp:NewCardID">
  	<!--Optional:-->
  	<NewCardID><xsl:value-of select="resp:NewCardID" /></NewCardID>
  </xsl:if>
  <xsl:if test="resp:NewCardNumber">
  	 <!--Optional:-->
 	 <NewCardNumber><xsl:value-of select="resp:NewCardNumber" /></NewCardNumber>
  </xsl:if>
  <xsl:if test="resp:NewExpiryDate">
  	<!--Optional:-->
  	<NewExpiryDate><xsl:value-of select="resp:NewExpiryDate" /></NewExpiryDate>
  </xsl:if>
  <xsl:if test="resp:NewSequenceNumber">
  	<!--Optional:-->
  	<NewSequenceNumber><xsl:value-of select="resp:NewSequenceNumber" /></NewSequenceNumber>
  </xsl:if>
  <RetCode><xsl:value-of select="resp:RetCode" /></RetCode>
  <xsl:if test="resp:RetMsg">
  	<!--Optional:-->
  	<RetMsg><xsl:value-of select="resp:RetMsg" /></RetMsg>
  </xsl:if>	
</Data>
</xsl:template>
</xsl:stylesheet>