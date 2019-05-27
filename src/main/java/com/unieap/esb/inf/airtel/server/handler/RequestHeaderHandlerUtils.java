package com.unieap.esb.inf.airtel.server.handler;

import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizServiceUtils;
import com.unieap.base.utils.DateUtils;

public class HandlerUtils {
	public static RequestInfo getRequestInfoFromRequest12AccountMgr(com.huawei.ocs12.accountmgrservice.RequestHeader requestHeader, String bizCode,
			String serviceNumber) {
		RequestInfo requestInfo = new RequestInfo();
		requestInfo.getRequestHeader().setTransactionId(BizServiceUtils.generateTransactionId());
		requestInfo.getRequestHeader().setRequestTime(DateUtils.getStringDate());
		requestInfo.getRequestHeader().setAppCode(requestHeader.getSessionEntity().getName());
		requestInfo.getRequestHeader().setChannelCode(requestHeader.getThirdPartyID().toString());
		requestInfo.getRequestHeader().setOperName(requestHeader.getOperatorID());
		requestInfo.getRequestHeader().setSystemCode(requestHeader.getThirdPartyID().toString());
		requestInfo.getRequestHeader().setExtTransactionId(requestHeader.getTransactionId());
		requestInfo.getRequestHeader().setVersion(requestHeader.getVersion());
		requestInfo.getRequestHeader().setRemoteAddress(requestHeader.getSessionEntity().getRemoteAddress());
		requestInfo.getRequestBody().setServiceNumber(serviceNumber);
		requestInfo.getRequestBody().setBizCode(bizCode);
		return requestInfo;
	}

	public static com.huawei.ocs12.accountmgrservice.RequestHeader getRequestHeader12AccountMgrFromRequestInfo(RequestInfo requestInfo) {
		com.huawei.ocs12.accountmgrservice.RequestHeader requestHeader = new com.huawei.ocs12.accountmgrservice.RequestHeader();
		requestHeader.setCommandId(requestInfo.getRequestHeader().getTransactionId());
		requestHeader.setVersion(requestInfo.getRequestHeader().getVersion());
		requestHeader.setTransactionId(requestInfo.getRequestHeader().getExtTransactionId());
		requestHeader.setSequenceId("1");
		requestHeader.setRequestType("1");
		requestHeader.setOperatorID(requestInfo.getRequestHeader().getOperName());
		requestHeader.setThirdPartyID(Integer.getInteger(requestInfo.getRequestHeader().getSystemCode()));
		com.huawei.ocs12.accountmgrservice.SessionEntityType sessionEntity = new com.huawei.ocs12.accountmgrservice.SessionEntityType();
		requestHeader.setSessionEntity(sessionEntity);
		sessionEntity.setName(requestInfo.getRequestHeader().getAccessName());
		sessionEntity.setPassword(requestInfo.getRequestHeader().getPassword());
		sessionEntity.setRemoteAddress(requestInfo.getRequestHeader().getRemoteAddress());
		return requestHeader;
	}
	
	public static RequestInfo getRequestInfoFromRequest12BusinessMgr(com.huawei.ocs12.businessmgrservice.RequestHeader requestHeader, String bizCode,
			String serviceNumber) {
		RequestInfo requestInfo = new RequestInfo();
		requestInfo.getRequestHeader().setTransactionId(BizServiceUtils.generateTransactionId());
		requestInfo.getRequestHeader().setRequestTime(DateUtils.getStringDate());
		requestInfo.getRequestHeader().setAppCode(requestHeader.getSessionEntity().getName());
		requestInfo.getRequestHeader().setChannelCode(requestHeader.getThirdPartyID().toString());
		requestInfo.getRequestHeader().setOperName(requestHeader.getOperatorID());
		requestInfo.getRequestHeader().setSystemCode(requestHeader.getThirdPartyID().toString());
		requestInfo.getRequestHeader().setExtTransactionId(requestHeader.getTransactionId());
		requestInfo.getRequestHeader().setVersion(requestHeader.getVersion());
		requestInfo.getRequestHeader().setRemoteAddress(requestHeader.getSessionEntity().getRemoteAddress());
		requestInfo.getRequestBody().setServiceNumber(serviceNumber);
		requestInfo.getRequestBody().setBizCode(bizCode);
		return requestInfo;
	}
	
	public static com.huawei.ocs12.businessmgrservice.RequestHeader getRequestHeader12BusinessMgrFromRequestInfo(RequestInfo requestInfo) {
		com.huawei.ocs12.businessmgrservice.RequestHeader requestHeader = new com.huawei.ocs12.businessmgrservice.RequestHeader();
		requestHeader.setCommandId(requestInfo.getRequestHeader().getTransactionId());
		requestHeader.setVersion(requestInfo.getRequestHeader().getVersion());
		requestHeader.setTransactionId(requestInfo.getRequestHeader().getExtTransactionId());
		requestHeader.setSequenceId("1");
		requestHeader.setRequestType("1");
		requestHeader.setOperatorID(requestInfo.getRequestHeader().getOperName());
		requestHeader.setThirdPartyID(Integer.getInteger(requestInfo.getRequestHeader().getSystemCode()));
		com.huawei.ocs12.businessmgrservice.SessionEntityType sessionEntity = new com.huawei.ocs12.businessmgrservice.SessionEntityType();
		requestHeader.setSessionEntity(sessionEntity);
		sessionEntity.setName(requestInfo.getRequestHeader().getAccessName());
		sessionEntity.setPassword(requestInfo.getRequestHeader().getPassword());
		sessionEntity.setRemoteAddress(requestInfo.getRequestHeader().getRemoteAddress());
		return requestHeader;
	}
}
