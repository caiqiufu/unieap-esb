
package com.huawei.ocs12.businessmgrservice;

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
 *         &lt;element name="BatchManageCUGMember" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UserGroupID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *                   &lt;element name="AddAccIndpndt" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}AddAccIndpndt" minOccurs="0"/>
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
 *         &lt;element name="BatchModAcctExt" minOccurs="0">
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
 *         &lt;element name="BatchMultiSubscriberBand" minOccurs="0">
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
 *         &lt;element name="BatchManPromotionPlan" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchOperationRequest", propOrder = {
    "batchNewSubscriber",
    "batchDeleteSubscriber",
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
    "batchManageCUGMember",
    "batchAjustAccount",
    "batchModAcctExt",
    "batchMultiSubscriberBand",
    "batchManPromotionPlan"
})
public class BatchOperationRequest {

    @XmlElement(name = "BatchNewSubscriber")
    protected BatchOperationRequest.BatchNewSubscriber batchNewSubscriber;
    @XmlElement(name = "BatchDeleteSubscriber")
    protected BatchOperationRequest.BatchDeleteSubscriber batchDeleteSubscriber;
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
    @XmlElement(name = "BatchManageCUGMember")
    protected BatchOperationRequest.BatchManageCUGMember batchManageCUGMember;
    @XmlElement(name = "BatchAjustAccount")
    protected BatchOperationRequest.BatchAjustAccount batchAjustAccount;
    @XmlElement(name = "BatchModAcctExt")
    protected BatchOperationRequest.BatchModAcctExt batchModAcctExt;
    @XmlElement(name = "BatchMultiSubscriberBand")
    protected BatchOperationRequest.BatchMultiSubscriberBand batchMultiSubscriberBand;
    @XmlElement(name = "BatchManPromotionPlan")
    protected BatchOperationRequest.BatchManPromotionPlan batchManPromotionPlan;

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
     * Gets the value of the batchModAcctExt property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchModAcctExt }
     *     
     */
    public BatchOperationRequest.BatchModAcctExt getBatchModAcctExt() {
        return batchModAcctExt;
    }

    /**
     * Sets the value of the batchModAcctExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchModAcctExt }
     *     
     */
    public void setBatchModAcctExt(BatchOperationRequest.BatchModAcctExt value) {
        this.batchModAcctExt = value;
    }

    /**
     * Gets the value of the batchMultiSubscriberBand property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchMultiSubscriberBand }
     *     
     */
    public BatchOperationRequest.BatchMultiSubscriberBand getBatchMultiSubscriberBand() {
        return batchMultiSubscriberBand;
    }

    /**
     * Sets the value of the batchMultiSubscriberBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchMultiSubscriberBand }
     *     
     */
    public void setBatchMultiSubscriberBand(BatchOperationRequest.BatchMultiSubscriberBand value) {
        this.batchMultiSubscriberBand = value;
    }

    /**
     * Gets the value of the batchManPromotionPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOperationRequest.BatchManPromotionPlan }
     *     
     */
    public BatchOperationRequest.BatchManPromotionPlan getBatchManPromotionPlan() {
        return batchManPromotionPlan;
    }

    /**
     * Sets the value of the batchManPromotionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOperationRequest.BatchManPromotionPlan }
     *     
     */
    public void setBatchManPromotionPlan(BatchOperationRequest.BatchManPromotionPlan value) {
        this.batchManPromotionPlan = value;
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

        @XmlElement(name = "FileName", required = true)
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
     *         &lt;element name="AddAccIndpndt" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}AddAccIndpndt" minOccurs="0"/>
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
        "addAccIndpndt",
        "additionalInfo",
        "spCode",
        "modifyAcctFeeList",
        "validityIncrement",
        "merchant",
        "service"
    })
    public static class BatchAjustAccount {

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "OperateType")
        protected int operateType;
        @XmlElement(name = "Rtner")
        protected Integer rtner;
        @XmlElement(name = "AddAccIndpndt")
        protected Integer addAccIndpndt;
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;
        @XmlElement(name = "SPCode")
        protected String spCode;
        @XmlElement(name = "ModifyAcctFeeList", required = true)
        protected BatchOperationRequest.BatchAjustAccount.ModifyAcctFeeList modifyAcctFeeList;
        @XmlElement(name = "ValidityIncrement")
        protected Integer validityIncrement;
        @XmlElement(name = "Merchant")
        protected String merchant;
        @XmlElement(name = "Service")
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
         * Gets the value of the addAccIndpndt property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAddAccIndpndt() {
            return addAccIndpndt;
        }

        /**
         * Sets the value of the addAccIndpndt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAddAccIndpndt(Integer value) {
            this.addAccIndpndt = value;
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

            @XmlElement(name = "ModifyAcctFee", required = true)
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

                @XmlElement(name = "AccountType", required = true)
                protected String accountType;
                @XmlElement(name = "CurrAcctChgAmt")
                protected long currAcctChgAmt;
                @XmlElement(name = "GLID")
                protected Integer glid;
                @XmlElement(name = "MinMeasureId")
                protected Integer minMeasureId;
                @XmlElement(name = "ProductID")
                protected String productID;
                @XmlElement(name = "ExpireTime")
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

        @XmlElement(name = "FileName", required = true)
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "NewMainProductId", required = true)
        protected String newMainProductId;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "Product")
        protected List<BatchOperationRequest.BatchChangeMainProduct.Product> product;
        @XmlElement(name = "HandlingChargeFlag")
        protected Integer handlingChargeFlag;
        @XmlElement(name = "RemovedProduct")
        protected List<BatchOperationRequest.BatchChangeMainProduct.RemovedProduct> removedProduct;
        @XmlElement(name = "NewBrandId")
        protected String newBrandId;
        protected Long ppsAcctCredit;
        protected Long posAcctCredit;
        protected Long ppsAcctInitBal;
        @XmlElement(name = "PosAcctInitBal")
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
            extends com.huawei.ocs12.businessmgrservice.Product
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
            extends com.huawei.ocs12.businessmgrservice.Product
        {

            @XmlElement(name = "ProductOrderKey")
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "Service", required = true)
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
            extends com.huawei.ocs12.businessmgrservice.Service
        {

            @XmlElement(name = "OperationType", required = true)
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

        @XmlElement(name = "FileName", required = true)
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
    public static class BatchManPromotionPlan {

        @XmlElement(name = "FileName", required = true)
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
        "userGroupID",
        "operationType"
    })
    public static class BatchManageCUGMember {

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "UserGroupID")
        protected int userGroupID;
        @XmlElement(name = "OperationType")
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
    public static class BatchModAcctExt {

        @XmlElement(name = "FileName", required = true)
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
        "operationDes"
    })
    public static class BatchModifySubValidity {

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "ValidityIncrement")
        protected int validityIncrement;
        @XmlElement(name = "ModifyType")
        protected Integer modifyType;
        @XmlElement(name = "OperationDes")
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "CardFlag")
        protected int cardFlag;
        @XmlElement(name = "OperationDes")
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
    public static class BatchMultiSubscriberBand {

        @XmlElement(name = "FileName", required = true)
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "Customer")
        protected IndividualCustomer customer;
        @XmlElement(name = "Subscriber", required = true)
        protected BatchOperationRequest.BatchNewSubscriber.Subscriber subscriber;
        @XmlElement(name = "Account")
        protected Account account;
        @XmlElement(name = "Product")
        protected List<com.huawei.ocs12.businessmgrservice.Product> product;

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
         * {@link com.huawei.ocs12.businessmgrservice.Product }
         * 
         * 
         */
        public List<com.huawei.ocs12.businessmgrservice.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<com.huawei.ocs12.businessmgrservice.Product>();
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

            @XmlElement(name = "CBPID")
            protected Integer cbpid;
            @XmlElement(name = "SCPID")
            protected Integer scpid;
            @XmlElement(name = "Password")
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

        @XmlElement(name = "FileName", required = true)
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "Product", required = true)
        protected List<BatchOperationRequest.BatchSubscribe.Product> product;
        @XmlElement(name = "HandlingChargeFlag")
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
            extends com.huawei.ocs12.businessmgrservice.Product
        {

            @XmlElement(name = "Service")
            protected List<com.huawei.ocs12.businessmgrservice.Service> service;

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
             * {@link com.huawei.ocs12.businessmgrservice.Service }
             * 
             * 
             */
            public List<com.huawei.ocs12.businessmgrservice.Service> getService() {
                if (service == null) {
                    service = new ArrayList<com.huawei.ocs12.businessmgrservice.Service>();
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

        @XmlElement(name = "FileName", required = true)
        protected String fileName;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "Product", required = true)
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

            @XmlElement(name = "ProductID", required = true)
            protected String productID;
            @XmlElement(name = "ProductOrderKey")
            protected String productOrderKey;
            @XmlElement(name = "Service")
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

                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "SimpleProperty", required = true)
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

        @XmlElement(name = "FileName", required = true)
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
