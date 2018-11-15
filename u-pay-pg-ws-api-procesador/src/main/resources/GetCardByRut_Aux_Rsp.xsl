<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetCardByRut/Resp-v2017.10"
exclude-result-prefixes="resp">
<xsl:output method="xml" indent="yes"/>
	<xsl:template match="GetCardByRutResp">
	        <GetCardByRutResp>
	       		<xsl:copy-of select="*"/>	            
	        </GetCardByRutResp>
	</xsl:template>
</xsl:stylesheet>