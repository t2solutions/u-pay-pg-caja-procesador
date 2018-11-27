<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Credit/NamelessCardAssignment/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:template match="//resp:DATA">
<Data>
	<xsl:if test="resp:RetCode">
    	<RetCode><xsl:value-of select="resp:RetCode" /></RetCode>
    </xsl:if>	
	<xsl:if test="resp:RetMsg">
	 	<!--Optional:-->
	 	<RetMsg><xsl:value-of select="resp:RetMsg" /></RetMsg> 
	</xsl:if>    
	<xsl:if test="resp:FailPoint">
	 	<!--Optional:-->
	 	<FailPoint><xsl:value-of select="resp:FailPoint" /></FailPoint> 
	</xsl:if>
</Data>
</xsl:template>
</xsl:stylesheet>