
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManParentChildRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManParentChildRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildSubscriberInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ChildSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ChildSubLimitAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PayFormeVoiceFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PayFormeSmsFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="MultiSurfFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TriggerType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ManParentChildRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscriberNo",
    "operationType",
    "childSubscriberInfo",
    "triggerType",
    "handlingChargeFlag"
})
public class ManParentChildRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "ChildSubscriberInfo")
    protected ManParentChildRequest.ChildSubscriberInfo childSubscriberInfo;
    @XmlElement(name = "TriggerType")
    protected Integer triggerType;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the childSubscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ManParentChildRequest.ChildSubscriberInfo }
     *     
     */
    public ManParentChildRequest.ChildSubscriberInfo getChildSubscriberInfo() {
        return childSubscriberInfo;
    }

    /**
     * Sets the value of the childSubscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManParentChildRequest.ChildSubscriberInfo }
     *     
     */
    public void setChildSubscriberInfo(ManParentChildRequest.ChildSubscriberInfo value) {
        this.childSubscriberInfo = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTriggerType(Integer value) {
        this.triggerType = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="ChildSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChildSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ChildSubLimitAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PayFormeVoiceFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PayFormeSmsFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="MultiSurfFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    public static class ChildSubscriberInfo {

        @XmlElement(name = "ChildSubNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String childSubNo;
        @XmlElement(name = "ChildSubType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer childSubType;
        @XmlElement(name = "ChildSubLimitAmt", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Long childSubLimitAmt;
        @XmlElement(name = "EffectiveDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String expireDate;
        @XmlElement(name = "PayFormeVoiceFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer payFormeVoiceFlag;
        @XmlElement(name = "PayFormeSmsFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer payFormeSmsFlag;
        @XmlElement(name = "MultiSurfFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer multiSurfFlag;

        /**
         * Gets the value of the childSubNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChildSubNo() {
            return childSubNo;
        }

        /**
         * Sets the value of the childSubNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChildSubNo(String value) {
            this.childSubNo = value;
        }

        /**
         * Gets the value of the childSubType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChildSubType() {
            return childSubType;
        }

        /**
         * Sets the value of the childSubType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChildSubType(Integer value) {
            this.childSubType = value;
        }

        /**
         * Gets the value of the childSubLimitAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getChildSubLimitAmt() {
            return childSubLimitAmt;
        }

        /**
         * Sets the value of the childSubLimitAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setChildSubLimitAmt(Long value) {
            this.childSubLimitAmt = value;
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
         * Gets the value of the payFormeVoiceFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPayFormeVoiceFlag() {
            return payFormeVoiceFlag;
        }

        /**
         * Sets the value of the payFormeVoiceFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPayFormeVoiceFlag(Integer value) {
            this.payFormeVoiceFlag = value;
        }

        /**
         * Gets the value of the payFormeSmsFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPayFormeSmsFlag() {
            return payFormeSmsFlag;
        }

        /**
         * Sets the value of the payFormeSmsFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPayFormeSmsFlag(Integer value) {
            this.payFormeSmsFlag = value;
        }

        /**
         * Gets the value of the multiSurfFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMultiSurfFlag() {
            return multiSurfFlag;
        }

        /**
         * Sets the value of the multiSurfFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMultiSurfFlag(Integer value) {
            this.multiSurfFlag = value;
        }

    }

}
