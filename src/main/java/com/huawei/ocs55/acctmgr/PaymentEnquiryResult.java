
package com.huawei.ocs55.acctmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentEnquiryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentLog" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="PaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PaymentBonus" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CanceledFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CancelLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdditiontalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PaymentTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PaymentPenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Loan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Poundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "PaymentEnquiryResult", propOrder = {
    "paymentLog"
})
public class PaymentEnquiryResult {

    @XmlElement(name = "PaymentLog", required = true)
    protected List<PaymentEnquiryResult.PaymentLog> paymentLog;

    /**
     * Gets the value of the paymentLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentEnquiryResult.PaymentLog }
     * 
     * 
     */
    public List<PaymentEnquiryResult.PaymentLog> getPaymentLog() {
        if (paymentLog == null) {
            paymentLog = new ArrayList<PaymentEnquiryResult.PaymentLog>();
        }
        return this.paymentLog;
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
     *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="PaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PaymentBonus" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CanceledFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CancelLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdditiontalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PaymentTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PaymentPenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="AgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Loan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Poundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "logID",
        "internalSerialNo",
        "subscriberNo",
        "subCosID",
        "tradeTime",
        "errorType",
        "paymentMode",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop",
        "oldBalance",
        "newBalance",
        "paymentAmt",
        "currency",
        "validity",
        "prmValidity",
        "paymentBonus",
        "canceledFlag",
        "cancelLogID",
        "additiontalInfo",
        "operatorID",
        "paymentTax",
        "paymentPenalty",
        "operationDes",
        "bankCode",
        "oldPOSBalance",
        "newPOSBalance",
        "location",
        "agentName",
        "batchNo",
        "sequence",
        "loan",
        "poundage"
    })
    public static class PaymentLog {

        @XmlElement(name = "LogID", required = true)
        protected String logID;
        @XmlElement(name = "InternalSerialNo", required = true)
        protected String internalSerialNo;
        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElement(name = "SubCosID", required = true, type = Integer.class, nillable = true)
        protected Integer subCosID;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "ErrorType", required = true)
        protected String errorType;
        @XmlElement(name = "PaymentMode", required = true)
        protected String paymentMode;
        @XmlElement(name = "OldActiveStop", required = true)
        protected String oldActiveStop;
        @XmlElement(name = "NewActiveStop", required = true)
        protected String newActiveStop;
        @XmlElement(name = "OldSuspendStop", required = true)
        protected String oldSuspendStop;
        @XmlElement(name = "NewSuspendStop", required = true)
        protected String newSuspendStop;
        @XmlElement(name = "OldDisableStop", required = true)
        protected String oldDisableStop;
        @XmlElement(name = "NewDisableStop", required = true)
        protected String newDisableStop;
        @XmlElement(name = "OldBalance", required = true, type = Long.class, nillable = true)
        protected Long oldBalance;
        @XmlElement(name = "NewBalance", required = true, type = Long.class, nillable = true)
        protected Long newBalance;
        @XmlElement(name = "PaymentAmt", required = true, type = Long.class, nillable = true)
        protected Long paymentAmt;
        @XmlElement(name = "Currency")
        protected String currency;
        @XmlElement(name = "Validity", required = true, type = Integer.class, nillable = true)
        protected Integer validity;
        @XmlElement(name = "PrmValidity")
        protected int prmValidity;
        @XmlElement(name = "PaymentBonus")
        protected List<PaymentEnquiryResult.PaymentLog.PaymentBonus> paymentBonus;
        @XmlElement(name = "CanceledFlag", required = true, type = Integer.class, nillable = true)
        protected Integer canceledFlag;
        @XmlElement(name = "CancelLogID")
        protected String cancelLogID;
        @XmlElement(name = "AdditiontalInfo", required = true)
        protected String additiontalInfo;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
        @XmlElementRef(name = "PaymentTax", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> paymentTax;
        @XmlElementRef(name = "PaymentPenalty", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> paymentPenalty;
        @XmlElement(name = "OperationDes")
        protected String operationDes;
        @XmlElement(name = "BankCode")
        protected String bankCode;
        @XmlElementRef(name = "OldPOSBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> oldPOSBalance;
        @XmlElementRef(name = "NewPOSBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> newPOSBalance;
        @XmlElementRef(name = "Location", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> location;
        @XmlElement(name = "AgentName")
        protected String agentName;
        @XmlElement(name = "BatchNo")
        protected String batchNo;
        @XmlElement(name = "Sequence")
        protected String sequence;
        @XmlElementRef(name = "Loan", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> loan;
        @XmlElementRef(name = "Poundage", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> poundage;

        /**
         * Gets the value of the logID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogID() {
            return logID;
        }

        /**
         * Sets the value of the logID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogID(String value) {
            this.logID = value;
        }

        /**
         * Gets the value of the internalSerialNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalSerialNo() {
            return internalSerialNo;
        }

        /**
         * Sets the value of the internalSerialNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalSerialNo(String value) {
            this.internalSerialNo = value;
        }

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
         * Gets the value of the subCosID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSubCosID() {
            return subCosID;
        }

        /**
         * Sets the value of the subCosID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSubCosID(Integer value) {
            this.subCosID = value;
        }

        /**
         * Gets the value of the tradeTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeTime() {
            return tradeTime;
        }

        /**
         * Sets the value of the tradeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeTime(String value) {
            this.tradeTime = value;
        }

        /**
         * Gets the value of the errorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorType() {
            return errorType;
        }

        /**
         * Sets the value of the errorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorType(String value) {
            this.errorType = value;
        }

        /**
         * Gets the value of the paymentMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentMode() {
            return paymentMode;
        }

        /**
         * Sets the value of the paymentMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentMode(String value) {
            this.paymentMode = value;
        }

        /**
         * Gets the value of the oldActiveStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldActiveStop() {
            return oldActiveStop;
        }

        /**
         * Sets the value of the oldActiveStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldActiveStop(String value) {
            this.oldActiveStop = value;
        }

        /**
         * Gets the value of the newActiveStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewActiveStop() {
            return newActiveStop;
        }

        /**
         * Sets the value of the newActiveStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewActiveStop(String value) {
            this.newActiveStop = value;
        }

        /**
         * Gets the value of the oldSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldSuspendStop() {
            return oldSuspendStop;
        }

        /**
         * Sets the value of the oldSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldSuspendStop(String value) {
            this.oldSuspendStop = value;
        }

        /**
         * Gets the value of the newSuspendStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewSuspendStop() {
            return newSuspendStop;
        }

        /**
         * Sets the value of the newSuspendStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewSuspendStop(String value) {
            this.newSuspendStop = value;
        }

        /**
         * Gets the value of the oldDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldDisableStop() {
            return oldDisableStop;
        }

        /**
         * Sets the value of the oldDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldDisableStop(String value) {
            this.oldDisableStop = value;
        }

        /**
         * Gets the value of the newDisableStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDisableStop() {
            return newDisableStop;
        }

        /**
         * Sets the value of the newDisableStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDisableStop(String value) {
            this.newDisableStop = value;
        }

        /**
         * Gets the value of the oldBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getOldBalance() {
            return oldBalance;
        }

        /**
         * Sets the value of the oldBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setOldBalance(Long value) {
            this.oldBalance = value;
        }

        /**
         * Gets the value of the newBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNewBalance() {
            return newBalance;
        }

        /**
         * Sets the value of the newBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNewBalance(Long value) {
            this.newBalance = value;
        }

        /**
         * Gets the value of the paymentAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPaymentAmt() {
            return paymentAmt;
        }

        /**
         * Sets the value of the paymentAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPaymentAmt(Long value) {
            this.paymentAmt = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the validity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getValidity() {
            return validity;
        }

        /**
         * Sets the value of the validity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setValidity(Integer value) {
            this.validity = value;
        }

        /**
         * Gets the value of the prmValidity property.
         * 
         */
        public int getPrmValidity() {
            return prmValidity;
        }

        /**
         * Sets the value of the prmValidity property.
         * 
         */
        public void setPrmValidity(int value) {
            this.prmValidity = value;
        }

        /**
         * Gets the value of the paymentBonus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentBonus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentBonus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentEnquiryResult.PaymentLog.PaymentBonus }
         * 
         * 
         */
        public List<PaymentEnquiryResult.PaymentLog.PaymentBonus> getPaymentBonus() {
            if (paymentBonus == null) {
                paymentBonus = new ArrayList<PaymentEnquiryResult.PaymentLog.PaymentBonus>();
            }
            return this.paymentBonus;
        }

        /**
         * Gets the value of the canceledFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCanceledFlag() {
            return canceledFlag;
        }

        /**
         * Sets the value of the canceledFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCanceledFlag(Integer value) {
            this.canceledFlag = value;
        }

        /**
         * Gets the value of the cancelLogID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelLogID() {
            return cancelLogID;
        }

        /**
         * Sets the value of the cancelLogID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelLogID(String value) {
            this.cancelLogID = value;
        }

        /**
         * Gets the value of the additiontalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditiontalInfo() {
            return additiontalInfo;
        }

        /**
         * Sets the value of the additiontalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditiontalInfo(String value) {
            this.additiontalInfo = value;
        }

        /**
         * Gets the value of the operatorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorID() {
            return operatorID;
        }

        /**
         * Sets the value of the operatorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorID(String value) {
            this.operatorID = value;
        }

        /**
         * Gets the value of the paymentTax property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getPaymentTax() {
            return paymentTax;
        }

        /**
         * Sets the value of the paymentTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setPaymentTax(JAXBElement<Integer> value) {
            this.paymentTax = value;
        }

        /**
         * Gets the value of the paymentPenalty property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getPaymentPenalty() {
            return paymentPenalty;
        }

        /**
         * Sets the value of the paymentPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setPaymentPenalty(JAXBElement<Integer> value) {
            this.paymentPenalty = value;
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
         * Gets the value of the bankCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * Sets the value of the bankCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCode(String value) {
            this.bankCode = value;
        }

        /**
         * Gets the value of the oldPOSBalance property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getOldPOSBalance() {
            return oldPOSBalance;
        }

        /**
         * Sets the value of the oldPOSBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setOldPOSBalance(JAXBElement<Long> value) {
            this.oldPOSBalance = value;
        }

        /**
         * Gets the value of the newPOSBalance property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getNewPOSBalance() {
            return newPOSBalance;
        }

        /**
         * Sets the value of the newPOSBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setNewPOSBalance(JAXBElement<Long> value) {
            this.newPOSBalance = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLocation(JAXBElement<Integer> value) {
            this.location = value;
        }

        /**
         * Gets the value of the agentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentName() {
            return agentName;
        }

        /**
         * Sets the value of the agentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentName(String value) {
            this.agentName = value;
        }

        /**
         * Gets the value of the batchNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBatchNo() {
            return batchNo;
        }

        /**
         * Sets the value of the batchNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBatchNo(String value) {
            this.batchNo = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequence(String value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the loan property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLoan() {
            return loan;
        }

        /**
         * Sets the value of the loan property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLoan(JAXBElement<Integer> value) {
            this.loan = value;
        }

        /**
         * Gets the value of the poundage property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getPoundage() {
            return poundage;
        }

        /**
         * Sets the value of the poundage property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setPoundage(JAXBElement<Integer> value) {
            this.poundage = value;
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
         *         &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "prmAcctType",
            "prmAmt",
            "currPrmAcctBalance"
        })
        public static class PaymentBonus {

            @XmlElement(name = "PrmAcctType", required = true, type = Integer.class, nillable = true)
            protected Integer prmAcctType;
            @XmlElement(name = "PrmAmt", required = true, type = Integer.class, nillable = true)
            protected Integer prmAmt;
            @XmlElementRef(name = "CurrPrmAcctBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
            protected JAXBElement<Integer> currPrmAcctBalance;

            /**
             * Gets the value of the prmAcctType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPrmAcctType() {
                return prmAcctType;
            }

            /**
             * Sets the value of the prmAcctType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPrmAcctType(Integer value) {
                this.prmAcctType = value;
            }

            /**
             * Gets the value of the prmAmt property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPrmAmt() {
                return prmAmt;
            }

            /**
             * Sets the value of the prmAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPrmAmt(Integer value) {
                this.prmAmt = value;
            }

            /**
             * Gets the value of the currPrmAcctBalance property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getCurrPrmAcctBalance() {
                return currPrmAcctBalance;
            }

            /**
             * Sets the value of the currPrmAcctBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setCurrPrmAcctBalance(JAXBElement<Integer> value) {
                this.currPrmAcctBalance = value;
            }

        }

    }

}
