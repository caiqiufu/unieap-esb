
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAdjustmentLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAdjustmentLogResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentLog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CurrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdjustmentItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="PrevBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "QueryAdjustmentLogResult", propOrder = {
    "adjustmentLog"
})
public class QueryAdjustmentLogResult {

    @XmlElement(name = "AdjustmentLog")
    protected List<QueryAdjustmentLogResult.AdjustmentLog> adjustmentLog;

    /**
     * Gets the value of the adjustmentLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryAdjustmentLogResult.AdjustmentLog }
     * 
     * 
     */
    public List<QueryAdjustmentLogResult.AdjustmentLog> getAdjustmentLog() {
        if (adjustmentLog == null) {
            adjustmentLog = new ArrayList<QueryAdjustmentLogResult.AdjustmentLog>();
        }
        return this.adjustmentLog;
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
     *         &lt;element name="CurrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OldDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperationDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdjustmentItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="PrevBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    @XmlType(name = "", propOrder = {
        "logID",
        "currStatus",
        "spid",
        "transactionCode",
        "internalSerialNo",
        "tradeTime",
        "operatorID",
        "oldActiveStop",
        "newActiveStop",
        "oldSuspendStop",
        "newSuspendStop",
        "oldDisableStop",
        "newDisableStop",
        "operationDes",
        "adjustmentItem"
    })
    public static class AdjustmentLog {

        @XmlElement(name = "LogID", required = true)
        protected String logID;
        @XmlElement(name = "CurrStatus")
        protected Integer currStatus;
        @XmlElement(name = "SPID")
        protected String spid;
        @XmlElement(name = "TransactionCode")
        protected String transactionCode;
        @XmlElement(name = "InternalSerialNo")
        protected String internalSerialNo;
        @XmlElement(name = "TradeTime", required = true)
        protected String tradeTime;
        @XmlElement(name = "OperatorID")
        protected String operatorID;
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
        @XmlElement(name = "OperationDes")
        protected String operationDes;
        @XmlElement(name = "AdjustmentItem", required = true)
        protected List<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem> adjustmentItem;

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
         * Gets the value of the currStatus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCurrStatus() {
            return currStatus;
        }

        /**
         * Sets the value of the currStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCurrStatus(Integer value) {
            this.currStatus = value;
        }

        /**
         * Gets the value of the spid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPID() {
            return spid;
        }

        /**
         * Sets the value of the spid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPID(String value) {
            this.spid = value;
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
         * Gets the value of the adjustmentItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustmentItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdjustmentItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem }
         * 
         * 
         */
        public List<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem> getAdjustmentItem() {
            if (adjustmentItem == null) {
                adjustmentItem = new ArrayList<QueryAdjustmentLogResult.AdjustmentLog.AdjustmentItem>();
            }
            return this.adjustmentItem;
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
         *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="CurrBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="PrevBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        public static class AdjustmentItem {

            @XmlElement(name = "AccountType", required = true, nillable = true)
            protected String accountType;
            @XmlElement(name = "AdjustmentAmt", required = true, type = Long.class, nillable = true)
            protected Long adjustmentAmt;
            @XmlElement(name = "CurrBalance", required = true, type = Long.class, nillable = true)
            protected Long currBalance;
            @XmlElement(name = "PrevBalance", required = true, type = Long.class, nillable = true)
            protected Long prevBalance;

            /**
             * Gets the value of the accountType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountType() {
                return accountType;
            }

            /**
             * Sets the value of the accountType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountType(String value) {
                this.accountType = value;
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
             * Gets the value of the currBalance property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getCurrBalance() {
                return currBalance;
            }

            /**
             * Sets the value of the currBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setCurrBalance(Long value) {
                this.currBalance = value;
            }

            /**
             * Gets the value of the prevBalance property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPrevBalance() {
                return prevBalance;
            }

            /**
             * Sets the value of the prevBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPrevBalance(Long value) {
                this.prevBalance = value;
            }

        }

    }

}
