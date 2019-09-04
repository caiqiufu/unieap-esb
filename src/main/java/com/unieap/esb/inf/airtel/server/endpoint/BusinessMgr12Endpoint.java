package com.unieap.esb.inf.airtel.server.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.huawei.ocs12.businessmgrservice.QueryBasicInfoRequestMsg;
import com.huawei.ocs12.businessmgrservice.QueryBasicInfoResultMsg;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizServiceHandler;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.esb.inf.airtel.server.handler.RequestHeaderHandlerUtils;

import net.sf.json.JSONObject;

@Endpoint
public class BusinessMgr12Endpoint extends BizServiceHandler {

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
		JSONObject jsonObj = this.getRequestServerInfo();
		jsonObj.put("appCode", appCode);
		jsonObj.put("server.address", address);
		jsonObj.put("server.port", port);
		this.saveEsbLogXMLObj(beginTime, requestInfo,response.getResultHeader().getResultCode(),response.getResultHeader().getResultDesc(), payload, response, jsonObj.toString());
		return response;
	}
}
