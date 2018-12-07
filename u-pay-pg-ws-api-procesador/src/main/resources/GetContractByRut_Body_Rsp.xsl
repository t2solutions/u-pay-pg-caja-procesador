<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetContractByRut/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:param name="failPoint" />
<xsl:template match="//resp:DATA">
<DATA>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
    <FailPoint><xsl:value-of select="$failPoint" /></FailPoint>
    <xsl:for-each select="//resp:IssContractDetailsAPIOutputV2Record">
	    <resp:IssContractDetailsAPIOutputV2Record>
	    	<xsl:for-each select="//resp:ContractData">
			    <ContractData>  		
			    <xsl:if test="resp:ProductCategory">				     
					<ProductCategory><xsl:value-of select="resp:ProductCategory" /></ProductCategory>
				</xsl:if>
				<xsl:if test="resp:ProductCategoryDesc">		
					<ProductCategoryDesc><xsl:value-of select="resp:ProductCategoryDesc" /></ProductCategoryDesc>
				</xsl:if>
				<xsl:if test="resp:RedefinedProductCategory">		
					<RedefinedProductCategory><xsl:value-of select="resp:RedefinedProductCategory" /></RedefinedProductCategory>
				</xsl:if>
				<xsl:if test="resp:ContractCategory">		
					<ContractCategory><xsl:value-of select="resp:ContractCategory" /></ContractCategory>
				</xsl:if>
				<xsl:if test="resp:ContractCategoryDesc">		
					<ContractCategoryDesc><xsl:value-of select="resp:ContractCategoryDesc" /></ContractCategoryDesc>
				</xsl:if>
				<xsl:if test="resp:ParentProduct">		
					<ParentProduct><xsl:value-of select="resp:ParentProduct" /></ParentProduct>
				</xsl:if>
				<xsl:if test="resp:ParentProductDesc">		
					<ParentProductDesc><xsl:value-of select="resp:ParentProductDesc" /></ParentProductDesc>
				</xsl:if>
				<xsl:if test="resp:MainProduct">		
					<MainProduct><xsl:value-of select="resp:MainProduct" /></MainProduct>
				</xsl:if>
				<xsl:if test="resp:Product">		
					<Product><xsl:value-of select="resp:Product" /></Product>
				</xsl:if>
				<xsl:if test="resp:ProductDesc">		
					<ProductDesc><xsl:value-of select="resp:ProductDesc" /></ProductDesc>
				</xsl:if>
				<xsl:if test="resp:ContractSubtype">		
					<ContractSubtype><xsl:value-of select="resp:ContractSubtype" /></ContractSubtype>
				</xsl:if>
				<xsl:if test="resp:ContractSubtypeDesc">		
					<ContractSubtypeDesc><xsl:value-of select="resp:ContractSubtypeDesc" /></ContractSubtypeDesc>
				</xsl:if>
				<xsl:if test="resp:ContractNumber">		
					<ContractNumber><xsl:value-of select="resp:ContractNumber" /></ContractNumber>
				</xsl:if>
				<xsl:if test="resp:SafeContractNumber">		
					<SafeContractNumber><xsl:value-of select="resp:SafeContractNumber" /></SafeContractNumber>
				</xsl:if>
				<xsl:if test="resp:ContractName">		
					<ContractName><xsl:value-of select="resp:ContractName" /></ContractName>
				</xsl:if>
				<xsl:if test="resp:ContractLevel">		
					<ContractLevel><xsl:value-of select="resp:ContractLevel" /></ContractLevel>
				</xsl:if>
				<xsl:if test="resp:ParentContract">		
					<ParentContract><xsl:value-of select="resp:ParentContract" /></ParentContract>
				</xsl:if>
				<xsl:if test="resp:ParentContractDesc">		
					<ParentContractDesc><xsl:value-of select="resp:ParentContractDesc" /></ParentContractDesc>
				</xsl:if>
				<xsl:if test="resp:BillingContract">		
					<BillingContract><xsl:value-of select="resp:BillingContract" /></BillingContract>
				</xsl:if>
				<xsl:if test="resp:BillingContractDesc">		
					<BillingContractDesc><xsl:value-of select="resp:BillingContractDesc" /></BillingContractDesc>
				</xsl:if>
				<xsl:if test="resp:TopContract">		
					<TopContract><xsl:value-of select="resp:TopContract" /></TopContract>
				</xsl:if>
				<xsl:if test="resp:TopContractDesc">		
					<TopContractDesc><xsl:value-of select="resp:TopContractDesc" /></TopContractDesc>
				</xsl:if>
				<xsl:if test="resp:OpenDate">		
					<OpenDate><xsl:value-of select="resp:OpenDate" /></OpenDate>
				</xsl:if>
				<xsl:if test="resp:CloseDate">		
					<CloseDate><xsl:value-of select="resp:CloseDate" /></CloseDate>
				</xsl:if>
				<xsl:if test="resp:DueDate">	
					<DueDate><xsl:value-of select="resp:DueDate" /></DueDate>
				</xsl:if>
				<xsl:if test="resp:CheckUsage">		
					<CheckUsage><xsl:value-of select="resp:CheckUsage" /></CheckUsage>
				</xsl:if>
				<xsl:if test="resp:Currency">		
					<Currency><xsl:value-of select="resp:Currency" /></Currency>
				</xsl:if>
				<xsl:if test="resp:CurrencyDesc">		
					<CurrencyDesc><xsl:value-of select="resp:CurrencyDesc" /></CurrencyDesc>
				</xsl:if>
				<xsl:if test="resp:LastBillingDate">		
					<LastBillingDate><xsl:value-of select="resp:LastBillingDate" /></LastBillingDate>
				</xsl:if>
				<xsl:if test="resp:NextBillingDate">		
					<NextBillingDate><xsl:value-of select="resp:NextBillingDate" /></NextBillingDate>
				</xsl:if>
				<xsl:if test="resp:Status">		
					<Status><xsl:value-of select="resp:Status" /></Status>
				</xsl:if>
				<xsl:if test="resp:StatusDesc">		
					<StatusDesc><xsl:value-of select="resp:StatusDesc" /></StatusDesc>
				</xsl:if>
				<xsl:if test="resp:StatusCode">	
					<StatusCode><xsl:value-of select="resp:StatusCode" /></StatusCode>
				</xsl:if>
				<xsl:if test="resp:StatusCodeDesc">	
					<StatusCodeDesc><xsl:value-of select="resp:StatusCodeDesc" /></StatusCodeDesc>
				</xsl:if>
				<xsl:if test="resp:LastApplicationDate">		
					<LastApplicationDate><xsl:value-of select="resp:LastApplicationDate" /></LastApplicationDate>
				</xsl:if>
				<xsl:if test="resp:LastApplicationOfficer">		
					<LastApplicationOfficer><xsl:value-of select="resp:LastApplicationOfficer" /></LastApplicationOfficer>
				</xsl:if>
				<xsl:if test="resp:LastApplicationStatus">		
					<LastApplicationStatus><xsl:value-of select="resp:LastApplicationStatus" /></LastApplicationStatus>
				</xsl:if>
				<xsl:if test="resp:LastActivityDate">		
					<LastActivityDate><xsl:value-of select="resp:LastActivityDate" /></LastActivityDate>
				</xsl:if>
				<xsl:if test="resp:Ready">		
					<Ready><xsl:value-of select="resp:Ready" /></Ready>
				</xsl:if>
				<xsl:if test="resp:ReadyDesc">		
					<ReadyDesc><xsl:value-of select="resp:ReadyDesc" /></ReadyDesc>
				</xsl:if>
				<xsl:if test="resp:AmendmentDate">		
					<AmendmentDate><xsl:value-of select="resp:AmendmentDate" /></AmendmentDate>
				</xsl:if>
				<xsl:if test="resp:LastScan">		
					<LastScan><xsl:value-of select="resp:LastScan" /></LastScan>
				</xsl:if>
				<xsl:if test="resp:AccountingParent">		
					<AccountingParent><xsl:value-of select="resp:AccountingParent" /></AccountingParent>
				</xsl:if>
				<xsl:if test="resp:AccountingParentDesc">		
					<AccountingParentDesc><xsl:value-of select="resp:AccountingParentDesc" /></AccountingParentDesc>
				</xsl:if>
				<xsl:if test="resp:LiabilityCategory">		
					<LiabilityCategory><xsl:value-of select="resp:LiabilityCategory" /></LiabilityCategory>
				</xsl:if>
				<xsl:if test="resp:LiabilityContract">		
					<LiabilityContract><xsl:value-of select="resp:LiabilityContract" /></LiabilityContract>
				</xsl:if>
				<xsl:if test="resp:RelationTag">		
					<RelationTag><xsl:value-of select="resp:RelationTag" /></RelationTag>
				</xsl:if>
				<xsl:if test="resp:RelationType">		
					<RelationType><xsl:value-of select="resp:RelationType" /></RelationType>
				</xsl:if>
				<xsl:if test="resp:ServiceGroup">		
					<ServiceGroup><xsl:value-of select="resp:ServiceGroup" /></ServiceGroup>
				</xsl:if>	
			   </ContractData>	
			  </xsl:for-each> 	
			  <xsl:for-each select="//resp:BalancesData">
					<BalancesData>
						<xsl:if test="resp:Available">
						<Available><xsl:value-of select="resp:Available" /></Available>
						</xsl:if>
						<xsl:if test="resp:Balance">
						<Balance><xsl:value-of select="resp:Balance" /></Balance>
						</xsl:if>
						<xsl:if test="resp:CreditLimit">
						<CreditLimit><xsl:value-of select="resp:CreditLimit" /></CreditLimit>
						</xsl:if>
						<xsl:if test="resp:AddLimit">
						<AddLimit><xsl:value-of select="resp:AddLimit" /></AddLimit>
						</xsl:if>
						<xsl:if test="resp:Blocked">
						<Blocked><xsl:value-of select="resp:Blocked" /></Blocked>
						</xsl:if>
						<xsl:if test="resp:TotalDue">
						<TotalDue><xsl:value-of select="resp:TotalDue" /></TotalDue>
						</xsl:if>
						<xsl:if test="resp:PastDue">
						<PastDue><xsl:value-of select="resp:PastDue" /></PastDue>
						</xsl:if>
						<xsl:if test="resp:CreditLimitUSD">
						<CreditLimitUSD><xsl:value-of select="resp:CreditLimitUSD" /></CreditLimitUSD>
						</xsl:if>
						<xsl:if test="resp:AvailableUSD">
						<AvailableUSD><xsl:value-of select="resp:AvailableUSD" /></AvailableUSD>
						</xsl:if>
						<xsl:if test="resp:BalanceUSD">
						<BalanceUSD><xsl:value-of select="resp:BalanceUSD" /></BalanceUSD>
						</xsl:if>
					</BalancesData>									
			   </xsl:for-each>
			   <xsl:for-each select="//resp:AddData">
			   		<AddData>
			   		<xsl:if test="resp:Institution">
						<Institution><xsl:value-of select="resp:Institution" /></Institution>
					</xsl:if>
					<xsl:if test="resp:InstitutionDesc">	
						<InstitutionDesc><xsl:value-of select="resp:InstitutionDesc" /></InstitutionDesc>
					</xsl:if>	
					<xsl:if test="resp:Branch">	
						<Branch><xsl:value-of select="resp:Branch" /></Branch>
					</xsl:if>
					<xsl:if test="resp:BranchDesc">		
						<BranchDesc><xsl:value-of select="resp:BranchDesc" /></BranchDesc>
					</xsl:if>
					<xsl:if test="resp:ClientCategory">		
						<ClientCategory><xsl:value-of select="resp:ClientCategory" /></ClientCategory>
					</xsl:if>
					<xsl:if test="resp:ClientCategoryDesc">		
						<ClientCategoryDesc><xsl:value-of select="resp:ClientCategoryDesc" /></ClientCategoryDesc>
					</xsl:if>
					<xsl:if test="resp:ClientType">		
						<ClientType><xsl:value-of select="resp:ClientType" /></ClientType>
					</xsl:if>
					<xsl:if test="resp:ClientTypeDesc">		
						<ClientTypeDesc><xsl:value-of select="resp:ClientTypeDesc" /></ClientTypeDesc>
					</xsl:if>
					<xsl:if test="resp:ReportType">		
						<ReportType><xsl:value-of select="resp:ReportType" /></ReportType>
					</xsl:if>
					<xsl:if test="resp:Role">		
						<Role><xsl:value-of select="resp:Role" /></Role>
					</xsl:if>
					<xsl:if test="resp:Leaf">		
						<Leaf><xsl:value-of select="resp:Leaf" /></Leaf>
					</xsl:if>
					<xsl:if test="resp:Client">		
						<Client><xsl:value-of select="resp:Client" /></Client>
					</xsl:if>
					<xsl:if test="resp:ID">		
						<ID><xsl:value-of select="resp:ID" /></ID>
					</xsl:if>
					<xsl:if test="resp:EnablesItem">		
						<EnablesItem><xsl:value-of select="resp:EnablesItem" /></EnablesItem> 	
					</xsl:if>
					<xsl:if test="resp:AddInfo01">							
						<AddInfo01><xsl:value-of select="resp:AddInfo01" /></AddInfo01>
					</xsl:if>
					<xsl:if test="resp:AddInfo02">		
						<AddInfo02><xsl:value-of select="resp:AddInfo02" /></AddInfo02>
					</xsl:if>
					<xsl:if test="resp:AddInfo03">		
						<AddInfo03><xsl:value-of select="resp:AddInfo03" /></AddInfo03>
					</xsl:if>
					<xsl:if test="resp:AddInfo04">		
						<AddInfo04><xsl:value-of select="resp:AddInfo04" /></AddInfo04>
					</xsl:if>
					<xsl:if test="resp:BehaviourGroup">		
						<BehaviourGroup><xsl:value-of select="resp:BehaviourGroup" /></BehaviourGroup>
					</xsl:if>	
					<xsl:if test="resp:BehaviourType">		
						<BehaviourType><xsl:value-of select="resp:BehaviourType" /></BehaviourType>
					</xsl:if>
					<xsl:if test="resp:ClientFullName">		
						<ClientFullName><xsl:value-of select="resp:ClientFullName" /></ClientFullName>	
					</xsl:if>		
			   		</AddData>  
	    	</xsl:for-each>
	    </resp:IssContractDetailsAPIOutputV2Record>
    </xsl:for-each>
</DATA>
</xsl:template>
</xsl:stylesheet>