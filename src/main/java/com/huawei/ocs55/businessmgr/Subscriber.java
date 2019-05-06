
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberBasic">
 *       &lt;sequence>
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldProductIDDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TempPrdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxSuspendDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxActiveDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RefillFraudCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MainProductDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendExpired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisableNotify" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PoolDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServiceOffering" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SuspendNotify" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstIVRCallDone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="USSDEndOfCall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountFlagsBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountFlagsAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mvnoid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FNNumberCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Field1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Field2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Field3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefereeMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefereeRechargeBenefitEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AON" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Gender" minOccurs="0"/>
 *         &lt;element name="Grade" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}CustomerGrade" minOccurs="0"/>
 *         &lt;element name="LastRechargeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldMainProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastVoiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSMSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastMMSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastGPRSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowbalanceNotifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "imsi",
    "oldProductID",
    "oldProductIDDesc",
    "tempPrdExpiryDate",
    "maxSuspendDays",
    "maxActiveDays",
    "refillFraudCounter",
    "mainProductDesc",
    "suspendExpired",
    "disableNotify",
    "poolDays",
    "serviceOffering",
    "suspendNotify",
    "accountGroup",
    "firstIVRCallDone",
    "ussdEndOfCall",
    "accountFlagsBefore",
    "accountFlagsAfter",
    "mvnoid",
    "fnNumberCount",
    "imei",
    "field1",
    "field2",
    "field3",
    "refereeMSISDN",
    "refereeRechargeBenefitEndDate",
    "faList",
    "aon",
    "gender",
    "grade",
    "lastRechargeTime",
    "oldMainProductID",
    "lastVoiceDate",
    "lastSMSDate",
    "lastMMSDate",
    "lastGPRSDate",
    "lowbalanceNotifyDate",
    "subscriberType"
})
@XmlSeeAlso({
    com.huawei.ocs55.businessmgr.NewSubscriberRequest.Subscriber.class,
    com.huawei.ocs55.businessmgr.IntegrationEnquiryResult.SubscriberInfo.Subscriber.class,
    com.huawei.ocs55.businessmgr.ReNewSubscriberRequest.Subscriber.class,
    com.huawei.ocs55.businessmgr.QueryBasicInfoResult.Subscriber.SubscriberInfo.class
})
public class Subscriber
    extends SubscriberBasic
{

    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "OldProductID")
    protected String oldProductID;
    @XmlElement(name = "OldProductIDDesc")
    protected String oldProductIDDesc;
    @XmlElement(name = "TempPrdExpiryDate")
    protected String tempPrdExpiryDate;
    @XmlElement(name = "MaxSuspendDays")
    protected Long maxSuspendDays;
    @XmlElement(name = "MaxActiveDays")
    protected Long maxActiveDays;
    @XmlElement(name = "RefillFraudCounter")
    protected Integer refillFraudCounter;
    @XmlElement(name = "MainProductDesc")
    protected String mainProductDesc;
    @XmlElement(name = "SuspendExpired")
    protected Integer suspendExpired;
    @XmlElement(name = "DisableNotify")
    protected Integer disableNotify;
    @XmlElement(name = "PoolDays")
    protected Long poolDays;
    @XmlElement(name = "ServiceOffering")
    protected Long serviceOffering;
    @XmlElement(name = "SuspendNotify")
    protected Integer suspendNotify;
    @XmlElement(name = "AccountGroup")
    protected Integer accountGroup;
    @XmlElement(name = "FirstIVRCallDone")
    protected Integer firstIVRCallDone;
    @XmlElement(name = "USSDEndOfCall")
    protected Integer ussdEndOfCall;
    @XmlElement(name = "AccountFlagsBefore")
    protected String accountFlagsBefore;
    @XmlElement(name = "AccountFlagsAfter")
    protected String accountFlagsAfter;
    @XmlElement(name = "Mvnoid")
    protected String mvnoid;
    @XmlElement(name = "FNNumberCount")
    protected Integer fnNumberCount;
    @XmlElement(name = "IMEI")
    protected String imei;
    @XmlElement(name = "Field1")
    protected String field1;
    @XmlElement(name = "Field2")
    protected String field2;
    @XmlElement(name = "Field3")
    protected String field3;
    @XmlElement(name = "RefereeMSISDN")
    protected String refereeMSISDN;
    @XmlElement(name = "RefereeRechargeBenefitEndDate")
    protected String refereeRechargeBenefitEndDate;
    @XmlElement(name = "FAList")
    protected String faList;
    @XmlElement(name = "AON")
    protected Integer aon;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElementRef(name = "Grade", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grade;
    @XmlElement(name = "LastRechargeTime")
    protected String lastRechargeTime;
    @XmlElement(name = "OldMainProductID")
    protected Integer oldMainProductID;
    @XmlElement(name = "LastVoiceDate")
    protected String lastVoiceDate;
    @XmlElement(name = "LastSMSDate")
    protected String lastSMSDate;
    @XmlElement(name = "LastMMSDate")
    protected String lastMMSDate;
    @XmlElement(name = "LastGPRSDate")
    protected String lastGPRSDate;
    @XmlElement(name = "LowbalanceNotifyDate")
    protected String lowbalanceNotifyDate;
    @XmlElement(name = "SubscriberType")
    protected Integer subscriberType;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the oldProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldProductID() {
        return oldProductID;
    }

    /**
     * Sets the value of the oldProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldProductID(String value) {
        this.oldProductID = value;
    }

    /**
     * Gets the value of the oldProductIDDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldProductIDDesc() {
        return oldProductIDDesc;
    }

    /**
     * Sets the value of the oldProductIDDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldProductIDDesc(String value) {
        this.oldProductIDDesc = value;
    }

    /**
     * Gets the value of the tempPrdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPrdExpiryDate() {
        return tempPrdExpiryDate;
    }

    /**
     * Sets the value of the tempPrdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPrdExpiryDate(String value) {
        this.tempPrdExpiryDate = value;
    }

    /**
     * Gets the value of the maxSuspendDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSuspendDays() {
        return maxSuspendDays;
    }

    /**
     * Sets the value of the maxSuspendDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSuspendDays(Long value) {
        this.maxSuspendDays = value;
    }

    /**
     * Gets the value of the maxActiveDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxActiveDays() {
        return maxActiveDays;
    }

    /**
     * Sets the value of the maxActiveDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxActiveDays(Long value) {
        this.maxActiveDays = value;
    }

    /**
     * Gets the value of the refillFraudCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefillFraudCounter() {
        return refillFraudCounter;
    }

    /**
     * Sets the value of the refillFraudCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefillFraudCounter(Integer value) {
        this.refillFraudCounter = value;
    }

    /**
     * Gets the value of the mainProductDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainProductDesc() {
        return mainProductDesc;
    }

    /**
     * Sets the value of the mainProductDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainProductDesc(String value) {
        this.mainProductDesc = value;
    }

    /**
     * Gets the value of the suspendExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendExpired() {
        return suspendExpired;
    }

    /**
     * Sets the value of the suspendExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendExpired(Integer value) {
        this.suspendExpired = value;
    }

    /**
     * Gets the value of the disableNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisableNotify() {
        return disableNotify;
    }

    /**
     * Sets the value of the disableNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisableNotify(Integer value) {
        this.disableNotify = value;
    }

    /**
     * Gets the value of the poolDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoolDays() {
        return poolDays;
    }

    /**
     * Sets the value of the poolDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoolDays(Long value) {
        this.poolDays = value;
    }

    /**
     * Gets the value of the serviceOffering property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceOffering() {
        return serviceOffering;
    }

    /**
     * Sets the value of the serviceOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceOffering(Long value) {
        this.serviceOffering = value;
    }

    /**
     * Gets the value of the suspendNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendNotify() {
        return suspendNotify;
    }

    /**
     * Sets the value of the suspendNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendNotify(Integer value) {
        this.suspendNotify = value;
    }

    /**
     * Gets the value of the accountGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountGroup() {
        return accountGroup;
    }

    /**
     * Sets the value of the accountGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountGroup(Integer value) {
        this.accountGroup = value;
    }

    /**
     * Gets the value of the firstIVRCallDone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstIVRCallDone() {
        return firstIVRCallDone;
    }

    /**
     * Sets the value of the firstIVRCallDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstIVRCallDone(Integer value) {
        this.firstIVRCallDone = value;
    }

    /**
     * Gets the value of the ussdEndOfCall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUSSDEndOfCall() {
        return ussdEndOfCall;
    }

    /**
     * Sets the value of the ussdEndOfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUSSDEndOfCall(Integer value) {
        this.ussdEndOfCall = value;
    }

    /**
     * Gets the value of the accountFlagsBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsBefore() {
        return accountFlagsBefore;
    }

    /**
     * Sets the value of the accountFlagsBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsBefore(String value) {
        this.accountFlagsBefore = value;
    }

    /**
     * Gets the value of the accountFlagsAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsAfter() {
        return accountFlagsAfter;
    }

    /**
     * Sets the value of the accountFlagsAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsAfter(String value) {
        this.accountFlagsAfter = value;
    }

    /**
     * Gets the value of the mvnoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvnoid() {
        return mvnoid;
    }

    /**
     * Sets the value of the mvnoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvnoid(String value) {
        this.mvnoid = value;
    }

    /**
     * Gets the value of the fnNumberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFNNumberCount() {
        return fnNumberCount;
    }

    /**
     * Sets the value of the fnNumberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFNNumberCount(Integer value) {
        this.fnNumberCount = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the field1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField1() {
        return field1;
    }

    /**
     * Sets the value of the field1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField1(String value) {
        this.field1 = value;
    }

    /**
     * Gets the value of the field2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField2() {
        return field2;
    }

    /**
     * Sets the value of the field2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField2(String value) {
        this.field2 = value;
    }

    /**
     * Gets the value of the field3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField3() {
        return field3;
    }

    /**
     * Sets the value of the field3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField3(String value) {
        this.field3 = value;
    }

    /**
     * Gets the value of the refereeMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefereeMSISDN() {
        return refereeMSISDN;
    }

    /**
     * Sets the value of the refereeMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefereeMSISDN(String value) {
        this.refereeMSISDN = value;
    }

    /**
     * Gets the value of the refereeRechargeBenefitEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefereeRechargeBenefitEndDate() {
        return refereeRechargeBenefitEndDate;
    }

    /**
     * Sets the value of the refereeRechargeBenefitEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefereeRechargeBenefitEndDate(String value) {
        this.refereeRechargeBenefitEndDate = value;
    }

    /**
     * Gets the value of the faList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAList() {
        return faList;
    }

    /**
     * Sets the value of the faList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAList(String value) {
        this.faList = value;
    }

    /**
     * Gets the value of the aon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAON() {
        return aon;
    }

    /**
     * Sets the value of the aon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAON(Integer value) {
        this.aon = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrade(JAXBElement<String> value) {
        this.grade = value;
    }

    /**
     * Gets the value of the lastRechargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRechargeTime() {
        return lastRechargeTime;
    }

    /**
     * Sets the value of the lastRechargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRechargeTime(String value) {
        this.lastRechargeTime = value;
    }

    /**
     * Gets the value of the oldMainProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldMainProductID() {
        return oldMainProductID;
    }

    /**
     * Sets the value of the oldMainProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldMainProductID(Integer value) {
        this.oldMainProductID = value;
    }

    /**
     * Gets the value of the lastVoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVoiceDate() {
        return lastVoiceDate;
    }

    /**
     * Sets the value of the lastVoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVoiceDate(String value) {
        this.lastVoiceDate = value;
    }

    /**
     * Gets the value of the lastSMSDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSMSDate() {
        return lastSMSDate;
    }

    /**
     * Sets the value of the lastSMSDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSMSDate(String value) {
        this.lastSMSDate = value;
    }

    /**
     * Gets the value of the lastMMSDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMMSDate() {
        return lastMMSDate;
    }

    /**
     * Sets the value of the lastMMSDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMMSDate(String value) {
        this.lastMMSDate = value;
    }

    /**
     * Gets the value of the lastGPRSDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastGPRSDate() {
        return lastGPRSDate;
    }

    /**
     * Sets the value of the lastGPRSDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastGPRSDate(String value) {
        this.lastGPRSDate = value;
    }

    /**
     * Gets the value of the lowbalanceNotifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowbalanceNotifyDate() {
        return lowbalanceNotifyDate;
    }

    /**
     * Sets the value of the lowbalanceNotifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowbalanceNotifyDate(String value) {
        this.lowbalanceNotifyDate = value;
    }

    /**
     * Gets the value of the subscriberType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriberType(Integer value) {
        this.subscriberType = value;
    }

}
