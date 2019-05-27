package com.unieap.esb.inf.airtel.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.ProcessResult;

@Service
public class QueryBalanceService extends BizHandler {
	/**
	 * if this business interface involved multiple sub_interfaces, will be
	 * processed in this function body
	 */
	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		// to-do add business process
		return this.process(requestInfo, appCode, extParameters);
	}
}
