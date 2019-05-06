package com.unieap.esb.inf.airtel.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.ProcessResult;

@Service
public class QueryBalanceService extends BizHandler {

	@Value("${spring.application.name}")
	public String app_code;

	/**
	 * if this business interface involved multiple sub_interfaces, will be
	 * processed in this function body
	 */
	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		// to-do add business process
		return this.process(requestInfo, app_code, extParameters);
	}
}
