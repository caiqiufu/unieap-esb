
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
 * <p>Java class for QueryCallHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCallHistoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallHistoryRecordInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CalledPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CallDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ChargeFromMainAccount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="PrepaidBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="SubCOSID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="FnfServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CostDeductAcct10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="BalanceAcct10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "QueryCallHistoryResult", propOrder = {
    "callHistoryRecordInfo"
})
public class QueryCallHistoryResult {

    @XmlElement(name = "CallHistoryRecordInfo")
    protected List<QueryCallHistoryResult.CallHistoryRecordInfo> callHistoryRecordInfo;

    /**
     * Gets the value of the callHistoryRecordInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callHistoryRecordInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallHistoryRecordInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCallHistoryResult.CallHistoryRecordInfo }
     * 
     * 
     */
    public List<QueryCallHistoryResult.CallHistoryRecordInfo> getCallHistoryRecordInfo() {
        if (callHistoryRecordInfo == null) {
            callHistoryRecordInfo = new ArrayList<QueryCallHistoryResult.CallHistoryRecordInfo>();
        }
        return this.callHistoryRecordInfo;
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
     *         &lt;element name="CalledPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CallDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ChargeFromMainAccount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PrepaidBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="SubCOSID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="FnfServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CostDeductAcct10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="BalanceAcct10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    public static class CallHistoryRecordInfo {

        @XmlElementRef(name = "CalledPartyNumber", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> calledPartyNumber;
        @XmlElementRef(name = "CallDuration", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> callDuration;
        @XmlElementRef(name = "CallType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> callType;
        @XmlElementRef(name = "EventType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> eventType;
        @XmlElementRef(name = "TimeStamp", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> timeStamp;
        @XmlElementRef(name = "ChargeFromMainAccount", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> chargeFromMainAccount;
        @XmlElementRef(name = "PrepaidBalance", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> prepaidBalance;
        @XmlElementRef(name = "SubCOSID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> subCOSID;
        @XmlElementRef(name = "Volume", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> volume;
        @XmlElementRef(name = "FnfServiceType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fnfServiceType;
        @XmlElementRef(name = "CostDeductAcct1", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct1;
        @XmlElementRef(name = "BalanceAcct1", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct1;
        @XmlElementRef(name = "CostDeductAcct2", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct2;
        @XmlElementRef(name = "BalanceAcct2", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct2;
        @XmlElementRef(name = "CostDeductAcct3", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct3;
        @XmlElementRef(name = "BalanceAcct3", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct3;
        @XmlElementRef(name = "CostDeductAcct4", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct4;
        @XmlElementRef(name = "BalanceAcct4", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct4;
        @XmlElementRef(name = "CostDeductAcct5", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct5;
        @XmlElementRef(name = "BalanceAcct5", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct5;
        @XmlElementRef(name = "CostDeductAcct6", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct6;
        @XmlElementRef(name = "BalanceAcct6", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct6;
        @XmlElementRef(name = "CostDeductAcct7", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct7;
        @XmlElementRef(name = "BalanceAcct7", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct7;
        @XmlElementRef(name = "CostDeductAcct8", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct8;
        @XmlElementRef(name = "BalanceAcct8", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct8;
        @XmlElementRef(name = "CostDeductAcct9", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct9;
        @XmlElementRef(name = "BalanceAcct9", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct9;
        @XmlElementRef(name = "CostDeductAcct10", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> costDeductAcct10;
        @XmlElementRef(name = "BalanceAcct10", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> balanceAcct10;

        /**
         * Gets the value of the calledPartyNumber property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCalledPartyNumber() {
            return calledPartyNumber;
        }

        /**
         * Sets the value of the calledPartyNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCalledPartyNumber(JAXBElement<String> value) {
            this.calledPartyNumber = value;
        }

        /**
         * Gets the value of the callDuration property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getCallDuration() {
            return callDuration;
        }

        /**
         * Sets the value of the callDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setCallDuration(JAXBElement<Integer> value) {
            this.callDuration = value;
        }

        /**
         * Gets the value of the callType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCallType() {
            return callType;
        }

        /**
         * Sets the value of the callType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCallType(JAXBElement<String> value) {
            this.callType = value;
        }

        /**
         * Gets the value of the eventType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getEventType() {
            return eventType;
        }

        /**
         * Sets the value of the eventType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setEventType(JAXBElement<Integer> value) {
            this.eventType = value;
        }

        /**
         * Gets the value of the timeStamp property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTimeStamp() {
            return timeStamp;
        }

        /**
         * Sets the value of the timeStamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTimeStamp(JAXBElement<String> value) {
            this.timeStamp = value;
        }

        /**
         * Gets the value of the chargeFromMainAccount property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getChargeFromMainAccount() {
            return chargeFromMainAccount;
        }

        /**
         * Sets the value of the chargeFromMainAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setChargeFromMainAccount(JAXBElement<Long> value) {
            this.chargeFromMainAccount = value;
        }

        /**
         * Gets the value of the prepaidBalance property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getPrepaidBalance() {
            return prepaidBalance;
        }

        /**
         * Sets the value of the prepaidBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setPrepaidBalance(JAXBElement<Long> value) {
            this.prepaidBalance = value;
        }

        /**
         * Gets the value of the subCOSID property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getSubCOSID() {
            return subCOSID;
        }

        /**
         * Sets the value of the subCOSID property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setSubCOSID(JAXBElement<Integer> value) {
            this.subCOSID = value;
        }

        /**
         * Gets the value of the volume property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setVolume(JAXBElement<Integer> value) {
            this.volume = value;
        }

        /**
         * Gets the value of the fnfServiceType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFnfServiceType() {
            return fnfServiceType;
        }

        /**
         * Sets the value of the fnfServiceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFnfServiceType(JAXBElement<String> value) {
            this.fnfServiceType = value;
        }

        /**
         * Gets the value of the costDeductAcct1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct1() {
            return costDeductAcct1;
        }

        /**
         * Sets the value of the costDeductAcct1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct1(JAXBElement<Long> value) {
            this.costDeductAcct1 = value;
        }

        /**
         * Gets the value of the balanceAcct1 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct1() {
            return balanceAcct1;
        }

        /**
         * Sets the value of the balanceAcct1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct1(JAXBElement<Long> value) {
            this.balanceAcct1 = value;
        }

        /**
         * Gets the value of the costDeductAcct2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct2() {
            return costDeductAcct2;
        }

        /**
         * Sets the value of the costDeductAcct2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct2(JAXBElement<Long> value) {
            this.costDeductAcct2 = value;
        }

        /**
         * Gets the value of the balanceAcct2 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct2() {
            return balanceAcct2;
        }

        /**
         * Sets the value of the balanceAcct2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct2(JAXBElement<Long> value) {
            this.balanceAcct2 = value;
        }

        /**
         * Gets the value of the costDeductAcct3 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct3() {
            return costDeductAcct3;
        }

        /**
         * Sets the value of the costDeductAcct3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct3(JAXBElement<Long> value) {
            this.costDeductAcct3 = value;
        }

        /**
         * Gets the value of the balanceAcct3 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct3() {
            return balanceAcct3;
        }

        /**
         * Sets the value of the balanceAcct3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct3(JAXBElement<Long> value) {
            this.balanceAcct3 = value;
        }

        /**
         * Gets the value of the costDeductAcct4 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct4() {
            return costDeductAcct4;
        }

        /**
         * Sets the value of the costDeductAcct4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct4(JAXBElement<Long> value) {
            this.costDeductAcct4 = value;
        }

        /**
         * Gets the value of the balanceAcct4 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct4() {
            return balanceAcct4;
        }

        /**
         * Sets the value of the balanceAcct4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct4(JAXBElement<Long> value) {
            this.balanceAcct4 = value;
        }

        /**
         * Gets the value of the costDeductAcct5 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct5() {
            return costDeductAcct5;
        }

        /**
         * Sets the value of the costDeductAcct5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct5(JAXBElement<Long> value) {
            this.costDeductAcct5 = value;
        }

        /**
         * Gets the value of the balanceAcct5 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct5() {
            return balanceAcct5;
        }

        /**
         * Sets the value of the balanceAcct5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct5(JAXBElement<Long> value) {
            this.balanceAcct5 = value;
        }

        /**
         * Gets the value of the costDeductAcct6 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct6() {
            return costDeductAcct6;
        }

        /**
         * Sets the value of the costDeductAcct6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct6(JAXBElement<Long> value) {
            this.costDeductAcct6 = value;
        }

        /**
         * Gets the value of the balanceAcct6 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct6() {
            return balanceAcct6;
        }

        /**
         * Sets the value of the balanceAcct6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct6(JAXBElement<Long> value) {
            this.balanceAcct6 = value;
        }

        /**
         * Gets the value of the costDeductAcct7 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct7() {
            return costDeductAcct7;
        }

        /**
         * Sets the value of the costDeductAcct7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct7(JAXBElement<Long> value) {
            this.costDeductAcct7 = value;
        }

        /**
         * Gets the value of the balanceAcct7 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct7() {
            return balanceAcct7;
        }

        /**
         * Sets the value of the balanceAcct7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct7(JAXBElement<Long> value) {
            this.balanceAcct7 = value;
        }

        /**
         * Gets the value of the costDeductAcct8 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct8() {
            return costDeductAcct8;
        }

        /**
         * Sets the value of the costDeductAcct8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct8(JAXBElement<Long> value) {
            this.costDeductAcct8 = value;
        }

        /**
         * Gets the value of the balanceAcct8 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct8() {
            return balanceAcct8;
        }

        /**
         * Sets the value of the balanceAcct8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct8(JAXBElement<Long> value) {
            this.balanceAcct8 = value;
        }

        /**
         * Gets the value of the costDeductAcct9 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct9() {
            return costDeductAcct9;
        }

        /**
         * Sets the value of the costDeductAcct9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct9(JAXBElement<Long> value) {
            this.costDeductAcct9 = value;
        }

        /**
         * Gets the value of the balanceAcct9 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct9() {
            return balanceAcct9;
        }

        /**
         * Sets the value of the balanceAcct9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct9(JAXBElement<Long> value) {
            this.balanceAcct9 = value;
        }

        /**
         * Gets the value of the costDeductAcct10 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getCostDeductAcct10() {
            return costDeductAcct10;
        }

        /**
         * Sets the value of the costDeductAcct10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setCostDeductAcct10(JAXBElement<Long> value) {
            this.costDeductAcct10 = value;
        }

        /**
         * Gets the value of the balanceAcct10 property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getBalanceAcct10() {
            return balanceAcct10;
        }

        /**
         * Sets the value of the balanceAcct10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setBalanceAcct10(JAXBElement<Long> value) {
            this.balanceAcct10 = value;
        }

    }

}
