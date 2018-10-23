<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetAddresses/Resp-v2017.10"
exclude-result-prefixes="resp">
<xsl:output method="xml" indent="yes"/>
	<xsl:template match="DataResp">
	        <DataResp>
	       		<xsl:copy-of select="*"/>	            
	        </DataResp>
	</xsl:template>
</xsl:stylesheet>