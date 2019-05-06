package com.unieap.esb.inf.airtel.ocs55;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.huawei.ocs55.acctmgr.BalanceRecordType;
import com.unieap.base.inf.transform.TransformMessageHandler;
import com.unieap.base.utils.JaxbXmlUtil;

@Service
public class QueryBalance55Transform2ExistingAirtel implements TransformMessageHandler {

	@Override
	public Object transform(Object payload, Map<String, Object> extParameters) throws Exception {

		com.huawei.ocs55.acctmgr.QueryBalanceResultMsg response55 = JaxbXmlUtil.convertXmlToJavaBean((String) payload,
				"QueryBalanceResultMsg", com.huawei.ocs55.acctmgr.QueryBalanceResultMsg.class);
		com.huawei.ocs12.accountmgrservice.ObjectFactory factory = new com.huawei.ocs12.accountmgrservice.ObjectFactory();
		com.huawei.ocs12.accountmgrservice.QueryBalanceResultMsg response12 = factory.createQueryBalanceResultMsg();
		com.huawei.ocs12.accountmgrservice.ResultHeader resultHeader = new com.huawei.ocs12.accountmgrservice.ResultHeader();
		response12.setResultHeader(resultHeader);
		resultHeader.setResultCode(response55.getResultHeader().getResultCode());
		resultHeader.setResultDesc(response55.getResultHeader().getResultDesc());
		List<BalanceRecordType> balanceRecord55 = response55.getQueryBalanceResult().getBalanceRecord();
		if (balanceRecord55 != null && balanceRecord55.size() > 0) {
			com.huawei.ocs12.accountmgrservice.QueryBalanceResult queryBalanceResult12 = new com.huawei.ocs12.accountmgrservice.QueryBalanceResult();
			response12.setQueryBalanceResult(queryBalanceResult12);
			for (BalanceRecordType balanceRecordType55 : balanceRecord55) {
				com.huawei.ocs12.accountmgrservice.BalanceRecordType balanceRecordType12 = new com.huawei.ocs12.accountmgrservice.BalanceRecordType();
				queryBalanceResult12.getBalanceRecord().add(balanceRecordType12);
				balanceRecordType12.setAccountCredit(balanceRecordType55.getAccountCredit());
				balanceRecordType12.setAccountKey(balanceRecordType55.getAccountKey());
				balanceRecordType12.setAccountType(balanceRecordType55.getAccountType());
				balanceRecordType12.setBalance(balanceRecordType55.getBalance());
				balanceRecordType12.setExpireTime(balanceRecordType55.getExpireTime());
				balanceRecordType12.setMinMeasureId(balanceRecordType55.getMinMeasureId());
				balanceRecordType12.setProductOrderKey(balanceRecordType55.getProductOrderKey());
				balanceRecordType12.setUnitType(balanceRecordType55.getUnitType());
			}
		}
		return response12;
	}

}
