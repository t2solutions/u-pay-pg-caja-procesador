<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/EditClient/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:template match="//resp:Data">
<Data>
    <RetCode><xsl:value-of select="resp:RetCode" /></RetCode>
    <RetMsg><xsl:value-of select="resp:RetMsg" /></RetMsg>
</Data>
</xsl:template>
</xsl:stylesheet>