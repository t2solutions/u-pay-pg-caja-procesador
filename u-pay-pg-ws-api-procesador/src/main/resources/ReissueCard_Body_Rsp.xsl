<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/ReissueCard/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:template match="//resp:Data">
<Data>

  <!--Optional:-->
  <PlasticID><xsl:value-of select="resp:PlasticID" /></PlasticID>
  <!--Optional:-->
  <NewCardID><xsl:value-of select="resp:NewCardID" /></NewCardID>
  <!--Optional:-->
  <NewCardNumber><xsl:value-of select="resp:NewCardNumber" /></NewCardNumber>
  <!--Optional:-->
  <NewExpiryDate><xsl:value-of select="resp:NewExpiryDate" /></NewExpiryDate>
  <!--Optional:-->
  <NewSequenceNumber><xsl:value-of select="resp:NewSequenceNumber" /></NewSequenceNumber>
  <RetCode><xsl:value-of select="resp:RetCode" /></RetCode>
   <!--Optional:-->
  <RetMsg><xsl:value-of select="resp:RetMsg" /></RetMsg>
</Data>
</xsl:template>
</xsl:stylesheet>