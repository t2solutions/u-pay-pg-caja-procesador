<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetCardByContract/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:GetCardByContractResp">
<GetCardByContractResp>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    
	<xsl:for-each select="//resp:IssContractDetailsAPIOutputRecord">
		<IssContractDetailsAPIOutputRecord>
			   <xsl:for-each select="resp:CardData">				   			   
	               <CardData>
						<ContractNumber><xsl:value-of select="resp:ContractNumber" /></ContractNumber>
						<SafeContractNumber><xsl:value-of select="resp:SafeContractNumber" /></SafeContractNumber>
						<ContractLevel><xsl:value-of select="resp:ContractLevel" /></ContractLevel>
						<Product><xsl:value-of select="resp:Product" /></Product>
						<ProductDesc><xsl:value-of select="resp:ProductDesc" /></ProductDesc>
						<ProductCategory><xsl:value-of select="resp:ProductCategory" /></ProductCategory>
						<ProductCategoryDesc><xsl:value-of select="resp:ProductCategoryDesc" /></ProductCategoryDesc>
						<OpenDate><xsl:value-of select="resp:OpenDate" /></OpenDate>
						<CheckUsage><xsl:value-of select="resp:CheckUsage" /></CheckUsage>
						<Currency><xsl:value-of select="resp:Currency" /></Currency>
						<CurrencyDesc><xsl:value-of select="resp:CurrencyDesc" /></CurrencyDesc>
						<Available><xsl:value-of select="resp:Available" /></Available>
						<Balance><xsl:value-of select="resp:Balance" /></Balance>
						<CreditLimit><xsl:value-of select="resp:CreditLimit" /></CreditLimit>
						<AddLimit><xsl:value-of select="resp:AddLimit" /></AddLimit>
						<Blocked><xsl:value-of select="resp:Blocked" /></Blocked>
						<TotalDue><xsl:value-of select="resp:TotalDue" /></TotalDue>
						<PastDue><xsl:value-of select="resp:TotalDue" /></PastDue>
						<LastBillingDate><xsl:value-of select="resp:LastBillingDate" /></LastBillingDate>
						<NextBillingDate><xsl:value-of select="resp:NextBillingDate" /></NextBillingDate>
						<Status><xsl:value-of select="resp:Status" /></Status>
						<StatusDesc><xsl:value-of select="resp:StatusDesc" /></StatusDesc>
						<Ready><xsl:value-of select="resp:Ready" /></Ready>
						<ReadyDesc><xsl:value-of select="resp:ReadyDesc" /></ReadyDesc>
						<AmendmentDate><xsl:value-of select="resp:AmendmentDate" /></AmendmentDate>
						<LastScan><xsl:value-of select="resp:LastScan" /></LastScan>
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
						<ClientType><xsl:value-of select="resp:ClientType" /></ClientType>
						<ClientTypeDesc><xsl:value-of select="resp:ClientTypeDesc" /></ClientTypeDesc>
						<RedefinedProductCategory><xsl:value-of select="resp:RedefinedProductCategory" /></RedefinedProductCategory>
						<ContractCategory><xsl:value-of select="resp:ContractCategory" /></ContractCategory>
						<ContractCategoryDesc><xsl:value-of select="resp:ContractCategoryDesc" /></ContractCategoryDesc>
						<ParentProduct><xsl:value-of select="resp:ParentProduct" /></ParentProduct>
						<ParentProductDesc><xsl:value-of select="resp:ParentProductDesc" /></ParentProductDesc>
						<MainProduct><xsl:value-of select="resp:MainProduct" /></MainProduct>
						<ContractSubtype><xsl:value-of select="resp:ContractSubtype" /></ContractSubtype>
						<ContractSubtypeDesc><xsl:value-of select="resp:ContractSubtypeDesc" /></ContractSubtypeDesc>
						<ReportType><xsl:value-of select="resp:ReportType" /></ReportType>
						<Role><xsl:value-of select="resp:Role" /></Role>
						<Leaf><xsl:value-of select="resp:Leaf" /></Leaf>
						<Client><xsl:value-of select="resp:Client" /></Client>
						<ClientDesc><xsl:value-of select="resp:ClientDesc" /></ClientDesc>
						<ParentContract><xsl:value-of select="resp:ParentContract" /></ParentContract>
						<ParentContractDesc><xsl:value-of select="resp:ParentContractDesc" /></ParentContractDesc>
						<BillingContract><xsl:value-of select="resp:BillingContract" /></BillingContract>
						<BillingContractDesc><xsl:value-of select="resp:BillingContractDesc" /></BillingContractDesc>
						<TopContract><xsl:value-of select="resp:TopContract" /></TopContract>
						<TopContractDesc><xsl:value-of select="resp:TopContractDesc" /></TopContractDesc>
						<StatusCode><xsl:value-of select="resp:StatusCode" /></StatusCode>
						<StatusCodeDesc><xsl:value-of select="resp:StatusCodeDesc" /></StatusCodeDesc>
						<LastApplicationDate><xsl:value-of select="resp:LastApplicationDate" /></LastApplicationDate>
						<LastApplicationOfficer><xsl:value-of select="resp:LastApplicationOfficer" /></LastApplicationOfficer>
						<LastApplicationStatus><xsl:value-of select="resp:LastApplicationStatus" /></LastApplicationStatus>
						<LastActivityDate><xsl:value-of select="resp:LastActivityDate" /></LastActivityDate>
						<ID><xsl:value-of select="resp:ID" /></ID>
						<AccountingParent><xsl:value-of select="resp:AccountingParent" /></AccountingParent>
						<AccountingParentDesc><xsl:value-of select="resp:AccountingParentDesc" /></AccountingParentDesc>
						<ClientFullName><xsl:value-of select="resp:ClientFullName" /></ClientFullName>
						<AddInfo01><xsl:value-of select="resp:AddInfo01" /></AddInfo01>
						<AddInfo02><xsl:value-of select="resp:AddInfo02" /></AddInfo02>
						<AddInfo03><xsl:value-of select="resp:AddInfo03" /></AddInfo03>
						<AddInfo04><xsl:value-of select="resp:AddInfo04" /></AddInfo04>		
					</AddData>																
				</xsl:for-each>
		</IssContractDetailsAPIOutputRecord>
	</xsl:for-each>
</GetCardByContractResp>
</xsl:template>
</xsl:stylesheet>