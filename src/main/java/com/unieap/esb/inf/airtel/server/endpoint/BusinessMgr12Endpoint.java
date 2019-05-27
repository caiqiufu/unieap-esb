package com.unieap.esb.inf.airtel.server.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.huawei.ocs12.businessmgrservice.QueryBasicInfoRequestMsg;
import com.huawei.ocs12.businessmgrservice.QueryBasicInfoResultMsg;
import com.unieap.base.UnieapConstants;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizServiceHandler;
import com.unieap.base.inf.handler.BizServiceUtils;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.base.pojo.Esblog;
import com.unieap.base.repository.EsbLogCacheMgt;
import com.unieap.base.utils.JSONUtils;
import com.unieap.esb.inf.airtel.server.handler.RequestHeaderHandlerUtils;

@Endpoint
public class BusinessMgr12Endpoint extends BizServiceHandler {

	@Value("${spring.application.name}")
	public String appCode;
	/**
	 * AR_NAMESPACE_URI QueryBasicInfoRequestMsg namespace QueryBasicInfo operation
	 */
	private final String AR_NAMESPACE_URI = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg";

	@PayloadRoot(namespace = AR_NAMESPACE_URI, localPart = "QueryBasicInfoRequestMsg")
	@ResponsePayload
	public QueryBasicInfoResultMsg QueryBasicInfo(@RequestPayload QueryBasicInfoRequestMsg payload) throws Exception {
		long beginTime = System.currentTimeMillis();
		String bizCode = "E0013";
		RequestInfo requestInfo = RequestHeaderHandlerUtils.getRequestInfoFromRequest12BusinessMgr(payload.getRequestHeader(),
				bizCode, payload.getQueryBasicInfoRequest().getSubscriberNo());
		ProcessResult processResult = this.process(payload, requestInfo, "QueryBasicInfoResultMsg",
				QueryBasicInfoResultMsg.class);
		QueryBasicInfoResultMsg response = null;
		if (processResult.getVo() != null) {
			response = (QueryBasicInfoResultMsg) processResult.getVo();
		} else {
			com.huawei.ocs12.businessmgrservice.ObjectFactory factory = new com.huawei.ocs12.businessmgrservice.ObjectFactory();
			response = factory.createQueryBasicInfoResultMsg();
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
	private void saveEsbLog(long beginTime, RequestInfo requestInfo,
			com.huawei.ocs12.businessmgrservice.ResultHeader resultHeader, Object payload, Object response)
			throws Exception {
		ProcessResult processResult = new ProcessResult();
		processResult.setResultCode(resultHeader.getResultCode());
		processResult.setResultDesc(resultHeader.getResultDesc());
		String requestInfoString = JSONUtils.convertBean2JSON(payload).toString();
		String responseInfoString = JSONUtils.convertBean2JSON(response).toString();
		long endTime = System.currentTimeMillis();
		String during = "" + (endTime - beginTime);
		Esblog esblog = BizServiceUtils.getEsbLog(requestInfo, processResult, requestInfoString, responseInfoString,
				during, appCode);
		String responseTime = UnieapConstants.getCurrentTime();
		esblog.setResponseTime(responseTime);
		EsbLogCacheMgt.setEsbLogVO(esblog);
	}
}
