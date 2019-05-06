
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchOperationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchOperationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchNewSubscriber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Customer" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer" minOccurs="0"/>
 *                   &lt;element name="Subscriber">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic">
 *                           &lt;sequence>
 *                             &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Account" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/>
 *                   &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchDeleteSubscriber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchChgLRN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchSubscribe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
 *                   &lt;element name="Product" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                           &lt;sequence>
 *                             &lt;element name="Service" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchUnSubscribe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
 *                   &lt;element name="Product" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchChangeService" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Service" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service">
 *                           &lt;sequence>
 *                             &lt;element name="OperationType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}OperationType"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchChangeMainProduct" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RemovedProduct" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                           &lt;sequence>
 *                             &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PosAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchModifySubValidity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ModifyType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUSCHGDAYS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="DISCHGDAYS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="UpdateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchModifyVoucherState" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CardFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchReplaceProduct" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchCashRecharge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchVouchRecharge" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchActiveSubscriber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchReleaseBlacklist" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchModifyMainBalance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchManageCUGMember" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UserGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchAjustAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Rtner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyAcctFeeList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ModifyAcctFee" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchChgMSISDN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatchModCallBundle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CallBundle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchOperationRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "batchNewSubscriber",
    "batchDeleteSubscriber",
    "batchChgLRN",
    "batchSubscribe",
    "batchUnSubscribe",
    "batchChangeService",
    "batchChangeMainProduct",
    "batchModifySubValidity",
    "batchModifyVoucherState",
    "batchReplaceProduct",
    "batchCashRecharge",
    "batchVouchRecharge",
    "batchActiveSubscriber",
    "batchReleaseBlacklist",
    "batchModifyMainBalance",
    "batchManageCUGMember",
    "batchAjustAccount",
    "batchChgMSISDN",
    "batchModCallBundle"
})
public class BatchOperationRequest {

    @XmlElement(name = "BatchNewSubscriber")
    protected BatchOperationRequest.BatchNewSubscriber batchNewSubscriber;
    @XmlElement(name = "BatchDeleteSubscriber")
    protected BatchOperationRequest.BatchDeleteSubscriber batchDeleteSubscriber;
    @XmlElement(name = "BatchChgLRN")
    protected BatchOperationRequest.BatchChgLRN batchChgLRN;
    @XmlElement(name = "BatchSubscribe")
    protected BatchOperationRequest.BatchSubscribe batchSubscribe;
    @XmlElement(name = "BatchUnSubscribe")
    protected BatchOperationRequest.BatchUnSubscribe batchUnSubscribe;
    @XmlElement(name = "BatchChangeService")
    protected BatchOperationRequest.BatchChangeService batchChangeService;
    @XmlElement(name = "BatchChangeMainProduct")
    protected BatchOperationRequest.BatchChangeMainProduct batchChangeMainProduct;
    @XmlElement(name = "BatchModifySubValidity")
    protected BatchOperationRequest.BatchModifySubValidity batchModifySubValidity;
    @XmlElement(name = "BatchModifyVoucherState")
    protected BatchOperationRequest.BatchModifyVoucherState batchModifyVoucherState;
    @XmlElement(name = "BatchReplaceProduct")
    protected BatchOperationRequest.BatchReplaceProduct batchReplaceProduct;
    @XmlElement(name = "BatchCashRecharge")
    protected BatchOperationRequest.BatchCashRecharge batchCashRecharge;
    @XmlElement(name = "BatchVouchRecharge")
    protected BatchOperationRequest.BatchVouchRecharge batchVouchRecharge;
    @XmlElement(name = "BatchActiveSubscriber")
    protected BatchOperationRequest.BatchActiveSubscriber batchActiveSubscriber;
    @XmlElement(name = "BatchReleaseBlacklist")
    protected BatchOperationRequest.BatchReleaseBlacklist batchReleaseBlacklist;
    @XmlElement(name = "BatchModifyMainBalance")
    protected BatchOperationRequest.BatchModifyMainBalance batchModifyMainBalance;
    @XmlElement(name = "BatchManageCUGMember")
    protected BatchOperationRequest.BatchManageCUGMember batchManageCUGMember;
    @XmlElement(name = "BatchAjustAccount")
    protected BatchOperationRequest.BatchAjustAccount batchAjustAccount;
    @XmlElement(name = "BatchChgMSISDN")
    protected BatchOperationRequest.BatchChgMSISDN batchChgMSISDN;
    @XmlElement(name = "BatchModCallBundle")
    protected BatchOperationRequest.BatchModCallBundle batchModCallBundle;

