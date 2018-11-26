<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Credit/GetKeysDUKPTByPan/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:template match="//resp:Data">
<Data>
    <RetCode><xsl:value-of select="resp:RetCode" /></RetCode>
	<xsl:if test="resp:RetMsg">
	 	<!--Optional:-->
	 	<RetMsg><xsl:value-of select="resp:RetMsg" /></RetMsg> 
	</xsl:if>    
	<xsl:if test="resp:IdDukpt">
	 	<!--Optional:-->
	 	<IdDukpt><xsl:value-of select="resp:IdDukpt" /></IdDukpt> 
	</xsl:if> 
	<xsl:if test="resp:KeyDukpt">
	 	<!--Optional:-->
	 	<KeyDukpt><xsl:value-of select="resp:KeyDukpt" /></KeyDukpt> 
	</xsl:if>
</Data>
</xsl:template>
</xsl:stylesheet>