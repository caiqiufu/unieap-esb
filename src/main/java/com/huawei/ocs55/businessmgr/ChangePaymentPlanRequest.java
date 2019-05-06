
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePaymentPlanRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePaymentPlanRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Common">
 *       &lt;sequence>
 *         &lt;element name="PaymentPlan" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Priority" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="3000"/>
 *                         &lt;maxInclusive value="3999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Feegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OperationType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}OperationType"/>
 *                   &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePaymentPlanRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "paymentPlan",
    "custID"
})
public class ChangePaymentPlanRequest
    extends Common
{

    @XmlElement(name = "PaymentPlan", required = true)
    protected List<ChangePaymentPlanRequest.PaymentPlan> paymentPlan;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the paymentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangePaymentPlanRequest.PaymentPlan }
     * 
     * 
     */
    public List<ChangePaymentPlanRequest.PaymentPlan> getPaymentPlan() {
        if (paymentPlan == null) {
            paymentPlan = new ArrayList<ChangePaymentPlanRequest.PaymentPlan>();
        }
        return this.paymentPlan;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DestSubNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Priority" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="3000"/>
     *               &lt;maxInclusive value="3999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Feegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OperationType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}OperationType"/>
     *         &lt;element name="PaymentPlanKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "accountType",
        "limitValue",
        "priority",
        "feegroup",
        "operationType",
        "paymentPlanKey"
    })
    public static class PaymentPlan {

        @XmlElement(name = "DestSubNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String destSubNo;
        @XmlElement(name = "AccountType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String accountType;
        @XmlElement(name = "LimitValue", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer limitValue;
        @XmlElement(name = "Priority", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer priority;
        @XmlElement(name = "Feegroup", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String feegroup;
        @XmlElement(name = "OperationType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String operationType;
        @XmlElement(name = "PaymentPlanKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer paymentPlanKey;

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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLimitValue() {
            return limitValue;
        }

        /**
         * Sets the value of the limitValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLimitValue(Integer value) {
            this.limitValue = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPriority(Integer value) {
            this.priority = value;
        }

        /**
         * Gets the value of the feegroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeegroup() {
            return feegroup;
        }

        /**
         * Sets the value of the feegroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeegroup(String value) {
            this.feegroup = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationType(String value) {
            this.operationType = value;
        }

        /**
         * Gets the value of the paymentPlanKey property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPaymentPlanKey() {
            return paymentPlanKey;
        }

        /**
         * Sets the value of the paymentPlanKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPaymentPlanKey(Integer value) {
            this.paymentPlanKey = value;
        }

    }

}