    /**
     * Gets the value of the batchNewSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchNewSubscriber }
     *     
     */
    public BatchOperationRequest.BatchNewSubscriber getBatchNewSubscriber() {
        return batchNewSubscriber;
    }

    /**
     * Sets the value of the batchNewSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchNewSubscriber }
     *     
     */
    public void setBatchNewSubscriber(BatchOperationRequest.BatchNewSubscriber value) {
        this.batchNewSubscriber = value;
    }

    /**
     * Gets the value of the batchDeleteSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchDeleteSubscriber }
     *     
     */
    public BatchOperationRequest.BatchDeleteSubscriber getBatchDeleteSubscriber() {
        return batchDeleteSubscriber;
    }

    /**
     * Sets the value of the batchDeleteSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchDeleteSubscriber }
     *     
     */
    public void setBatchDeleteSubscriber(BatchOperationRequest.BatchDeleteSubscriber value) {
        this.batchDeleteSubscriber = value;
    }

    /**
     * Gets the value of the batchChgLRN property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChgLRN }
     *     
     */
    public BatchOperationRequest.BatchChgLRN getBatchChgLRN() {
        return batchChgLRN;
    }

    /**
     * Sets the value of the batchChgLRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChgLRN }
     *     
     */
    public void setBatchChgLRN(BatchOperationRequest.BatchChgLRN value) {
        this.batchChgLRN = value;
    }

    /**
     * Gets the value of the batchSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchSubscribe }
     *     
     */
    public BatchOperationRequest.BatchSubscribe getBatchSubscribe() {
        return batchSubscribe;
    }

    /**
     * Sets the value of the batchSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchSubscribe }
     *     
     */
    public void setBatchSubscribe(BatchOperationRequest.BatchSubscribe value) {
        this.batchSubscribe = value;
    }

    /**
     * Gets the value of the batchUnSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchUnSubscribe }
     *     
     */
    public BatchOperationRequest.BatchUnSubscribe getBatchUnSubscribe() {
        return batchUnSubscribe;
    }

    /**
     * Sets the value of the batchUnSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchUnSubscribe }
     *     
     */
    public void setBatchUnSubscribe(BatchOperationRequest.BatchUnSubscribe value) {
        this.batchUnSubscribe = value;
    }

    /**
     * Gets the value of the batchChangeService property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChangeService }
     *     
     */
    public BatchOperationRequest.BatchChangeService getBatchChangeService() {
        return batchChangeService;
    }

    /**
     * Sets the value of the batchChangeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChangeService }
     *     
     */
    public void setBatchChangeService(BatchOperationRequest.BatchChangeService value) {
        this.batchChangeService = value;
    }

    /**
     * Gets the value of the batchChangeMainProduct property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChangeMainProduct }
     *     
     */
    public BatchOperationRequest.BatchChangeMainProduct getBatchChangeMainProduct() {
        return batchChangeMainProduct;
    }

    /**
     * Sets the value of the batchChangeMainProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChangeMainProduct }
     *     
     */
    public void setBatchChangeMainProduct(BatchOperationRequest.BatchChangeMainProduct value) {
        this.batchChangeMainProduct = value;
    }

    /**
     * Gets the value of the batchModifySubValidity property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModifySubValidity }
     *     
     */
    public BatchOperationRequest.BatchModifySubValidity getBatchModifySubValidity() {
        return batchModifySubValidity;
    }

    /**
     * Sets the value of the batchModifySubValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModifySubValidity }
     *     
     */
    public void setBatchModifySubValidity(BatchOperationRequest.BatchModifySubValidity value) {
        this.batchModifySubValidity = value;
    }

    /**
     * Gets the value of the batchModifyVoucherState property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModifyVoucherState }
     *     
     */
    public BatchOperationRequest.BatchModifyVoucherState getBatchModifyVoucherState() {
        return batchModifyVoucherState;
    }

