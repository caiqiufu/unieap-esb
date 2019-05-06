
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchSubscribeAppProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchSubscribeAppProductRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumberInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Product" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
 *                   &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSubscribeAppProductRequest", propOrder = {
    "subscriberNoList",
    "product",
    "handlingChargeFlag",
    "custID"
})
public class BatchSubscribeAppProductRequest {

    @XmlElement(name = "SubscriberNoList", required = true)
    protected BatchSubscribeAppProductRequest.SubscriberNoList subscriberNoList;
    @XmlElement(name = "Product", required = true)
    protected List<BatchSubscribeAppProductRequest.Product> product;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "CustID")
    protected String custID;

    /**
     * Gets the value of the subscriberNoList property.
     * 
     * @return
     *     possible object is
     *     {@link BatchSubscribeAppProductRequest.SubscriberNoList }
     *     
     */
    public BatchSubscribeAppProductRequest.SubscriberNoList getSubscriberNoList() {
        return subscriberNoList;
    }

    /**
     * Sets the value of the subscriberNoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchSubscribeAppProductRequest.SubscriberNoList }
     *     
     */
    public void setSubscriberNoList(BatchSubscribeAppProductRequest.SubscriberNoList value) {
        this.subscriberNoList = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSubscribeAppProductRequest.Product }
     * 
     * 
     */
    public List<BatchSubscribeAppProductRequest.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<BatchSubscribeAppProductRequest.Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *       &lt;sequence>
     *         &lt;element name="Service" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Service" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
     *         &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
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
        "service",
        "effectiveDate",
        "expireDate",
        "validMode",
        "bindSubscriberNo"
    })
    public static class Product
        extends com.huawei.ocs12.businessmgrservice.Product
    {

        @XmlElement(name = "Service")
        protected List<Service> service;
        @XmlElement(name = "EffectiveDate")
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate")
        protected String expireDate;
        @XmlElement(name = "ValidMode", required = true)
        protected String validMode;
        @XmlElement(name = "BindSubscriberNo")
        protected List<BindSubscriberNo> bindSubscriberNo;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Service }
         * 
         * 
         */
        public List<Service> getService() {
            if (service == null) {
                service = new ArrayList<Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the validMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidMode() {
            return validMode;
        }

        /**
         * Sets the value of the validMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidMode(String value) {
            this.validMode = value;
        }

        /**
         * Gets the value of the bindSubscriberNo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bindSubscriberNo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBindSubscriberNo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BindSubscriberNo }
         * 
         * 
         */
        public List<BindSubscriberNo> getBindSubscriberNo() {
            if (bindSubscriberNo == null) {
                bindSubscriberNo = new ArrayList<BindSubscriberNo>();
            }
            return this.bindSubscriberNo;
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
     *         &lt;element name="NumberInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "numberInfo"
    })
    public static class SubscriberNoList {

        @XmlElement(name = "NumberInfo", required = true)
        protected List<BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo> numberInfo;

        /**
         * Gets the value of the numberInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numberInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNumberInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo }
         * 
         * 
         */
        public List<BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo> getNumberInfo() {
            if (numberInfo == null) {
                numberInfo = new ArrayList<BatchSubscribeAppProductRequest.SubscriberNoList.NumberInfo>();
            }
            return this.numberInfo;
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
         *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class NumberInfo {

            @XmlElement(name = "RequestID")
            protected int requestID;
            @XmlElement(name = "SubscriberNo", required = true)
            protected String subscriberNo;

            /**
             * Gets the value of the requestID property.
             * 
             */
            public int getRequestID() {
                return requestID;
            }

            /**
             * Sets the value of the requestID property.
             * 
             */
            public void setRequestID(int value) {
                this.requestID = value;
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

        }

    }

}
