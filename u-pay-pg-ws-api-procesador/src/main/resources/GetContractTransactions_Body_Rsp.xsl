<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetContractTransactions/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:DATA">
<Data>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <xsl:for-each select="//resp:CSWTransactionDetailsRecord">
	    <resp:CSWTransactionDetailsRecord>
				<TransactionAmount><xsl:value-of select="resp:TransactionAmount" /></TransactionAmount>
				<TransactionCurrency><xsl:value-of select="resp:TransactionCurrency" /></TransactionCurrency>
				<TransactionCurrencyDesc><xsl:value-of select="resp:TransactionCurrencyDesc" /></TransactionCurrencyDesc>
				<SettlementAmount><xsl:value-of select="resp:SettlementAmount" /></SettlementAmount>
				<SettlementCurrency><xsl:value-of select="resp:SettlementCurrency" /></SettlementCurrency>
				<SettlementCurrencyDesc><xsl:value-of select="resp:SettlementCurrencyDesc" /></SettlementCurrencyDesc>
				<BaseAmount><xsl:value-of select="resp:BaseAmount" /></BaseAmount>
				<FeeAmount><xsl:value-of select="resp:FeeAmount" /></FeeAmount>
				<FeeDescription><xsl:value-of select="resp:FeeDescription" /></FeeDescription>
				<AccountCurrency><xsl:value-of select="resp:AccountCurrency" /></AccountCurrency>
				<AccountCurrencyDesc><xsl:value-of select="resp:AccountCurrencyDesc" /></AccountCurrencyDesc>
				<FXRate><xsl:value-of select="resp:FXRate" /></FXRate>
				<TransactionType><xsl:value-of select="resp:TransactionType" /></TransactionType>
				<TransactionTypeDesc><xsl:value-of select="resp:TransactionTypeDesc" /></TransactionTypeDesc>
				<TransactionTypeCode><xsl:value-of select="resp:TransactionTypeCode" /></TransactionTypeCode>
				<TransactionDate><xsl:value-of select="resp:TransactionDate" /></TransactionDate>
				<PostingDate><xsl:value-of select="resp:PostingDate" /></PostingDate>
				<SIC><xsl:value-of select="resp:SIC" /></SIC>
				<TransDetails><xsl:value-of select="resp:TransDetails" /></TransDetails>
				<TransDescription><xsl:value-of select="resp:TransDescription" /></TransDescription>
				<AuthCode><xsl:value-of select="resp:AuthCode" /></AuthCode>
				<ResponseCode><xsl:value-of select="resp:ResponseCode" /></ResponseCode>
				<ResponseCodeDesc><xsl:value-of select="resp:ResponseCodeDesc" /></ResponseCodeDesc>
				<TransactionStatus><xsl:value-of select="resp:TransactionStatus" /></TransactionStatus>
				<Category><xsl:value-of select="resp:Category" /></Category>
				<CategoryDesc><xsl:value-of select="resp:CategoryDesc" /></CategoryDesc>
				<IsAuthorisation><xsl:value-of select="resp:IsAuthorisation" /></IsAuthorisation>
				<RRN><xsl:value-of select="resp:RRN" /></RRN>
				<Macrotransaction><xsl:value-of select="resp:Macrotransaction" /></Macrotransaction>
				<Document><xsl:value-of select="resp:Document" /></Document>
				<AuthDocID><xsl:value-of select="resp:AuthDocID" /></AuthDocID>
				<FinDocID><xsl:value-of select="resp:FinDocID" /></FinDocID>
	    </resp:CSWTransactionDetailsRecord>
    </xsl:for-each>
</Data>
</xsl:template>
</xsl:stylesheet>