    /**
     * Sets the value of the batchModifyVoucherState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModifyVoucherState }
     *     
     */
    public void setBatchModifyVoucherState(BatchOperationRequest.BatchModifyVoucherState value) {
        this.batchModifyVoucherState = value;
    }

    /**
     * Gets the value of the batchReplaceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchReplaceProduct }
     *     
     */
    public BatchOperationRequest.BatchReplaceProduct getBatchReplaceProduct() {
        return batchReplaceProduct;
    }

    /**
     * Sets the value of the batchReplaceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchReplaceProduct }
     *     
     */
    public void setBatchReplaceProduct(BatchOperationRequest.BatchReplaceProduct value) {
        this.batchReplaceProduct = value;
    }

    /**
     * Gets the value of the batchCashRecharge property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchCashRecharge }
     *     
     */
    public BatchOperationRequest.BatchCashRecharge getBatchCashRecharge() {
        return batchCashRecharge;
    }

    /**
     * Sets the value of the batchCashRecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchCashRecharge }
     *     
     */
    public void setBatchCashRecharge(BatchOperationRequest.BatchCashRecharge value) {
        this.batchCashRecharge = value;
    }

    /**
     * Gets the value of the batchVouchRecharge property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchVouchRecharge }
     *     
     */
    public BatchOperationRequest.BatchVouchRecharge getBatchVouchRecharge() {
        return batchVouchRecharge;
    }

    /**
     * Sets the value of the batchVouchRecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchVouchRecharge }
     *     
     */
    public void setBatchVouchRecharge(BatchOperationRequest.BatchVouchRecharge value) {
        this.batchVouchRecharge = value;
    }

    /**
     * Gets the value of the batchActiveSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchActiveSubscriber }
     *     
     */
    public BatchOperationRequest.BatchActiveSubscriber getBatchActiveSubscriber() {
        return batchActiveSubscriber;
    }

    /**
     * Sets the value of the batchActiveSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchActiveSubscriber }
     *     
     */
    public void setBatchActiveSubscriber(BatchOperationRequest.BatchActiveSubscriber value) {
        this.batchActiveSubscriber = value;
    }

    /**
     * Gets the value of the batchReleaseBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchReleaseBlacklist }
     *     
     */
    public BatchOperationRequest.BatchReleaseBlacklist getBatchReleaseBlacklist() {
        return batchReleaseBlacklist;
    }

    /**
     * Sets the value of the batchReleaseBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchReleaseBlacklist }
     *     
     */
    public void setBatchReleaseBlacklist(BatchOperationRequest.BatchReleaseBlacklist value) {
        this.batchReleaseBlacklist = value;
    }

    /**
     * Gets the value of the batchModifyMainBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModifyMainBalance }
     *     
     */
    public BatchOperationRequest.BatchModifyMainBalance getBatchModifyMainBalance() {
        return batchModifyMainBalance;
    }

    /**
     * Sets the value of the batchModifyMainBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModifyMainBalance }
     *     
     */
    public void setBatchModifyMainBalance(BatchOperationRequest.BatchModifyMainBalance value) {
        this.batchModifyMainBalance = value;
    }

    /**
     * Gets the value of the batchManageCUGMember property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchManageCUGMember }
     *     
     */
    public BatchOperationRequest.BatchManageCUGMember getBatchManageCUGMember() {
        return batchManageCUGMember;
    }

    /**
     * Sets the value of the batchManageCUGMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchManageCUGMember }
     *     
     */
    public void setBatchManageCUGMember(BatchOperationRequest.BatchManageCUGMember value) {
        this.batchManageCUGMember = value;
    }

    /**
     * Gets the value of the batchAjustAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchAjustAccount }
     *     
     */
    public BatchOperationRequest.BatchAjustAccount getBatchAjustAccount() {
        return batchAjustAccount;
    }

    /**
     * Sets the value of the batchAjustAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchAjustAccount }
     *     
     */
    public void setBatchAjustAccount(BatchOperationRequest.BatchAjustAccount value) {
        this.batchAjustAccount = value;
    }

