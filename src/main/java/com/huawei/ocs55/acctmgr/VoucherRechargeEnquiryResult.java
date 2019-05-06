
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
 * <p>Java class for VoucherRechargeEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherRechargeEnquiryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RechargeLog" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RechargeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Batch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CardCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RechargeBonus" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RechargeTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RechargePenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CallingPartyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CardSPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="LoanPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="LoanPoundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "VoucherRechargeEnquiryResult", propOrder = {
    "rechargeLog"
})
public class VoucherRechargeEnquiryResult {

    @XmlElement(name = "RechargeLog", required = true)
    protected List<VoucherRechargeEnquiryResult.RechargeLog> rechargeLog;

    /**
     * Gets the value of the rechargeLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechargeLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechargeLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherRechargeEnquiryResult.RechargeLog }
     * 
     * 
     */
    public List<VoucherRechargeEnquiryResult.RechargeLog> getRechargeLog() {
        if (rechargeLog == null) {
            rechargeLog = new ArrayList<VoucherRechargeEnquiryResult.RechargeLog>();
        }
        return this.rechargeLog;
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
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RechargeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Batch" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CardCosID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RechargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PrmValidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="RechargeBonus" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RechargeTax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RechargePenalty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CallingPartyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CardSPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OldPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NewPOSBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="LoanPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="LoanPoundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "subscriberNo",
        "subCosID",
        "tradeTime",
        "errorType",
        "rechargeType",
        "batch",
        "sequence",
        "cardCosID",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop",
        "oldBalance",
        "newBalance",
        "rechargeAmt",
        "currency",
        "validity",
        "prmValidity",
        "rechargeBonus",
        "operatorID",
        "rechargeTax",
        "rechargePenalty",
        "callingPartyNo",
        "cardSPID",
        "oldPOSBalance",
        "newPOSBalance",
        "loanPayment",
        "loanPoundage"
    })
    public static class RechargeLog {

        @XmlElement(name = "SubscriberNo", required = true)
        protected String subscriberNo;
        @XmlElement(name = "SubCosID", required = true, type = Integer.class, nillable = true)
        protected Integer subCosID;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "ErrorType", required = true)
        protected String errorType;
        @XmlElement(name = "RechargeType", required = true)
        protected String rechargeType;
        @XmlElement(name = "Batch", required = true)
        protected String batch;
        @XmlElement(name = "Sequence", required = true)
        protected String sequence;
        @XmlElement(name = "CardCosID", required = true, type = Integer.class, nillable = true)
        protected Integer cardCosID;
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
        @XmlElement(name = "RechargeAmt", required = true, type = Long.class, nillable = true)
        protected Long rechargeAmt;
        @XmlElement(name = "Currency")
        protected String currency;
        @XmlElement(name = "Validity", required = true, type = Integer.class, nillable = true)
        protected Integer validity;
        @XmlElement(name = "PrmValidity")
        protected int prmValidity;
        @XmlElement(name = "RechargeBonus")
        protected List<VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus> rechargeBonus;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
        @XmlElementRef(name = "RechargeTax", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> rechargeTax;
        @XmlElementRef(name = "RechargePenalty", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> rechargePenalty;
        @XmlElement(name = "CallingPartyNo")
        protected String callingPartyNo;
        @XmlElement(name = "CardSPID")
        protected String cardSPID;
        @XmlElementRef(name = "OldPOSBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> oldPOSBalance;
        @XmlElementRef(name = "NewPOSBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> newPOSBalance;
        @XmlElementRef(name = "LoanPayment", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> loanPayment;
        @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> loanPoundage;

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
         * Gets the value of the rechargeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechargeType() {
            return rechargeType;
        }

        /**
         * Sets the value of the rechargeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechargeType(String value) {
            this.rechargeType = value;
        }

        /**
         * Gets the value of the batch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBatch() {
            return batch;
        }

        /**
         * Sets the value of the batch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBatch(String value) {
            this.batch = value;
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
         * Gets the value of the cardCosID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCardCosID() {
            return cardCosID;
        }

        /**
         * Sets the value of the cardCosID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCardCosID(Integer value) {
            this.cardCosID = value;
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
         * Gets the value of the rechargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRechargeAmt() {
            return rechargeAmt;
        }

        /**
         * Sets the value of the rechargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRechargeAmt(Long value) {
            this.rechargeAmt = value;
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
         * Gets the value of the rechargeBonus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rechargeBonus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRechargeBonus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus }
         * 
         * 
         */
        public List<VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus> getRechargeBonus() {
            if (rechargeBonus == null) {
                rechargeBonus = new ArrayList<VoucherRechargeEnquiryResult.RechargeLog.RechargeBonus>();
            }
            return this.rechargeBonus;
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
         * Gets the value of the rechargeTax property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getRechargeTax() {
            return rechargeTax;
        }

        /**
         * Sets the value of the rechargeTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setRechargeTax(JAXBElement<Integer> value) {
            this.rechargeTax = value;
        }

        /**
         * Gets the value of the rechargePenalty property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getRechargePenalty() {
            return rechargePenalty;
        }

        /**
         * Sets the value of the rechargePenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setRechargePenalty(JAXBElement<Integer> value) {
            this.rechargePenalty = value;
        }

        /**
         * Gets the value of the callingPartyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallingPartyNo() {
            return callingPartyNo;
        }

        /**
         * Sets the value of the callingPartyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallingPartyNo(String value) {
            this.callingPartyNo = value;
        }

        /**
         * Gets the value of the cardSPID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardSPID() {
            return cardSPID;
        }

        /**
         * Sets the value of the cardSPID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardSPID(String value) {
            this.cardSPID = value;
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
         * Gets the value of the loanPayment property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLoanPayment() {
            return loanPayment;
        }

        /**
         * Sets the value of the loanPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLoanPayment(JAXBElement<Integer> value) {
            this.loanPayment = value;
        }

        /**
         * Gets the value of the loanPoundage property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getLoanPoundage() {
            return loanPoundage;
        }

        /**
         * Sets the value of the loanPoundage property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setLoanPoundage(JAXBElement<Integer> value) {
            this.loanPoundage = value;
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
         *         &lt;element name="PrmAcctType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PrmAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CurrPrmAcctBalance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        public static class RechargeBonus {

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
