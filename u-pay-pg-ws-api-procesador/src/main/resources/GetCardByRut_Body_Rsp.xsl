<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetCardByRut/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:GetCardByRutResp">
<GetCardByRutResp>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
	<xsl:for-each select="//resp:CardDetailsAPIRecord">
		<CardDetailsAPIRecord>
			   <xsl:for-each select="resp:CardData">	
	               <CardData>
						<CardNumber><xsl:value-of select="resp:CardNumber" /></CardNumber>
						<CardName><xsl:value-of select="resp:CardName" /></CardName>
						<Product><xsl:value-of select="resp:Product" /></Product>
						<ProductDesc><xsl:value-of select="resp:ProductDesc" /></ProductDesc>
						<ExpirationDate><xsl:value-of select="resp:ExpirationDate" /></ExpirationDate>
						<Available><xsl:value-of select="resp:Available" /></Available>
						<Currency><xsl:value-of select="resp:Currency" /></Currency>
						<CurrencyDesc><xsl:value-of select="resp:CurrencyDesc" /></CurrencyDesc>
						<AvailableProductionAction><xsl:value-of select="resp:AvailableProductionAction" /></AvailableProductionAction>
						<MaxPinAttempts><xsl:value-of select="resp:MaxPinAttempts" /></MaxPinAttempts>
						<PinAttemptsCounter><xsl:value-of select="resp:PinAttemptsCounter" /></PinAttemptsCounter>
						<EmbossedTitle><xsl:value-of select="resp:EmbossedTitle" /></EmbossedTitle>
						<EmbossedFirstName><xsl:value-of select="resp:EmbossedFirstName" /></EmbossedFirstName>
						<EmbossedLastName><xsl:value-of select="resp:EmbossedLastName" /></EmbossedLastName>
						<Status><xsl:value-of select="resp:Status" /></Status>
						<StatusDesc><xsl:value-of select="resp:StatusDesc" /></StatusDesc>
						<StatusCode><xsl:value-of select="resp:StatusCode" /></StatusCode>
						<ProductionStatus><xsl:value-of select="resp:ProductionStatus" /></ProductionStatus>
						<ProductionStatusDesc><xsl:value-of select="resp:ProductionStatusDesc" /></ProductionStatusDesc>
						<Ready><xsl:value-of select="resp:Ready" /></Ready>
						<ReadyDesc><xsl:value-of select="resp:ReadyDesc" /></ReadyDesc>
	               </CardData>		
				</xsl:for-each>
				<xsl:for-each select="resp:AddData">	
					<AddData>
						<Institution><xsl:value-of select="resp:Institution" /></Institution>
						<InstitutionDesc><xsl:value-of select="resp:InstitutionDesc" /></InstitutionDesc>
						<Branch><xsl:value-of select="resp:Branch" /></Branch>
						<BranchDesc><xsl:value-of select="resp:BranchDesc" /></BranchDesc>
						<ClientCategory><xsl:value-of select="resp:ClientCategory" /></ClientCategory>
						<ClientCategoryDesc><xsl:value-of select="resp:ClientCategoryDesc" /></ClientCategoryDesc>
						<ProductCategory><xsl:value-of select="resp:ProductCategory" /></ProductCategory>
						<ProductCategoryDesc><xsl:value-of select="resp:ProductCategoryDesc" /></ProductCategoryDesc>
						<ContractCategory><xsl:value-of select="resp:ContractCategory" /></ContractCategory>
						<ContractCategoryDesc><xsl:value-of select="resp:ContractCategoryDesc" /></ContractCategoryDesc>
						<ParentProduct><xsl:value-of select="resp:ParentProduct" /></ParentProduct>
						<ParentProductDesc><xsl:value-of select="resp:ParentProductDesc" /></ParentProductDesc>
						<CounterpartChannel><xsl:value-of select="resp:CounterpartChannel" /></CounterpartChannel>
						<CounterpartChannelDesc><xsl:value-of select="resp:CounterpartChannelDesc" /></CounterpartChannelDesc>
						<RiskFactor><xsl:value-of select="resp:RiskFactor" /></RiskFactor>
						<StatusCodeDesc><xsl:value-of select="resp:StatusCodeDesc" /></StatusCodeDesc>
						<ID><xsl:value-of select="resp:ID" /></ID>
						<AmendmentDate><xsl:value-of select="resp:AmendmentDate" /></AmendmentDate>
						<Client><xsl:value-of select="resp:Client" /></Client>
						<ClientDesc><xsl:value-of select="resp:ClientDesc" /></ClientDesc>
						<Parent><xsl:value-of select="resp:Parent" /></Parent>
						<ParentDesc><xsl:value-of select="resp:ParentDesc" /></ParentDesc>
						<ServPack><xsl:value-of select="resp:ServPack" /></ServPack>
						<AddInfo01><xsl:value-of select="resp:AddInfo01" /></AddInfo01>
						<AddInfo02><xsl:value-of select="resp:AddInfo02" /></AddInfo02>
						<AddInfo03><xsl:value-of select="resp:AddInfo03" /></AddInfo03>
						<AddInfo04><xsl:value-of select="resp:AddInfo04" /></AddInfo04>						
					</AddData>								
				</xsl:for-each>
		</CardDetailsAPIRecord>
	</xsl:for-each>
</GetCardByRutResp>
</xsl:template>
</xsl:stylesheet>