package com.unieap.esb.inf.airtel.server.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.huawei.ocs12.accountmgrservice.QueryBalanceRequestMsg;
import com.huawei.ocs12.accountmgrservice.QueryBalanceResultMsg;
import com.huawei.ocs12.accountmgrservice.ResultHeader;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizServiceHandler;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.esb.inf.airtel.server.handler.RequestHeaderHandlerUtils;

@Endpoint
public class AccountMgr12Endpoint{
	@Autowired
	BizServiceHandler bizServiceHandler;
	/**
	 * AR_NAMESPACE_URI QueryBalanceRequestMsg namespace QueryBalance operation
	 */
	private final String AR_NAMESPACE_URI = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg";

	@PayloadRoot(namespace = AR_NAMESPACE_URI, localPart = "QueryBalanceRequestMsg")
	@ResponsePayload
	public QueryBalanceResultMsg QueryBalance(@RequestPayload QueryBalanceRequestMsg payload) throws Exception {
		long beginTime = System.currentTimeMillis();
		String bizCode = "E9401010002";
		RequestInfo requestInfo = RequestHeaderHandlerUtils.getRequestInfoFromRequest12AccountMgr(
				payload.getRequestHeader(), bizCode, payload.getQueryBalanceRequest().getSubscriberNo());
		ProcessResult processResult = bizServiceHandler.process(payload, requestInfo, "QueryBalanceResultMsg",
				QueryBalanceResultMsg.class);
		QueryBalanceResultMsg response = null;
		if (processResult.getVo() != null) {
			response = (QueryBalanceResultMsg) processResult.getVo();
		} else {
			com.huawei.ocs12.accountmgrservice.ObjectFactory factory = new com.huawei.ocs12.accountmgrservice.ObjectFactory();
			response = factory.createQueryBalanceResultMsg();
			ResultHeader resultHeader = new ResultHeader();
			response.setResultHeader(resultHeader);
			resultHeader.setResultCode(processResult.getResultCode());
			resultHeader.setResultDesc(processResult.getResultDesc());

		}
		bizServiceHandler.saveEsbLogXMLObj(beginTime, requestInfo, response.getResultHeader().getResultCode(),response.getResultHeader().getResultDesc(), payload, response, bizServiceHandler.getRequestServerInfo().toString());
		return response;
	}
}
