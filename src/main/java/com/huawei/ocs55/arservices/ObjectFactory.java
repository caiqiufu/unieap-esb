
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.ocs55.arservices package. 
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

    private final static QName _LoanResultLoanInterestAmt_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/arservices", "LoanInterestAmt");
    private final static QName _QueryOCSBalanceResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginPlanID_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/arservices", "PlanID");
    private final static QName _OfferingKeyOfferingID_QNAME = new QName("http://cbs.huawei.com/ar/wsservice/arcommon", "OfferingID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.ocs55.arservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcctBalance }
     * 
     */
    public AcctBalance createAcctBalance() {
        return new AcctBalance();
    }

    /**
     * Create an instance of {@link AcctBalance.BalanceDetail }
     * 
     */
    public AcctBalance.BalanceDetail createAcctBalanceBalanceDetail() {
        return new AcctBalance.BalanceDetail();
    }

    /**
     * Create an instance of {@link BalanceAdjustment }
     * 
     */
    public BalanceAdjustment createBalanceAdjustment() {
        return new BalanceAdjustment();
    }

    /**
     * Create an instance of {@link AdjustmentRequest }
     * 
     */
    public AdjustmentRequest createAdjustmentRequest() {
        return new AdjustmentRequest();
    }

    /**
     * Create an instance of {@link AdjustmentRequest.AdjustmentObj }
     * 
     */
    public AdjustmentRequest.AdjustmentObj createAdjustmentRequestAdjustmentObj() {
        return new AdjustmentRequest.AdjustmentObj();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceRequest }
     * 
     */
    public QueryOCSBalanceRequest createQueryOCSBalanceRequest() {
        return new QueryOCSBalanceRequest();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest }
     * 
     */
    public TransferBalanceRequest createTransferBalanceRequest() {
        return new TransferBalanceRequest();
    }

    /**
     * Create an instance of {@link TransferBalanceResult }
     * 
     */
    public TransferBalanceResult createTransferBalanceResult() {
        return new TransferBalanceResult();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferee }
     * 
     */
    public TransferBalanceResult.Transferee createTransferBalanceResultTransferee() {
        return new TransferBalanceResult.Transferee();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferee.LifeCycleChgInfo }
     * 
     */
    public TransferBalanceResult.Transferee.LifeCycleChgInfo createTransferBalanceResultTransfereeLifeCycleChgInfo() {
        return new TransferBalanceResult.Transferee.LifeCycleChgInfo();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferor }
     * 
     */
    public TransferBalanceResult.Transferor createTransferBalanceResultTransferor() {
        return new TransferBalanceResult.Transferor();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferor.LifeCycleChgInfo }
     * 
     */
    public TransferBalanceResult.Transferor.LifeCycleChgInfo createTransferBalanceResultTransferorLifeCycleChgInfo() {
        return new TransferBalanceResult.Transferor.LifeCycleChgInfo();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult }
     * 
     */
    public QueryLoanLogResult createQueryLoanLogResult() {
        return new QueryLoanLogResult();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult.LoanLogDetail }
     * 
     */
    public QueryLoanLogResult.LoanLogDetail createQueryLoanLogResultLoanLogDetail() {
        return new QueryLoanLogResult.LoanLogDetail();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult.LoanLogSummary }
     * 
     */
    public QueryLoanLogResult.LoanLogSummary createQueryLoanLogResultLoanLogSummary() {
        return new QueryLoanLogResult.LoanLogSummary();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult }
     * 
     */
    public QueryOCSBalanceResult createQueryOCSBalanceResult() {
        return new QueryOCSBalanceResult();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.FreeUnitItem }
     * 
     */
    public QueryOCSBalanceResult.FreeUnitItem createQueryOCSBalanceResultFreeUnitItem() {
        return new QueryOCSBalanceResult.FreeUnitItem();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail }
     * 
     */
    public QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail createQueryOCSBalanceResultFreeUnitItemFreeUnitItemDetail() {
        return new QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin }
     * 
     */
    public QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin createQueryOCSBalanceResultFreeUnitItemFreeUnitItemDetailFreeUnitOrigin() {
        return new QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.AcctList }
     * 
     */
    public QueryOCSBalanceResult.AcctList createQueryOCSBalanceResultAcctList() {
        return new QueryOCSBalanceResult.AcctList();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.AcctList.AccountCredit }
     * 
     */
    public QueryOCSBalanceResult.AcctList.AccountCredit createQueryOCSBalanceResultAcctListAccountCredit() {
        return new QueryOCSBalanceResult.AcctList.AccountCredit();
    }

    /**
     * Create an instance of {@link ResultHeader }
     * 
     */
    public ResultHeader createResultHeader() {
        return new ResultHeader();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResultMsg }
     * 
     */
    public QueryOCSBalanceResultMsg createQueryOCSBalanceResultMsg() {
        return new QueryOCSBalanceResultMsg();
    }

    /**
     * Create an instance of {@link LoanRequestMsg }
     * 
     */
    public LoanRequestMsg createLoanRequestMsg() {
        return new LoanRequestMsg();
    }

    /**
     * Create an instance of {@link LoanRequest }
     * 
     */
    public LoanRequest createLoanRequest() {
        return new LoanRequest();
    }

    /**
     * Create an instance of {@link LoanResultMsg }
     * 
     */
    public LoanResultMsg createLoanResultMsg() {
        return new LoanResultMsg();
    }

    /**
     * Create an instance of {@link LoanResult }
     * 
     */
    public LoanResult createLoanResult() {
        return new LoanResult();
    }

    /**
     * Create an instance of {@link QueryLoanLogRequestMsg }
     * 
     */
    public QueryLoanLogRequestMsg createQueryLoanLogRequestMsg() {
        return new QueryLoanLogRequestMsg();
    }

    /**
     * Create an instance of {@link QueryLoanLogRequest }
     * 
     */
    public QueryLoanLogRequest createQueryLoanLogRequest() {
        return new QueryLoanLogRequest();
    }

    /**
     * Create an instance of {@link QueryLoanLogResultMsg }
     * 
     */
    public QueryLoanLogResultMsg createQueryLoanLogResultMsg() {
        return new QueryLoanLogResultMsg();
    }

    /**
     * Create an instance of {@link TransferBalanceResultMsg }
     * 
     */
    public TransferBalanceResultMsg createTransferBalanceResultMsg() {
        return new TransferBalanceResultMsg();
    }

    /**
     * Create an instance of {@link TransferBalanceRequestMsg }
     * 
     */
    public TransferBalanceRequestMsg createTransferBalanceRequestMsg() {
        return new TransferBalanceRequestMsg();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceRequestMsg }
     * 
     */
    public QueryOCSBalanceRequestMsg createQueryOCSBalanceRequestMsg() {
        return new QueryOCSBalanceRequestMsg();
    }

    /**
     * Create an instance of {@link AdjustmentResultMsg }
     * 
     */
    public AdjustmentResultMsg createAdjustmentResultMsg() {
        return new AdjustmentResultMsg();
    }

    /**
     * Create an instance of {@link AdjustmentResult }
     * 
     */
    public AdjustmentResult createAdjustmentResult() {
        return new AdjustmentResult();
    }

    /**
     * Create an instance of {@link AdjustmentRequestMsg }
     * 
     */
    public AdjustmentRequestMsg createAdjustmentRequestMsg() {
        return new AdjustmentRequestMsg();
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
     * Create an instance of {@link SubAccessCode }
     * 
     */
    public SubAccessCode createSubAccessCode() {
        return new SubAccessCode();
    }

    /**
     * Create an instance of {@link BalanceChgInfo }
     * 
     */
    public BalanceChgInfo createBalanceChgInfo() {
        return new BalanceChgInfo();
    }

    /**
     * Create an instance of {@link FeeDetailValue }
     * 
     */
    public FeeDetailValue createFeeDetailValue() {
        return new FeeDetailValue();
    }

    /**
     * Create an instance of {@link BonusOffering }
     * 
     */
    public BonusOffering createBonusOffering() {
        return new BonusOffering();
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
     * Create an instance of {@link com.huawei.ocs55.arservices.AcctAccessCode }
     * 
     */
    public com.huawei.ocs55.arservices.AcctAccessCode createAcctAccessCode() {
        return new com.huawei.ocs55.arservices.AcctAccessCode();
    }

    /**
     * Create an instance of {@link SubAccessCodeWithAuth }
     * 
     */
    public SubAccessCodeWithAuth createSubAccessCodeWithAuth() {
        return new SubAccessCodeWithAuth();
    }

    /**
     * Create an instance of {@link FeeDetailValue2 }
     * 
     */
    public FeeDetailValue2 createFeeDetailValue2() {
        return new FeeDetailValue2();
    }

    /**
     * Create an instance of {@link CustAccessCode }
     * 
     */
    public CustAccessCode createCustAccessCode() {
        return new CustAccessCode();
    }

    /**
     * Create an instance of {@link PaymentDetailValue }
     * 
     */
    public PaymentDetailValue createPaymentDetailValue() {
        return new PaymentDetailValue();
    }

    /**
     * Create an instance of {@link AcctAccessCodeWithAuth }
     * 
     */
    public AcctAccessCodeWithAuth createAcctAccessCodeWithAuth() {
        return new AcctAccessCodeWithAuth();
    }

    /**
     * Create an instance of {@link OfferingInfo }
     * 
     */
    public OfferingInfo createOfferingInfo() {
        return new OfferingInfo();
    }

    /**
     * Create an instance of {@link MainAcctBalance }
     * 
     */
    public MainAcctBalance createMainAcctBalance() {
        return new MainAcctBalance();
    }

    /**
     * Create an instance of {@link CreditChgInfo }
     * 
     */
    public CreditChgInfo createCreditChgInfo() {
        return new CreditChgInfo();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link ChargeDetailValue }
     * 
     */
    public ChargeDetailValue createChargeDetailValue() {
        return new ChargeDetailValue();
    }

    /**
     * Create an instance of {@link LoanChgInfo }
     * 
     */
    public LoanChgInfo createLoanChgInfo() {
        return new LoanChgInfo();
    }

    /**
     * Create an instance of {@link SubGroupAccessCode }
     * 
     */
    public SubGroupAccessCode createSubGroupAccessCode() {
        return new SubGroupAccessCode();
    }

    /**
     * Create an instance of {@link com.huawei.ocs55.arservices.OfferingKey }
     * 
     */
    public com.huawei.ocs55.arservices.OfferingKey createOfferingKey() {
        return new com.huawei.ocs55.arservices.OfferingKey();
    }

    /**
     * Create an instance of {@link SimpleProperty }
     * 
     */
    public SimpleProperty createSimpleProperty() {
        return new SimpleProperty();
    }

    /**
     * Create an instance of {@link AcctBalance.BalanceDetail.AcctBalOriginal }
     * 
     */
    public AcctBalance.BalanceDetail.AcctBalOriginal createAcctBalanceBalanceDetailAcctBalOriginal() {
        return new AcctBalance.BalanceDetail.AcctBalOriginal();
    }

    /**
     * Create an instance of {@link BalanceAdjustment.Owner }
     * 
     */
    public BalanceAdjustment.Owner createBalanceAdjustmentOwner() {
        return new BalanceAdjustment.Owner();
    }

    /**
     * Create an instance of {@link AdjustmentRequest.FreeUnitAdjustmentInfo }
     * 
     */
    public AdjustmentRequest.FreeUnitAdjustmentInfo createAdjustmentRequestFreeUnitAdjustmentInfo() {
        return new AdjustmentRequest.FreeUnitAdjustmentInfo();
    }

    /**
     * Create an instance of {@link AdjustmentRequest.InvoiceInfo }
     * 
     */
    public AdjustmentRequest.InvoiceInfo createAdjustmentRequestInvoiceInfo() {
        return new AdjustmentRequest.InvoiceInfo();
    }

    /**
     * Create an instance of {@link AdjustmentRequest.AdjustmentObj.AcctAccessCode }
     * 
     */
    public AdjustmentRequest.AdjustmentObj.AcctAccessCode createAdjustmentRequestAdjustmentObjAcctAccessCode() {
        return new AdjustmentRequest.AdjustmentObj.AcctAccessCode();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceRequest.QueryObj }
     * 
     */
    public QueryOCSBalanceRequest.QueryObj createQueryOCSBalanceRequestQueryObj() {
        return new QueryOCSBalanceRequest.QueryObj();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.TransferorObj }
     * 
     */
    public TransferBalanceRequest.TransferorObj createTransferBalanceRequestTransferorObj() {
        return new TransferBalanceRequest.TransferorObj();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.TransfereeObj }
     * 
     */
    public TransferBalanceRequest.TransfereeObj createTransferBalanceRequestTransfereeObj() {
        return new TransferBalanceRequest.TransfereeObj();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.TransferorAcct }
     * 
     */
    public TransferBalanceRequest.TransferorAcct createTransferBalanceRequestTransferorAcct() {
        return new TransferBalanceRequest.TransferorAcct();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.TransfereeAcct }
     * 
     */
    public TransferBalanceRequest.TransfereeAcct createTransferBalanceRequestTransfereeAcct() {
        return new TransferBalanceRequest.TransfereeAcct();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.FreeUnitTransferorInfo }
     * 
     */
    public TransferBalanceRequest.FreeUnitTransferorInfo createTransferBalanceRequestFreeUnitTransferorInfo() {
        return new TransferBalanceRequest.FreeUnitTransferorInfo();
    }

    /**
     * Create an instance of {@link TransferBalanceRequest.CreditTransferorInfo }
     * 
     */
    public TransferBalanceRequest.CreditTransferorInfo createTransferBalanceRequestCreditTransferorInfo() {
        return new TransferBalanceRequest.CreditTransferorInfo();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus }
     * 
     */
    public TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus createTransferBalanceResultTransfereeLifeCycleChgInfoOldLifeCycleStatus() {
        return new TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus }
     * 
     */
    public TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus createTransferBalanceResultTransfereeLifeCycleChgInfoNewLifeCycleStatus() {
        return new TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus }
     * 
     */
    public TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus createTransferBalanceResultTransferorLifeCycleChgInfoOldLifeCycleStatus() {
        return new TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus();
    }

    /**
     * Create an instance of {@link TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus }
     * 
     */
    public TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus createTransferBalanceResultTransferorLifeCycleChgInfoNewLifeCycleStatus() {
        return new TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult.RepaymentLogDetail }
     * 
     */
    public QueryLoanLogResult.RepaymentLogDetail createQueryLoanLogResultRepaymentLogDetail() {
        return new QueryLoanLogResult.RepaymentLogDetail();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult.LoanLogDetail.AdditionalProperty }
     * 
     */
    public QueryLoanLogResult.LoanLogDetail.AdditionalProperty createQueryLoanLogResultLoanLogDetailAdditionalProperty() {
        return new QueryLoanLogResult.LoanLogDetail.AdditionalProperty();
    }

    /**
     * Create an instance of {@link QueryLoanLogResult.LoanLogSummary.AdditionalProperty }
     * 
     */
    public QueryLoanLogResult.LoanLogSummary.AdditionalProperty createQueryLoanLogResultLoanLogSummaryAdditionalProperty() {
        return new QueryLoanLogResult.LoanLogSummary.AdditionalProperty();
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
     * Create an instance of {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey }
     * 
     */
    public QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey createQueryOCSBalanceResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginOfferingKey() {
        return new QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey();
    }

    /**
     * Create an instance of {@link QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo }
     * 
     */
    public QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo createQueryOCSBalanceResultAcctListAccountCreditCreditAmountInfo() {
        return new QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo();
    }

    /**
     * Create an instance of {@link ResultHeader.AdditionalProperty }
     * 
     */
    public ResultHeader.AdditionalProperty createResultHeaderAdditionalProperty() {
        return new ResultHeader.AdditionalProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/arservices", name = "LoanInterestAmt", scope = LoanResult.class)
    public JAXBElement<Long> createLoanResultLoanInterestAmt(Long value) {
        return new JAXBElement<Long>(_LoanResultLoanInterestAmt_QNAME, Long.class, LoanResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/arservices", name = "PlanID", scope = QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.class)
    public JAXBElement<Long> createQueryOCSBalanceResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginPlanID(Long value) {
        return new JAXBElement<Long>(_QueryOCSBalanceResultFreeUnitItemFreeUnitItemDetailFreeUnitOriginPlanID_QNAME, Long.class, QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cbs.huawei.com/ar/wsservice/arcommon", name = "OfferingID", scope = com.huawei.ocs55.arservices.OfferingKey.class)
    public JAXBElement<BigInteger> createOfferingKeyOfferingID(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferingKeyOfferingID_QNAME, BigInteger.class, com.huawei.ocs55.arservices.OfferingKey.class, value);
    }

}
