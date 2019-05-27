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
public class WebServiceConfigBCServices55 extends WsConfigurerAdapter {
	// http://127.0.0.1:8100/unieap/service/BCServices55.wsdl
	@Bean(name = "BCServices55")
	public Wsdl11Definition defaultWsdl11DefinitionBCServices55() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/ocs55/CBSInterface_BC_Services.wsdl"));
		return wsdl11Definition;
	}
}
