<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resp="http://xsd.nexuschile.cl/Prepaid/GetClientByRut/Resp-v2017.10">
<!-- <xsl:variable name="retCode"  select="'ASDF'" />  -->
<xsl:output method="xml" />
<xsl:param name="retCode" /> 
<xsl:param name="retMsg" />
<xsl:template match="//resp:GetClientByRutResp">
<GetClientByRutResp>
    <RetCode><xsl:value-of select="$retCode" /></RetCode>
    <RetMsg><xsl:value-of select="$retMsg" /></RetMsg>
	<xsl:for-each select="//resp:IssClientDetailsAPIRecord">
		<IssClientDetailsAPIRecord>
			   <xsl:for-each select="resp:ClientData">	
	               <ClientData>
	                  <IdentityCardNumber><xsl:value-of select="resp:IdentityCardNumber" /></IdentityCardNumber>
	                  <Name><xsl:value-of select="resp:Name" /></Name>
	                  <FullName><xsl:value-of select="resp:FullName" /></FullName>
	                  <ShortName><xsl:value-of select="resp:ShortName" /></ShortName>
	                  <FirstName><xsl:value-of select="resp:FirstName" /></FirstName>
	                  <LastName><xsl:value-of select="resp:LastName" /></LastName>
	                  <Salutation><xsl:value-of select="resp:Salutation" /></Salutation>
	                  <Gender><xsl:value-of select="resp:Gender" /></Gender>
	                  <GenderDesc><xsl:value-of select="resp:GenderDesc" /></GenderDesc>
	                  <BirthDate><xsl:value-of select="resp:BirthDate" /></BirthDate>
	                  <Citizenship><xsl:value-of select="resp:Citizenship" /></Citizenship>
	                  <CitizenshipDesc><xsl:value-of select="resp:CitizenshipDesc" /></CitizenshipDesc>
	                  <MaritalStatus><xsl:value-of select="resp:MaritalStatus" /></MaritalStatus>
	                  <MaritalStatusDesc><xsl:value-of select="resp:MaritalStatusDesc" /></MaritalStatusDesc>
	                  <CompanyName><xsl:value-of select="resp:CompanyName" /></CompanyName>
	                  <Department><xsl:value-of select="resp:Department" /></Department>
	                  <Position><xsl:value-of select="resp:Position" /></Position>
	                  <ClientCategory><xsl:value-of select="resp:ClientCategory" /></ClientCategory>
	                  <ClientCategoryDesc><xsl:value-of select="resp:ClientCategoryDesc" /></ClientCategoryDesc>
	                  <ClientType><xsl:value-of select="resp:ClientType" /></ClientType>
	                  <ClientTypeDesc><xsl:value-of select="resp:ClientTypeDesc" /></ClientTypeDesc>
	               </ClientData>		
				</xsl:for-each>
				<xsl:for-each select="resp:AddData">	
					<AddData>
						<Institution><xsl:value-of select="resp:Institution" /></Institution>
						<InstitutionDesc><xsl:value-of select="resp:InstitutionDesc" /></InstitutionDesc>
						<Branch><xsl:value-of select="resp:Branch" /></Branch>
						<BranchDesc><xsl:value-of select="resp:BranchDesc" /></BranchDesc>
						<ProductCategory><xsl:value-of select="resp:ProductCategory" /></ProductCategory>
						<ProductCategoryDesc><xsl:value-of select="resp:ProductCategoryDesc" /></ProductCategoryDesc>
						<Trademark><xsl:value-of select="resp:Trademark" /></Trademark>
						<EmbossedLastName><xsl:value-of select="resp:EmbossedLastName" /></EmbossedLastName>
						<EmbossedFirstName><xsl:value-of select="resp:EmbossedFirstName" /></EmbossedFirstName>
						<EmbossedCompanyName><xsl:value-of select="resp:EmbossedCompanyName" /></EmbossedCompanyName>
						<SecretPhrase><xsl:value-of select="resp:SecretPhrase" /></SecretPhrase>
						<RegistrationDate><xsl:value-of select="resp:RegistrationDate" /></RegistrationDate>
						<LastApplicationOfficer><xsl:value-of select="resp:LastApplicationOfficer" /></LastApplicationOfficer>
						<LastApplicationDate><xsl:value-of select="resp:LastApplicationDate" /></LastApplicationDate>
						<LastApplicationStatus><xsl:value-of select="resp:LastApplicationStatus" /></LastApplicationStatus>
						<Ready><xsl:value-of select="resp:Ready" /></Ready>
						<ReadyDesc><xsl:value-of select="resp:ReadyDesc" /></ReadyDesc>
						<AmendmentDate><xsl:value-of select="resp:AmendmentDate" /></AmendmentDate>
						<ID><xsl:value-of select="resp:ID" /></ID>						
					</AddData>								
				</xsl:for-each>
		</IssClientDetailsAPIRecord>
	</xsl:for-each>
</GetClientByRutResp>
</xsl:template>
</xsl:stylesheet>