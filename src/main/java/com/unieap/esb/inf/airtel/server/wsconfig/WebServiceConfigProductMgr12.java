package com.unieap.esb.inf.airtel.server.wsconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfigProductMgr12 extends WsConfigurerAdapter {
	// http://127.0.0.1:8100/unieap/service/ProductMgr12.wsdl
	@Bean(name = "ProductMgr12")
	public Wsdl11Definition defaultWsdl11DefinitionProductMgr12() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition
				.setWsdl(new ClassPathResource("/wsdl/ocs12/META-INF_ProductMgr/CBSInterfaceProductMgrService.wsdl"));
		return wsdl11Definition;
	}
}
