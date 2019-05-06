
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", propOrder = {
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
    "mvnoid"
})
@XmlSeeAlso({
    com.huawei.ocs12.businessmgrservice.ReNewSubscriberRequest.Subscriber.class,
    com.huawei.ocs12.businessmgrservice.NewSubscriberRequest.Subscriber.class,
    com.huawei.ocs12.businessmgrservice.IntegrationEnquiryResult.SubscriberInfo.Subscriber.class,
    com.huawei.ocs12.businessmgrservice.QueryBasicInfoResult.Subscriber.SubscriberInfo.class
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

}
