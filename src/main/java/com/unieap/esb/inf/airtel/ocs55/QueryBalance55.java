package com.unieap.esb.inf.airtel.ocs55;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.unieap.base.UnieapConstants;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.ProcessResult;
import com.unieap.base.inf.vo.InfConfigVO;

@Service
public class QueryBalance55 extends BizHandler {
	@Override
	public String getRequestXML(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		com.huawei.ocs55.acctmgr.ObjectFactory factory = new com.huawei.ocs55.acctmgr.ObjectFactory();
		com.huawei.ocs55.acctmgr.QueryBalanceRequestMsg queryBalanceRequestMsg = factory.createQueryBalanceRequestMsg();
		InfConfigVO infConfigVO = (InfConfigVO) extParameters.get(UnieapConstants.INFCONFIG);
		com.huawei.ocs55.acctmgr.RequestHeader requestHeader = new com.huawei.ocs55.acctmgr.RequestHeader(); 
		queryBalanceRequestMsg.setRequestHeader(requestHeader);
		requestHeader.setSessionEntity(new com.huawei.ocs55.acctmgr.SessionEntityType());
		requestHeader.getSessionEntity().setName(infConfigVO.getAccessName());
		requestHeader.getSessionEntity().setPassword(infConfigVO.getPassword());
		////
		com.huawei.ocs55.acctmgr.QueryBalanceRequest queryBalanceRequest = new com.huawei.ocs55.acctmgr.QueryBalanceRequest();
		queryBalanceRequest.setSubscriberNo(requestInfo.getRequestBody().getServiceNumber());
		queryBalanceRequestMsg.setQueryBalanceRequest(queryBalanceRequest);
		return this.getSOAPRequestMessageFromPayload(queryBalanceRequestMsg);
	}

	@Override
	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		String requestMessage = getRequestXML(requestInfo, extParameters);
		return this.process(requestInfo, extParameters, requestMessage);
	}
}
