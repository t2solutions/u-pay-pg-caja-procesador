<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetClassifierByContract/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:Data">
<Data>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <xsl:for-each select="//resp:ContractClassifierSummaryRecord">
	    <resp:ContractClassifierSummaryRecord>
				<ClassifierName><xsl:value-of select="resp:ClassifierName" /></ClassifierName>
				<ValueName><xsl:value-of select="resp:ValueName" /></ValueName>
				<ValueCode><xsl:value-of select="resp:ValueCode" /></ValueCode>
				<Status><xsl:value-of select="resp:Status" /></Status>
				<StatusDesc><xsl:value-of select="resp:StatusDesc" /></StatusDesc>
				<PreviousValue><xsl:value-of select="resp:PreviousValue" /></PreviousValue>
				<LastUpdated><xsl:value-of select="resp:LastUpdated" /></LastUpdated>
				<Officer><xsl:value-of select="resp:Officer" /></Officer>
				<Description><xsl:value-of select="resp:Description" /></Description>
				<GroupCode><xsl:value-of select="resp:GroupCode" /></GroupCode>
				<Role><xsl:value-of select="resp:Role" /></Role>
				<RoleDesc><xsl:value-of select="resp:RoleDesc" /></RoleDesc>
				<ClassifierOwner><xsl:value-of select="resp:ClassifierOwner" /></ClassifierOwner>
				<DateFrom><xsl:value-of select="resp:DateFrom" /></DateFrom>
				<DateTo><xsl:value-of select="resp:DateTo" /></DateTo>
				<ID><xsl:value-of select="resp:ID" /></ID>
				<Contract><xsl:value-of select="resp:Contract" /></Contract>
				<StatusLogID><xsl:value-of select="resp:StatusLogID" /></StatusLogID>
				<ContractClassifierCode><xsl:value-of select="resp:ContractClassifierCode" /></ContractClassifierCode>
	    </resp:ContractClassifierSummaryRecord>
    </xsl:for-each>
</Data>
</xsl:template>
</xsl:stylesheet>