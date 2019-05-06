package com.unieap.esb.inf.airtel.ocs12;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.huawei.ocs12.accountmgrservice.QueryBalanceRequest;
import com.huawei.ocs12.accountmgrservice.QueryBalanceRequestMsg;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.esb.Constants;
import com.unieap.esb.inf.airtel.server.handler.HandlerUtils;

@Service
public class QueryBalance12 extends BizHandler {

	public String getRequestXML(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		QueryBalanceRequestMsg payload = (QueryBalanceRequestMsg) extParameters.get(Constants.PAYLOAD);
		if (payload == null) {
			com.huawei.ocs12.accountmgrservice.ObjectFactory factory = new com.huawei.ocs12.accountmgrservice.ObjectFactory();
			payload = factory.createQueryBalanceRequestMsg();
			payload.setRequestHeader(HandlerUtils.getRequestHeader12AccountMgrFromRequestInfo(requestInfo));
			QueryBalanceRequest queryBalanceRequest = new QueryBalanceRequest();
			queryBalanceRequest.setSubscriberNo(requestInfo.getRequestBody().getServiceNumber());
			payload.setQueryBalanceRequest(queryBalanceRequest);
		}
		return this.getSOAPRequestMessageFromPayload(payload);
	}

	@Value("${spring.application.name}")
	public String appCode;

	@Override
	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		String requestMessage = getRequestXML(requestInfo, extParameters);
		requestInfo.getRequestHeader().setSystemCode(appCode);
		ProcessResult processResult = this.callCommonHTTPService(appCode, requestInfo, requestMessage, extParameters);
		return processResult;
	}
}
