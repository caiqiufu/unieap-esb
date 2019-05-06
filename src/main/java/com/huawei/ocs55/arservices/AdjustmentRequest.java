
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentObj">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
 *                   &lt;element name="AcctAccessCode">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
 *                           &lt;sequence>
 *                             &lt;element name="PayType" type="{http://cbs.huawei.com/ar/wsservice/arcommon}string20" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjustmentInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreeUnitAdjustmentInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvoiceInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvoiceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InvoiceDetailID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="AdjustmentType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://cbs.huawei.com/ar/wsservice/arcommon}string20">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="BillingCycleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalProperty" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentRequest", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "adjustmentSerialNo",
    "adjustmentObj",
    "opType",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "invoiceInfo",
    "adjustmentReasonCode",
    "additionalProperty"
})
public class AdjustmentRequest {

    @XmlElement(name = "AdjustmentSerialNo")
    protected String adjustmentSerialNo;
    @XmlElement(name = "AdjustmentObj", required = true)
    protected AdjustmentRequest.AdjustmentObj adjustmentObj;
    @XmlElement(name = "OpType", required = true)
    protected String opType;
    @XmlElement(name = "AdjustmentInfo")
    protected List<BalanceAdjustment> adjustmentInfo;
    @XmlElement(name = "FreeUnitAdjustmentInfo")
    protected List<AdjustmentRequest.FreeUnitAdjustmentInfo> freeUnitAdjustmentInfo;
    @XmlElement(name = "InvoiceInfo")
    protected List<AdjustmentRequest.InvoiceInfo> invoiceInfo;
    @XmlElement(name = "AdjustmentReasonCode")
    protected String adjustmentReasonCode;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;

    /**
     * Gets the value of the adjustmentSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentSerialNo() {
        return adjustmentSerialNo;
    }

    /**
     * Sets the value of the adjustmentSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentSerialNo(String value) {
        this.adjustmentSerialNo = value;
    }

    /**
     * Gets the value of the adjustmentObj property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentRequest.AdjustmentObj }
     *     
     */
    public AdjustmentRequest.AdjustmentObj getAdjustmentObj() {
        return adjustmentObj;
    }

