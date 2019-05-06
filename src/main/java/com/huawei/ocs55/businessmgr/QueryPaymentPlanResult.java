
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPaymentPlanResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPaymentPlanResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentPlanForOther" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FeeGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentPlanForMe" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SrcSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FeeGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "QueryPaymentPlanResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "paymentPlanForOther",
    "paymentPlanForMe"
})
public class QueryPaymentPlanResult {

    @XmlElement(name = "PaymentPlanForOther")
    protected List<QueryPaymentPlanResult.PaymentPlanForOther> paymentPlanForOther;
    @XmlElement(name = "PaymentPlanForMe")
    protected List<QueryPaymentPlanResult.PaymentPlanForMe> paymentPlanForMe;

    /**
     * Gets the value of the paymentPlanForOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanForOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanForOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPaymentPlanResult.PaymentPlanForOther }
     * 
     * 
     */
    public List<QueryPaymentPlanResult.PaymentPlanForOther> getPaymentPlanForOther() {
        if (paymentPlanForOther == null) {
            paymentPlanForOther = new ArrayList<QueryPaymentPlanResult.PaymentPlanForOther>();
        }
        return this.paymentPlanForOther;
    }

    /**
     * Gets the value of the paymentPlanForMe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlanForMe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlanForMe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPaymentPlanResult.PaymentPlanForMe }
     * 
     * 
     */
    public List<QueryPaymentPlanResult.PaymentPlanForMe> getPaymentPlanForMe() {
        if (paymentPlanForMe == null) {
            paymentPlanForMe = new ArrayList<QueryPaymentPlanResult.PaymentPlanForMe>();
        }
        return this.paymentPlanForMe;
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
     *         &lt;element name="SrcSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FeeGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "srcSubNo",
        "feeGroup",
        "accountType",
        "limitValue",
        "priority",
        "paymentPlanKey"
    })
    public static class PaymentPlanForMe {

        @XmlElement(name = "SrcSubNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String srcSubNo;
        @XmlElement(name = "FeeGroup", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String feeGroup;
        @XmlElement(name = "AccountType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String accountType;
        @XmlElement(name = "LimitValue", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int limitValue;
        @XmlElement(name = "Priority", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int priority;
        @XmlElement(name = "PaymentPlanKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int paymentPlanKey;

        /**
         * Gets the value of the srcSubNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrcSubNo() {
            return srcSubNo;
        }

        /**
         * Sets the value of the srcSubNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrcSubNo(String value) {
            this.srcSubNo = value;
        }

        /**
         * Gets the value of the feeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeGroup() {
            return feeGroup;
        }

        /**
         * Sets the value of the feeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeGroup(String value) {
            this.feeGroup = value;
        }

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
         * Gets the value of the limitValue property.
         * 
         */
        public int getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         */
        public void setLimitValue(int value) {
            this.limitValue = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         */
        public int getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         */
        public void setPriority(int value) {
            this.priority = value;
        }

        /**
         * Gets the value of the paymentPlanKey property.
         * 
         */
        public int getPaymentPlanKey() {
            return paymentPlanKey;
        }

        /**
         * Sets the value of the paymentPlanKey property.
         * 
         */
        public void setPaymentPlanKey(int value) {
            this.paymentPlanKey = value;
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
     *         &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FeeGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "destSubNo",
        "feeGroup",
        "accountType",
        "limitValue",
        "priority",
        "paymentPlanKey"
    })
    public static class PaymentPlanForOther {

        @XmlElement(name = "DestSubNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String destSubNo;
        @XmlElement(name = "FeeGroup", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String feeGroup;
        @XmlElement(name = "AccountType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String accountType;
        @XmlElement(name = "LimitValue", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int limitValue;
        @XmlElement(name = "Priority", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int priority;
        @XmlElement(name = "PaymentPlanKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected int paymentPlanKey;

        /**
         * Gets the value of the destSubNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestSubNo() {
            return destSubNo;
        }

        /**
         * Sets the value of the destSubNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestSubNo(String value) {
            this.destSubNo = value;
        }

        /**
         * Gets the value of the feeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeeGroup() {
            return feeGroup;
        }

        /**
         * Sets the value of the feeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeeGroup(String value) {
            this.feeGroup = value;
        }

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
         * Gets the value of the limitValue property.
         * 
         */
        public int getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         */
        public void setLimitValue(int value) {
            this.limitValue = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         */
        public int getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         */
        public void setPriority(int value) {
            this.priority = value;
        }

        /**
         * Gets the value of the paymentPlanKey property.
         * 
         */
        public int getPaymentPlanKey() {
            return paymentPlanKey;
        }

        /**
         * Sets the value of the paymentPlanKey property.
         * 
         */
        public void setPaymentPlanKey(int value) {
            this.paymentPlanKey = value;
        }

    }

}
