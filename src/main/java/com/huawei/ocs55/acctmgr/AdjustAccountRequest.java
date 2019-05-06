
package com.huawei.ocs55.acctmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rtner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifyAcctFeeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ModifyAcctFee" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifyAcctFeeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidityIncrement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncSuspendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberNumberNAI" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}SubscriberNumberNAI" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendandDisableDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisableandPoolDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeOrigVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustAccountRequest", propOrder = {

})
public class AdjustAccountRequest {

    @XmlElement(name = "LogID")
    protected String logID;
    @XmlElement(name = "OldLogID")
    protected String oldLogID;
    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperateType")
    protected int operateType;
    @XmlElement(name = "Rtner")
    protected Integer rtner;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "SPCode")
    protected String spCode;
    @XmlElement(name = "ModifyAcctFeeList")
    protected AdjustAccountRequest.ModifyAcctFeeList modifyAcctFeeList;
    @XmlElement(name = "CustID")
    protected String custID;
    @XmlElement(name = "ValidityIncrement")
    protected Integer validityIncrement;
    @XmlElement(name = "IncSuspendDays")
    protected Integer incSuspendDays;
    @XmlElement(name = "Merchant")
    protected String merchant;
    @XmlElement(name = "Service")
    protected String service;
    @XmlElement(name = "Reserve")
    protected String reserve;
    @XmlElement(name = "SubscriberNumberNAI")
    protected Integer subscriberNumberNAI;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "ExternalData1")
    protected String externalData1;
    @XmlElement(name = "ActiveStopDateTime")
    protected String activeStopDateTime;
    @XmlElement(name = "SuspendStopDateTime")
    protected String suspendStopDateTime;
    @XmlElement(name = "SuspendandDisableDays")
    protected Integer suspendandDisableDays;
    @XmlElement(name = "DisableandPoolDays")
    protected Integer disableandPoolDays;
    protected String externalData2;
    @XmlElement(name = "AccessMethod")
    protected Integer accessMethod;
    @XmlElement(name = "ChangeOrigVal")
    protected Integer changeOrigVal;

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
     * Gets the value of the oldLogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldLogID() {
        return oldLogID;
    }

    /**
     * Sets the value of the oldLogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldLogID(String value) {
        this.oldLogID = value;
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
     *     {@link AdjustAccountRequest.ModifyAcctFeeList }
     *     
     */
    public AdjustAccountRequest.ModifyAcctFeeList getModifyAcctFeeList() {
        return modifyAcctFeeList;
    }

    /**
     * Sets the value of the modifyAcctFeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustAccountRequest.ModifyAcctFeeList }
     *     
     */
    public void setModifyAcctFeeList(AdjustAccountRequest.ModifyAcctFeeList value) {
        this.modifyAcctFeeList = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
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
     * Gets the value of the incSuspendDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncSuspendDays() {
        return incSuspendDays;
    }

    /**
     * Sets the value of the incSuspendDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncSuspendDays(Integer value) {
        this.incSuspendDays = value;
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
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the subscriberNumberNAI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriberNumberNAI() {
        return subscriberNumberNAI;
    }

    /**
     * Sets the value of the subscriberNumberNAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriberNumberNAI(Integer value) {
        this.subscriberNumberNAI = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the externalData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalData1() {
        return externalData1;
    }

    /**
     * Sets the value of the externalData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalData1(String value) {
        this.externalData1 = value;
    }

    /**
     * Gets the value of the activeStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStopDateTime() {
        return activeStopDateTime;
    }

    /**
     * Sets the value of the activeStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStopDateTime(String value) {
        this.activeStopDateTime = value;
    }

    /**
     * Gets the value of the suspendStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendStopDateTime() {
        return suspendStopDateTime;
    }

    /**
     * Sets the value of the suspendStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendStopDateTime(String value) {
        this.suspendStopDateTime = value;
    }

    /**
     * Gets the value of the suspendandDisableDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendandDisableDays() {
        return suspendandDisableDays;
    }

    /**
     * Sets the value of the suspendandDisableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendandDisableDays(Integer value) {
        this.suspendandDisableDays = value;
    }

    /**
     * Gets the value of the disableandPoolDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisableandPoolDays() {
        return disableandPoolDays;
    }

    /**
     * Sets the value of the disableandPoolDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisableandPoolDays(Integer value) {
        this.disableandPoolDays = value;
    }

    /**
     * Gets the value of the externalData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalData2() {
        return externalData2;
    }

    /**
     * Sets the value of the externalData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalData2(String value) {
        this.externalData2 = value;
    }

    /**
     * Gets the value of the accessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessMethod() {
        return accessMethod;
    }

    /**
     * Sets the value of the accessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessMethod(Integer value) {
        this.accessMethod = value;
    }

    /**
     * Gets the value of the changeOrigVal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeOrigVal() {
        return changeOrigVal;
    }

    /**
     * Sets the value of the changeOrigVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeOrigVal(Integer value) {
        this.changeOrigVal = value;
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
     *         &lt;element name="ModifyAcctFee" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifyAcctFeeType" maxOccurs="unbounded"/>
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
        protected List<ModifyAcctFeeType> modifyAcctFee;

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
         * {@link ModifyAcctFeeType }
         * 
         * 
         */
        public List<ModifyAcctFeeType> getModifyAcctFee() {
            if (modifyAcctFee == null) {
                modifyAcctFee = new ArrayList<ModifyAcctFeeType>();
            }
            return this.modifyAcctFee;
        }

    }

}
