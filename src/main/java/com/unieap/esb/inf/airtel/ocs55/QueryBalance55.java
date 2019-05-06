package com.unieap.esb.inf.airtel.ocs55;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SOAPMessage;

import org.dom4j.Node;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.unieap.base.UnieapConstants;
import com.unieap.base.inf.element.RequestInfo;
import com.unieap.base.inf.handler.BizHandler;
import com.unieap.base.inf.handler.BizServiceUtils;
import com.unieap.base.inf.handler.ProcessResult;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class QueryBalance55 extends BizHandler {
	public static String inf_code = "C0011";

	public String getRequestXML(String MSISDN) {
		StringBuffer sb = new StringBuffer();
		sb.append(
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:acc=\"http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg\" xmlns:com=\"http://www.huawei.com/bme/cbsinterface/common\" xmlns:acc1=\"http://www.huawei.com/bme/cbsinterface/cbs/accountmgr\">");
		sb.append("<soapenv:Header/>");
		sb.append("<soapenv:Body>");
		sb.append("<acc:QueryBalanceRequestMsg>");
		sb.append("<RequestHeader>");
		sb.append("<com:CommandId>11</com:CommandId>");
		sb.append("<com:Version>12</com:Version>");
		sb.append("<com:TransactionId>112222</com:TransactionId>");
		sb.append("<com:SequenceId>111</com:SequenceId>");
		sb.append("<com:RequestType>11</com:RequestType>");
		sb.append("<com:SessionEntity>");
		sb.append("<com:Name>unieap</com:Name>");
		sb.append("<com:Password>unieap</com:Password>");
		sb.append("<com:RemoteAddress>127.0.0.3</com:RemoteAddress>");
		sb.append("</com:SessionEntity>");
		sb.append("</RequestHeader>");
		sb.append("<QueryBalanceRequest>");
		sb.append("<acc1:SubscriberNo>" + MSISDN + "</acc1:SubscriberNo>");
		sb.append("</QueryBalanceRequest>");
		sb.append("</acc:QueryBalanceRequestMsg>");
		sb.append("</soapenv:Body>");
		sb.append("</soapenv:Envelope>");
		return sb.toString();
	}

	/**
	 * return common format
	 * 
	 * @param processResult
	 * @return
	 * @throws Exception
	 */
	public ProcessResult getResponse(ProcessResult processResult) throws Exception {
		if (!UnieapConstants.C0.equals(processResult.getResultCode())) {
			return processResult;
		}
		SOAPMessage responseSOAPMessage = (SOAPMessage) processResult.getVo();
		Map<String, String> map = new HashMap<String, String>();
		map.put("acc", "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg");
		map.put("com", "http://www.huawei.com/bme/cbsinterface/common");
		map.put("acc", "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr");
		org.dom4j.Document document = BizServiceUtils.getSoapMessageDocumentDom4J(responseSOAPMessage, map);
		String resultCode = document.createXPath("//com:ResultCode").selectSingleNode(document).getText();
		String resultDesc = document.createXPath("//com:ResultDesc").selectSingleNode(document).getText();
		processResult.setResultCode(resultCode);
		processResult.setResultDesc(resultDesc);
		this.errorCodeIgnore(processResult);
		List<Node> AcctListXPathNodeList = document.createXPath("//acc:BalanceRecord").selectNodes(document);
		if (AcctListXPathNodeList != null && AcctListXPathNodeList.size() > 0) {
			JSONArray ja = new JSONArray();
			for (int i = 0; i < AcctListXPathNodeList.size(); i++) {
				JSONObject balanceRecord = new JSONObject();
				Node Acct = AcctListXPathNodeList.get(i);
				balanceRecord.put("balanceDesc", Acct.createXPath("acc:BalanceDesc").selectSingleNode(Acct).getText());
				balanceRecord.put("balance",
						Long.parseLong(Acct.createXPath("acc:Balance").selectSingleNode(Acct).getText()));
				balanceRecord.put("minMeasureId",
						Acct.createXPath("acc:MinMeasureId").selectSingleNode(Acct).getText());
				balanceRecord.put("expireTime", Acct.createXPath("acc:ExpireTime").selectSingleNode(Acct).getText());
				balanceRecord.put("accountKey", Acct.createXPath("acc:AccountKey").selectSingleNode(Acct).getText());
				balanceRecord.put("productID", Acct.createXPath("acc:ProductID").selectSingleNode(Acct).getText());
				ja.add(balanceRecord);
			}
			JSONObject balanceRecordList = new JSONObject();
			balanceRecordList.put("balanceRecord", ja.toString());
			processResult.setVo(balanceRecordList);
		}
		return processResult;
	}

	@Value("${spring.application.name}")
	public String app_code;

	public ProcessResult process(RequestInfo requestInfo, Map<String, Object> extParameters) throws Exception {
		requestInfo.getRequestHeader().setSystemCode(app_code);
		String requestMessage = getRequestXML(requestInfo.getRequestBody().getServiceNumber());
		ProcessResult processResult = this.callCommonHTTPService(app_code, requestInfo, requestMessage, extParameters);
		return processResult;
	}
}
