
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExtraValidity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AcctChgRecList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoanPoundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OriginTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginOperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubscriberInfoAfter" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}SubscriberInfoAfter" minOccurs="0"/>
 *         &lt;element name="SubscriberInfoBefore" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}SubscriberInfoBefore" minOccurs="0"/>
 *         &lt;element name="CUGListAfter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUGList" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}CUGList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CUGListBefore" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUGList" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}CUGList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisableDaysExtnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OldBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RefillFraudCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResult", propOrder = {

})
public class PaymentResult {

    @XmlElement(name = "InternalSerialNo")
    protected String internalSerialNo;
    @XmlElementRef(name = "NewBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> newBalance;
    @XmlElement(name = "NewActiveStop")
    protected String newActiveStop;
    @XmlElementRef(name = "ValidityPeriod", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> validityPeriod;
    @XmlElementRef(name = "ExtraValidity", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extraValidity;
    @XmlElement(name = "AcctChgRecList")
    protected PaymentResult.AcctChgRecList acctChgRecList;
    @XmlElementRef(name = "LoanAmount", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loanAmount;
    @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loanPoundage;
    @XmlElementRef(name = "OriginTransactionID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originTransactionID;
    @XmlElementRef(name = "OriginOperatorID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originOperatorID;
    @XmlElementRef(name = "MasterAccountNumber", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterAccountNumber;
    @XmlElementRef(name = "LanguageID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> languageID;
    @XmlElement(name = "SubscriberInfoAfter")
    protected SubscriberInfoAfter subscriberInfoAfter;
    @XmlElement(name = "SubscriberInfoBefore")
    protected SubscriberInfoBefore subscriberInfoBefore;
    @XmlElement(name = "CUGListAfter")
    protected PaymentResult.CUGListAfter cugListAfter;
    @XmlElement(name = "CUGListBefore")
    protected PaymentResult.CUGListBefore cugListBefore;
    @XmlElementRef(name = "DisableDaysExtnd", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> disableDaysExtnd;
    @XmlElementRef(name = "OldBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> oldBalance;
    @XmlElement(name = "RefillFraudCounter")
    protected String refillFraudCounter;

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
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNewBalance(JAXBElement<Long> value) {
        this.newBalance = value;
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
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setValidityPeriod(JAXBElement<Integer> value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the extraValidity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtraValidity() {
        return extraValidity;
    }

    /**
     * Sets the value of the extraValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtraValidity(JAXBElement<Integer> value) {
        this.extraValidity = value;
    }

    /**
     * Gets the value of the acctChgRecList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResult.AcctChgRecList }
     *     
     */
    public PaymentResult.AcctChgRecList getAcctChgRecList() {
        return acctChgRecList;
    }

    /**
     * Sets the value of the acctChgRecList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResult.AcctChgRecList }
     *     
     */
    public void setAcctChgRecList(PaymentResult.AcctChgRecList value) {
        this.acctChgRecList = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoanAmount(JAXBElement<Integer> value) {
        this.loanAmount = value;
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
     * Gets the value of the originTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginTransactionID() {
        return originTransactionID;
    }

    /**
     * Sets the value of the originTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginTransactionID(JAXBElement<String> value) {
        this.originTransactionID = value;
    }

    /**
     * Gets the value of the originOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginOperatorID() {
        return originOperatorID;
    }

    /**
     * Sets the value of the originOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginOperatorID(JAXBElement<String> value) {
        this.originOperatorID = value;
    }

    /**
     * Gets the value of the masterAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterAccountNumber() {
        return masterAccountNumber;
    }

    /**
     * Sets the value of the masterAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterAccountNumber(JAXBElement<String> value) {
        this.masterAccountNumber = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLanguageID(JAXBElement<Integer> value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the subscriberInfoAfter property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfoAfter }
     *     
     */
    public SubscriberInfoAfter getSubscriberInfoAfter() {
        return subscriberInfoAfter;
    }

    /**
     * Sets the value of the subscriberInfoAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfoAfter }
     *     
     */
    public void setSubscriberInfoAfter(SubscriberInfoAfter value) {
        this.subscriberInfoAfter = value;
    }

    /**
     * Gets the value of the subscriberInfoBefore property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfoBefore }
     *     
     */
    public SubscriberInfoBefore getSubscriberInfoBefore() {
        return subscriberInfoBefore;
    }

    /**
     * Sets the value of the subscriberInfoBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfoBefore }
     *     
     */
    public void setSubscriberInfoBefore(SubscriberInfoBefore value) {
        this.subscriberInfoBefore = value;
    }

    /**
     * Gets the value of the cugListAfter property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResult.CUGListAfter }
     *     
     */
    public PaymentResult.CUGListAfter getCUGListAfter() {
        return cugListAfter;
    }

    /**
     * Sets the value of the cugListAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResult.CUGListAfter }
     *     
     */
    public void setCUGListAfter(PaymentResult.CUGListAfter value) {
        this.cugListAfter = value;
    }

    /**
     * Gets the value of the cugListBefore property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResult.CUGListBefore }
     *     
     */
    public PaymentResult.CUGListBefore getCUGListBefore() {
        return cugListBefore;
    }

    /**
     * Sets the value of the cugListBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResult.CUGListBefore }
     *     
     */
    public void setCUGListBefore(PaymentResult.CUGListBefore value) {
        this.cugListBefore = value;
    }

    /**
     * Gets the value of the disableDaysExtnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDisableDaysExtnd() {
        return disableDaysExtnd;
    }

    /**
     * Sets the value of the disableDaysExtnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDisableDaysExtnd(JAXBElement<Integer> value) {
        this.disableDaysExtnd = value;
    }

    /**
     * Gets the value of the oldBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOldBalance() {
        return oldBalance;
    }

    /**
     * Sets the value of the oldBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOldBalance(JAXBElement<Long> value) {
        this.oldBalance = value;
    }

    /**
     * Gets the value of the refillFraudCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefillFraudCounter() {
        return refillFraudCounter;
    }

    /**
     * Sets the value of the refillFraudCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillFraudCounter(String value) {
        this.refillFraudCounter = value;
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
     *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded" minOccurs="0"/>
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
        "acctChgRec"
    })
    public static class AcctChgRecList {

        @XmlElement(name = "AcctChgRec")
        protected List<AcctChgRecType> acctChgRec;

        /**
         * Gets the value of the acctChgRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctChgRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctChgRecType }
         * 
         * 
         */
        public List<AcctChgRecType> getAcctChgRec() {
            if (acctChgRec == null) {
                acctChgRec = new ArrayList<AcctChgRecType>();
            }
            return this.acctChgRec;
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
     *         &lt;element name="CUGList" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}CUGList" maxOccurs="unbounded" minOccurs="0"/>
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
        "cugList"
    })
    public static class CUGListAfter {

        @XmlElement(name = "CUGList")
        protected List<CUGList> cugList;

        /**
         * Gets the value of the cugList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cugList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUGList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUGList }
         * 
         * 
         */
        public List<CUGList> getCUGList() {
            if (cugList == null) {
                cugList = new ArrayList<CUGList>();
            }
            return this.cugList;
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
     *         &lt;element name="CUGList" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}CUGList" maxOccurs="unbounded" minOccurs="0"/>
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
        "cugList"
    })
    public static class CUGListBefore {

        @XmlElement(name = "CUGList")
        protected List<CUGList> cugList;

        /**
         * Gets the value of the cugList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cugList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUGList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CUGList }
         * 
         * 
         */
        public List<CUGList> getCUGList() {
            if (cugList == null) {
                cugList = new ArrayList<CUGList>();
            }
            return this.cugList;
        }

    }

}
