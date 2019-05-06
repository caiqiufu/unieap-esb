
package com.huawei.ocs12.businessmgrservice;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.ocs12.businessmgrservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BalanceRecordTypeUnitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "UnitType");
    private final static QName _BalanceRecordTypeMinMeasureId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MinMeasureId");
    private final static QName _BalanceRecordTypeAccountCredit_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AccountCredit");
    private final static QName _BalanceRecordTypeAccountKey_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "AccountKey");
    private final static QName _BalanceRecordTypeProductID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductID");
    private final static QName _QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStart_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "weekStart");
    private final static QName _QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStop_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "weekStop");
    private final static QName _QuerySubCallScreenNoResultNonCallScreenNoInfoRoutingMethod_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "RoutingMethod");
    private final static QName _QuerySubCallScreenNoResultNonCallScreenNoInfoIRRouteFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IRRouteFlag");
    private final static QName _AccountBillcycleType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillcycleType");
    private final static QName _AccountAddress_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Address");
    private final static QName _QuerySubLowBalPrtResultSubLowBalPrtAction_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Action");
    private final static QName _QuerySubLowBalPrtResultSubLowBalPrtMessageID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MessageID");
    private final static QName _IntegrationEnquiryResultSubscriberInfoProductProductOrderKey_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ProductOrderKey");
    private final static QName _QueryPassInfoResultMonthCapEndTime_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MonthCapEndTime");
    private final static QName _QueryPassInfoResultPassStartTime_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PassStartTime");
    private final static QName _QueryPassInfoResultDayCapEndTime_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "DayCapEndTime");
    private final static QName _QueryPassInfoResultPassEndTime_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "PassEndTime");
    private final static QName _IntegrationEnquiryResultSubAttachedInfoChgMainProductTimes_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChgMainProductTimes");
    private final static QName _IntegrationEnquiryResultSubAttachedInfoChgMainPackageTimes_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ChgMainPackageTimes");
    private final static QName _QueryBasicInfoResultSubscriberProductStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "status");
    private final static QName _IntegrationEnquiryResultSubscriberStateLossFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LossFlag");
    private final static QName _IntegrationEnquiryResultSubscriberStatePOSUserState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "POSUserState");
    private final static QName _IntegrationEnquiryResultSubscriberStateLifeCycleState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "LifeCycleState");
    private final static QName _UpdateSubscriberSegmentationRequestAccountGroupID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "accountGroupID");
    private final static QName _ServiceStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Status");
    private final static QName _IndividualCustomerForResultEducation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Education");
    private final static QName _IndividualCustomerForResultSocialNo_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SocialNo");
    private final static QName _IndividualCustomerForResultMaritalStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "MaritalStatus");
    private final static QName _IndividualCustomerForResultJobType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "JobType");
    private final static QName _IndividualCustomerForResultSkill_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Skill");
    private final static QName _IndividualCustomerForResultCreditGrade_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CreditGrade");
    private final static QName _IndividualCustomerForResultCountry_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Country");
    private final static QName _IndividualCustomerForResultIdCode_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdCode");
    private final static QName _IndividualCustomerForResultNationType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NationType");
    private final static QName _IndividualCustomerForResultZipCode_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "ZipCode");
    private final static QName _IndividualCustomerForResultEmail_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Email");
    private final static QName _IndividualCustomerForResultCustomerState_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerState");
    private final static QName _IndividualCustomerForResultNativePlace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "NativePlace");
    private final static QName _IndividualCustomerForResultCustomerType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CustomerType");
    private final static QName _IndividualCustomerForResultIdType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "IdType");
    private final static QName _IndividualCustomerForResultBelToAreaID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BelToAreaID");
    private final static QName _IndividualCustomerForResultCreditAmount_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "CreditAmount");
    private final static QName _IndividualCustomerForResultGender_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Gender");
    private final static QName _IndividualCustomerForResultGrade_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "Grade");
    private final static QName _SubscriberBasicSMSLang_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "SMSLang");
    private final static QName _SubscriberBasicUSSDLang_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "USSDLang");
    private final static QName _SubscriberBasicBrandId_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BrandId");
    private final static QName _SubscriberBasicInitialCredit_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "InitialCredit");
    private final static QName _IntegrationEnquiryResultBillingCycleDateBillCycleType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", "BillCycleType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.ocs12.businessmgrservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuerySCPCBPNumberSgmntsResult }
     * 
     */
    public QuerySCPCBPNumberSgmntsResult createQuerySCPCBPNumberSgmntsResult() {
        return new QuerySCPCBPNumberSgmntsResult();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult }
     * 
     */
    public QueryBasicInfoResult createQueryBasicInfoResult() {
        return new QueryBasicInfoResult();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.Subscriber }
     * 
     */
    public QueryBasicInfoResult.Subscriber createQueryBasicInfoResultSubscriber() {
        return new QueryBasicInfoResult.Subscriber();
    }

    /**
     * Create an instance of {@link ManSubCallScreenNoRequest }
     * 
     */
    public ManSubCallScreenNoRequest createManSubCallScreenNoRequest() {
        return new ManSubCallScreenNoRequest();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest }
     * 
     */
    public BindProductSubscriberNoRequest createBindProductSubscriberNoRequest() {
        return new BindProductSubscriberNoRequest();
    }

    /**
     * Create an instance of {@link ManParentChildResult }
     * 
     */
    public ManParentChildResult createManParentChildResult() {
        return new ManParentChildResult();
    }

    /**
     * Create an instance of {@link ChangeAppendantProductRequest }
     * 
     */
    public ChangeAppendantProductRequest createChangeAppendantProductRequest() {
        return new ChangeAppendantProductRequest();
    }

    /**
     * Create an instance of {@link QuerySubscriberProductInfoResult }
     * 
     */
    public QuerySubscriberProductInfoResult createQuerySubscriberProductInfoResult() {
        return new QuerySubscriberProductInfoResult();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoResult }
     * 
     */
    public QuerySubCallScreenNoResult createQuerySubCallScreenNoResult() {
        return new QuerySubCallScreenNoResult();
    }

    /**
     * Create an instance of {@link QueryCUGTypeResult }
     * 
     */
    public QueryCUGTypeResult createQueryCUGTypeResult() {
        return new QueryCUGTypeResult();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductRequest }
     * 
     */
    public BatchSubscribeAppProductRequest createBatchSubscribeAppProductRequest() {
        return new BatchSubscribeAppProductRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductRequest.SubscriberNoList }
     * 
     */
    public BatchSubscribeAppProductRequest.SubscriberNoList createBatchSubscribeAppProductRequestSubscriberNoList() {
        return new BatchSubscribeAppProductRequest.SubscriberNoList();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult }
     * 
     */
    public IntegrationEnquiryResult createIntegrationEnquiryResult() {
        return new IntegrationEnquiryResult();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.UserGroupList }
     * 
     */
    public IntegrationEnquiryResult.UserGroupList createIntegrationEnquiryResultUserGroupList() {
        return new IntegrationEnquiryResult.UserGroupList();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.CumulativeItemList }
     * 
     */
    public IntegrationEnquiryResult.CumulativeItemList createIntegrationEnquiryResultCumulativeItemList() {
        return new IntegrationEnquiryResult.CumulativeItemList();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.SubscriberInfo }
     * 
     */
    public IntegrationEnquiryResult.SubscriberInfo createIntegrationEnquiryResultSubscriberInfo() {
        return new IntegrationEnquiryResult.SubscriberInfo();
    }

    /**
     * Create an instance of {@link QueryAdjustValidityLogResult }
     * 
     */
    public QueryAdjustValidityLogResult createQueryAdjustValidityLogResult() {
        return new QueryAdjustValidityLogResult();
    }

    /**
     * Create an instance of {@link QuerySubFamilyNoResult }
     * 
     */
    public QuerySubFamilyNoResult createQuerySubFamilyNoResult() {
        return new QuerySubFamilyNoResult();
    }

    /**
     * Create an instance of {@link QuerySubscribedGroupResult }
     * 
     */
    public QuerySubscribedGroupResult createQuerySubscribedGroupResult() {
        return new QuerySubscribedGroupResult();
    }

    /**
     * Create an instance of {@link ChangeMainProdRequest }
     * 
     */
    public ChangeMainProdRequest createChangeMainProdRequest() {
        return new ChangeMainProdRequest();
    }

    /**
     * Create an instance of {@link QueryUserGroupResult }
     * 
     */
    public QueryUserGroupResult createQueryUserGroupResult() {
        return new QueryUserGroupResult();
    }

    /**
     * Create an instance of {@link QuerySubHomeZoneResult }
     * 
     */
    public QuerySubHomeZoneResult createQuerySubHomeZoneResult() {
        return new QuerySubHomeZoneResult();
    }

    /**
     * Create an instance of {@link ManSubHomeZoneRequest }
     * 
     */
    public ManSubHomeZoneRequest createManSubHomeZoneRequest() {
        return new ManSubHomeZoneRequest();
    }

    /**
     * Create an instance of {@link BatchOperationRequest }
     * 
     */
    public BatchOperationRequest createBatchOperationRequest() {
        return new BatchOperationRequest();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchAjustAccount }
     * 
     */
    public BatchOperationRequest.BatchAjustAccount createBatchOperationRequestBatchAjustAccount() {
        return new BatchOperationRequest.BatchAjustAccount();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList }
     * 
     */
    public BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList createBatchOperationRequestBatchAjustAccountModifyAcctFeeList() {
        return new BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchChangeMainProduct }
     * 
     */
    public BatchOperationRequest.BatchChangeMainProduct createBatchOperationRequestBatchChangeMainProduct() {
        return new BatchOperationRequest.BatchChangeMainProduct();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchChangeService }
     * 
     */
    public BatchOperationRequest.BatchChangeService createBatchOperationRequestBatchChangeService() {
        return new BatchOperationRequest.BatchChangeService();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchUnSubscribe }
     * 
     */
    public BatchOperationRequest.BatchUnSubscribe createBatchOperationRequestBatchUnSubscribe() {
        return new BatchOperationRequest.BatchUnSubscribe();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchUnSubscribe.Product }
     * 
     */
    public BatchOperationRequest.BatchUnSubscribe.Product createBatchOperationRequestBatchUnSubscribeProduct() {
        return new BatchOperationRequest.BatchUnSubscribe.Product();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchSubscribe }
     * 
     */
    public BatchOperationRequest.BatchSubscribe createBatchOperationRequestBatchSubscribe() {
        return new BatchOperationRequest.BatchSubscribe();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchNewSubscriber }
     * 
     */
    public BatchOperationRequest.BatchNewSubscriber createBatchOperationRequestBatchNewSubscriber() {
        return new BatchOperationRequest.BatchNewSubscriber();
    }

    /**
     * Create an instance of {@link ManSubFamilyNoRequest }
     * 
     */
    public ManSubFamilyNoRequest createManSubFamilyNoRequest() {
        return new ManSubFamilyNoRequest();
    }

    /**
     * Create an instance of {@link ManParentChildRequest }
     * 
     */
    public ManParentChildRequest createManParentChildRequest() {
        return new ManParentChildRequest();
    }

    /**
     * Create an instance of {@link ChangeServicesRequest }
     * 
     */
    public ChangeServicesRequest createChangeServicesRequest() {
        return new ChangeServicesRequest();
    }

    /**
     * Create an instance of {@link SubscribeAppendantProductRequest }
     * 
     */
    public SubscribeAppendantProductRequest createSubscribeAppendantProductRequest() {
        return new SubscribeAppendantProductRequest();
    }

    /**
     * Create an instance of {@link QueryPassCapEventInfoResult }
     * 
     */
    public QueryPassCapEventInfoResult createQueryPassCapEventInfoResult() {
        return new QueryPassCapEventInfoResult();
    }

    /**
     * Create an instance of {@link CheckUVCPartPinResult }
     * 
     */
    public CheckUVCPartPinResult createCheckUVCPartPinResult() {
        return new CheckUVCPartPinResult();
    }

    /**
     * Create an instance of {@link ChangeSubLowBalPrtRequest }
     * 
     */
    public ChangeSubLowBalPrtRequest createChangeSubLowBalPrtRequest() {
        return new ChangeSubLowBalPrtRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductRequest }
     * 
     */
    public UnSubscribeAppendantProductRequest createUnSubscribeAppendantProductRequest() {
        return new UnSubscribeAppendantProductRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductRequest.Product }
     * 
     */
    public UnSubscribeAppendantProductRequest.Product createUnSubscribeAppendantProductRequestProduct() {
        return new UnSubscribeAppendantProductRequest.Product();
    }

    /**
     * Create an instance of {@link NewSubscriberRequest }
     * 
     */
    public NewSubscriberRequest createNewSubscriberRequest() {
        return new NewSubscriberRequest();
    }

    /**
     * Create an instance of {@link NewSubscriberExtRequest }
     * 
     */
    public NewSubscriberExtRequest createNewSubscriberExtRequest() {
        return new NewSubscriberExtRequest();
    }

    /**
     * Create an instance of {@link QuerySubLowBalPrtResult }
     * 
     */
    public QuerySubLowBalPrtResult createQuerySubLowBalPrtResult() {
        return new QuerySubLowBalPrtResult();
    }

    /**
     * Create an instance of {@link QueryDefinedZonesInfoResult }
     * 
     */
    public QueryDefinedZonesInfoResult createQueryDefinedZonesInfoResult() {
        return new QueryDefinedZonesInfoResult();
    }

    /**
     * Create an instance of {@link ReNewSubscriberRequest }
     * 
     */
    public ReNewSubscriberRequest createReNewSubscriberRequest() {
        return new ReNewSubscriberRequest();
    }

    /**
     * Create an instance of {@link QueryInterActLogResult }
     * 
     */
    public QueryInterActLogResult createQueryInterActLogResult() {
        return new QueryInterActLogResult();
    }

    /**
     * Create an instance of {@link QueryInterActLogResult.QueryInterActLogList }
     * 
     */
    public QueryInterActLogResult.QueryInterActLogList createQueryInterActLogResultQueryInterActLogList() {
        return new QueryInterActLogResult.QueryInterActLogList();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtRequest }
     * 
     */
    public UnSubscribeAppendantProductExtRequest createUnSubscribeAppendantProductExtRequest() {
        return new UnSubscribeAppendantProductExtRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtRequest.Product }
     * 
     */
    public UnSubscribeAppendantProductExtRequest.Product createUnSubscribeAppendantProductExtRequestProduct() {
        return new UnSubscribeAppendantProductExtRequest.Product();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogResult }
     * 
     */
    public QuerySubChangeLogResult createQuerySubChangeLogResult() {
        return new QuerySubChangeLogResult();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogResult.SubChangeLogList }
     * 
     */
    public QuerySubChangeLogResult.SubChangeLogList createQuerySubChangeLogResultSubChangeLogList() {
        return new QuerySubChangeLogResult.SubChangeLogList();
    }

    /**
     * Create an instance of {@link QueryCUGMembersResult }
     * 
     */
    public QueryCUGMembersResult createQueryCUGMembersResult() {
        return new QueryCUGMembersResult();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link SessionEntityType }
     * 
     */
    public SessionEntityType createSessionEntityType() {
        return new SessionEntityType();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryRequestMsg }
     * 
     */
    public IntegrationEnquiryRequestMsg createIntegrationEnquiryRequestMsg() {
        return new IntegrationEnquiryRequestMsg();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryRequest }
     * 
     */
    public IntegrationEnquiryRequest createIntegrationEnquiryRequest() {
        return new IntegrationEnquiryRequest();
    }

    /**
     * Create an instance of {@link ManSubFamilyNoResultMsg }
     * 
     */
    public ManSubFamilyNoResultMsg createManSubFamilyNoResultMsg() {
        return new ManSubFamilyNoResultMsg();
    }

    /**
     * Create an instance of {@link ManSubFamilyNoResult }
     * 
     */
    public ManSubFamilyNoResult createManSubFamilyNoResult() {
        return new ManSubFamilyNoResult();
    }

    /**
     * Create an instance of {@link QueryCUGMembersResultMsg }
     * 
     */
    public QueryCUGMembersResultMsg createQueryCUGMembersResultMsg() {
        return new QueryCUGMembersResultMsg();
    }

    /**
     * Create an instance of {@link DisclaimMissingRequestMsg }
     * 
     */
    public DisclaimMissingRequestMsg createDisclaimMissingRequestMsg() {
        return new DisclaimMissingRequestMsg();
    }

    /**
     * Create an instance of {@link DisclaimMissingRequest }
     * 
     */
    public DisclaimMissingRequest createDisclaimMissingRequest() {
        return new DisclaimMissingRequest();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogResultMsg }
     * 
     */
    public QuerySubChangeLogResultMsg createQuerySubChangeLogResultMsg() {
        return new QuerySubChangeLogResultMsg();
    }

    /**
     * Create an instance of {@link ChangeCreditLevelRequestMsg }
     * 
     */
    public ChangeCreditLevelRequestMsg createChangeCreditLevelRequestMsg() {
        return new ChangeCreditLevelRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeCreditLevelRequest }
     * 
     */
    public ChangeCreditLevelRequest createChangeCreditLevelRequest() {
        return new ChangeCreditLevelRequest();
    }

    /**
     * Create an instance of {@link DisclaimMissingResultMsg }
     * 
     */
    public DisclaimMissingResultMsg createDisclaimMissingResultMsg() {
        return new DisclaimMissingResultMsg();
    }

    /**
     * Create an instance of {@link NewSubscriberExtResultMsg }
     * 
     */
    public NewSubscriberExtResultMsg createNewSubscriberExtResultMsg() {
        return new NewSubscriberExtResultMsg();
    }

    /**
     * Create an instance of {@link NewSubscriberExtResult }
     * 
     */
    public NewSubscriberExtResult createNewSubscriberExtResult() {
        return new NewSubscriberExtResult();
    }

    /**
     * Create an instance of {@link ChangeMainProdResultMsg }
     * 
     */
    public ChangeMainProdResultMsg createChangeMainProdResultMsg() {
        return new ChangeMainProdResultMsg();
    }

    /**
     * Create an instance of {@link ChangeMainProdResult }
     * 
     */
    public ChangeMainProdResult createChangeMainProdResult() {
        return new ChangeMainProdResult();
    }

    /**
     * Create an instance of {@link BatchOperationResultMsg }
     * 
     */
    public BatchOperationResultMsg createBatchOperationResultMsg() {
        return new BatchOperationResultMsg();
    }

    /**
     * Create an instance of {@link ChangeOwnerResultMsg }
     * 
     */
    public ChangeOwnerResultMsg createChangeOwnerResultMsg() {
        return new ChangeOwnerResultMsg();
    }

    /**
     * Create an instance of {@link SuspendRequestMsg }
     * 
     */
    public SuspendRequestMsg createSuspendRequestMsg() {
        return new SuspendRequestMsg();
    }

    /**
     * Create an instance of {@link SuspendRequest }
     * 
     */
    public SuspendRequest createSuspendRequest() {
        return new SuspendRequest();
    }

    /**
     * Create an instance of {@link ManCUGInfoRequestMsg }
     * 
     */
    public ManCUGInfoRequestMsg createManCUGInfoRequestMsg() {
        return new ManCUGInfoRequestMsg();
    }

    /**
     * Create an instance of {@link ManCUGInfoRequest }
     * 
     */
    public ManCUGInfoRequest createManCUGInfoRequest() {
        return new ManCUGInfoRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductResultMsg }
     * 
     */
    public UnSubscribeAppendantProductResultMsg createUnSubscribeAppendantProductResultMsg() {
        return new UnSubscribeAppendantProductResultMsg();
    }

    /**
     * Create an instance of {@link QueryLanguageInfRequestMsg }
     * 
     */
    public QueryLanguageInfRequestMsg createQueryLanguageInfRequestMsg() {
        return new QueryLanguageInfRequestMsg();
    }

    /**
     * Create an instance of {@link QueryLanguageInfRequest }
     * 
     */
    public QueryLanguageInfRequest createQueryLanguageInfRequest() {
        return new QueryLanguageInfRequest();
    }

    /**
     * Create an instance of {@link CheckPasswordResultMsg }
     * 
     */
    public CheckPasswordResultMsg createCheckPasswordResultMsg() {
        return new CheckPasswordResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSIMRequestMsg }
     * 
     */
    public ChangeSIMRequestMsg createChangeSIMRequestMsg() {
        return new ChangeSIMRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSIMRequest }
     * 
     */
    public ChangeSIMRequest createChangeSIMRequest() {
        return new ChangeSIMRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtRequestMsg }
     * 
     */
    public UnSubscribeAppendantProductExtRequestMsg createUnSubscribeAppendantProductExtRequestMsg() {
        return new UnSubscribeAppendantProductExtRequestMsg();
    }

    /**
     * Create an instance of {@link ReconnectResultMsg }
     * 
     */
    public ReconnectResultMsg createReconnectResultMsg() {
        return new ReconnectResultMsg();
    }

    /**
     * Create an instance of {@link QueryInterActLogResultMsg }
     * 
     */
    public QueryInterActLogResultMsg createQueryInterActLogResultMsg() {
        return new QueryInterActLogResultMsg();
    }

    /**
     * Create an instance of {@link ManGroupMemberRequestMsg }
     * 
     */
    public ManGroupMemberRequestMsg createManGroupMemberRequestMsg() {
        return new ManGroupMemberRequestMsg();
    }

    /**
     * Create an instance of {@link ManGroupMemberRequest }
     * 
     */
    public ManGroupMemberRequest createManGroupMemberRequest() {
        return new ManGroupMemberRequest();
    }

    /**
     * Create an instance of {@link ReNewSubscriberRequestMsg }
     * 
     */
    public ReNewSubscriberRequestMsg createReNewSubscriberRequestMsg() {
        return new ReNewSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link QueryDefinedZonesInfoResultMsg }
     * 
     */
    public QueryDefinedZonesInfoResultMsg createQueryDefinedZonesInfoResultMsg() {
        return new QueryDefinedZonesInfoResultMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberExtRequestMsg }
     * 
     */
    public DeleteSubscriberExtRequestMsg createDeleteSubscriberExtRequestMsg() {
        return new DeleteSubscriberExtRequestMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberExtRequest }
     * 
     */
    public DeleteSubscriberExtRequest createDeleteSubscriberExtRequest() {
        return new DeleteSubscriberExtRequest();
    }

    /**
     * Create an instance of {@link ResetPasswordRequestMsg }
     * 
     */
    public ResetPasswordRequestMsg createResetPasswordRequestMsg() {
        return new ResetPasswordRequestMsg();
    }

    /**
     * Create an instance of {@link ResetPasswordRequest }
     * 
     */
    public ResetPasswordRequest createResetPasswordRequest() {
        return new ResetPasswordRequest();
    }

    /**
     * Create an instance of {@link ReNewSubscriberResultMsg }
     * 
     */
    public ReNewSubscriberResultMsg createReNewSubscriberResultMsg() {
        return new ReNewSubscriberResultMsg();
    }

    /**
     * Create an instance of {@link ReNewSubscriberResult }
     * 
     */
    public ReNewSubscriberResult createReNewSubscriberResult() {
        return new ReNewSubscriberResult();
    }

    /**
     * Create an instance of {@link QueryCUGMembersRequestMsg }
     * 
     */
    public QueryCUGMembersRequestMsg createQueryCUGMembersRequestMsg() {
        return new QueryCUGMembersRequestMsg();
    }

    /**
     * Create an instance of {@link QueryCUGMembersRequest }
     * 
     */
    public QueryCUGMembersRequest createQueryCUGMembersRequest() {
        return new QueryCUGMembersRequest();
    }

    /**
     * Create an instance of {@link ChangeAppendantProductResultMsg }
     * 
     */
    public ChangeAppendantProductResultMsg createChangeAppendantProductResultMsg() {
        return new ChangeAppendantProductResultMsg();
    }

    /**
     * Create an instance of {@link ChangeAppendantProductResult }
     * 
     */
    public ChangeAppendantProductResult createChangeAppendantProductResult() {
        return new ChangeAppendantProductResult();
    }

    /**
     * Create an instance of {@link QuerySubLowBalPrtResultMsg }
     * 
     */
    public QuerySubLowBalPrtResultMsg createQuerySubLowBalPrtResultMsg() {
        return new QuerySubLowBalPrtResultMsg();
    }

    /**
     * Create an instance of {@link NewSubscriberExtRequestMsg }
     * 
     */
    public NewSubscriberExtRequestMsg createNewSubscriberExtRequestMsg() {
        return new NewSubscriberExtRequestMsg();
    }

    /**
     * Create an instance of {@link NewSubscriberRequestMsg }
     * 
     */
    public NewSubscriberRequestMsg createNewSubscriberRequestMsg() {
        return new NewSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link ModifyPosUserStateResultMsg }
     * 
     */
    public ModifyPosUserStateResultMsg createModifyPosUserStateResultMsg() {
        return new ModifyPosUserStateResultMsg();
    }

    /**
     * Create an instance of {@link QueryInterActLogRequestMsg }
     * 
     */
    public QueryInterActLogRequestMsg createQueryInterActLogRequestMsg() {
        return new QueryInterActLogRequestMsg();
    }

    /**
     * Create an instance of {@link QueryInterActLogRequest }
     * 
     */
    public QueryInterActLogRequest createQueryInterActLogRequest() {
        return new QueryInterActLogRequest();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductRequestMsg }
     * 
     */
    public UnSubscribeAppendantProductRequestMsg createUnSubscribeAppendantProductRequestMsg() {
        return new UnSubscribeAppendantProductRequestMsg();
    }

    /**
     * Create an instance of {@link ChangePasswordResultMsg }
     * 
     */
    public ChangePasswordResultMsg createChangePasswordResultMsg() {
        return new ChangePasswordResultMsg();
    }

    /**
     * Create an instance of {@link BlockSubscriberResultMsg }
     * 
     */
    public BlockSubscriberResultMsg createBlockSubscriberResultMsg() {
        return new BlockSubscriberResultMsg();
    }

    /**
     * Create an instance of {@link BlockSubscriberResult }
     * 
     */
    public BlockSubscriberResult createBlockSubscriberResult() {
        return new BlockSubscriberResult();
    }

    /**
     * Create an instance of {@link ModifyCFNoResultMsg }
     * 
     */
    public ModifyCFNoResultMsg createModifyCFNoResultMsg() {
        return new ModifyCFNoResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberServiceInfoRequestMsg }
     * 
     */
    public QuerySubscriberServiceInfoRequestMsg createQuerySubscriberServiceInfoRequestMsg() {
        return new QuerySubscriberServiceInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberServiceInfoRequest }
     * 
     */
    public QuerySubscriberServiceInfoRequest createQuerySubscriberServiceInfoRequest() {
        return new QuerySubscriberServiceInfoRequest();
    }

    /**
     * Create an instance of {@link QueryPassCapEventInfoRequestMsg }
     * 
     */
    public QueryPassCapEventInfoRequestMsg createQueryPassCapEventInfoRequestMsg() {
        return new QueryPassCapEventInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryPassCapEventInfoRequest }
     * 
     */
    public QueryPassCapEventInfoRequest createQueryPassCapEventInfoRequest() {
        return new QueryPassCapEventInfoRequest();
    }

    /**
     * Create an instance of {@link ChangeSubLowBalPrtRequestMsg }
     * 
     */
    public ChangeSubLowBalPrtRequestMsg createChangeSubLowBalPrtRequestMsg() {
        return new ChangeSubLowBalPrtRequestMsg();
    }

    /**
     * Create an instance of {@link CheckUVCPartPinResultMsg }
     * 
     */
    public CheckUVCPartPinResultMsg createCheckUVCPartPinResultMsg() {
        return new CheckUVCPartPinResultMsg();
    }

    /**
     * Create an instance of {@link QueryPassCapEventInfoResultMsg }
     * 
     */
    public QueryPassCapEventInfoResultMsg createQueryPassCapEventInfoResultMsg() {
        return new QueryPassCapEventInfoResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscribedGroupRequestMsg }
     * 
     */
    public QuerySubscribedGroupRequestMsg createQuerySubscribedGroupRequestMsg() {
        return new QuerySubscribedGroupRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubscribedGroupRequest }
     * 
     */
    public QuerySubscribedGroupRequest createQuerySubscribedGroupRequest() {
        return new QuerySubscribedGroupRequest();
    }

    /**
     * Create an instance of {@link ModifyCFNoRequestMsg }
     * 
     */
    public ModifyCFNoRequestMsg createModifyCFNoRequestMsg() {
        return new ModifyCFNoRequestMsg();
    }

    /**
     * Create an instance of {@link ModifyCFNoRequest }
     * 
     */
    public ModifyCFNoRequest createModifyCFNoRequest() {
        return new ModifyCFNoRequest();
    }

    /**
     * Create an instance of {@link QueryCUGTypeRequestMsg }
     * 
     */
    public QueryCUGTypeRequestMsg createQueryCUGTypeRequestMsg() {
        return new QueryCUGTypeRequestMsg();
    }

    /**
     * Create an instance of {@link QueryCUGTypeRequest }
     * 
     */
    public QueryCUGTypeRequest createQueryCUGTypeRequest() {
        return new QueryCUGTypeRequest();
    }

    /**
     * Create an instance of {@link SubscribeAppendantProductRequestMsg }
     * 
     */
    public SubscribeAppendantProductRequestMsg createSubscribeAppendantProductRequestMsg() {
        return new SubscribeAppendantProductRequestMsg();
    }

    /**
     * Create an instance of {@link ManSubCallScreenNoResultMsg }
     * 
     */
    public ManSubCallScreenNoResultMsg createManSubCallScreenNoResultMsg() {
        return new ManSubCallScreenNoResultMsg();
    }

    /**
     * Create an instance of {@link ChangeServicesRequestMsg }
     * 
     */
    public ChangeServicesRequestMsg createChangeServicesRequestMsg() {
        return new ChangeServicesRequestMsg();
    }

    /**
     * Create an instance of {@link ManPromotionPlanResultMsg }
     * 
     */
    public ManPromotionPlanResultMsg createManPromotionPlanResultMsg() {
        return new ManPromotionPlanResultMsg();
    }

    /**
     * Create an instance of {@link SynDTDiscountRequestMsg }
     * 
     */
    public SynDTDiscountRequestMsg createSynDTDiscountRequestMsg() {
        return new SynDTDiscountRequestMsg();
    }

    /**
     * Create an instance of {@link SynDTDiscountRequest }
     * 
     */
    public SynDTDiscountRequest createSynDTDiscountRequest() {
        return new SynDTDiscountRequest();
    }

    /**
     * Create an instance of {@link ChangeServicesResultMsg }
     * 
     */
    public ChangeServicesResultMsg createChangeServicesResultMsg() {
        return new ChangeServicesResultMsg();
    }

    /**
     * Create an instance of {@link CheckOperatorPasswordResultMsg }
     * 
     */
    public CheckOperatorPasswordResultMsg createCheckOperatorPasswordResultMsg() {
        return new CheckOperatorPasswordResultMsg();
    }

    /**
     * Create an instance of {@link ManParentChildRequestMsg }
     * 
     */
    public ManParentChildRequestMsg createManParentChildRequestMsg() {
        return new ManParentChildRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogRequestMsg }
     * 
     */
    public QuerySubChangeLogRequestMsg createQuerySubChangeLogRequestMsg() {
        return new QuerySubChangeLogRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogRequest }
     * 
     */
    public QuerySubChangeLogRequest createQuerySubChangeLogRequest() {
        return new QuerySubChangeLogRequest();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentationRequestMsg }
     * 
     */
    public UpdateSubscriberSegmentationRequestMsg createUpdateSubscriberSegmentationRequestMsg() {
        return new UpdateSubscriberSegmentationRequestMsg();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentationRequest }
     * 
     */
    public UpdateSubscriberSegmentationRequest createUpdateSubscriberSegmentationRequest() {
        return new UpdateSubscriberSegmentationRequest();
    }

    /**
     * Create an instance of {@link ChangeCustBasicInforRequestMsg }
     * 
     */
    public ChangeCustBasicInforRequestMsg createChangeCustBasicInforRequestMsg() {
        return new ChangeCustBasicInforRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeCustBasicInforRequest }
     * 
     */
    public ChangeCustBasicInforRequest createChangeCustBasicInforRequest() {
        return new ChangeCustBasicInforRequest();
    }

    /**
     * Create an instance of {@link DeleteSubscriberExtResultMsg }
     * 
     */
    public DeleteSubscriberExtResultMsg createDeleteSubscriberExtResultMsg() {
        return new DeleteSubscriberExtResultMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberExtResult }
     * 
     */
    public DeleteSubscriberExtResult createDeleteSubscriberExtResult() {
        return new DeleteSubscriberExtResult();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentationResultMsg }
     * 
     */
    public UpdateSubscriberSegmentationResultMsg createUpdateSubscriberSegmentationResultMsg() {
        return new UpdateSubscriberSegmentationResultMsg();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentationResult }
     * 
     */
    public UpdateSubscriberSegmentationResult createUpdateSubscriberSegmentationResult() {
        return new UpdateSubscriberSegmentationResult();
    }

    /**
     * Create an instance of {@link ChangeOwnerRequestMsg }
     * 
     */
    public ChangeOwnerRequestMsg createChangeOwnerRequestMsg() {
        return new ChangeOwnerRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeOwnerRequest }
     * 
     */
    public ChangeOwnerRequest createChangeOwnerRequest() {
        return new ChangeOwnerRequest();
    }

    /**
     * Create an instance of {@link QueryUserGroupRequestMsg }
     * 
     */
    public QueryUserGroupRequestMsg createQueryUserGroupRequestMsg() {
        return new QueryUserGroupRequestMsg();
    }

    /**
     * Create an instance of {@link QueryUserGroupRequest }
     * 
     */
    public QueryUserGroupRequest createQueryUserGroupRequest() {
        return new QueryUserGroupRequest();
    }

    /**
     * Create an instance of {@link ResetPasswordResultMsg }
     * 
     */
    public ResetPasswordResultMsg createResetPasswordResultMsg() {
        return new ResetPasswordResultMsg();
    }

    /**
     * Create an instance of {@link ManSubFamilyNoRequestMsg }
     * 
     */
    public ManSubFamilyNoRequestMsg createManSubFamilyNoRequestMsg() {
        return new ManSubFamilyNoRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSIMResultMsg }
     * 
     */
    public ChangeSIMResultMsg createChangeSIMResultMsg() {
        return new ChangeSIMResultMsg();
    }

    /**
     * Create an instance of {@link QueryLanguageInfResultMsg }
     * 
     */
    public QueryLanguageInfResultMsg createQueryLanguageInfResultMsg() {
        return new QueryLanguageInfResultMsg();
    }

    /**
     * Create an instance of {@link QueryChildLimitRequestMsg }
     * 
     */
    public QueryChildLimitRequestMsg createQueryChildLimitRequestMsg() {
        return new QueryChildLimitRequestMsg();
    }

    /**
     * Create an instance of {@link QueryChildLimitRequest }
     * 
     */
    public QueryChildLimitRequest createQueryChildLimitRequest() {
        return new QueryChildLimitRequest();
    }

    /**
     * Create an instance of {@link BatchOperationRequestMsg }
     * 
     */
    public BatchOperationRequestMsg createBatchOperationRequestMsg() {
        return new BatchOperationRequestMsg();
    }

    /**
     * Create an instance of {@link ManGroupMemberResultMsg }
     * 
     */
    public ManGroupMemberResultMsg createManGroupMemberResultMsg() {
        return new ManGroupMemberResultMsg();
    }

    /**
     * Create an instance of {@link ManGroupMemberResult }
     * 
     */
    public ManGroupMemberResult createManGroupMemberResult() {
        return new ManGroupMemberResult();
    }

    /**
     * Create an instance of {@link UpdateCUGListResultMsg }
     * 
     */
    public UpdateCUGListResultMsg createUpdateCUGListResultMsg() {
        return new UpdateCUGListResultMsg();
    }

    /**
     * Create an instance of {@link UpdateCUGListResult }
     * 
     */
    public UpdateCUGListResult createUpdateCUGListResult() {
        return new UpdateCUGListResult();
    }

    /**
     * Create an instance of {@link SubscribeAppendantProductResultMsg }
     * 
     */
    public SubscribeAppendantProductResultMsg createSubscribeAppendantProductResultMsg() {
        return new SubscribeAppendantProductResultMsg();
    }

    /**
     * Create an instance of {@link SubscribeAppendantProductResult }
     * 
     */
    public SubscribeAppendantProductResult createSubscribeAppendantProductResult() {
        return new SubscribeAppendantProductResult();
    }

    /**
     * Create an instance of {@link ChangeMSISDNResultMsg }
     * 
     */
    public ChangeMSISDNResultMsg createChangeMSISDNResultMsg() {
        return new ChangeMSISDNResultMsg();
    }

    /**
     * Create an instance of {@link ManSubHomeZoneRequestMsg }
     * 
     */
    public ManSubHomeZoneRequestMsg createManSubHomeZoneRequestMsg() {
        return new ManSubHomeZoneRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubHomeZoneResultMsg }
     * 
     */
    public QuerySubHomeZoneResultMsg createQuerySubHomeZoneResultMsg() {
        return new QuerySubHomeZoneResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSubLowBalPrtResultMsg }
     * 
     */
    public ChangeSubLowBalPrtResultMsg createChangeSubLowBalPrtResultMsg() {
        return new ChangeSubLowBalPrtResultMsg();
    }

    /**
     * Create an instance of {@link QueryChildLimitResultMsg }
     * 
     */
    public QueryChildLimitResultMsg createQueryChildLimitResultMsg() {
        return new QueryChildLimitResultMsg();
    }

    /**
     * Create an instance of {@link QueryChildLimitResult }
     * 
     */
    public QueryChildLimitResult createQueryChildLimitResult() {
        return new QueryChildLimitResult();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtResultMsg }
     * 
     */
    public UnSubscribeAppendantProductExtResultMsg createUnSubscribeAppendantProductExtResultMsg() {
        return new UnSubscribeAppendantProductExtResultMsg();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtResult }
     * 
     */
    public UnSubscribeAppendantProductExtResult createUnSubscribeAppendantProductExtResult() {
        return new UnSubscribeAppendantProductExtResult();
    }

    /**
     * Create an instance of {@link ModifySubscriberValidityResultMsg }
     * 
     */
    public ModifySubscriberValidityResultMsg createModifySubscriberValidityResultMsg() {
        return new ModifySubscriberValidityResultMsg();
    }

    /**
     * Create an instance of {@link ModifySubscriberValidityResult }
     * 
     */
    public ModifySubscriberValidityResult createModifySubscriberValidityResult() {
        return new ModifySubscriberValidityResult();
    }

    /**
     * Create an instance of {@link QuerySubscriberProductInfoRequestMsg }
     * 
     */
    public QuerySubscriberProductInfoRequestMsg createQuerySubscriberProductInfoRequestMsg() {
        return new QuerySubscriberProductInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberProductInfoRequest }
     * 
     */
    public QuerySubscriberProductInfoRequest createQuerySubscriberProductInfoRequest() {
        return new QuerySubscriberProductInfoRequest();
    }

    /**
     * Create an instance of {@link ManCUGInfoResultMsg }
     * 
     */
    public ManCUGInfoResultMsg createManCUGInfoResultMsg() {
        return new ManCUGInfoResultMsg();
    }

    /**
     * Create an instance of {@link ManCUGInfoResult }
     * 
     */
    public ManCUGInfoResult createManCUGInfoResult() {
        return new ManCUGInfoResult();
    }

    /**
     * Create an instance of {@link CheckOperatorPasswordRequestMsg }
     * 
     */
    public CheckOperatorPasswordRequestMsg createCheckOperatorPasswordRequestMsg() {
        return new CheckOperatorPasswordRequestMsg();
    }

    /**
     * Create an instance of {@link CheckOperatorPasswordRequest }
     * 
     */
    public CheckOperatorPasswordRequest createCheckOperatorPasswordRequest() {
        return new CheckOperatorPasswordRequest();
    }

    /**
     * Create an instance of {@link QueryUserGroupResultMsg }
     * 
     */
    public QueryUserGroupResultMsg createQueryUserGroupResultMsg() {
        return new QueryUserGroupResultMsg();
    }

    /**
     * Create an instance of {@link DeleteRechageBlackRequestMsg }
     * 
     */
    public DeleteRechageBlackRequestMsg createDeleteRechageBlackRequestMsg() {
        return new DeleteRechageBlackRequestMsg();
    }

    /**
     * Create an instance of {@link DeleteRechageBlackRequest }
     * 
     */
    public DeleteRechageBlackRequest createDeleteRechageBlackRequest() {
        return new DeleteRechageBlackRequest();
    }

    /**
     * Create an instance of {@link CheckPasswordRequestMsg }
     * 
     */
    public CheckPasswordRequestMsg createCheckPasswordRequestMsg() {
        return new CheckPasswordRequestMsg();
    }

    /**
     * Create an instance of {@link CheckPasswordRequest }
     * 
     */
    public CheckPasswordRequest createCheckPasswordRequest() {
        return new CheckPasswordRequest();
    }

    /**
     * Create an instance of {@link ClaimMissingResultMsg }
     * 
     */
    public ClaimMissingResultMsg createClaimMissingResultMsg() {
        return new ClaimMissingResultMsg();
    }

    /**
     * Create an instance of {@link ManPromotionPlanRequestMsg }
     * 
     */
    public ManPromotionPlanRequestMsg createManPromotionPlanRequestMsg() {
        return new ManPromotionPlanRequestMsg();
    }

    /**
     * Create an instance of {@link ManPromotionPlanRequest }
     * 
     */
    public ManPromotionPlanRequest createManPromotionPlanRequest() {
        return new ManPromotionPlanRequest();
    }

    /**
     * Create an instance of {@link QueryGroupMemberRequestMsg }
     * 
     */
    public QueryGroupMemberRequestMsg createQueryGroupMemberRequestMsg() {
        return new QueryGroupMemberRequestMsg();
    }

    /**
     * Create an instance of {@link QueryGroupMemberRequest }
     * 
     */
    public QueryGroupMemberRequest createQueryGroupMemberRequest() {
        return new QueryGroupMemberRequest();
    }

    /**
     * Create an instance of {@link ModifySubscriberStateRequestMsg }
     * 
     */
    public ModifySubscriberStateRequestMsg createModifySubscriberStateRequestMsg() {
        return new ModifySubscriberStateRequestMsg();
    }

    /**
     * Create an instance of {@link ModifySubscriberStateRequest }
     * 
     */
    public ModifySubscriberStateRequest createModifySubscriberStateRequest() {
        return new ModifySubscriberStateRequest();
    }

    /**
     * Create an instance of {@link QuerySubFamilyNoRequestMsg }
     * 
     */
    public QuerySubFamilyNoRequestMsg createQuerySubFamilyNoRequestMsg() {
        return new QuerySubFamilyNoRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubFamilyNoRequest }
     * 
     */
    public QuerySubFamilyNoRequest createQuerySubFamilyNoRequest() {
        return new QuerySubFamilyNoRequest();
    }

    /**
     * Create an instance of {@link ChangeMainProdRequestMsg }
     * 
     */
    public ChangeMainProdRequestMsg createChangeMainProdRequestMsg() {
        return new ChangeMainProdRequestMsg();
    }

    /**
     * Create an instance of {@link QueryPassInfoResultMsg }
     * 
     */
    public QueryPassInfoResultMsg createQueryPassInfoResultMsg() {
        return new QueryPassInfoResultMsg();
    }

    /**
     * Create an instance of {@link QueryPassInfoResult }
     * 
     */
    public QueryPassInfoResult createQueryPassInfoResult() {
        return new QueryPassInfoResult();
    }

    /**
     * Create an instance of {@link QueryAdjustValidityLogRequestMsg }
     * 
     */
    public QueryAdjustValidityLogRequestMsg createQueryAdjustValidityLogRequestMsg() {
        return new QueryAdjustValidityLogRequestMsg();
    }

    /**
     * Create an instance of {@link QueryAdjustValidityLogRequest }
     * 
     */
    public QueryAdjustValidityLogRequest createQueryAdjustValidityLogRequest() {
        return new QueryAdjustValidityLogRequest();
    }

    /**
     * Create an instance of {@link QuerySubLowBalPrtRequestMsg }
     * 
     */
    public QuerySubLowBalPrtRequestMsg createQuerySubLowBalPrtRequestMsg() {
        return new QuerySubLowBalPrtRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubLowBalPrtRequest }
     * 
     */
    public QuerySubLowBalPrtRequest createQuerySubLowBalPrtRequest() {
        return new QuerySubLowBalPrtRequest();
    }

    /**
     * Create an instance of {@link ModifySubscriberStateResultMsg }
     * 
     */
    public ModifySubscriberStateResultMsg createModifySubscriberStateResultMsg() {
        return new ModifySubscriberStateResultMsg();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoResultMsg }
     * 
     */
    public BindProductSubscriberNoResultMsg createBindProductSubscriberNoResultMsg() {
        return new BindProductSubscriberNoResultMsg();
    }

    /**
     * Create an instance of {@link ClaimMissingRequestMsg }
     * 
     */
    public ClaimMissingRequestMsg createClaimMissingRequestMsg() {
        return new ClaimMissingRequestMsg();
    }

    /**
     * Create an instance of {@link ClaimMissingRequest }
     * 
     */
    public ClaimMissingRequest createClaimMissingRequest() {
        return new ClaimMissingRequest();
    }

    /**
     * Create an instance of {@link ModifyPosUserStateRequestMsg }
     * 
     */
    public ModifyPosUserStateRequestMsg createModifyPosUserStateRequestMsg() {
        return new ModifyPosUserStateRequestMsg();
    }

    /**
     * Create an instance of {@link ModifyPosUserStateRequest }
     * 
     */
    public ModifyPosUserStateRequest createModifyPosUserStateRequest() {
        return new ModifyPosUserStateRequest();
    }

    /**
     * Create an instance of {@link QueryPassInfoRequestMsg }
     * 
     */
    public QueryPassInfoRequestMsg createQueryPassInfoRequestMsg() {
        return new QueryPassInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryPassInfoRequest }
     * 
     */
    public QueryPassInfoRequest createQueryPassInfoRequest() {
        return new QueryPassInfoRequest();
    }

    /**
     * Create an instance of {@link QueryAccumulatedPassInfoRequestMsg }
     * 
     */
    public QueryAccumulatedPassInfoRequestMsg createQueryAccumulatedPassInfoRequestMsg() {
        return new QueryAccumulatedPassInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryAccumulatedPassInfoRequest }
     * 
     */
    public QueryAccumulatedPassInfoRequest createQueryAccumulatedPassInfoRequest() {
        return new QueryAccumulatedPassInfoRequest();
    }

    /**
     * Create an instance of {@link ModifySubscriberValidityRequestMsg }
     * 
     */
    public ModifySubscriberValidityRequestMsg createModifySubscriberValidityRequestMsg() {
        return new ModifySubscriberValidityRequestMsg();
    }

    /**
     * Create an instance of {@link ModifySubscriberValidityRequest }
     * 
     */
    public ModifySubscriberValidityRequest createModifySubscriberValidityRequest() {
        return new ModifySubscriberValidityRequest();
    }

    /**
     * Create an instance of {@link SynDTDiscountResultMsg }
     * 
     */
    public SynDTDiscountResultMsg createSynDTDiscountResultMsg() {
        return new SynDTDiscountResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscribedGroupResultMsg }
     * 
     */
    public QuerySubscribedGroupResultMsg createQuerySubscribedGroupResultMsg() {
        return new QuerySubscribedGroupResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubFamilyNoResultMsg }
     * 
     */
    public QuerySubFamilyNoResultMsg createQuerySubFamilyNoResultMsg() {
        return new QuerySubFamilyNoResultMsg();
    }

    /**
     * Create an instance of {@link CheckUVCPartPinRequestMsg }
     * 
     */
    public CheckUVCPartPinRequestMsg createCheckUVCPartPinRequestMsg() {
        return new CheckUVCPartPinRequestMsg();
    }

    /**
     * Create an instance of {@link CheckUVCPartPinRequest }
     * 
     */
    public CheckUVCPartPinRequest createCheckUVCPartPinRequest() {
        return new CheckUVCPartPinRequest();
    }

    /**
     * Create an instance of {@link ChangeAccountBasicInforRequestMsg }
     * 
     */
    public ChangeAccountBasicInforRequestMsg createChangeAccountBasicInforRequestMsg() {
        return new ChangeAccountBasicInforRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeAccountBasicInforRequest }
     * 
     */
    public ChangeAccountBasicInforRequest createChangeAccountBasicInforRequest() {
        return new ChangeAccountBasicInforRequest();
    }

    /**
     * Create an instance of {@link ChangeMSISDNRequestMsg }
     * 
     */
    public ChangeMSISDNRequestMsg createChangeMSISDNRequestMsg() {
        return new ChangeMSISDNRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeMSISDNRequest }
     * 
     */
    public ChangeMSISDNRequest createChangeMSISDNRequest() {
        return new ChangeMSISDNRequest();
    }

    /**
     * Create an instance of {@link ReconnectRequestMsg }
     * 
     */
    public ReconnectRequestMsg createReconnectRequestMsg() {
        return new ReconnectRequestMsg();
    }

    /**
     * Create an instance of {@link ReconnectRequest }
     * 
     */
    public ReconnectRequest createReconnectRequest() {
        return new ReconnectRequest();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoRequestMsg }
     * 
     */
    public QuerySubCallScreenNoRequestMsg createQuerySubCallScreenNoRequestMsg() {
        return new QuerySubCallScreenNoRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoRequest }
     * 
     */
    public QuerySubCallScreenNoRequest createQuerySubCallScreenNoRequest() {
        return new QuerySubCallScreenNoRequest();
    }

    /**
     * Create an instance of {@link QueryAdjustValidityLogResultMsg }
     * 
     */
    public QueryAdjustValidityLogResultMsg createQueryAdjustValidityLogResultMsg() {
        return new QueryAdjustValidityLogResultMsg();
    }

    /**
     * Create an instance of {@link QueryPromotionPlanResultMsg }
     * 
     */
    public QueryPromotionPlanResultMsg createQueryPromotionPlanResultMsg() {
        return new QueryPromotionPlanResultMsg();
    }

    /**
     * Create an instance of {@link QueryPromotionPlanResult }
     * 
     */
    public QueryPromotionPlanResult createQueryPromotionPlanResult() {
        return new QueryPromotionPlanResult();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResultMsg }
     * 
     */
    public IntegrationEnquiryResultMsg createIntegrationEnquiryResultMsg() {
        return new IntegrationEnquiryResultMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberRequestMsg }
     * 
     */
    public DeleteSubscriberRequestMsg createDeleteSubscriberRequestMsg() {
        return new DeleteSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberRequest }
     * 
     */
    public DeleteSubscriberRequest createDeleteSubscriberRequest() {
        return new DeleteSubscriberRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductRequestMsg }
     * 
     */
    public BatchSubscribeAppProductRequestMsg createBatchSubscribeAppProductRequestMsg() {
        return new BatchSubscribeAppProductRequestMsg();
    }

    /**
     * Create an instance of {@link UpdateCUGListRequestMsg }
     * 
     */
    public UpdateCUGListRequestMsg createUpdateCUGListRequestMsg() {
        return new UpdateCUGListRequestMsg();
    }

    /**
     * Create an instance of {@link UpdateCUGListRequest }
     * 
     */
    public UpdateCUGListRequest createUpdateCUGListRequest() {
        return new UpdateCUGListRequest();
    }

    /**
     * Create an instance of {@link QueryCUGTypeResultMsg }
     * 
     */
    public QueryCUGTypeResultMsg createQueryCUGTypeResultMsg() {
        return new QueryCUGTypeResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoResultMsg }
     * 
     */
    public QuerySubCallScreenNoResultMsg createQuerySubCallScreenNoResultMsg() {
        return new QuerySubCallScreenNoResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberServiceInfoResultMsg }
     * 
     */
    public QuerySubscriberServiceInfoResultMsg createQuerySubscriberServiceInfoResultMsg() {
        return new QuerySubscriberServiceInfoResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberServiceInfoResult }
     * 
     */
    public QuerySubscriberServiceInfoResult createQuerySubscriberServiceInfoResult() {
        return new QuerySubscriberServiceInfoResult();
    }

    /**
     * Create an instance of {@link QuerySubHomeZoneRequestMsg }
     * 
     */
    public QuerySubHomeZoneRequestMsg createQuerySubHomeZoneRequestMsg() {
        return new QuerySubHomeZoneRequestMsg();
    }

    /**
     * Create an instance of {@link QuerySubHomeZoneRequest }
     * 
     */
    public QuerySubHomeZoneRequest createQuerySubHomeZoneRequest() {
        return new QuerySubHomeZoneRequest();
    }

    /**
     * Create an instance of {@link ChangeCreditLevelResultMsg }
     * 
     */
    public ChangeCreditLevelResultMsg createChangeCreditLevelResultMsg() {
        return new ChangeCreditLevelResultMsg();
    }

    /**
     * Create an instance of {@link QuerySubscriberProductInfoResultMsg }
     * 
     */
    public QuerySubscriberProductInfoResultMsg createQuerySubscriberProductInfoResultMsg() {
        return new QuerySubscriberProductInfoResultMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberResultMsg }
     * 
     */
    public DeleteSubscriberResultMsg createDeleteSubscriberResultMsg() {
        return new DeleteSubscriberResultMsg();
    }

    /**
     * Create an instance of {@link DeleteSubscriberResult }
     * 
     */
    public DeleteSubscriberResult createDeleteSubscriberResult() {
        return new DeleteSubscriberResult();
    }

    /**
     * Create an instance of {@link ChangeAppendantProductRequestMsg }
     * 
     */
    public ChangeAppendantProductRequestMsg createChangeAppendantProductRequestMsg() {
        return new ChangeAppendantProductRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeAccountBasicInforResultMsg }
     * 
     */
    public ChangeAccountBasicInforResultMsg createChangeAccountBasicInforResultMsg() {
        return new ChangeAccountBasicInforResultMsg();
    }

    /**
     * Create an instance of {@link ManParentChildResultMsg }
     * 
     */
    public ManParentChildResultMsg createManParentChildResultMsg() {
        return new ManParentChildResultMsg();
    }

    /**
     * Create an instance of {@link QueryAccumulatedPassInfoResultMsg }
     * 
     */
    public QueryAccumulatedPassInfoResultMsg createQueryAccumulatedPassInfoResultMsg() {
        return new QueryAccumulatedPassInfoResultMsg();
    }

    /**
     * Create an instance of {@link QueryAccumulatedPassInfoResult }
     * 
     */
    public QueryAccumulatedPassInfoResult createQueryAccumulatedPassInfoResult() {
        return new QueryAccumulatedPassInfoResult();
    }

    /**
     * Create an instance of {@link DeleteRechageBlackResultMsg }
     * 
     */
    public DeleteRechageBlackResultMsg createDeleteRechageBlackResultMsg() {
        return new DeleteRechageBlackResultMsg();
    }

    /**
     * Create an instance of {@link QueryPromotionPlanRequestMsg }
     * 
     */
    public QueryPromotionPlanRequestMsg createQueryPromotionPlanRequestMsg() {
        return new QueryPromotionPlanRequestMsg();
    }

    /**
     * Create an instance of {@link QueryPromotionPlanRequest }
     * 
     */
    public QueryPromotionPlanRequest createQueryPromotionPlanRequest() {
        return new QueryPromotionPlanRequest();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequestMsg }
     * 
     */
    public BindProductSubscriberNoRequestMsg createBindProductSubscriberNoRequestMsg() {
        return new BindProductSubscriberNoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryGroupMemberResultMsg }
     * 
     */
    public QueryGroupMemberResultMsg createQueryGroupMemberResultMsg() {
        return new QueryGroupMemberResultMsg();
    }

    /**
     * Create an instance of {@link QueryGroupMemberResult }
     * 
     */
    public QueryGroupMemberResult createQueryGroupMemberResult() {
        return new QueryGroupMemberResult();
    }

    /**
     * Create an instance of {@link SuspendResultMsg }
     * 
     */
    public SuspendResultMsg createSuspendResultMsg() {
        return new SuspendResultMsg();
    }

    /**
     * Create an instance of {@link ChangePasswordRequestMsg }
     * 
     */
    public ChangePasswordRequestMsg createChangePasswordRequestMsg() {
        return new ChangePasswordRequestMsg();
    }

    /**
     * Create an instance of {@link ChangePasswordRequest }
     * 
     */
    public ChangePasswordRequest createChangePasswordRequest() {
        return new ChangePasswordRequest();
    }

    /**
     * Create an instance of {@link NewSubscriberResultMsg }
     * 
     */
    public NewSubscriberResultMsg createNewSubscriberResultMsg() {
        return new NewSubscriberResultMsg();
    }

    /**
     * Create an instance of {@link NewSubscriberResult }
     * 
     */
    public NewSubscriberResult createNewSubscriberResult() {
        return new NewSubscriberResult();
    }

    /**
     * Create an instance of {@link QueryDefinedZonesInfoRequestMsg }
     * 
     */
    public QueryDefinedZonesInfoRequestMsg createQueryDefinedZonesInfoRequestMsg() {
        return new QueryDefinedZonesInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryDefinedZonesInfoRequest }
     * 
     */
    public QueryDefinedZonesInfoRequest createQueryDefinedZonesInfoRequest() {
        return new QueryDefinedZonesInfoRequest();
    }

    /**
     * Create an instance of {@link ChangeSubscriberBasicInforRequestMsg }
     * 
     */
    public ChangeSubscriberBasicInforRequestMsg createChangeSubscriberBasicInforRequestMsg() {
        return new ChangeSubscriberBasicInforRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSubscriberBasicInforRequest }
     * 
     */
    public ChangeSubscriberBasicInforRequest createChangeSubscriberBasicInforRequest() {
        return new ChangeSubscriberBasicInforRequest();
    }

    /**
     * Create an instance of {@link ManSubCallScreenNoRequestMsg }
     * 
     */
    public ManSubCallScreenNoRequestMsg createManSubCallScreenNoRequestMsg() {
        return new ManSubCallScreenNoRequestMsg();
    }

    /**
     * Create an instance of {@link BlockSubscriberRequestMsg }
     * 
     */
    public BlockSubscriberRequestMsg createBlockSubscriberRequestMsg() {
        return new BlockSubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link BlockSubscriberRequest }
     * 
     */
    public BlockSubscriberRequest createBlockSubscriberRequest() {
        return new BlockSubscriberRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductResultMsg }
     * 
     */
    public BatchSubscribeAppProductResultMsg createBatchSubscribeAppProductResultMsg() {
        return new BatchSubscribeAppProductResultMsg();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductResult }
     * 
     */
    public BatchSubscribeAppProductResult createBatchSubscribeAppProductResult() {
        return new BatchSubscribeAppProductResult();
    }

    /**
     * Create an instance of {@link ChangeCustBasicInforResultMsg }
     * 
     */
    public ChangeCustBasicInforResultMsg createChangeCustBasicInforResultMsg() {
        return new ChangeCustBasicInforResultMsg();
    }

    /**
     * Create an instance of {@link ManSubHomeZoneResultMsg }
     * 
     */
    public ManSubHomeZoneResultMsg createManSubHomeZoneResultMsg() {
        return new ManSubHomeZoneResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSubscriberBasicInforResultMsg }
     * 
     */
    public ChangeSubscriberBasicInforResultMsg createChangeSubscriberBasicInforResultMsg() {
        return new ChangeSubscriberBasicInforResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSubscriberBasicInforResult }
     * 
     */
    public ChangeSubscriberBasicInforResult createChangeSubscriberBasicInforResult() {
        return new ChangeSubscriberBasicInforResult();
    }

    /**
     * Create an instance of {@link QueryBasicInfoRequestMsg }
     * 
     */
    public QueryBasicInfoRequestMsg createQueryBasicInfoRequestMsg() {
        return new QueryBasicInfoRequestMsg();
    }

    /**
     * Create an instance of {@link QueryBasicInfoRequest }
     * 
     */
    public QueryBasicInfoRequest createQueryBasicInfoRequest() {
        return new QueryBasicInfoRequest();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResultMsg }
     * 
     */
    public QueryBasicInfoResultMsg createQueryBasicInfoResultMsg() {
        return new QueryBasicInfoResultMsg();
    }

    /**
     * Create an instance of {@link com.huawei.ocs12.businessmgrservice.Account }
     * 
     */
    public com.huawei.ocs12.businessmgrservice.Account createAccount() {
        return new com.huawei.ocs12.businessmgrservice.Account();
    }

    /**
     * Create an instance of {@link com.huawei.ocs12.businessmgrservice.Customer }
     * 
     */
    public com.huawei.ocs12.businessmgrservice.Customer createCustomer() {
        return new com.huawei.ocs12.businessmgrservice.Customer();
    }

    /**
     * Create an instance of {@link com.huawei.ocs12.businessmgrservice.Product }
     * 
     */
    public com.huawei.ocs12.businessmgrservice.Product createProduct() {
        return new com.huawei.ocs12.businessmgrservice.Product();
    }

    /**
     * Create an instance of {@link ServiceOfferings }
     * 
     */
    public ServiceOfferings createServiceOfferings() {
        return new ServiceOfferings();
    }

    /**
     * Create an instance of {@link QueryFNRelationShipRequest }
     * 
     */
    public QueryFNRelationShipRequest createQueryFNRelationShipRequest() {
        return new QueryFNRelationShipRequest();
    }

    /**
     * Create an instance of {@link QuerySCPCBPNumberSgmntsRequest }
     * 
     */
    public QuerySCPCBPNumberSgmntsRequest createQuerySCPCBPNumberSgmntsRequest() {
        return new QuerySCPCBPNumberSgmntsRequest();
    }

    /**
     * Create an instance of {@link NumberInfoType }
     * 
     */
    public NumberInfoType createNumberInfoType() {
        return new NumberInfoType();
    }

    /**
     * Create an instance of {@link BindSubscriberNo }
     * 
     */
    public BindSubscriberNo createBindSubscriberNo() {
        return new BindSubscriberNo();
    }

    /**
     * Create an instance of {@link ManPromotionPlanResult }
     * 
     */
    public ManPromotionPlanResult createManPromotionPlanResult() {
        return new ManPromotionPlanResult();
    }

    /**
     * Create an instance of {@link ProductOrderInfoType }
     * 
     */
    public ProductOrderInfoType createProductOrderInfoType() {
        return new ProductOrderInfoType();
    }

    /**
     * Create an instance of {@link SimpleProperty }
     * 
     */
    public SimpleProperty createSimpleProperty() {
        return new SimpleProperty();
    }

    /**
     * Create an instance of {@link GroupCustomer }
     * 
     */
    public GroupCustomer createGroupCustomer() {
        return new GroupCustomer();
    }

    /**
     * Create an instance of {@link QueryNPInfResult }
     * 
     */
    public QueryNPInfResult createQueryNPInfResult() {
        return new QueryNPInfResult();
    }

    /**
     * Create an instance of {@link BalanceRecordType }
     * 
     */
    public BalanceRecordType createBalanceRecordType() {
        return new BalanceRecordType();
    }

    /**
     * Create an instance of {@link UnlimitedSubscribeProductRequest }
     * 
     */
    public UnlimitedSubscribeProductRequest createUnlimitedSubscribeProductRequest() {
        return new UnlimitedSubscribeProductRequest();
    }

    /**
     * Create an instance of {@link SubscriberBasic }
     * 
     */
    public SubscriberBasic createSubscriberBasic() {
        return new SubscriberBasic();
    }

    /**
     * Create an instance of {@link ManNPInfRequest }
     * 
     */
    public ManNPInfRequest createManNPInfRequest() {
        return new ManNPInfRequest();
    }

    /**
     * Create an instance of {@link PromotionPlanType }
     * 
     */
    public PromotionPlanType createPromotionPlanType() {
        return new PromotionPlanType();
    }

    /**
     * Create an instance of {@link com.huawei.ocs12.businessmgrservice.Subscriber }
     * 
     */
    public com.huawei.ocs12.businessmgrservice.Subscriber createSubscriber() {
        return new com.huawei.ocs12.businessmgrservice.Subscriber();
    }

    /**
     * Create an instance of {@link IndividualCustomer }
     * 
     */
    public IndividualCustomer createIndividualCustomer() {
        return new IndividualCustomer();
    }

    /**
     * Create an instance of {@link QueryNPInfRequest }
     * 
     */
    public QueryNPInfRequest createQueryNPInfRequest() {
        return new QueryNPInfRequest();
    }

    /**
     * Create an instance of {@link BatchCommon }
     * 
     */
    public BatchCommon createBatchCommon() {
        return new BatchCommon();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link SubscriberProdOrderInfoType }
     * 
     */
    public SubscriberProdOrderInfoType createSubscriberProdOrderInfoType() {
        return new SubscriberProdOrderInfoType();
    }

    /**
     * Create an instance of {@link Imsi }
     * 
     */
    public Imsi createImsi() {
        return new Imsi();
    }

    /**
     * Create an instance of {@link QueryFNRelationShipResult }
     * 
     */
    public QueryFNRelationShipResult createQueryFNRelationShipResult() {
        return new QueryFNRelationShipResult();
    }

    /**
     * Create an instance of {@link ComplexProperty }
     * 
     */
    public ComplexProperty createComplexProperty() {
        return new ComplexProperty();
    }

    /**
     * Create an instance of {@link QueryLanguageInfResult }
     * 
     */
    public QueryLanguageInfResult createQueryLanguageInfResult() {
        return new QueryLanguageInfResult();
    }

    /**
     * Create an instance of {@link IndividualCustomerForResult }
     * 
     */
    public IndividualCustomerForResult createIndividualCustomerForResult() {
        return new IndividualCustomerForResult();
    }

    /**
     * Create an instance of {@link com.huawei.ocs12.businessmgrservice.Service }
     * 
     */
    public com.huawei.ocs12.businessmgrservice.Service createService() {
        return new com.huawei.ocs12.businessmgrservice.Service();
    }

    /**
     * Create an instance of {@link QuerySCPCBPNumberSgmntsResult.NumberSegmentsList }
     * 
     */
    public QuerySCPCBPNumberSgmntsResult.NumberSegmentsList createQuerySCPCBPNumberSgmntsResultNumberSegmentsList() {
        return new QuerySCPCBPNumberSgmntsResult.NumberSegmentsList();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.Customer }
     * 
     */
    public QueryBasicInfoResult.Customer createQueryBasicInfoResultCustomer() {
        return new QueryBasicInfoResult.Customer();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.SubscriberAccount }
     * 
     */
    public QueryBasicInfoResult.SubscriberAccount createQueryBasicInfoResultSubscriberAccount() {
        return new QueryBasicInfoResult.SubscriberAccount();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.Account }
     * 
     */
    public QueryBasicInfoResult.Account createQueryBasicInfoResultAccount() {
        return new QueryBasicInfoResult.Account();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.Subscriber.SubscriberInfo }
     * 
     */
    public QueryBasicInfoResult.Subscriber.SubscriberInfo createQueryBasicInfoResultSubscriberSubscriberInfo() {
        return new QueryBasicInfoResult.Subscriber.SubscriberInfo();
    }

    /**
     * Create an instance of {@link QueryBasicInfoResult.Subscriber.Product }
     * 
     */
    public QueryBasicInfoResult.Subscriber.Product createQueryBasicInfoResultSubscriberProduct() {
        return new QueryBasicInfoResult.Subscriber.Product();
    }

    /**
     * Create an instance of {@link ManSubCallScreenNoRequest.CallScreenNoInfo }
     * 
     */
    public ManSubCallScreenNoRequest.CallScreenNoInfo createManSubCallScreenNoRequestCallScreenNoInfo() {
        return new ManSubCallScreenNoRequest.CallScreenNoInfo();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest.BindSubNumber }
     * 
     */
    public BindProductSubscriberNoRequest.BindSubNumber createBindProductSubscriberNoRequestBindSubNumber() {
        return new BindProductSubscriberNoRequest.BindSubNumber();
    }

    /**
     * Create an instance of {@link ManParentChildResult.ChildSubscriberInfo }
     * 
     */
    public ManParentChildResult.ChildSubscriberInfo createManParentChildResultChildSubscriberInfo() {
        return new ManParentChildResult.ChildSubscriberInfo();
    }

    /**
     * Create an instance of {@link ChangeAppendantProductRequest.Product }
     * 
     */
    public ChangeAppendantProductRequest.Product createChangeAppendantProductRequestProduct() {
        return new ChangeAppendantProductRequest.Product();
    }

    /**
     * Create an instance of {@link QuerySubscriberProductInfoResult.Product }
     * 
     */
    public QuerySubscriberProductInfoResult.Product createQuerySubscriberProductInfoResultProduct() {
        return new QuerySubscriberProductInfoResult.Product();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoResult.CallScreenNoInfo }
     * 
     */
    public QuerySubCallScreenNoResult.CallScreenNoInfo createQuerySubCallScreenNoResultCallScreenNoInfo() {
        return new QuerySubCallScreenNoResult.CallScreenNoInfo();
    }

    /**
     * Create an instance of {@link QuerySubCallScreenNoResult.NonCallScreenNoInfo }
     * 
     */
    public QuerySubCallScreenNoResult.NonCallScreenNoInfo createQuerySubCallScreenNoResultNonCallScreenNoInfo() {
        return new QuerySubCallScreenNoResult.NonCallScreenNoInfo();
    }

    /**
     * Create an instance of {@link QueryCUGTypeResult.CUGTypeList }
     * 
     */
    public QueryCUGTypeResult.CUGTypeList createQueryCUGTypeResultCUGTypeList() {
        return new QueryCUGTypeResult.CUGTypeList();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductRequest.Product }
     * 
     */
    public BatchSubscribeAppProductRequest.Product createBatchSubscribeAppProductRequestProduct() {
        return new BatchSubscribeAppProductRequest.Product();
    }

    /**
     * Create an instance of {@link BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo }
     * 
     */
    public BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo createBatchSubscribeAppProductRequestSubscriberNoListNumberInfo() {
        return new BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.BalanceRecordList }
     * 
     */
    public IntegrationEnquiryResult.BalanceRecordList createIntegrationEnquiryResultBalanceRecordList() {
        return new IntegrationEnquiryResult.BalanceRecordList();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.SubscriberState }
     * 
     */
    public IntegrationEnquiryResult.SubscriberState createIntegrationEnquiryResultSubscriberState() {
        return new IntegrationEnquiryResult.SubscriberState();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.BillingCycleDate }
     * 
     */
    public IntegrationEnquiryResult.BillingCycleDate createIntegrationEnquiryResultBillingCycleDate() {
        return new IntegrationEnquiryResult.BillingCycleDate();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.SubAttachedInfo }
     * 
     */
    public IntegrationEnquiryResult.SubAttachedInfo createIntegrationEnquiryResultSubAttachedInfo() {
        return new IntegrationEnquiryResult.SubAttachedInfo();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.UserGroupList.UserGroup }
     * 
     */
    public IntegrationEnquiryResult.UserGroupList.UserGroup createIntegrationEnquiryResultUserGroupListUserGroup() {
        return new IntegrationEnquiryResult.UserGroupList.UserGroup();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.CumulativeItemList.CumulativeItem }
     * 
     */
    public IntegrationEnquiryResult.CumulativeItemList.CumulativeItem createIntegrationEnquiryResultCumulativeItemListCumulativeItem() {
        return new IntegrationEnquiryResult.CumulativeItemList.CumulativeItem();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.SubscriberInfo.Subscriber }
     * 
     */
    public IntegrationEnquiryResult.SubscriberInfo.Subscriber createIntegrationEnquiryResultSubscriberInfoSubscriber() {
        return new IntegrationEnquiryResult.SubscriberInfo.Subscriber();
    }

    /**
     * Create an instance of {@link IntegrationEnquiryResult.SubscriberInfo.Product }
     * 
     */
    public IntegrationEnquiryResult.SubscriberInfo.Product createIntegrationEnquiryResultSubscriberInfoProduct() {
        return new IntegrationEnquiryResult.SubscriberInfo.Product();
    }

    /**
     * Create an instance of {@link QueryAdjustValidityLogResult.AdjustValidityLog }
     * 
     */
    public QueryAdjustValidityLogResult.AdjustValidityLog createQueryAdjustValidityLogResultAdjustValidityLog() {
        return new QueryAdjustValidityLogResult.AdjustValidityLog();
    }

    /**
     * Create an instance of {@link QuerySubFamilyNoResult.FamilyNoInfo }
     * 
     */
    public QuerySubFamilyNoResult.FamilyNoInfo createQuerySubFamilyNoResultFamilyNoInfo() {
        return new QuerySubFamilyNoResult.FamilyNoInfo();
    }

    /**
     * Create an instance of {@link QuerySubscribedGroupResult.UserGroup }
     * 
     */
    public QuerySubscribedGroupResult.UserGroup createQuerySubscribedGroupResultUserGroup() {
        return new QuerySubscribedGroupResult.UserGroup();
    }

    /**
     * Create an instance of {@link ChangeMainProdRequest.Product }
     * 
     */
    public ChangeMainProdRequest.Product createChangeMainProdRequestProduct() {
        return new ChangeMainProdRequest.Product();
    }

    /**
     * Create an instance of {@link ChangeMainProdRequest.RemovedProduct }
     * 
     */
    public ChangeMainProdRequest.RemovedProduct createChangeMainProdRequestRemovedProduct() {
        return new ChangeMainProdRequest.RemovedProduct();
    }

    /**
     * Create an instance of {@link QueryUserGroupResult.UserGroup }
     * 
     */
    public QueryUserGroupResult.UserGroup createQueryUserGroupResultUserGroup() {
        return new QueryUserGroupResult.UserGroup();
    }

    /**
     * Create an instance of {@link QuerySubHomeZoneResult.HomeZoneNoInfo }
     * 
     */
    public QuerySubHomeZoneResult.HomeZoneNoInfo createQuerySubHomeZoneResultHomeZoneNoInfo() {
        return new QuerySubHomeZoneResult.HomeZoneNoInfo();
    }

    /**
     * Create an instance of {@link ManSubHomeZoneRequest.HomeZoneInfo }
     * 
     */
    public ManSubHomeZoneRequest.HomeZoneInfo createManSubHomeZoneRequestHomeZoneInfo() {
        return new ManSubHomeZoneRequest.HomeZoneInfo();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchDeleteSubscriber }
     * 
     */
    public BatchOperationRequest.BatchDeleteSubscriber createBatchOperationRequestBatchDeleteSubscriber() {
        return new BatchOperationRequest.BatchDeleteSubscriber();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchModifySubValidity }
     * 
     */
    public BatchOperationRequest.BatchModifySubValidity createBatchOperationRequestBatchModifySubValidity() {
        return new BatchOperationRequest.BatchModifySubValidity();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchModifyVoucherState }
     * 
     */
    public BatchOperationRequest.BatchModifyVoucherState createBatchOperationRequestBatchModifyVoucherState() {
        return new BatchOperationRequest.BatchModifyVoucherState();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchReplaceProduct }
     * 
     */
    public BatchOperationRequest.BatchReplaceProduct createBatchOperationRequestBatchReplaceProduct() {
        return new BatchOperationRequest.BatchReplaceProduct();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchCashRecharge }
     * 
     */
    public BatchOperationRequest.BatchCashRecharge createBatchOperationRequestBatchCashRecharge() {
        return new BatchOperationRequest.BatchCashRecharge();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchVouchRecharge }
     * 
     */
    public BatchOperationRequest.BatchVouchRecharge createBatchOperationRequestBatchVouchRecharge() {
        return new BatchOperationRequest.BatchVouchRecharge();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchActiveSubscriber }
     * 
     */
    public BatchOperationRequest.BatchActiveSubscriber createBatchOperationRequestBatchActiveSubscriber() {
        return new BatchOperationRequest.BatchActiveSubscriber();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchManageCUGMember }
     * 
     */
    public BatchOperationRequest.BatchManageCUGMember createBatchOperationRequestBatchManageCUGMember() {
        return new BatchOperationRequest.BatchManageCUGMember();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchModAcctExt }
     * 
     */
    public BatchOperationRequest.BatchModAcctExt createBatchOperationRequestBatchModAcctExt() {
        return new BatchOperationRequest.BatchModAcctExt();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchMultiSubscriberBand }
     * 
     */
    public BatchOperationRequest.BatchMultiSubscriberBand createBatchOperationRequestBatchMultiSubscriberBand() {
        return new BatchOperationRequest.BatchMultiSubscriberBand();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchManPromotionPlan }
     * 
     */
    public BatchOperationRequest.BatchManPromotionPlan createBatchOperationRequestBatchManPromotionPlan() {
        return new BatchOperationRequest.BatchManPromotionPlan();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee }
     * 
     */
    public BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee createBatchOperationRequestBatchAjustAccountModifyAcctFeeListModifyAcctFee() {
        return new BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchChangeMainProduct.Product }
     * 
     */
    public BatchOperationRequest.BatchChangeMainProduct.Product createBatchOperationRequestBatchChangeMainProductProduct() {
        return new BatchOperationRequest.BatchChangeMainProduct.Product();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchChangeMainProduct.RemovedProduct }
     * 
     */
    public BatchOperationRequest.BatchChangeMainProduct.RemovedProduct createBatchOperationRequestBatchChangeMainProductRemovedProduct() {
        return new BatchOperationRequest.BatchChangeMainProduct.RemovedProduct();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchChangeService.Service }
     * 
     */
    public BatchOperationRequest.BatchChangeService.Service createBatchOperationRequestBatchChangeServiceService() {
        return new BatchOperationRequest.BatchChangeService.Service();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchUnSubscribe.Product.Service }
     * 
     */
    public BatchOperationRequest.BatchUnSubscribe.Product.Service createBatchOperationRequestBatchUnSubscribeProductService() {
        return new BatchOperationRequest.BatchUnSubscribe.Product.Service();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchSubscribe.Product }
     * 
     */
    public BatchOperationRequest.BatchSubscribe.Product createBatchOperationRequestBatchSubscribeProduct() {
        return new BatchOperationRequest.BatchSubscribe.Product();
    }

    /**
     * Create an instance of {@link BatchOperationRequest.BatchNewSubscriber.Subscriber }
     * 
     */
    public BatchOperationRequest.BatchNewSubscriber.Subscriber createBatchOperationRequestBatchNewSubscriberSubscriber() {
        return new BatchOperationRequest.BatchNewSubscriber.Subscriber();
    }

    /**
     * Create an instance of {@link ManSubFamilyNoRequest.FamilyNoInfo }
     * 
     */
    public ManSubFamilyNoRequest.FamilyNoInfo createManSubFamilyNoRequestFamilyNoInfo() {
        return new ManSubFamilyNoRequest.FamilyNoInfo();
    }

    /**
     * Create an instance of {@link ManParentChildRequest.ChildSubscriberInfo }
     * 
     */
    public ManParentChildRequest.ChildSubscriberInfo createManParentChildRequestChildSubscriberInfo() {
        return new ManParentChildRequest.ChildSubscriberInfo();
    }

    /**
     * Create an instance of {@link ChangeServicesRequest.Service }
     * 
     */
    public ChangeServicesRequest.Service createChangeServicesRequestService() {
        return new ChangeServicesRequest.Service();
    }

    /**
     * Create an instance of {@link SubscribeAppendantProductRequest.Product }
     * 
     */
    public SubscribeAppendantProductRequest.Product createSubscribeAppendantProductRequestProduct() {
        return new SubscribeAppendantProductRequest.Product();
    }

    /**
     * Create an instance of {@link QueryPassCapEventInfoResult.CapEventInfo }
     * 
     */
    public QueryPassCapEventInfoResult.CapEventInfo createQueryPassCapEventInfoResultCapEventInfo() {
        return new QueryPassCapEventInfoResult.CapEventInfo();
    }

    /**
     * Create an instance of {@link CheckUVCPartPinResult.CardInfo }
     * 
     */
    public CheckUVCPartPinResult.CardInfo createCheckUVCPartPinResultCardInfo() {
        return new CheckUVCPartPinResult.CardInfo();
    }

    /**
     * Create an instance of {@link ChangeSubLowBalPrtRequest.LowBalPrt }
     * 
     */
    public ChangeSubLowBalPrtRequest.LowBalPrt createChangeSubLowBalPrtRequestLowBalPrt() {
        return new ChangeSubLowBalPrtRequest.LowBalPrt();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductRequest.Product.Service }
     * 
     */
    public UnSubscribeAppendantProductRequest.Product.Service createUnSubscribeAppendantProductRequestProductService() {
        return new UnSubscribeAppendantProductRequest.Product.Service();
    }

    /**
     * Create an instance of {@link NewSubscriberRequest.Subscriber }
     * 
     */
    public NewSubscriberRequest.Subscriber createNewSubscriberRequestSubscriber() {
        return new NewSubscriberRequest.Subscriber();
    }

    /**
     * Create an instance of {@link NewSubscriberExtRequest.Subscriber }
     * 
     */
    public NewSubscriberExtRequest.Subscriber createNewSubscriberExtRequestSubscriber() {
        return new NewSubscriberExtRequest.Subscriber();
    }

    /**
     * Create an instance of {@link NewSubscriberExtRequest.Product }
     * 
     */
    public NewSubscriberExtRequest.Product createNewSubscriberExtRequestProduct() {
        return new NewSubscriberExtRequest.Product();
    }

    /**
     * Create an instance of {@link QuerySubLowBalPrtResult.SubLowBalPrt }
     * 
     */
    public QuerySubLowBalPrtResult.SubLowBalPrt createQuerySubLowBalPrtResultSubLowBalPrt() {
        return new QuerySubLowBalPrtResult.SubLowBalPrt();
    }

    /**
     * Create an instance of {@link QueryDefinedZonesInfoResult.DefinedZonesInfo }
     * 
     */
    public QueryDefinedZonesInfoResult.DefinedZonesInfo createQueryDefinedZonesInfoResultDefinedZonesInfo() {
        return new QueryDefinedZonesInfoResult.DefinedZonesInfo();
    }

    /**
     * Create an instance of {@link ReNewSubscriberRequest.Subscriber }
     * 
     */
    public ReNewSubscriberRequest.Subscriber createReNewSubscriberRequestSubscriber() {
        return new ReNewSubscriberRequest.Subscriber();
    }

    /**
     * Create an instance of {@link QueryInterActLogResult.QueryInterActLogList.QueryInterActLog }
     * 
     */
    public QueryInterActLogResult.QueryInterActLogList.QueryInterActLog createQueryInterActLogResultQueryInterActLogListQueryInterActLog() {
        return new QueryInterActLogResult.QueryInterActLogList.QueryInterActLog();
    }

    /**
     * Create an instance of {@link UnSubscribeAppendantProductExtRequest.Product.Service }
     * 
     */
    public UnSubscribeAppendantProductExtRequest.Product.Service createUnSubscribeAppendantProductExtRequestProductService() {
        return new UnSubscribeAppendantProductExtRequest.Product.Service();
    }

    /**
     * Create an instance of {@link QuerySubChangeLogResult.SubChangeLogList.SubChangeLog }
     * 
     */
    public QuerySubChangeLogResult.SubChangeLogList.SubChangeLog createQuerySubChangeLogResultSubChangeLogListSubChangeLog() {
        return new QuerySubChangeLogResult.SubChangeLogList.SubChangeLog();
    }

    /**
     * Create an instance of {@link QueryCUGMembersResult.CUGMemberList }
     * 
     */
    public QueryCUGMembersResult.CUGMemberList createQueryCUGMembersResultCUGMemberList() {
        return new QueryCUGMembersResult.CUGMemberList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "UnitType", scope = BalanceRecordType.class)
    public JAXBElement<Integer> createBalanceRecordTypeUnitType(Integer value) {
        return new JAXBElement<Integer>(_BalanceRecordTypeUnitType_QNAME, Integer.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "MinMeasureId", scope = BalanceRecordType.class)
    public JAXBElement<Integer> createBalanceRecordTypeMinMeasureId(Integer value) {
        return new JAXBElement<Integer>(_BalanceRecordTypeMinMeasureId_QNAME, Integer.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "AccountCredit", scope = BalanceRecordType.class)
    public JAXBElement<Long> createBalanceRecordTypeAccountCredit(Long value) {
        return new JAXBElement<Long>(_BalanceRecordTypeAccountCredit_QNAME, Long.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "AccountKey", scope = BalanceRecordType.class)
    public JAXBElement<String> createBalanceRecordTypeAccountKey(String value) {
        return new JAXBElement<String>(_BalanceRecordTypeAccountKey_QNAME, String.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ProductID", scope = BalanceRecordType.class)
    public JAXBElement<String> createBalanceRecordTypeProductID(String value) {
        return new JAXBElement<String>(_BalanceRecordTypeProductID_QNAME, String.class, BalanceRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "weekStart", scope = QuerySubCallScreenNoResult.NonCallScreenNoInfo.class)
    public JAXBElement<String> createQuerySubCallScreenNoResultNonCallScreenNoInfoWeekStart(String value) {
        return new JAXBElement<String>(_QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStart_QNAME, String.class, QuerySubCallScreenNoResult.NonCallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "weekStop", scope = QuerySubCallScreenNoResult.NonCallScreenNoInfo.class)
    public JAXBElement<String> createQuerySubCallScreenNoResultNonCallScreenNoInfoWeekStop(String value) {
        return new JAXBElement<String>(_QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStop_QNAME, String.class, QuerySubCallScreenNoResult.NonCallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "RoutingMethod", scope = QuerySubCallScreenNoResult.NonCallScreenNoInfo.class)
    public JAXBElement<Integer> createQuerySubCallScreenNoResultNonCallScreenNoInfoRoutingMethod(Integer value) {
        return new JAXBElement<Integer>(_QuerySubCallScreenNoResultNonCallScreenNoInfoRoutingMethod_QNAME, Integer.class, QuerySubCallScreenNoResult.NonCallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "IRRouteFlag", scope = QuerySubCallScreenNoResult.NonCallScreenNoInfo.class)
    public JAXBElement<Integer> createQuerySubCallScreenNoResultNonCallScreenNoInfoIRRouteFlag(Integer value) {
        return new JAXBElement<Integer>(_QuerySubCallScreenNoResultNonCallScreenNoInfoIRRouteFlag_QNAME, Integer.class, QuerySubCallScreenNoResult.NonCallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "BillcycleType", scope = com.huawei.ocs12.businessmgrservice.Account.class)
    public JAXBElement<String> createAccountBillcycleType(String value) {
        return new JAXBElement<String>(_AccountBillcycleType_QNAME, String.class, com.huawei.ocs12.businessmgrservice.Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Address", scope = com.huawei.ocs12.businessmgrservice.Account.class)
    public JAXBElement<String> createAccountAddress(String value) {
        return new JAXBElement<String>(_AccountAddress_QNAME, String.class, com.huawei.ocs12.businessmgrservice.Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "weekStart", scope = QuerySubCallScreenNoResult.CallScreenNoInfo.class)
    public JAXBElement<String> createQuerySubCallScreenNoResultCallScreenNoInfoWeekStart(String value) {
        return new JAXBElement<String>(_QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStart_QNAME, String.class, QuerySubCallScreenNoResult.CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "weekStop", scope = QuerySubCallScreenNoResult.CallScreenNoInfo.class)
    public JAXBElement<String> createQuerySubCallScreenNoResultCallScreenNoInfoWeekStop(String value) {
        return new JAXBElement<String>(_QuerySubCallScreenNoResultNonCallScreenNoInfoWeekStop_QNAME, String.class, QuerySubCallScreenNoResult.CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "IRRouteFlag", scope = QuerySubCallScreenNoResult.CallScreenNoInfo.class)
    public JAXBElement<Integer> createQuerySubCallScreenNoResultCallScreenNoInfoIRRouteFlag(Integer value) {
        return new JAXBElement<Integer>(_QuerySubCallScreenNoResultNonCallScreenNoInfoIRRouteFlag_QNAME, Integer.class, QuerySubCallScreenNoResult.CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Action", scope = QuerySubLowBalPrtResult.SubLowBalPrt.class)
    public JAXBElement<Integer> createQuerySubLowBalPrtResultSubLowBalPrtAction(Integer value) {
        return new JAXBElement<Integer>(_QuerySubLowBalPrtResultSubLowBalPrtAction_QNAME, Integer.class, QuerySubLowBalPrtResult.SubLowBalPrt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "MessageID", scope = QuerySubLowBalPrtResult.SubLowBalPrt.class)
    public JAXBElement<Integer> createQuerySubLowBalPrtResultSubLowBalPrtMessageID(Integer value) {
        return new JAXBElement<Integer>(_QuerySubLowBalPrtResultSubLowBalPrtMessageID_QNAME, Integer.class, QuerySubLowBalPrtResult.SubLowBalPrt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ProductOrderKey", scope = IntegrationEnquiryResult.SubscriberInfo.Product.class)
    public JAXBElement<String> createIntegrationEnquiryResultSubscriberInfoProductProductOrderKey(String value) {
        return new JAXBElement<String>(_IntegrationEnquiryResultSubscriberInfoProductProductOrderKey_QNAME, String.class, IntegrationEnquiryResult.SubscriberInfo.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "MonthCapEndTime", scope = QueryPassInfoResult.class)
    public JAXBElement<String> createQueryPassInfoResultMonthCapEndTime(String value) {
        return new JAXBElement<String>(_QueryPassInfoResultMonthCapEndTime_QNAME, String.class, QueryPassInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "PassStartTime", scope = QueryPassInfoResult.class)
    public JAXBElement<String> createQueryPassInfoResultPassStartTime(String value) {
        return new JAXBElement<String>(_QueryPassInfoResultPassStartTime_QNAME, String.class, QueryPassInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "DayCapEndTime", scope = QueryPassInfoResult.class)
    public JAXBElement<String> createQueryPassInfoResultDayCapEndTime(String value) {
        return new JAXBElement<String>(_QueryPassInfoResultDayCapEndTime_QNAME, String.class, QueryPassInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "PassEndTime", scope = QueryPassInfoResult.class)
    public JAXBElement<String> createQueryPassInfoResultPassEndTime(String value) {
        return new JAXBElement<String>(_QueryPassInfoResultPassEndTime_QNAME, String.class, QueryPassInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ChgMainProductTimes", scope = IntegrationEnquiryResult.SubAttachedInfo.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultSubAttachedInfoChgMainProductTimes(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultSubAttachedInfoChgMainProductTimes_QNAME, Integer.class, IntegrationEnquiryResult.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ChgMainPackageTimes", scope = IntegrationEnquiryResult.SubAttachedInfo.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultSubAttachedInfoChgMainPackageTimes(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultSubAttachedInfoChgMainPackageTimes_QNAME, Integer.class, IntegrationEnquiryResult.SubAttachedInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ProductOrderKey", scope = QueryBasicInfoResult.Subscriber.Product.class)
    public JAXBElement<String> createQueryBasicInfoResultSubscriberProductProductOrderKey(String value) {
        return new JAXBElement<String>(_IntegrationEnquiryResultSubscriberInfoProductProductOrderKey_QNAME, String.class, QueryBasicInfoResult.Subscriber.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "status", scope = QueryBasicInfoResult.Subscriber.Product.class)
    public JAXBElement<Integer> createQueryBasicInfoResultSubscriberProductStatus(Integer value) {
        return new JAXBElement<Integer>(_QueryBasicInfoResultSubscriberProductStatus_QNAME, Integer.class, QueryBasicInfoResult.Subscriber.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "LossFlag", scope = IntegrationEnquiryResult.SubscriberState.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultSubscriberStateLossFlag(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultSubscriberStateLossFlag_QNAME, Integer.class, IntegrationEnquiryResult.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "POSUserState", scope = IntegrationEnquiryResult.SubscriberState.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultSubscriberStatePOSUserState(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultSubscriberStatePOSUserState_QNAME, Integer.class, IntegrationEnquiryResult.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "LifeCycleState", scope = IntegrationEnquiryResult.SubscriberState.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultSubscriberStateLifeCycleState(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultSubscriberStateLifeCycleState_QNAME, Integer.class, IntegrationEnquiryResult.SubscriberState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "accountGroupID", scope = UpdateSubscriberSegmentationRequest.class)
    public JAXBElement<Integer> createUpdateSubscriberSegmentationRequestAccountGroupID(Integer value) {
        return new JAXBElement<Integer>(_UpdateSubscriberSegmentationRequestAccountGroupID_QNAME, Integer.class, UpdateSubscriberSegmentationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Status", scope = com.huawei.ocs12.businessmgrservice.Service.class)
    public JAXBElement<String> createServiceStatus(String value) {
        return new JAXBElement<String>(_ServiceStatus_QNAME, String.class, com.huawei.ocs12.businessmgrservice.Service.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Education", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultEducation(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultEducation_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "SocialNo", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultSocialNo(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultSocialNo_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "MaritalStatus", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultMaritalStatus(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultMaritalStatus_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "JobType", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultJobType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultJobType_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Skill", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultSkill(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultSkill_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CreditGrade", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultCreditGrade(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCreditGrade_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Country", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultCountry(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCountry_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "IdCode", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultIdCode(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultIdCode_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Address", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultAddress(String value) {
        return new JAXBElement<String>(_AccountAddress_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "NationType", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultNationType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultNationType_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ZipCode", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultZipCode(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultZipCode_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Email", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultEmail(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultEmail_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CustomerState", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultCustomerState(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCustomerState_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "NativePlace", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultNativePlace(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultNativePlace_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CustomerType", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultCustomerType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCustomerType_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "IdType", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultIdType(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultIdType_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "BelToAreaID", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultBelToAreaID(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultBelToAreaID_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CreditAmount", scope = IndividualCustomerForResult.class)
    public JAXBElement<BigInteger> createIndividualCustomerForResultCreditAmount(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCreditAmount_QNAME, BigInteger.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Gender", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultGender(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultGender_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Grade", scope = IndividualCustomerForResult.class)
    public JAXBElement<String> createIndividualCustomerForResultGrade(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultGrade_QNAME, String.class, IndividualCustomerForResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "ProductOrderKey", scope = QuerySubscriberProductInfoResult.Product.class)
    public JAXBElement<String> createQuerySubscriberProductInfoResultProductProductOrderKey(String value) {
        return new JAXBElement<String>(_IntegrationEnquiryResultSubscriberInfoProductProductOrderKey_QNAME, String.class, QuerySubscriberProductInfoResult.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "status", scope = QuerySubscriberProductInfoResult.Product.class)
    public JAXBElement<Integer> createQuerySubscriberProductInfoResultProductStatus(Integer value) {
        return new JAXBElement<Integer>(_QueryBasicInfoResultSubscriberProductStatus_QNAME, Integer.class, QuerySubscriberProductInfoResult.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "SMSLang", scope = SubscriberBasic.class)
    public JAXBElement<String> createSubscriberBasicSMSLang(String value) {
        return new JAXBElement<String>(_SubscriberBasicSMSLang_QNAME, String.class, SubscriberBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "USSDLang", scope = SubscriberBasic.class)
    public JAXBElement<String> createSubscriberBasicUSSDLang(String value) {
        return new JAXBElement<String>(_SubscriberBasicUSSDLang_QNAME, String.class, SubscriberBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "BrandId", scope = SubscriberBasic.class)
    public JAXBElement<String> createSubscriberBasicBrandId(String value) {
        return new JAXBElement<String>(_SubscriberBasicBrandId_QNAME, String.class, SubscriberBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "BelToAreaID", scope = SubscriberBasic.class)
    public JAXBElement<String> createSubscriberBasicBelToAreaID(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultBelToAreaID_QNAME, String.class, SubscriberBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "InitialCredit", scope = SubscriberBasic.class)
    public JAXBElement<Integer> createSubscriberBasicInitialCredit(Integer value) {
        return new JAXBElement<Integer>(_SubscriberBasicInitialCredit_QNAME, Integer.class, SubscriberBasic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "BillCycleType", scope = IntegrationEnquiryResult.BillingCycleDate.class)
    public JAXBElement<Integer> createIntegrationEnquiryResultBillingCycleDateBillCycleType(Integer value) {
        return new JAXBElement<Integer>(_IntegrationEnquiryResultBillingCycleDateBillCycleType_QNAME, Integer.class, IntegrationEnquiryResult.BillingCycleDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Education", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerEducation(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultEducation_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "NationType", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerNationType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultNationType_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "MaritalStatus", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerMaritalStatus(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultMaritalStatus_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "JobType", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerJobType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultJobType_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CustomerState", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerCustomerState(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCustomerState_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "NativePlace", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerNativePlace(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultNativePlace_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CustomerType", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerCustomerType(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCustomerType_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CreditGrade", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerCreditGrade(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCreditGrade_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "IdType", scope = IndividualCustomer.class)
    public JAXBElement<String> createIndividualCustomerIdType(String value) {
        return new JAXBElement<String>(_IndividualCustomerForResultIdType_QNAME, String.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "Country", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerCountry(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCountry_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", name = "CreditAmount", scope = IndividualCustomer.class)
    public JAXBElement<BigInteger> createIndividualCustomerCreditAmount(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndividualCustomerForResultCreditAmount_QNAME, BigInteger.class, IndividualCustomer.class, value);
    }

}
