
package com.huawei.ocs55.bcservices;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.ocs55.bcservices package. 
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

    private final static QName _CustBasicInfoCustLevel_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CustLevel");
    private final static QName _IndividualInfoEducation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Education");
    private final static QName _IndividualInfoRace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Race");
    private final static QName _IndividualInfoMaritalStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MaritalStatus");
    private final static QName _IndividualInfoOccupation_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Occupation");
    private final static QName _IndividualInfoSalary_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Salary");
    private final static QName _IndividualInfoNativePlace_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "NativePlace");
    private final static QName _IndividualInfoIDType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "IDType");
    private final static QName _IndividualInfoNationality_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Nationality");
    private final static QName _IndividualInfoTitle_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Title");
    private final static QName _IndividualInfoGender_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "Gender");
    private final static QName _OfferingKeyOfferingID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "OfferingID");
    private final static QName _SubscriberConsumptionLimitUnitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "UnitType");
    private final static QName _SubscriberConsumptionLimitLimitParam_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitParam");
    private final static QName _SubscriberConsumptionLimitMesureType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureType");
    private final static QName _SubscriberConsumptionLimitLimitValue_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitValue");
    private final static QName _SubscriberConsumptionLimitLimitType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "LimitType");
    private final static QName _SubscriberConsumptionLimitCurrencyID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "CurrencyID");
    private final static QName _SubscriberConsumptionLimitMesureID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/bccommon", "MesureID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.ocs55.bcservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.PaymentLimit }
     * 
     */
    public com.huawei.ocs55.bcservices.PaymentLimit createPaymentLimit() {
        return new com.huawei.ocs55.bcservices.PaymentLimit();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.OfferingInst }
     * 
     */
    public com.huawei.ocs55.bcservices.OfferingInst createOfferingInst() {
        return new com.huawei.ocs55.bcservices.OfferingInst();
    }

    /**
     * Create an instance of {@link InstProperty }
     * 
     */
    public InstProperty createInstProperty() {
        return new InstProperty();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link AccountInfo.AutoPayChannel }
     * 
     */
    public AccountInfo.AutoPayChannel createAccountInfoAutoPayChannel() {
        return new AccountInfo.AutoPayChannel();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AutoPayChannelInfo }
     * 
     */
    public com.huawei.ocs55.bcservices.AutoPayChannelInfo createAutoPayChannelInfo() {
        return new com.huawei.ocs55.bcservices.AutoPayChannelInfo();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan }
     * 
     */
    public com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan createAutoPayChannelInfoPaymentPlan() {
        return new com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.ProductInst }
     * 
     */
    public com.huawei.ocs55.bcservices.ProductInst createProductInst() {
        return new com.huawei.ocs55.bcservices.ProductInst();
    }

    /**
     * Create an instance of {@link RscRelation }
     * 
     */
    public RscRelation createRscRelation() {
        return new RscRelation();
    }

    /**
     * Create an instance of {@link CustInfo }
     * 
     */
    public CustInfo createCustInfo() {
        return new CustInfo();
    }

    /**
     * Create an instance of {@link AccountForBatch }
     * 
     */
    public AccountForBatch createAccountForBatch() {
        return new AccountForBatch();
    }

    /**
     * Create an instance of {@link SubscriberForBatch }
     * 
     */
    public SubscriberForBatch createSubscriberForBatch() {
        return new SubscriberForBatch();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.Subscriber }
     * 
     */
    public com.huawei.ocs55.bcservices.Subscriber createSubscriber() {
        return new com.huawei.ocs55.bcservices.Subscriber();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit }
     * 
     */
    public com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit createSubscriberConsumptionLimit() {
        return new com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit();
    }

    /**
     * Create an instance of {@link POfferingInst }
     * 
     */
    public POfferingInst createPOfferingInst() {
        return new POfferingInst();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingResult }
     * 
     */
    public ChangeSubOfferingResult createChangeSubOfferingResult() {
        return new ChangeSubOfferingResult();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest }
     * 
     */
    public ChangeSubOfferingRequest createChangeSubOfferingRequest() {
        return new ChangeSubOfferingRequest();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.SupplementaryOffering }
     * 
     */
    public ChangeSubOfferingRequest.SupplementaryOffering createChangeSubOfferingRequestSupplementaryOffering() {
        return new ChangeSubOfferingRequest.SupplementaryOffering();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.SupplementaryOffering.DelOffering }
     * 
     */
    public ChangeSubOfferingRequest.SupplementaryOffering.DelOffering createChangeSubOfferingRequestSupplementaryOfferingDelOffering() {
        return new ChangeSubOfferingRequest.SupplementaryOffering.DelOffering();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequest }
     * 
     */
    public QueryOfferingInstPropertyRequest createQueryOfferingInstPropertyRequest() {
        return new QueryOfferingInstPropertyRequest();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequest.OfferingInst }
     * 
     */
    public QueryOfferingInstPropertyRequest.OfferingInst createQueryOfferingInstPropertyRequestOfferingInst() {
        return new QueryOfferingInstPropertyRequest.OfferingInst();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequest.OfferingOwner }
     * 
     */
    public QueryOfferingInstPropertyRequest.OfferingOwner createQueryOfferingInstPropertyRequestOfferingOwner() {
        return new QueryOfferingInstPropertyRequest.OfferingOwner();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult }
     * 
     */
    public QueryCustomerInfoResult createQueryCustomerInfoResult() {
        return new QueryCustomerInfoResult();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account }
     * 
     */
    public QueryCustomerInfoResult.Account createQueryCustomerInfoResultAccount() {
        return new QueryCustomerInfoResult.Account();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account.AcctInfo }
     * 
     */
    public QueryCustomerInfoResult.Account.AcctInfo createQueryCustomerInfoResultAccountAcctInfo() {
        return new QueryCustomerInfoResult.Account.AcctInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel }
     * 
     */
    public QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel createQueryCustomerInfoResultAccountAcctInfoAutoPayChannel() {
        return new QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.SubGroup }
     * 
     */
    public QueryCustomerInfoResult.SubGroup createQueryCustomerInfoResultSubGroup() {
        return new QueryCustomerInfoResult.SubGroup();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo }
     * 
     */
    public QueryCustomerInfoResult.SubGroup.SubGroupInfo createQueryCustomerInfoResultSubGroupSubGroupInfo() {
        return new QueryCustomerInfoResult.SubGroup.SubGroupInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Subscriber }
     * 
     */
    public QueryCustomerInfoResult.Subscriber createQueryCustomerInfoResultSubscriber() {
        return new QueryCustomerInfoResult.Subscriber();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo }
     * 
     */
    public QueryCustomerInfoResult.Subscriber.SubscriberInfo createQueryCustomerInfoResultSubscriberSubscriberInfo() {
        return new QueryCustomerInfoResult.Subscriber.SubscriberInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Customer }
     * 
     */
    public QueryCustomerInfoResult.Customer createQueryCustomerInfoResultCustomer() {
        return new QueryCustomerInfoResult.Customer();
    }

    /**
     * Create an instance of {@link QueryGroupListBySubscriberResult }
     * 
     */
    public QueryGroupListBySubscriberResult createQueryGroupListBySubscriberResult() {
        return new QueryGroupListBySubscriberResult();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequest }
     * 
     */
    public ChangeGroupOfferingRequest createChangeGroupOfferingRequest() {
        return new ChangeGroupOfferingRequest();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest }
     * 
     */
    public ChangeOfferingPropertyRequest createChangeOfferingPropertyRequest() {
        return new ChangeOfferingPropertyRequest();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst createChangeOfferingPropertyRequestOfferingInst() {
        return new ChangeOfferingPropertyRequest.OfferingInst();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.ProductInst createChangeOfferingPropertyRequestOfferingInstProductInst() {
        return new ChangeOfferingPropertyRequest.OfferingInst.ProductInst();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty createChangeOfferingPropertyRequestOfferingInstOfferingInstProperty() {
        return new ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner createChangeOfferingPropertyRequestOfferingInstOfferingOwner() {
        return new ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResult }
     * 
     */
    public QueryOfferingInstPropertyResult createQueryOfferingInstPropertyResult() {
        return new QueryOfferingInstPropertyResult();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResult.OfferingInst }
     * 
     */
    public QueryOfferingInstPropertyResult.OfferingInst createQueryOfferingInstPropertyResultOfferingInst() {
        return new QueryOfferingInstPropertyResult.OfferingInst();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResult.OfferingInst.ProductInst }
     * 
     */
    public QueryOfferingInstPropertyResult.OfferingInst.ProductInst createQueryOfferingInstPropertyResultOfferingInstProductInst() {
        return new QueryOfferingInstPropertyResult.OfferingInst.ProductInst();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequest }
     * 
     */
    public DelGroupMemberRequest createDelGroupMemberRequest() {
        return new DelGroupMemberRequest();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequest.PaymentRelation }
     * 
     */
    public DelGroupMemberRequest.PaymentRelation createDelGroupMemberRequestPaymentRelation() {
        return new DelGroupMemberRequest.PaymentRelation();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberInfoRequest }
     * 
     */
    public ChangeGroupMemberInfoRequest createChangeGroupMemberInfoRequest() {
        return new ChangeGroupMemberInfoRequest();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest }
     * 
     */
    public ChangeSubIdentityRequest createChangeSubIdentityRequest() {
        return new ChangeSubIdentityRequest();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingResult }
     * 
     */
    public ChangeGroupOfferingResult createChangeGroupOfferingResult() {
        return new ChangeGroupOfferingResult();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoRequest }
     * 
     */
    public QueryCustomerInfoRequest createQueryCustomerInfoRequest() {
        return new QueryCustomerInfoRequest();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoRequest.QueryObj }
     * 
     */
    public QueryCustomerInfoRequest.QueryObj createQueryCustomerInfoRequestQueryObj() {
        return new QueryCustomerInfoRequest.QueryObj();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest }
     * 
     */
    public AddGroupMemberRequest createAddGroupMemberRequest() {
        return new AddGroupMemberRequest();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation createAddGroupMemberRequestPaymentRelation() {
        return new AddGroupMemberRequest.PaymentRelation();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.AddPayRelation createAddGroupMemberRequestPaymentRelationAddPayRelation() {
        return new AddGroupMemberRequest.PaymentRelation.AddPayRelation();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit createAddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimit() {
        return new AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.NewDFTAcct createAddGroupMemberRequestPaymentRelationNewDFTAcct() {
        return new AddGroupMemberRequest.PaymentRelation.NewDFTAcct();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit createAddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimit() {
        return new AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.GroupMember }
     * 
     */
    public AddGroupMemberRequest.GroupMember createAddGroupMemberRequestGroupMember() {
        return new AddGroupMemberRequest.GroupMember();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingResult }
     * 
     */
    public ChangeGroupMemberOfferingResult createChangeGroupMemberOfferingResult() {
        return new ChangeGroupMemberOfferingResult();
    }

    /**
     * Create an instance of {@link CreateGroupRequest }
     * 
     */
    public CreateGroupRequest createCreateGroupRequest() {
        return new CreateGroupRequest();
    }

    /**
     * Create an instance of {@link AcctDeactivationRequest }
     * 
     */
    public AcctDeactivationRequest createAcctDeactivationRequest() {
        return new AcctDeactivationRequest();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingRequest }
     * 
     */
    public ChangeGroupMemberOfferingRequest createChangeGroupMemberOfferingRequest() {
        return new ChangeGroupMemberOfferingRequest();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link GroupDeactivationRequestMsg }
     * 
     */
    public GroupDeactivationRequestMsg createGroupDeactivationRequestMsg() {
        return new GroupDeactivationRequestMsg();
    }

    /**
     * Create an instance of {@link GroupDeactivationRequest }
     * 
     */
    public GroupDeactivationRequest createGroupDeactivationRequest() {
        return new GroupDeactivationRequest();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityResultMsg }
     * 
     */
    public ChangeSubIdentityResultMsg createChangeSubIdentityResultMsg() {
        return new ChangeSubIdentityResultMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingRequestMsg }
     * 
     */
    public ChangeGroupMemberOfferingRequestMsg createChangeGroupMemberOfferingRequestMsg() {
        return new ChangeGroupMemberOfferingRequestMsg();
    }

    /**
     * Create an instance of {@link AcctDeactivationRequestMsg }
     * 
     */
    public AcctDeactivationRequestMsg createAcctDeactivationRequestMsg() {
        return new AcctDeactivationRequestMsg();
    }

    /**
     * Create an instance of {@link CreateGroupRequestMsg }
     * 
     */
    public CreateGroupRequestMsg createCreateGroupRequestMsg() {
        return new CreateGroupRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingResultMsg }
     * 
     */
    public ChangeGroupMemberOfferingResultMsg createChangeGroupMemberOfferingResultMsg() {
        return new ChangeGroupMemberOfferingResultMsg();
    }

    /**
     * Create an instance of {@link QueryGroupListBySubscriberRequestMsg }
     * 
     */
    public QueryGroupListBySubscriberRequestMsg createQueryGroupListBySubscriberRequestMsg() {
        return new QueryGroupListBySubscriberRequestMsg();
    }

    /**
     * Create an instance of {@link QueryGroupListBySubscriberRequest }
     * 
     */
    public QueryGroupListBySubscriberRequest createQueryGroupListBySubscriberRequest() {
        return new QueryGroupListBySubscriberRequest();
    }

    /**
     * Create an instance of {@link AddGroupMemberResultMsg }
     * 
     */
    public AddGroupMemberResultMsg createAddGroupMemberResultMsg() {
        return new AddGroupMemberResultMsg();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequestMsg }
     * 
     */
    public AddGroupMemberRequestMsg createAddGroupMemberRequestMsg() {
        return new AddGroupMemberRequestMsg();
    }

    /**
     * Create an instance of {@link DelGroupMemberResultMsg }
     * 
     */
    public DelGroupMemberResultMsg createDelGroupMemberResultMsg() {
        return new DelGroupMemberResultMsg();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoRequestMsg }
     * 
     */
    public QueryCustomerInfoRequestMsg createQueryCustomerInfoRequestMsg() {
        return new QueryCustomerInfoRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingResultMsg }
     * 
     */
    public ChangeGroupOfferingResultMsg createChangeGroupOfferingResultMsg() {
        return new ChangeGroupOfferingResultMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberInfoResultMsg }
     * 
     */
    public ChangeGroupMemberInfoResultMsg createChangeGroupMemberInfoResultMsg() {
        return new ChangeGroupMemberInfoResultMsg();
    }

    /**
     * Create an instance of {@link AcctDeactivationResultMsg }
     * 
     */
    public AcctDeactivationResultMsg createAcctDeactivationResultMsg() {
        return new AcctDeactivationResultMsg();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequestMsg }
     * 
     */
    public ChangeSubIdentityRequestMsg createChangeSubIdentityRequestMsg() {
        return new ChangeSubIdentityRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberInfoRequestMsg }
     * 
     */
    public ChangeGroupMemberInfoRequestMsg createChangeGroupMemberInfoRequestMsg() {
        return new ChangeGroupMemberInfoRequestMsg();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequestMsg }
     * 
     */
    public DelGroupMemberRequestMsg createDelGroupMemberRequestMsg() {
        return new DelGroupMemberRequestMsg();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResultMsg }
     * 
     */
    public QueryOfferingInstPropertyResultMsg createQueryOfferingInstPropertyResultMsg() {
        return new QueryOfferingInstPropertyResultMsg();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequestMsg }
     * 
     */
    public ChangeOfferingPropertyRequestMsg createChangeOfferingPropertyRequestMsg() {
        return new ChangeOfferingPropertyRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequestMsg }
     * 
     */
    public ChangeGroupOfferingRequestMsg createChangeGroupOfferingRequestMsg() {
        return new ChangeGroupOfferingRequestMsg();
    }

    /**
     * Create an instance of {@link QueryGroupListBySubscriberResultMsg }
     * 
     */
    public QueryGroupListBySubscriberResultMsg createQueryGroupListBySubscriberResultMsg() {
        return new QueryGroupListBySubscriberResultMsg();
    }

    /**
     * Create an instance of {@link GroupDeactivationResultMsg }
     * 
     */
    public GroupDeactivationResultMsg createGroupDeactivationResultMsg() {
        return new GroupDeactivationResultMsg();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResultMsg }
     * 
     */
    public QueryCustomerInfoResultMsg createQueryCustomerInfoResultMsg() {
        return new QueryCustomerInfoResultMsg();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequestMsg }
     * 
     */
    public QueryOfferingInstPropertyRequestMsg createQueryOfferingInstPropertyRequestMsg() {
        return new QueryOfferingInstPropertyRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequestMsg }
     * 
     */
    public ChangeSubOfferingRequestMsg createChangeSubOfferingRequestMsg() {
        return new ChangeSubOfferingRequestMsg();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingResultMsg }
     * 
     */
    public ChangeSubOfferingResultMsg createChangeSubOfferingResultMsg() {
        return new ChangeSubOfferingResultMsg();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyResultMsg }
     * 
     */
    public ChangeOfferingPropertyResultMsg createChangeOfferingPropertyResultMsg() {
        return new ChangeOfferingPropertyResultMsg();
    }

    /**
     * Create an instance of {@link CreateGroupResultMsg }
     * 
     */
    public CreateGroupResultMsg createCreateGroupResultMsg() {
        return new CreateGroupResultMsg();
    }

    /**
     * Create an instance of {@link OperatorInfo }
     * 
     */
    public OperatorInfo createOperatorInfo() {
        return new OperatorInfo();
    }

    /**
     * Create an instance of {@link SecurityInfo }
     * 
     */
    public SecurityInfo createSecurityInfo() {
        return new SecurityInfo();
    }

    /**
     * Create an instance of {@link OwnershipInfo }
     * 
     */
    public OwnershipInfo createOwnershipInfo() {
        return new OwnershipInfo();
    }

    /**
     * Create an instance of {@link CustomerForBatch }
     * 
     */
    public CustomerForBatch createCustomerForBatch() {
        return new CustomerForBatch();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link FreeUnitChgInfo }
     * 
     */
    public FreeUnitChgInfo createFreeUnitChgInfo() {
        return new FreeUnitChgInfo();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AcctAccessCode }
     * 
     */
    public com.huawei.ocs55.bcservices.AcctAccessCode createAcctAccessCode() {
        return new com.huawei.ocs55.bcservices.AcctAccessCode();
    }

    /**
     * Create an instance of {@link AutoPaymentPlan }
     * 
     */
    public AutoPaymentPlan createAutoPaymentPlan() {
        return new AutoPaymentPlan();
    }

    /**
     * Create an instance of {@link SubGroupBasicInfo }
     * 
     */
    public SubGroupBasicInfo createSubGroupBasicInfo() {
        return new SubGroupBasicInfo();
    }

    /**
     * Create an instance of {@link FreeBillMedium }
     * 
     */
    public FreeBillMedium createFreeBillMedium() {
        return new FreeBillMedium();
    }

    /**
     * Create an instance of {@link TaxException }
     * 
     */
    public TaxException createTaxException() {
        return new TaxException();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.SubGroup }
     * 
     */
    public com.huawei.ocs55.bcservices.SubGroup createSubGroup() {
        return new com.huawei.ocs55.bcservices.SubGroup();
    }

    /**
     * Create an instance of {@link PayOwner }
     * 
     */
    public PayOwner createPayOwner() {
        return new PayOwner();
    }

    /**
     * Create an instance of {@link PayRelExtRule }
     * 
     */
    public PayRelExtRule createPayRelExtRule() {
        return new PayRelExtRule();
    }

    /**
     * Create an instance of {@link AccountBasicInfo }
     * 
     */
    public AccountBasicInfo createAccountBasicInfo() {
        return new AccountBasicInfo();
    }

    /**
     * Create an instance of {@link SubGroupAccessCode }
     * 
     */
    public SubGroupAccessCode createSubGroupAccessCode() {
        return new SubGroupAccessCode();
    }

    /**
     * Create an instance of {@link OfferingKey }
     * 
     */
    public OfferingKey createOfferingKey() {
        return new OfferingKey();
    }

    /**
     * Create an instance of {@link SimpleProperty }
     * 
     */
    public SimpleProperty createSimpleProperty() {
        return new SimpleProperty();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.SubAccessCode }
     * 
     */
    public com.huawei.ocs55.bcservices.SubAccessCode createSubAccessCode() {
        return new com.huawei.ocs55.bcservices.SubAccessCode();
    }

    /**
     * Create an instance of {@link BalanceChgInfo }
     * 
     */
    public BalanceChgInfo createBalanceChgInfo() {
        return new BalanceChgInfo();
    }

    /**
     * Create an instance of {@link StatementInfo }
     * 
     */
    public StatementInfo createStatementInfo() {
        return new StatementInfo();
    }

    /**
     * Create an instance of {@link SalesInfo }
     * 
     */
    public SalesInfo createSalesInfo() {
        return new SalesInfo();
    }

    /**
     * Create an instance of {@link SubGroupMemberInfo }
     * 
     */
    public SubGroupMemberInfo createSubGroupMemberInfo() {
        return new SubGroupMemberInfo();
    }

    /**
     * Create an instance of {@link ActiveMode }
     * 
     */
    public ActiveMode createActiveMode() {
        return new ActiveMode();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.OfferingOwner }
     * 
     */
    public com.huawei.ocs55.bcservices.OfferingOwner createOfferingOwner() {
        return new com.huawei.ocs55.bcservices.OfferingOwner();
    }

    /**
     * Create an instance of {@link SubRelationInfo }
     * 
     */
    public SubRelationInfo createSubRelationInfo() {
        return new SubRelationInfo();
    }

    /**
     * Create an instance of {@link CustAccessCode }
     * 
     */
    public CustAccessCode createCustAccessCode() {
        return new CustAccessCode();
    }

    /**
     * Create an instance of {@link SubIdentity }
     * 
     */
    public SubIdentity createSubIdentity() {
        return new SubIdentity();
    }

    /**
     * Create an instance of {@link StatementMedium }
     * 
     */
    public StatementMedium createStatementMedium() {
        return new StatementMedium();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.SubBasicInfo }
     * 
     */
    public com.huawei.ocs55.bcservices.SubBasicInfo createSubBasicInfo() {
        return new com.huawei.ocs55.bcservices.SubBasicInfo();
    }

    /**
     * Create an instance of {@link SubGroupMember }
     * 
     */
    public SubGroupMember createSubGroupMember() {
        return new SubGroupMember();
    }

    /**
     * Create an instance of {@link EffectMode }
     * 
     */
    public EffectMode createEffectMode() {
        return new EffectMode();
    }

    /**
     * Create an instance of {@link OfferingExpireMode }
     * 
     */
    public OfferingExpireMode createOfferingExpireMode() {
        return new OfferingExpireMode();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link CustBasicInfo }
     * 
     */
    public CustBasicInfo createCustBasicInfo() {
        return new CustBasicInfo();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link OrgInfo }
     * 
     */
    public OrgInfo createOrgInfo() {
        return new OrgInfo();
    }

    /**
     * Create an instance of {@link StatementScenario }
     * 
     */
    public StatementScenario createStatementScenario() {
        return new StatementScenario();
    }

    /**
     * Create an instance of {@link IndividualInfo }
     * 
     */
    public IndividualInfo createIndividualInfo() {
        return new IndividualInfo();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.PaymentLimit.Limit }
     * 
     */
    public com.huawei.ocs55.bcservices.PaymentLimit.Limit createPaymentLimitLimit() {
        return new com.huawei.ocs55.bcservices.PaymentLimit.Limit();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.OfferingInst.OInstProperty }
     * 
     */
    public com.huawei.ocs55.bcservices.OfferingInst.OInstProperty createOfferingInstOInstProperty() {
        return new com.huawei.ocs55.bcservices.OfferingInst.OInstProperty();
    }

    /**
     * Create an instance of {@link InstProperty.SubPropInst }
     * 
     */
    public InstProperty.SubPropInst createInstPropertySubPropInst() {
        return new InstProperty.SubPropInst();
    }

    /**
     * Create an instance of {@link AccountInfo.CreditLimit }
     * 
     */
    public AccountInfo.CreditLimit createAccountInfoCreditLimit() {
        return new AccountInfo.CreditLimit();
    }

    /**
     * Create an instance of {@link AccountInfo.AutoPayChannel.AutoPayChannelInfo }
     * 
     */
    public AccountInfo.AutoPayChannel.AutoPayChannelInfo createAccountInfoAutoPayChannelAutoPayChannelInfo() {
        return new AccountInfo.AutoPayChannel.AutoPayChannelInfo();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.BillCycleSchema }
     * 
     */
    public com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.BillCycleSchema createAutoPayChannelInfoPaymentPlanBillCycleSchema() {
        return new com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.BillCycleSchema();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.TimeSchema }
     * 
     */
    public com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.TimeSchema createAutoPayChannelInfoPaymentPlanTimeSchema() {
        return new com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.TimeSchema();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema }
     * 
     */
    public com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema createAutoPayChannelInfoPaymentPlanLowBalanceSchema() {
        return new com.huawei.ocs55.bcservices.AutoPayChannelInfo.PaymentPlan.LowBalanceSchema();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.ProductInst.PInstProperty }
     * 
     */
    public com.huawei.ocs55.bcservices.ProductInst.PInstProperty createProductInstPInstProperty() {
        return new com.huawei.ocs55.bcservices.ProductInst.PInstProperty();
    }

    /**
     * Create an instance of {@link RscRelation.RelationDestIdentify }
     * 
     */
    public RscRelation.RelationDestIdentify createRscRelationRelationDestIdentify() {
        return new RscRelation.RelationDestIdentify();
    }

    /**
     * Create an instance of {@link RscRelation.ShareLimit }
     * 
     */
    public RscRelation.ShareLimit createRscRelationShareLimit() {
        return new RscRelation.ShareLimit();
    }

    /**
     * Create an instance of {@link CustInfo.NoticeSuppress }
     * 
     */
    public CustInfo.NoticeSuppress createCustInfoNoticeSuppress() {
        return new CustInfo.NoticeSuppress();
    }

    /**
     * Create an instance of {@link AccountForBatch.CreditLimit }
     * 
     */
    public AccountForBatch.CreditLimit createAccountForBatchCreditLimit() {
        return new AccountForBatch.CreditLimit();
    }

    /**
     * Create an instance of {@link SubscriberForBatch.SubBasicInfo }
     * 
     */
    public SubscriberForBatch.SubBasicInfo createSubscriberForBatchSubBasicInfo() {
        return new SubscriberForBatch.SubBasicInfo();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam }
     * 
     */
    public com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam createSubscriberConsumptionLimitLimitParam() {
        return new com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam();
    }

    /**
     * Create an instance of {@link POfferingInst.OfferingInstProperty }
     * 
     */
    public POfferingInst.OfferingInstProperty createPOfferingInstOfferingInstProperty() {
        return new POfferingInst.OfferingInstProperty();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingResult.ModifyOffering }
     * 
     */
    public ChangeSubOfferingResult.ModifyOffering createChangeSubOfferingResultModifyOffering() {
        return new ChangeSubOfferingResult.ModifyOffering();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.PrimaryOffering }
     * 
     */
    public ChangeSubOfferingRequest.PrimaryOffering createChangeSubOfferingRequestPrimaryOffering() {
        return new ChangeSubOfferingRequest.PrimaryOffering();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.SupplementaryOffering.AddOffering }
     * 
     */
    public ChangeSubOfferingRequest.SupplementaryOffering.AddOffering createChangeSubOfferingRequestSupplementaryOfferingAddOffering() {
        return new ChangeSubOfferingRequest.SupplementaryOffering.AddOffering();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering }
     * 
     */
    public ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering createChangeSubOfferingRequestSupplementaryOfferingModifyOffering() {
        return new ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering();
    }

    /**
     * Create an instance of {@link ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty }
     * 
     */
    public ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty createChangeSubOfferingRequestSupplementaryOfferingDelOfferingAdditionalProperty() {
        return new ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequest.OfferingInst.ProductInst }
     * 
     */
    public QueryOfferingInstPropertyRequest.OfferingInst.ProductInst createQueryOfferingInstPropertyRequestOfferingInstProductInst() {
        return new QueryOfferingInstPropertyRequest.OfferingInst.ProductInst();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyRequest.OfferingOwner.AcctAccessCode }
     * 
     */
    public QueryOfferingInstPropertyRequest.OfferingOwner.AcctAccessCode createQueryOfferingInstPropertyRequestOfferingOwnerAcctAccessCode() {
        return new QueryOfferingInstPropertyRequest.OfferingOwner.AcctAccessCode();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account.OfferingInst }
     * 
     */
    public QueryCustomerInfoResult.Account.OfferingInst createQueryCustomerInfoResultAccountOfferingInst() {
        return new QueryCustomerInfoResult.Account.OfferingInst();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account.AcctInfo.UserCustomer }
     * 
     */
    public QueryCustomerInfoResult.Account.AcctInfo.UserCustomer createQueryCustomerInfoResultAccountAcctInfoUserCustomer() {
        return new QueryCustomerInfoResult.Account.AcctInfo.UserCustomer();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo }
     * 
     */
    public QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo createQueryCustomerInfoResultAccountAcctInfoAutoPayChannelAutoPayChannelInfo() {
        return new QueryCustomerInfoResult.Account.AcctInfo.AutoPayChannel.AutoPayChannelInfo();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.SubGroup.SupplementaryOffering }
     * 
     */
    public QueryCustomerInfoResult.SubGroup.SupplementaryOffering createQueryCustomerInfoResultSubGroupSupplementaryOffering() {
        return new QueryCustomerInfoResult.SubGroup.SupplementaryOffering();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer }
     * 
     */
    public QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer createQueryCustomerInfoResultSubGroupSubGroupInfoUserCustomer() {
        return new QueryCustomerInfoResult.SubGroup.SubGroupInfo.UserCustomer();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Subscriber.SupplementaryOffering }
     * 
     */
    public QueryCustomerInfoResult.Subscriber.SupplementaryOffering createQueryCustomerInfoResultSubscriberSupplementaryOffering() {
        return new QueryCustomerInfoResult.Subscriber.SupplementaryOffering();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer }
     * 
     */
    public QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer createQueryCustomerInfoResultSubscriberSubscriberInfoUserCustomer() {
        return new QueryCustomerInfoResult.Subscriber.SubscriberInfo.UserCustomer();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoResult.Customer.OfferingInst }
     * 
     */
    public QueryCustomerInfoResult.Customer.OfferingInst createQueryCustomerInfoResultCustomerOfferingInst() {
        return new QueryCustomerInfoResult.Customer.OfferingInst();
    }

    /**
     * Create an instance of {@link QueryGroupListBySubscriberResult.GroupList }
     * 
     */
    public QueryGroupListBySubscriberResult.GroupList createQueryGroupListBySubscriberResultGroupList() {
        return new QueryGroupListBySubscriberResult.GroupList();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequest.PrimaryOffering }
     * 
     */
    public ChangeGroupOfferingRequest.PrimaryOffering createChangeGroupOfferingRequestPrimaryOffering() {
        return new ChangeGroupOfferingRequest.PrimaryOffering();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequest.AddOffering }
     * 
     */
    public ChangeGroupOfferingRequest.AddOffering createChangeGroupOfferingRequestAddOffering() {
        return new ChangeGroupOfferingRequest.AddOffering();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequest.DelOffering }
     * 
     */
    public ChangeGroupOfferingRequest.DelOffering createChangeGroupOfferingRequestDelOffering() {
        return new ChangeGroupOfferingRequest.DelOffering();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingRequest.ModifyOffering }
     * 
     */
    public ChangeGroupOfferingRequest.ModifyOffering createChangeGroupOfferingRequestModifyOffering() {
        return new ChangeGroupOfferingRequest.ModifyOffering();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty createChangeOfferingPropertyRequestOfferingInstProductInstAddProperty() {
        return new ChangeOfferingPropertyRequest.OfferingInst.ProductInst.AddProperty();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty createChangeOfferingPropertyRequestOfferingInstProductInstDelProperty() {
        return new ChangeOfferingPropertyRequest.OfferingInst.ProductInst.DelProperty();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty createChangeOfferingPropertyRequestOfferingInstOfferingInstPropertyAddProperty() {
        return new ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.AddProperty();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty createChangeOfferingPropertyRequestOfferingInstOfferingInstPropertyDelProperty() {
        return new ChangeOfferingPropertyRequest.OfferingInst.OfferingInstProperty.DelProperty();
    }

    /**
     * Create an instance of {@link ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode }
     * 
     */
    public ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode createChangeOfferingPropertyRequestOfferingInstOfferingOwnerAcctAccessCode() {
        return new ChangeOfferingPropertyRequest.OfferingInst.OfferingOwner.AcctAccessCode();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty }
     * 
     */
    public QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty createQueryOfferingInstPropertyResultOfferingInstOfferingInstProperty() {
        return new QueryOfferingInstPropertyResult.OfferingInst.OfferingInstProperty();
    }

    /**
     * Create an instance of {@link QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty }
     * 
     */
    public QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty createQueryOfferingInstPropertyResultOfferingInstProductInstProductInstProperty() {
        return new QueryOfferingInstPropertyResult.OfferingInst.ProductInst.ProductInstProperty();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequest.DelGroupMemberOffering }
     * 
     */
    public DelGroupMemberRequest.DelGroupMemberOffering createDelGroupMemberRequestDelGroupMemberOffering() {
        return new DelGroupMemberRequest.DelGroupMemberOffering();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequest.PaymentRelation.NewDFTAcct }
     * 
     */
    public DelGroupMemberRequest.PaymentRelation.NewDFTAcct createDelGroupMemberRequestPaymentRelationNewDFTAcct() {
        return new DelGroupMemberRequest.PaymentRelation.NewDFTAcct();
    }

    /**
     * Create an instance of {@link DelGroupMemberRequest.PaymentRelation.DelPayRelation }
     * 
     */
    public DelGroupMemberRequest.PaymentRelation.DelPayRelation createDelGroupMemberRequestPaymentRelationDelPayRelation() {
        return new DelGroupMemberRequest.PaymentRelation.DelPayRelation();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberInfoRequest.GroupMember }
     * 
     */
    public ChangeGroupMemberInfoRequest.GroupMember createChangeGroupMemberInfoRequestGroupMember() {
        return new ChangeGroupMemberInfoRequest.GroupMember();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.AddSubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.AddSubIdentity createChangeSubIdentityRequestAddSubIdentity() {
        return new ChangeSubIdentityRequest.AddSubIdentity();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.DelSubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.DelSubIdentity createChangeSubIdentityRequestDelSubIdentity() {
        return new ChangeSubIdentityRequest.DelSubIdentity();
    }

    /**
     * Create an instance of {@link ChangeSubIdentityRequest.ModifySubIdentity }
     * 
     */
    public ChangeSubIdentityRequest.ModifySubIdentity createChangeSubIdentityRequestModifySubIdentity() {
        return new ChangeSubIdentityRequest.ModifySubIdentity();
    }

    /**
     * Create an instance of {@link ChangeGroupOfferingResult.ModifyOffering }
     * 
     */
    public ChangeGroupOfferingResult.ModifyOffering createChangeGroupOfferingResultModifyOffering() {
        return new ChangeGroupOfferingResult.ModifyOffering();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoRequest.QueryObj.SubAccessCode }
     * 
     */
    public QueryCustomerInfoRequest.QueryObj.SubAccessCode createQueryCustomerInfoRequestQueryObjSubAccessCode() {
        return new QueryCustomerInfoRequest.QueryObj.SubAccessCode();
    }

    /**
     * Create an instance of {@link QueryCustomerInfoRequest.QueryObj.AcctAccessCode }
     * 
     */
    public QueryCustomerInfoRequest.QueryObj.AcctAccessCode createQueryCustomerInfoRequestQueryObjAcctAccessCode() {
        return new QueryCustomerInfoRequest.QueryObj.AcctAccessCode();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.GroupMemberOffering }
     * 
     */
    public AddGroupMemberRequest.GroupMemberOffering createAddGroupMemberRequestGroupMemberOffering() {
        return new AddGroupMemberRequest.GroupMemberOffering();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation createAddGroupMemberRequestPaymentRelationAddPayRelationPayRelation() {
        return new AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo createAddGroupMemberRequestPaymentRelationAddPayRelationPaymentLimitPaymentLimitInfo() {
        return new AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo }
     * 
     */
    public AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo createAddGroupMemberRequestPaymentRelationNewDFTAcctPaymentLimitPaymentLimitInfo() {
        return new AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo();
    }

    /**
     * Create an instance of {@link AddGroupMemberRequest.GroupMember.SubInfo }
     * 
     */
    public AddGroupMemberRequest.GroupMember.SubInfo createAddGroupMemberRequestGroupMemberSubInfo() {
        return new AddGroupMemberRequest.GroupMember.SubInfo();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingResult.ModifyOffering }
     * 
     */
    public ChangeGroupMemberOfferingResult.ModifyOffering createChangeGroupMemberOfferingResultModifyOffering() {
        return new ChangeGroupMemberOfferingResult.ModifyOffering();
    }

    /**
     * Create an instance of {@link CreateGroupRequest.RegisterCustomer }
     * 
     */
    public CreateGroupRequest.RegisterCustomer createCreateGroupRequestRegisterCustomer() {
        return new CreateGroupRequest.RegisterCustomer();
    }

    /**
     * Create an instance of {@link CreateGroupRequest.UserCustomer }
     * 
     */
    public CreateGroupRequest.UserCustomer createCreateGroupRequestUserCustomer() {
        return new CreateGroupRequest.UserCustomer();
    }

    /**
     * Create an instance of {@link CreateGroupRequest.Account }
     * 
     */
    public CreateGroupRequest.Account createCreateGroupRequestAccount() {
        return new CreateGroupRequest.Account();
    }

    /**
     * Create an instance of {@link CreateGroupRequest.Group }
     * 
     */
    public CreateGroupRequest.Group createCreateGroupRequestGroup() {
        return new CreateGroupRequest.Group();
    }

    /**
     * Create an instance of {@link CreateGroupRequest.SupplementaryOffering }
     * 
     */
    public CreateGroupRequest.SupplementaryOffering createCreateGroupRequestSupplementaryOffering() {
        return new CreateGroupRequest.SupplementaryOffering();
    }

    /**
     * Create an instance of {@link AcctDeactivationRequest.AcctAccessCode }
     * 
     */
    public AcctDeactivationRequest.AcctAccessCode createAcctDeactivationRequestAcctAccessCode() {
        return new AcctDeactivationRequest.AcctAccessCode();
    }

    /**
     * Create an instance of {@link AcctDeactivationRequest.AdditionalProperty }
     * 
     */
    public AcctDeactivationRequest.AdditionalProperty createAcctDeactivationRequestAdditionalProperty() {
        return new AcctDeactivationRequest.AdditionalProperty();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingRequest.AddOffering }
     * 
     */
    public ChangeGroupMemberOfferingRequest.AddOffering createChangeGroupMemberOfferingRequestAddOffering() {
        return new ChangeGroupMemberOfferingRequest.AddOffering();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingRequest.DelOffering }
     * 
     */
    public ChangeGroupMemberOfferingRequest.DelOffering createChangeGroupMemberOfferingRequestDelOffering() {
        return new ChangeGroupMemberOfferingRequest.DelOffering();
    }

    /**
     * Create an instance of {@link ChangeGroupMemberOfferingRequest.ModifyOffering }
     * 
     */
    public ChangeGroupMemberOfferingRequest.ModifyOffering createChangeGroupMemberOfferingRequestModifyOffering() {
        return new ChangeGroupMemberOfferingRequest.ModifyOffering();
    }

    /**
     * Create an instance of {@link ResultHeader.AdditionalProperty }
     * 
     */
    public ResultHeader.AdditionalProperty createResultHeaderAdditionalProperty() {
        return new ResultHeader.AdditionalProperty();
    }

    /**
     * Create an instance of {@link RequestHeader.TimeFormat }
     * 
     */
    public RequestHeader.TimeFormat createRequestHeaderTimeFormat() {
        return new RequestHeader.TimeFormat();
    }

    /**
     * Create an instance of {@link RequestHeader.AdditionalProperty }
     * 
     */
    public RequestHeader.AdditionalProperty createRequestHeaderAdditionalProperty() {
        return new RequestHeader.AdditionalProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CustLevel", scope = CustBasicInfo.class)
    public JAXBElement<String> createCustBasicInfoCustLevel(String value) {
        return new JAXBElement<String>(_CustBasicInfoCustLevel_QNAME, String.class, CustBasicInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CustLevel", scope = CustomerForBatch.class)
    public JAXBElement<String> createCustomerForBatchCustLevel(String value) {
        return new JAXBElement<String>(_CustBasicInfoCustLevel_QNAME, String.class, CustomerForBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Education", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoEducation(String value) {
        return new JAXBElement<String>(_IndividualInfoEducation_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Race", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoRace(String value) {
        return new JAXBElement<String>(_IndividualInfoRace_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MaritalStatus", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoMaritalStatus(String value) {
        return new JAXBElement<String>(_IndividualInfoMaritalStatus_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Occupation", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoOccupation(String value) {
        return new JAXBElement<String>(_IndividualInfoOccupation_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Salary", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoSalary(String value) {
        return new JAXBElement<String>(_IndividualInfoSalary_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "NativePlace", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoNativePlace(String value) {
        return new JAXBElement<String>(_IndividualInfoNativePlace_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "IDType", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoIDType(String value) {
        return new JAXBElement<String>(_IndividualInfoIDType_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Nationality", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoNationality(String value) {
        return new JAXBElement<String>(_IndividualInfoNationality_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Title", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoTitle(String value) {
        return new JAXBElement<String>(_IndividualInfoTitle_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "Gender", scope = IndividualInfo.class)
    public JAXBElement<String> createIndividualInfoGender(String value) {
        return new JAXBElement<String>(_IndividualInfoGender_QNAME, String.class, IndividualInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "OfferingID", scope = OfferingKey.class)
    public JAXBElement<BigInteger> createOfferingKeyOfferingID(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferingKeyOfferingID_QNAME, BigInteger.class, OfferingKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "IDType", scope = OrgInfo.class)
    public JAXBElement<String> createOrgInfoIDType(String value) {
        return new JAXBElement<String>(_IndividualInfoIDType_QNAME, String.class, OrgInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "UnitType", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<String> createSubscriberConsumptionLimitUnitType(String value) {
        return new JAXBElement<String>(_SubscriberConsumptionLimitUnitType_QNAME, String.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitParam", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam> createSubscriberConsumptionLimitLimitParam(com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam value) {
        return new JAXBElement<com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam>(_SubscriberConsumptionLimitLimitParam_QNAME, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.LimitParam.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MesureType", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitMesureType(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitMesureType_QNAME, BigInteger.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitValue", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<Long> createSubscriberConsumptionLimitLimitValue(Long value) {
        return new JAXBElement<Long>(_SubscriberConsumptionLimitLimitValue_QNAME, Long.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "LimitType", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<String> createSubscriberConsumptionLimitLimitType(String value) {
        return new JAXBElement<String>(_SubscriberConsumptionLimitLimitType_QNAME, String.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "CurrencyID", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitCurrencyID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitCurrencyID_QNAME, BigInteger.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", name = "MesureID", scope = com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class)
    public JAXBElement<BigInteger> createSubscriberConsumptionLimitMesureID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubscriberConsumptionLimitMesureID_QNAME, BigInteger.class, com.huawei.ocs55.bcservices.Subscriber.ConsumptionLimit.class, value);
    }

}
