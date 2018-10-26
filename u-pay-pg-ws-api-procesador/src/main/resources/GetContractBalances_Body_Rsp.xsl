<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetContractBalances/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:DATA">
<DATA>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <xsl:for-each select="//resp:ContractBalanceListDetailsRecord">
	    <resp:ContractBalanceListDetailsRecord>
				<BalanceCode><xsl:value-of select="resp:BalanceCode" /></BalanceCode>
				<BalanceCurrency><xsl:value-of select="resp:BalanceCurrency" /></BalanceCurrency>
				<BalanceValue><xsl:value-of select="resp:BalanceValue" /></BalanceValue>
	    </resp:ContractBalanceListDetailsRecord>
    </xsl:for-each>
</DATA>
</xsl:template>
</xsl:stylesheet>