    /**
     * Gets the value of the batchChgMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchChgMSISDN }
     *     
     */
    public BatchOperationRequest.BatchChgMSISDN getBatchChgMSISDN() {
        return batchChgMSISDN;
    }

    /**
     * Sets the value of the batchChgMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchChgMSISDN }
     *     
     */
    public void setBatchChgMSISDN(BatchOperationRequest.BatchChgMSISDN value) {
        this.batchChgMSISDN = value;
    }

    /**
     * Gets the value of the batchModCallBundle property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModCallBundle }
     *     
     */
    public BatchOperationRequest.BatchModCallBundle getBatchModCallBundle() {
        return batchModCallBundle;
    }

    /**
     * Sets the value of the batchModCallBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModCallBundle }
     *     
     */
    public void setBatchModCallBundle(BatchOperationRequest.BatchModCallBundle value) {
        this.batchModCallBundle = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchActiveSubscriber {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Rtner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyAcctFeeList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ModifyAcctFee" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "operateType",
        "rtner",
        "additionalInfo",
        "spCode",
        "modifyAcctFeeList",
        "validityIncrement",
        "merchant",
        "service"
    })
    public static class BatchAjustAccount {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "OperateType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int operateType;
        @XmlElement(name = "Rtner", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer rtner;
        @XmlElement(name = "AdditionalInfo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String additionalInfo;
        @XmlElement(name = "SPCode", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String spCode;
        @XmlElement(name = "ModifyAcctFeeList", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList modifyAcctFeeList;
        @XmlElement(name = "ValidityIncrement", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer validityIncrement;
        @XmlElement(name = "Merchant", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String merchant;
        @XmlElement(name = "Service", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String service;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the operateType property.
         * 
         */
        public int getOperateType() {
            return operateType;
        }

        /**
         * Sets the value of the operateType property.
         * 
         */
        public void setOperateType(int value) {
            this.operateType = value;
        }

        /**
         * Gets the value of the rtner property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRtner() {
            return rtner;
        }

        /**
         * Sets the value of the rtner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRtner(Integer value) {
            this.rtner = value;
        }

        /**
         * Gets the value of the additionalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfo() {
            return additionalInfo;
        }

        /**
         * Sets the value of the additionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalInfo(String value) {
            this.additionalInfo = value;
        }

        /**
         * Gets the value of the spCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPCode() {
            return spCode;
        }

        /**
         * Sets the value of the spCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPCode(String value) {
            this.spCode = value;
        }

        /**
         * Gets the value of the modifyAcctFeeList property.
         * 
         * @return
         *     possible object is
         *     {@link BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList }
         *     
         */
        public BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList getModifyAcctFeeList() {
            return modifyAcctFeeList;
        }

        /**
         * Sets the value of the modifyAcctFeeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList }
         *     
         */
        public void setModifyAcctFeeList(BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList value) {
            this.modifyAcctFeeList = value;
        }

        /**
         * Gets the value of the validityIncrement property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getValidityIncrement() {
            return validityIncrement;
        }

        /**
         * Sets the value of the validityIncrement property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setValidityIncrement(Integer value) {
            this.validityIncrement = value;
        }

        /**
         * Gets the value of the merchant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchant() {
            return merchant;
        }

        /**
         * Sets the value of the merchant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchant(String value) {
            this.merchant = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setService(String value) {
            this.service = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ModifyAcctFee" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "modifyAcctFee"
        })
        public static class ModifyAcctFeeList {

            @XmlElement(name = "ModifyAcctFee", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected List<BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee> modifyAcctFee;

            /**
             * Gets the value of the modifyAcctFee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modifyAcctFee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getModifyAcctFee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee }
             * 
             * 
             */
            public List<BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee> getModifyAcctFee() {
                if (modifyAcctFee == null) {
                    modifyAcctFee = new ArrayList<BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList.ModifyAcctFee>();
                }
                return this.modifyAcctFee;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class ModifyAcctFee {

                @XmlElement(name = "AccountType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
                protected String accountType;
                @XmlElement(name = "CurrAcctChgAmt", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
                protected long currAcctChgAmt;
                @XmlElement(name = "GLID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
                protected Integer glid;
                @XmlElement(name = "MinMeasureId", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
                protected Integer minMeasureId;
                @XmlElement(name = "ProductID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
                protected String productID;
                @XmlElement(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
                protected String expireTime;

                /**
                 * Gets the value of the accountType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccountType() {
                    return accountType;
                }

                /**
                 * Sets the value of the accountType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccountType(String value) {
                    this.accountType = value;
                }

                /**
                 * Gets the value of the currAcctChgAmt property.
                 * 
                 */
                public long getCurrAcctChgAmt() {
                    return currAcctChgAmt;
                }

                /**
                 * Sets the value of the currAcctChgAmt property.
                 * 
                 */
                public void setCurrAcctChgAmt(long value) {
                    this.currAcctChgAmt = value;
                }

                /**
                 * Gets the value of the glid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getGLID() {
                    return glid;
                }

                /**
                 * Sets the value of the glid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setGLID(Integer value) {
                    this.glid = value;
                }

                /**
                 * Gets the value of the minMeasureId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMinMeasureId() {
                    return minMeasureId;
                }

                /**
                 * Sets the value of the minMeasureId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMinMeasureId(Integer value) {
                    this.minMeasureId = value;
                }

                /**
                 * Gets the value of the productID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductID() {
                    return productID;
                }

                /**
                 * Sets the value of the productID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductID(String value) {
                    this.productID = value;
                }

                /**
                 * Gets the value of the expireTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExpireTime() {
                    return expireTime;
                }

                /**
                 * Sets the value of the expireTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExpireTime(String value) {
                    this.expireTime = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchCashRecharge {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RemovedProduct" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *                 &lt;sequence>
     *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PosAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "newMainProductId",
        "validMode",
        "effectiveDate",
        "product",
        "handlingChargeFlag",
        "removedProduct",
        "newBrandId",
        "ppsAcctCredit",
        "posAcctCredit",
        "ppsAcctInitBal",
        "posAcctInitBal"
    })
    public static class BatchChangeMainProduct {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "NewMainProductId", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String newMainProductId;
        @XmlElement(name = "ValidMode", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String validMode;
        @XmlElement(name = "EffectiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String effectiveDate;
        @XmlElement(name = "Product", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected List<BatchOperationRequest.BatchChangeMainProduct.Product> product;
        @XmlElement(name = "HandlingChargeFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer handlingChargeFlag;
        @XmlElement(name = "RemovedProduct", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected List<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct> removedProduct;
        @XmlElement(name = "NewBrandId", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String newBrandId;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Long ppsAcctCredit;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Long posAcctCredit;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Long ppsAcctInitBal;
        @XmlElement(name = "PosAcctInitBal", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Long posAcctInitBal;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the newMainProductId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewMainProductId() {
            return newMainProductId;
        }

        /**
         * Sets the value of the newMainProductId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewMainProductId(String value) {
            this.newMainProductId = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidMode(String value) {
            this.validMode = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchOperationRequest.BatchChangeMainProduct.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeMainProduct.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchChangeMainProduct.Product>();
            }
            return this.product;
        }

        /**
         * Gets the value of the handlingChargeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHandlingChargeFlag() {
            return handlingChargeFlag;
        }

        /**
         * Sets the value of the handlingChargeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHandlingChargeFlag(Integer value) {
            this.handlingChargeFlag = value;
        }

        /**
         * Gets the value of the removedProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the removedProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemovedProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchOperationRequest.BatchChangeMainProduct.RemovedProduct }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct> getRemovedProduct() {
            if (removedProduct == null) {
                removedProduct = new ArrayList<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct>();
            }
            return this.removedProduct;
        }

        /**
         * Gets the value of the newBrandId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewBrandId() {
            return newBrandId;
        }

        /**
         * Sets the value of the newBrandId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewBrandId(String value) {
            this.newBrandId = value;
        }

        /**
         * Gets the value of the ppsAcctCredit property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPpsAcctCredit() {
            return ppsAcctCredit;
        }

        /**
         * Sets the value of the ppsAcctCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPpsAcctCredit(Long value) {
            this.ppsAcctCredit = value;
        }

        /**
         * Gets the value of the posAcctCredit property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPosAcctCredit() {
            return posAcctCredit;
        }

        /**
         * Sets the value of the posAcctCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPosAcctCredit(Long value) {
            this.posAcctCredit = value;
        }

        /**
         * Gets the value of the ppsAcctInitBal property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPpsAcctInitBal() {
            return ppsAcctInitBal;
        }

        /**
         * Sets the value of the ppsAcctInitBal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPpsAcctInitBal(Long value) {
            this.ppsAcctInitBal = value;
        }

        /**
         * Gets the value of the posAcctInitBal property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPosAcctInitBal() {
            return posAcctInitBal;
        }

        /**
         * Sets the value of the posAcctInitBal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPosAcctInitBal(Long value) {
            this.posAcctInitBal = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Product
            extends com.huawei.ocs55.businessmgr.Product
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
         *       &lt;sequence>
         *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "productOrderKey"
        })
        public static class RemovedProduct
            extends com.huawei.ocs55.businessmgr.Product
        {

            @XmlElement(name = "ProductOrderKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected String productOrderKey;

            /**
             * Gets the value of the productOrderKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductOrderKey() {
                return productOrderKey;
            }

            /**
             * Sets the value of the productOrderKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductOrderKey(String value) {
                this.productOrderKey = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Service" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service">
     *                 &lt;sequence>
     *                   &lt;element name="OperationType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}OperationType"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "service"
    })
    public static class BatchChangeService {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "Service", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected List<BatchOperationRequest.BatchChangeService.Service> service;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchOperationRequest.BatchChangeService.Service }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchChangeService.Service> getService() {
            if (service == null) {
                service = new ArrayList<BatchOperationRequest.BatchChangeService.Service>();
            }
            return this.service;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service">
         *       &lt;sequence>
         *         &lt;element name="OperationType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}OperationType"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "operationType"
        })
        public static class Service
            extends com.huawei.ocs55.businessmgr.Service
        {

            @XmlElement(name = "OperationType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String operationType;

            /**
             * Gets the value of the operationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationType() {
                return operationType;
            }

            /**
             * Sets the value of the operationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationType(String value) {
                this.operationType = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "mode"
    })
    public static class BatchChgLRN {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "Mode", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int mode;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the mode property.
         * 
         */
        public int getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         */
        public void setMode(int value) {
            this.mode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchChgMSISDN {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchDeleteSubscriber {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UserGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "userGroupID"
    })
    public static class BatchManageCUGMember {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "UserGroupID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int userGroupID;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the userGroupID property.
         * 
         */
        public int getUserGroupID() {
            return userGroupID;
        }

        /**
         * Sets the value of the userGroupID property.
         * 
         */
        public void setUserGroupID(int value) {
            this.userGroupID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CallBundle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "callBundle",
        "fileName"
    })
    public static class BatchModCallBundle {

        @XmlElement(name = "CallBundle", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String callBundle;
        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the callBundle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallBundle() {
            return callBundle;
        }

        /**
         * Sets the value of the callBundle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallBundle(String value) {
            this.callBundle = value;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "flag",
        "accountType"
    })
    public static class BatchModifyMainBalance {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "Flag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer flag;
        @XmlElement(name = "AccountType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer accountType;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the flag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFlag() {
            return flag;
        }

        /**
         * Sets the value of the flag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFlag(Integer value) {
            this.flag = value;
        }

        /**
         * Gets the value of the accountType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAccountType() {
            return accountType;
        }

        /**
         * Sets the value of the accountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAccountType(Integer value) {
            this.accountType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ModifyType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUSCHGDAYS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="DISCHGDAYS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="UpdateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "validityIncrement",
        "modifyType",
        "operationDes",
        "suschgdays",
        "dischgdays",
        "updateType"
    })
    public static class BatchModifySubValidity {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "ValidityIncrement", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int validityIncrement;
        @XmlElement(name = "ModifyType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer modifyType;
        @XmlElement(name = "OperationDes", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String operationDes;
        @XmlElement(name = "SUSCHGDAYS", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer suschgdays;
        @XmlElement(name = "DISCHGDAYS", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer dischgdays;
        @XmlElement(name = "UpdateType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer updateType;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the validityIncrement property.
         * 
         */
        public int getValidityIncrement() {
            return validityIncrement;
        }

        /**
         * Sets the value of the validityIncrement property.
         * 
         */
        public void setValidityIncrement(int value) {
            this.validityIncrement = value;
        }

        /**
         * Gets the value of the modifyType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getModifyType() {
            return modifyType;
        }

        /**
         * Sets the value of the modifyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setModifyType(Integer value) {
            this.modifyType = value;
        }

        /**
         * Gets the value of the operationDes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDes() {
            return operationDes;
        }

        /**
         * Sets the value of the operationDes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDes(String value) {
            this.operationDes = value;
        }

        /**
         * Gets the value of the suschgdays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSUSCHGDAYS() {
            return suschgdays;
        }

        /**
         * Sets the value of the suschgdays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSUSCHGDAYS(Integer value) {
            this.suschgdays = value;
        }

        /**
         * Gets the value of the dischgdays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDISCHGDAYS() {
            return dischgdays;
        }

        /**
         * Sets the value of the dischgdays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDISCHGDAYS(Integer value) {
            this.dischgdays = value;
        }

        /**
         * Gets the value of the updateType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getUpdateType() {
            return updateType;
        }

        /**
         * Sets the value of the updateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setUpdateType(Integer value) {
            this.updateType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "cardFlag",
        "operationDes"
    })
    public static class BatchModifyVoucherState {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "CardFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int cardFlag;
        @XmlElement(name = "OperationDes", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String operationDes;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the cardFlag property.
         * 
         */
        public int getCardFlag() {
            return cardFlag;
        }

        /**
         * Sets the value of the cardFlag property.
         * 
         */
        public void setCardFlag(int value) {
            this.cardFlag = value;
        }

        /**
         * Gets the value of the operationDes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDes() {
            return operationDes;
        }

        /**
         * Sets the value of the operationDes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDes(String value) {
            this.operationDes = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Customer" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer" minOccurs="0"/>
     *         &lt;element name="Subscriber">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic">
     *                 &lt;sequence>
     *                   &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Account" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/>
     *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "customer",
        "subscriber",
        "account",
        "product"
    })
    public static class BatchNewSubscriber {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "Customer", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected IndividualCustomer customer;
        @XmlElement(name = "Subscriber", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected BatchOperationRequest.BatchNewSubscriber.Subscriber subscriber;
        @XmlElement(name = "Account", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Account account;
        @XmlElement(name = "Product", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected List<com.huawei.ocs55.businessmgr.Product> product;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualCustomer }
         *     
         */
        public IndividualCustomer getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualCustomer }
         *     
         */
        public void setCustomer(IndividualCustomer value) {
            this.customer = value;
        }

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link BatchOperationRequest.BatchNewSubscriber.Subscriber }
         *     
         */
        public BatchOperationRequest.BatchNewSubscriber.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BatchOperationRequest.BatchNewSubscriber.Subscriber }
         *     
         */
        public void setSubscriber(BatchOperationRequest.BatchNewSubscriber.Subscriber value) {
            this.subscriber = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link Account }
         *     
         */
        public Account getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link Account }
         *     
         */
        public void setAccount(Account value) {
            this.account = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.huawei.ocs55.businessmgr.Product }
         * 
         * 
         */
        public List<com.huawei.ocs55.businessmgr.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<com.huawei.ocs55.businessmgr.Product>();
            }
            return this.product;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic">
         *       &lt;sequence>
         *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cbpid",
            "scpid",
            "password"
        })
        public static class Subscriber
            extends SubscriberBasic
        {

            @XmlElement(name = "CBPID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected Integer cbpid;
            @XmlElement(name = "SCPID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected Integer scpid;
            @XmlElement(name = "Password", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected String password;

            /**
             * Gets the value of the cbpid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCBPID() {
                return cbpid;
            }

            /**
             * Sets the value of the cbpid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCBPID(Integer value) {
                this.cbpid = value;
            }

            /**
             * Gets the value of the scpid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSCPID() {
                return scpid;
            }

            /**
             * Sets the value of the scpid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSCPID(Integer value) {
                this.scpid = value;
            }

            /**
             * Gets the value of the password property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "operationType"
    })
    public static class BatchReleaseBlacklist {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "OperationType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer operationType;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOperationType(Integer value) {
            this.operationType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchReplaceProduct {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
     *         &lt;element name="Product" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *                 &lt;sequence>
     *                   &lt;element name="Service" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "effectiveDate",
        "expireDate",
        "validMode",
        "product",
        "handlingChargeFlag"
    })
    public static class BatchSubscribe {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "EffectiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String expireDate;
        @XmlElement(name = "ValidMode", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String validMode;
        @XmlElement(name = "Product", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected List<BatchOperationRequest.BatchSubscribe.Product> product;
        @XmlElement(name = "HandlingChargeFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer handlingChargeFlag;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidMode(String value) {
            this.validMode = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchOperationRequest.BatchSubscribe.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchSubscribe.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchSubscribe.Product>();
            }
            return this.product;
        }

        /**
         * Gets the value of the handlingChargeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHandlingChargeFlag() {
            return handlingChargeFlag;
        }

        /**
         * Sets the value of the handlingChargeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHandlingChargeFlag(Integer value) {
            this.handlingChargeFlag = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
         *       &lt;sequence>
         *         &lt;element name="Service" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "service"
        })
        public static class Product
            extends com.huawei.ocs55.businessmgr.Product
        {

            @XmlElement(name = "Service", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected List<com.huawei.ocs55.businessmgr.Service> service;

            /**
             * Gets the value of the service property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the service property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link com.huawei.ocs55.businessmgr.Service }
             * 
             * 
             */
            public List<com.huawei.ocs55.businessmgr.Service> getService() {
                if (service == null) {
                    service = new ArrayList<com.huawei.ocs55.businessmgr.Service>();
                }
                return this.service;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
     *         &lt;element name="Product" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName",
        "expireDate",
        "validMode",
        "product"
    })
    public static class BatchUnSubscribe {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;
        @XmlElement(name = "ExpireDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String expireDate;
        @XmlElement(name = "ValidMode", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String validMode;
        @XmlElement(name = "Product", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected List<BatchOperationRequest.BatchUnSubscribe.Product> product;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidMode(String value) {
            this.validMode = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchOperationRequest.BatchUnSubscribe.Product }
         * 
         * 
         */
        public List<BatchOperationRequest.BatchUnSubscribe.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<BatchOperationRequest.BatchUnSubscribe.Product>();
            }
            return this.product;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "productID",
            "productOrderKey",
            "service"
        })
        public static class Product {

            @XmlElement(name = "ProductID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String productID;
            @XmlElement(name = "ProductOrderKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected String productOrderKey;
            @XmlElement(name = "Service", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected List<BatchOperationRequest.BatchUnSubscribe.Product.Service> service;

            /**
             * Gets the value of the productID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * Sets the value of the productID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * Gets the value of the productOrderKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductOrderKey() {
                return productOrderKey;
            }

            /**
             * Sets the value of the productOrderKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductOrderKey(String value) {
                this.productOrderKey = value;
            }

            /**
             * Gets the value of the service property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the service property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BatchOperationRequest.BatchUnSubscribe.Product.Service }
             * 
             * 
             */
            public List<BatchOperationRequest.BatchUnSubscribe.Product.Service> getService() {
                if (service == null) {
                    service = new ArrayList<BatchOperationRequest.BatchUnSubscribe.Product.Service>();
                }
                return this.service;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "simpleProperty"
            })
            public static class Service {

                @XmlElement(name = "Id", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
                protected String id;
                @XmlElement(name = "SimpleProperty", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
                protected List<SimpleProperty> simpleProperty;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the simpleProperty property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSimpleProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SimpleProperty }
                 * 
                 * 
                 */
                public List<SimpleProperty> getSimpleProperty() {
                    if (simpleProperty == null) {
                        simpleProperty = new ArrayList<SimpleProperty>();
                    }
                    return this.simpleProperty;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileName"
    })
    public static class BatchVouchRecharge {

        @XmlElement(name = "FileName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String fileName;

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

    }

}
