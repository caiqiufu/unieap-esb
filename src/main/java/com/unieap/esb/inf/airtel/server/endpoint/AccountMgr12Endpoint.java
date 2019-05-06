package com.unieap.esb.inf.airtel.server.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.huawei.ocs12.accountmgrservice.QueryBalanceRequestMsg;
import com.huawei.ocs12.accountmgrservice.QueryBalanceResultMsg;
import com.huawei.ocs12.accountmgrservice.ResultHeader;
import com.unieap.base.UnieapConstants;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizServiceBO;
import com.unieap.base.inf.handler.BizServiceUtils;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.base.pojo.Esblog;
import com.unieap.base.repository.EsbLogCacheMgt;
import com.unieap.base.utils.JSONUtils;
import com.unieap.esb.inf.airtel.server.handler.HandlerUtils;

@Endpoint
public class AccountMgr12Endpoint extends BizServiceBO {

	@Value("${spring.application.name}")
	public String appCode;
	/**
	 * AR_NAMESPACE_URI QueryBalanceRequestMsg namespace QueryBalance operation
	 */
	private final String AR_NAMESPACE_URI = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg";

	@PayloadRoot(namespace = AR_NAMESPACE_URI, localPart = "QueryBalanceRequestMsg")
	@ResponsePayload
	public QueryBalanceResultMsg QueryBalance(@RequestPayload QueryBalanceRequestMsg payload) throws Exception {
		long beginTime = System.currentTimeMillis();
		String bizCode = "E0012";
		RequestInfo requestInfo = HandlerUtils.getRequestInfoFromRequest12AccountMgr(payload.getRequestHeader(),
				bizCode, payload.getQueryBalanceRequest().getSubscriberNo());
		ProcessResult processResult = this.process(payload, requestInfo, "QueryBalanceResultMsg",
				QueryBalanceResultMsg.class);
		QueryBalanceResultMsg response = null;
		if (processResult.getVo() != null) {
			response = (QueryBalanceResultMsg) processResult.getVo();
		} else {
			com.huawei.ocs12.accountmgrservice.ObjectFactory factory = new com.huawei.ocs12.accountmgrservice.ObjectFactory();
			response = factory.createQueryBalanceResultMsg();
			response.getResultHeader().setResultCode(processResult.getResultCode());
			response.getResultHeader().setResultDesc(processResult.getResultDesc());

		}
		this.saveEsbLog(beginTime, requestInfo, response.getResultHeader(), payload, response);
		return response;
	}

	/**
	 * 
	 * @param beginTime
	 * @param requestInfo
	 * @param resultHeader
	 * @param payload
	 * @param response
	 * @throws Exception
	 */
	private void saveEsbLog(long beginTime, RequestInfo requestInfo, ResultHeader resultHeader, Object payload,
			Object response) throws Exception {
		ProcessResult processResult = new ProcessResult();
		processResult.setResultCode(resultHeader.getResultCode());
		processResult.setResultDesc(resultHeader.getResultDesc());
		String requestInfoString = JSONUtils.convertBean2JSON(payload).toString();
		String responseInfoString = JSONUtils.convertBean2JSON(response).toString();
		long endTime = System.currentTimeMillis();
		String during = "" + (endTime - beginTime);
		Esblog esblog = BizServiceUtils.getEsbLog(requestInfo, processResult, requestInfoString, responseInfoString,
				during, app_code);
		String responseTime = UnieapConstants.getCurrentTime();
		esblog.setResponseTime(responseTime);
		EsbLogCacheMgt.setEsbLogVO(esblog);
	}
}
