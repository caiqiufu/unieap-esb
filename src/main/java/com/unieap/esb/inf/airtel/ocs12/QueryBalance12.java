package com.unieap.esb.inf.airtel.ocs12;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.huawei.ocs12.accountmgrservice.QueryBalanceRequestMsg;
import com.huawei.ocs12.accountmgrservice.RequestHeader;
import com.unieap.base.UnieapConstants;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.base.inf.vo.InfConfigVO;
import com.unieap.esb.Constants;

@Service
public class QueryBalance12 extends BizHandler {
	@Override
	public String getRequestXML(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		InfConfigVO infConfigVO = (InfConfigVO) extParameters.get(UnieapConstants.INFCONFIG);
		QueryBalanceRequestMsg payload = (QueryBalanceRequestMsg) extParameters.get(Constants.PAYLOAD);
		if (payload == null) {
			com.huawei.ocs12.accountmgrservice.ObjectFactory factory = new com.huawei.ocs12.accountmgrservice.ObjectFactory();
			payload = factory.createQueryBalanceRequestMsg();
			com.huawei.ocs12.accountmgrservice.QueryBalanceRequest queryBalanceRequest = new com.huawei.ocs12.accountmgrservice.QueryBalanceRequest();
			queryBalanceRequest.setSubscriberNo(requestInfo.getRequestBody().getServiceNumber());
			payload.setQueryBalanceRequest(queryBalanceRequest);
		}
		com.huawei.ocs12.accountmgrservice.RequestHeader requestHeader = payload.getRequestHeader();
		if(requestHeader==null) {
			requestHeader =  new RequestHeader(); 
			payload.setRequestHeader(requestHeader);
		}
		if(requestHeader.getSessionEntity() == null) {
			requestHeader.setSessionEntity(new com.huawei.ocs12.accountmgrservice.SessionEntityType());
		}
		requestHeader.getSessionEntity().setName(infConfigVO.getAccessName());
		requestHeader.getSessionEntity().setPassword(infConfigVO.getPassword());
		return this.getSOAPRequestMessageFromPayload(payload);
	}

	@Override
	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		String requestMessage = getRequestXML(requestInfo, extParameters);
		return this.process(requestInfo, extParameters, requestMessage);
	}
}
