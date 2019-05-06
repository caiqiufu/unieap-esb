
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribeAppendantProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeAppendantProductRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Common">
 *       &lt;sequence>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeAppendantProductRequest", propOrder = {
    "product",
    "handlingChargeFlag",
    "custID"
})
public class SubscribeAppendantProductRequest
    extends Common
{

    @XmlElement(name = "Product", required = true)
    protected List<SubscribeAppendantProductRequest.Product> product;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "CustID")
    protected String custID;

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
     * {@link SubscribeAppendantProductRequest.Product }
     * 
     * 
     */
    public List<SubscribeAppendantProductRequest.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<SubscribeAppendantProductRequest.Product>();
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

}
