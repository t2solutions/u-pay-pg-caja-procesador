<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetEventsByContract/Resp-v2017.10">
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:Data">
<Data>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <xsl:for-each select="//resp:EventLogDetailsRecord">
	    <EventLogDetailsRecord>
			<ContractCategory><xsl:value-of select="resp:ContractCategory" /></ContractCategory>
			<ContractCategoryDesc><xsl:value-of select="resp:ContractCategoryDesc" /></ContractCategoryDesc>
			<EventType><xsl:value-of select="resp:EventType" /></EventType>
			<EventTypeDesc><xsl:value-of select="resp:EventTypeDesc" /></EventTypeDesc>
			<EventDetails><xsl:value-of select="resp:EventDetails" /></EventDetails>
			<PostingStatus><xsl:value-of select="resp:PostingStatus" /></PostingStatus>
			<PostingStatusDesc><xsl:value-of select="resp:PostingStatusDesc" /></PostingStatusDesc>
			<RecordDate><xsl:value-of select="resp:RecordDate" /></RecordDate>
			<StartDate><xsl:value-of select="resp:StartDate" /></StartDate>
			<EndDate><xsl:value-of select="resp:EndDate" /></EndDate>
			<ID><xsl:value-of select="resp:ID" /></ID>
			<Contract><xsl:value-of select="resp:Contract" /></Contract>
			<ContractNum><xsl:value-of select="resp:ContractNum" /></ContractNum>
			<TargetDoc><xsl:value-of select="resp:TargetDoc" /></TargetDoc>				    
	    </EventLogDetailsRecord>
    </xsl:for-each>
</Data>
</xsl:template>
</xsl:stylesheet>