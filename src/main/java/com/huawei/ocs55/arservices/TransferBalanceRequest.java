
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferBalanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBalanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferType" type="{http://cbs.huawei.com/ar/wsservice/arcommon}string64"/>
 *         &lt;element name="TransferorObj" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
 *                   &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
 *                   &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransfereeObj" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
 *                   &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
 *                   &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransferorAcct" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
 *                 &lt;sequence>
 *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransfereeAcct" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
 *                 &lt;sequence>
 *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SrcBalanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SrcBalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestBalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransferHandleFee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransfeeHandleFee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FreeUnitTransferorInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TransferAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CreditTransferorInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TransferAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TransferBalanceRequest", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "transferType",
    "transferorObj",
    "transfereeObj",
    "transferorAcct",
    "transfereeAcct",
    "srcBalanceID",
    "srcBalanceType",
    "destBalanceType",
    "transferAmount",
    "transferHandleFee",
    "transfeeHandleFee",
    "freeUnitTransferorInfo",
    "creditTransferorInfo",
    "currencyID",
    "remark",
    "additionalProperty"
})
public class TransferBalanceRequest {

    @XmlElement(name = "TransferType", required = true)
    protected String transferType;
    @XmlElement(name = "TransferorObj")
    protected TransferBalanceRequest.TransferorObj transferorObj;
    @XmlElement(name = "TransfereeObj")
    protected TransferBalanceRequest.TransfereeObj transfereeObj;
    @XmlElement(name = "TransferorAcct")
    protected TransferBalanceRequest.TransferorAcct transferorAcct;
    @XmlElement(name = "TransfereeAcct")
    protected TransferBalanceRequest.TransfereeAcct transfereeAcct;
    @XmlElement(name = "SrcBalanceID")
    protected Long srcBalanceID;
    @XmlElement(name = "SrcBalanceType")
    protected String srcBalanceType;
    @XmlElement(name = "DestBalanceType")
    protected String destBalanceType;
    @XmlElement(name = "TransferAmount")
    protected Long transferAmount;
    @XmlElement(name = "TransferHandleFee")
    protected Long transferHandleFee;
    @XmlElement(name = "TransfeeHandleFee")
    protected Long transfeeHandleFee;
    @XmlElement(name = "FreeUnitTransferorInfo")
    protected List<TransferBalanceRequest.FreeUnitTransferorInfo> freeUnitTransferorInfo;
    @XmlElement(name = "CreditTransferorInfo")
    protected List<TransferBalanceRequest.CreditTransferorInfo> creditTransferorInfo;
    @XmlElement(name = "CurrencyID")
    protected BigInteger currencyID;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferorObj property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceRequest.TransferorObj }
     *     
     */
    public TransferBalanceRequest.TransferorObj getTransferorObj() {
        return transferorObj;
    }

    /**
     * Sets the value of the transferorObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceRequest.TransferorObj }
     *     
     */
    public void setTransferorObj(TransferBalanceRequest.TransferorObj value) {
        this.transferorObj = value;
    }

    /**
     * Gets the value of the transfereeObj property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceRequest.TransfereeObj }
     *     
     */
    public TransferBalanceRequest.TransfereeObj getTransfereeObj() {
        return transfereeObj;
    }

    /**
     * Sets the value of the transfereeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceRequest.TransfereeObj }
     *     
     */
    public void setTransfereeObj(TransferBalanceRequest.TransfereeObj value) {
        this.transfereeObj = value;
    }

    /**
     * Gets the value of the transferorAcct property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceRequest.TransferorAcct }
     *     
     */
    public TransferBalanceRequest.TransferorAcct getTransferorAcct() {
        return transferorAcct;
    }

    /**
     * Sets the value of the transferorAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceRequest.TransferorAcct }
     *     
     */
    public void setTransferorAcct(TransferBalanceRequest.TransferorAcct value) {
        this.transferorAcct = value;
    }

    /**
     * Gets the value of the transfereeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceRequest.TransfereeAcct }
     *     
     */
    public TransferBalanceRequest.TransfereeAcct getTransfereeAcct() {
        return transfereeAcct;
    }

    /**
     * Sets the value of the transfereeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceRequest.TransfereeAcct }
     *     
     */
    public void setTransfereeAcct(TransferBalanceRequest.TransfereeAcct value) {
        this.transfereeAcct = value;
    }

    /**
     * Gets the value of the srcBalanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcBalanceID() {
        return srcBalanceID;
    }

    /**
     * Sets the value of the srcBalanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcBalanceID(Long value) {
        this.srcBalanceID = value;
    }

    /**
     * Gets the value of the srcBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcBalanceType() {
        return srcBalanceType;
    }

    /**
     * Sets the value of the srcBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcBalanceType(String value) {
        this.srcBalanceType = value;
    }

    /**
     * Gets the value of the destBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestBalanceType() {
        return destBalanceType;
    }

    /**
     * Sets the value of the destBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestBalanceType(String value) {
        this.destBalanceType = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferAmount(Long value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the transferHandleFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferHandleFee() {
        return transferHandleFee;
    }

    /**
     * Sets the value of the transferHandleFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferHandleFee(Long value) {
        this.transferHandleFee = value;
    }

    /**
     * Gets the value of the transfeeHandleFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransfeeHandleFee() {
        return transfeeHandleFee;
    }

    /**
     * Sets the value of the transfeeHandleFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransfeeHandleFee(Long value) {
        this.transfeeHandleFee = value;
    }

    /**
     * Gets the value of the freeUnitTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferBalanceRequest.FreeUnitTransferorInfo }
     * 
     * 
     */
    public List<TransferBalanceRequest.FreeUnitTransferorInfo> getFreeUnitTransferorInfo() {
        if (freeUnitTransferorInfo == null) {
            freeUnitTransferorInfo = new ArrayList<TransferBalanceRequest.FreeUnitTransferorInfo>();
        }
        return this.freeUnitTransferorInfo;
    }

    /**
     * Gets the value of the creditTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferBalanceRequest.CreditTransferorInfo }
     * 
     * 
     */
    public List<TransferBalanceRequest.CreditTransferorInfo> getCreditTransferorInfo() {
        if (creditTransferorInfo == null) {
            creditTransferorInfo = new ArrayList<TransferBalanceRequest.CreditTransferorInfo>();
        }
        return this.creditTransferorInfo;
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
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     *       &lt;sequence>
     *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TransferAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "creditLimitType",
        "transferAmt"
    })
    public static class CreditTransferorInfo {

        @XmlElement(name = "CreditLimitType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String creditLimitType;
        @XmlElement(name = "TransferAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long transferAmt;

        /**
         * Gets the value of the creditLimitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditLimitType() {
            return creditLimitType;
        }

        /**
         * Sets the value of the creditLimitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditLimitType(String value) {
            this.creditLimitType = value;
        }

        /**
         * Gets the value of the transferAmt property.
         * 
         */
        public long getTransferAmt() {
            return transferAmt;
        }

        /**
         * Sets the value of the transferAmt property.
         * 
         */
        public void setTransferAmt(long value) {
            this.transferAmt = value;
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
     *         &lt;element name="TransferAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "transferAmt"
    })
    public static class FreeUnitTransferorInfo {

        @XmlElement(name = "FreeUnitInstanceID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long freeUnitInstanceID;
        @XmlElement(name = "FreeUnitType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String freeUnitType;
        @XmlElement(name = "TransferAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long transferAmt;

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
         * Gets the value of the transferAmt property.
         * 
         */
        public long getTransferAmt() {
            return transferAmt;
        }

        /**
         * Sets the value of the transferAmt property.
         * 
         */
        public void setTransferAmt(long value) {
            this.transferAmt = value;
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
     *     &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctAccessCode">
     *       &lt;sequence>
     *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class TransfereeAcct
        extends AcctAccessCode
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
     *         &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
     *         &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
     *         &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
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
        "custAccessCode",
        "subGroupAccessCode",
        "subAccessCode"
    })
    public static class TransfereeObj {

        @XmlElement(name = "CustAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected CustAccessCode custAccessCode;
        @XmlElement(name = "SubGroupAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubGroupAccessCode subGroupAccessCode;
        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubAccessCode subAccessCode;

        /**
         * Gets the value of the custAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccessCode }
         *     
         */
        public CustAccessCode getCustAccessCode() {
            return custAccessCode;
        }

        /**
         * Sets the value of the custAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccessCode }
         *     
         */
        public void setCustAccessCode(CustAccessCode value) {
            this.custAccessCode = value;
        }

        /**
         * Gets the value of the subGroupAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public SubGroupAccessCode getSubGroupAccessCode() {
            return subGroupAccessCode;
        }

        /**
         * Sets the value of the subGroupAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public void setSubGroupAccessCode(SubGroupAccessCode value) {
            this.subGroupAccessCode = value;
        }

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
     *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class TransferorAcct
        extends AcctAccessCode
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
     *         &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
     *         &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
     *         &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
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
        "custAccessCode",
        "subGroupAccessCode",
        "subAccessCode"
    })
    public static class TransferorObj {

        @XmlElement(name = "CustAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected CustAccessCode custAccessCode;
        @XmlElement(name = "SubGroupAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubGroupAccessCode subGroupAccessCode;
        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubAccessCode subAccessCode;

        /**
         * Gets the value of the custAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccessCode }
         *     
         */
        public CustAccessCode getCustAccessCode() {
            return custAccessCode;
        }

        /**
         * Sets the value of the custAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccessCode }
         *     
         */
        public void setCustAccessCode(CustAccessCode value) {
            this.custAccessCode = value;
        }

        /**
         * Gets the value of the subGroupAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public SubGroupAccessCode getSubGroupAccessCode() {
            return subGroupAccessCode;
        }

        /**
         * Sets the value of the subGroupAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public void setSubGroupAccessCode(SubGroupAccessCode value) {
            this.subGroupAccessCode = value;
        }

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

    }

}