    /**
     * Sets the value of the adjustmentObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentRequest.AdjustmentObj }
     *     
     */
    public void setAdjustmentObj(AdjustmentRequest.AdjustmentObj value) {
        this.adjustmentObj = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceAdjustment }
     * 
     * 
     */
    public List<BalanceAdjustment> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BalanceAdjustment>();
        }
        return this.adjustmentInfo;
    }

    /**
     * Gets the value of the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentRequest.FreeUnitAdjustmentInfo }
     * 
     * 
     */
    public List<AdjustmentRequest.FreeUnitAdjustmentInfo> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<AdjustmentRequest.FreeUnitAdjustmentInfo>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentRequest.InvoiceInfo }
     * 
     * 
     */
    public List<AdjustmentRequest.InvoiceInfo> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<AdjustmentRequest.InvoiceInfo>();
        }
        return this.invoiceInfo;
    }

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimpleProperty>();
        }
        return this.additionalProperty;
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
     *       &lt;choice>
     *         &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
     *         &lt;element name="AcctAccessCode">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
     *                 &lt;sequence>
     *                   &lt;element name="PayType" type="{http://cbs.huawei.com/ar/wsservice/arcommon}string20" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subAccessCode",
        "acctAccessCode"
    })
    public static class AdjustmentObj {

        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "AcctAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected AdjustmentRequest.AdjustmentObj.AcctAccessCode acctAccessCode;

        /**
         * Gets the value of the subAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubAccessCode() {
            return subAccessCode;
        }

        /**
         * Sets the value of the subAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubAccessCode(SubAccessCode value) {
            this.subAccessCode = value;
        }

        /**
         * Gets the value of the acctAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link AdjustmentRequest.AdjustmentObj.AcctAccessCode }
         *     
         */
        public AdjustmentRequest.AdjustmentObj.AcctAccessCode getAcctAccessCode() {
            return acctAccessCode;
        }

        /**
         * Sets the value of the acctAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdjustmentRequest.AdjustmentObj.AcctAccessCode }
         *     
         */
        public void setAcctAccessCode(AdjustmentRequest.AdjustmentObj.AcctAccessCode value) {
            this.acctAccessCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
         *       &lt;sequence>
         *         &lt;element name="PayType" type="{http://cbs.huawei.com/ar/wsservice/arcommon}string20" minOccurs="0"/>
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
            "payType"
        })
        public static class AcctAccessCode
            extends com.huawei.ocs55.arservices.AcctAccessCode
        {

            @XmlElement(name = "PayType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected String payType;

            /**
             * Gets the value of the payType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayType() {
                return payType;
            }

            /**
             * Sets the value of the payType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayType(String value) {
                this.payType = value;
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
     *         &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "freeUnitInstanceID",
        "freeUnitType",
        "adjustmentType",
        "adjustmentAmt",
        "effectiveTime",
        "expireTime"
    })
    public static class FreeUnitAdjustmentInfo {

        @XmlElement(name = "FreeUnitInstanceID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long freeUnitInstanceID;
        @XmlElement(name = "FreeUnitType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String freeUnitType;
        @XmlElement(name = "AdjustmentType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String adjustmentType;
        @XmlElement(name = "AdjustmentAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long adjustmentAmt;
        @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String expireTime;

        /**
         * Gets the value of the freeUnitInstanceID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFreeUnitInstanceID() {
            return freeUnitInstanceID;
        }

        /**
         * Sets the value of the freeUnitInstanceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFreeUnitInstanceID(Long value) {
            this.freeUnitInstanceID = value;
        }

        /**
         * Gets the value of the freeUnitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeUnitType() {
            return freeUnitType;
        }

        /**
         * Sets the value of the freeUnitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeUnitType(String value) {
            this.freeUnitType = value;
        }

        /**
         * Gets the value of the adjustmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentType() {
            return adjustmentType;
        }

        /**
         * Sets the value of the adjustmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentType(String value) {
            this.adjustmentType = value;
        }

        /**
         * Gets the value of the adjustmentAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAdjustmentAmt() {
            return adjustmentAmt;
        }

        /**
         * Sets the value of the adjustmentAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAdjustmentAmt(Long value) {
            this.adjustmentAmt = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
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
     *         &lt;element name="InvoiceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InvoiceDetailID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="AdjustmentType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://cbs.huawei.com/ar/wsservice/arcommon}string20">
     *               &lt;length value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="BillingCycleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "invoiceNo",
        "invoiceDetailID",
        "adjustmentType",
        "adjustmentAmt",
        "currencyID",
        "billingCycleID",
        "dueDate"
    })
    public static class InvoiceInfo {

        @XmlElement(name = "InvoiceNo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String invoiceNo;
        @XmlElement(name = "InvoiceDetailID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long invoiceDetailID;
        @XmlElement(name = "AdjustmentType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String adjustmentType;
        @XmlElement(name = "AdjustmentAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long adjustmentAmt;
        @XmlElement(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected BigInteger currencyID;
        @XmlElement(name = "BillingCycleID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String billingCycleID;
        @XmlElement(name = "DueDate", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String dueDate;

        /**
         * Gets the value of the invoiceNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceNo() {
            return invoiceNo;
        }

        /**
         * Sets the value of the invoiceNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceNo(String value) {
            this.invoiceNo = value;
        }

        /**
         * Gets the value of the invoiceDetailID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInvoiceDetailID() {
            return invoiceDetailID;
        }

        /**
         * Sets the value of the invoiceDetailID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInvoiceDetailID(Long value) {
            this.invoiceDetailID = value;
        }

        /**
         * Gets the value of the adjustmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustmentType() {
            return adjustmentType;
        }

        /**
         * Sets the value of the adjustmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustmentType(String value) {
            this.adjustmentType = value;
        }

        /**
         * Gets the value of the adjustmentAmt property.
         * 
         */
        public long getAdjustmentAmt() {
            return adjustmentAmt;
        }

        /**
         * Sets the value of the adjustmentAmt property.
         * 
         */
        public void setAdjustmentAmt(long value) {
            this.adjustmentAmt = value;
        }

        /**
         * Gets the value of the currencyID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCurrencyID() {
            return currencyID;
        }

        /**
         * Sets the value of the currencyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCurrencyID(BigInteger value) {
            this.currencyID = value;
        }

        /**
         * Gets the value of the billingCycleID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingCycleID() {
            return billingCycleID;
        }

        /**
         * Sets the value of the billingCycleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingCycleID(String value) {
            this.billingCycleID = value;
        }

        /**
         * Gets the value of the dueDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDueDate() {
            return dueDate;
        }

        /**
         * Sets the value of the dueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDueDate(String value) {
            this.dueDate = value;
        }

    }

}
