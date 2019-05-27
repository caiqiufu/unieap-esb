package com.unieap.esb.inf.airtel.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfigAirtel extends WsConfigurerAdapter {

	//OCS12
	//http://127.0.0.1:8100/unieap/service/AccountMgr12.wsdl
	@Bean(name = "AccountMgr12")
	public Wsdl11Definition defaultWsdl11DefinitionAccountMgr12() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs12/META-INF_AccountMgr/CBSInterfaceAccountMgrService.wsdl"));
		return wsdl11Definition;
	}
	//http://127.0.0.1:8100/unieap/service/BusinessMgr12.wsdl
	@Bean(name = "BusinessMgr12")
	public Wsdl11Definition defaultWsdl11DefinitionBusinessMgr12() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs12/META-INF_BusinessMgr/CBSInterfaceBusinessMgrService.wsdl"));
		return wsdl11Definition;
	}
	@Bean(name = "ProductMgr12")
	public Wsdl11Definition defaultWsdl11DefinitionProductMgr12() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs12/META-INF_ProductMgr/CBSInterfaceProductMgrService.wsdl"));
		return wsdl11Definition;
	}
	//OCS55
	@Bean(name = "AcctMgr55")
	public Wsdl11Definition defaultWsdl11DefinitionAcctMgr55() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs55/CBSInterface_AcctMgr.wsdl"));
		return wsdl11Definition;
	}
	
	@Bean(name = "ARServices55")
	public Wsdl11Definition defaultWsdl11DefinitionARServices55() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs55/CBSInterface_AR_Services.wsdl"));
		return wsdl11Definition;
	}
	
	@Bean(name = "BCServices55")
	public Wsdl11Definition defaultWsdl11DefinitionBCServices55() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs55/CBSInterface_BC_Services.wsdl"));
		return wsdl11Definition;
	}
	
	@Bean(name = "BusinessMgr55")
	public Wsdl11Definition defaultWsdl11DefinitionBusinessMgr55() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs55/CBSInterface_BusinessMgr.wsdl"));
		return wsdl11Definition;
	}
}
