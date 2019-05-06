
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewSubscriberExtRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewSubscriberExtRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}IndividualCustomer" minOccurs="0"/>
 *         &lt;element name="Subscriber">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SMSLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BelToAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/>
 *         &lt;element name="Product" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                 &lt;sequence>
 *                   &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "NewSubscriberExtRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "customer",
    "subscriber",
    "account",
    "product"
})
public class NewSubscriberExtRequest {

    @XmlElement(name = "Customer")
    protected IndividualCustomer customer;
    @XmlElement(name = "Subscriber", required = true)
    protected NewSubscriberExtRequest.Subscriber subscriber;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "Product", required = true)
    protected List<NewSubscriberExtRequest.Product> product;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomer }
     *     
     */
    public IndividualCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomer }
     *     
     */
    public void setCustomer(IndividualCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link NewSubscriberExtRequest.Subscriber }
     *     
     */
    public NewSubscriberExtRequest.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSubscriberExtRequest.Subscriber }
     *     
     */
    public void setSubscriber(NewSubscriberExtRequest.Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
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
     * {@link NewSubscriberExtRequest.Product }
     * 
     * 
     */
    public List<NewSubscriberExtRequest.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<NewSubscriberExtRequest.Product>();
        }
        return this.product;
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
        "bindSubscriberNo"
    })
    public static class Product
        extends com.huawei.ocs55.businessmgr.Product
    {

        @XmlElement(name = "BindSubscriberNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected List<BindSubscriberNo> bindSubscriberNo;

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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegistrationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SMSLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BelToAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "code",
        "registrationTime",
        "lang",
        "smsLang",
        "belToAreaID",
        "mainProductID",
        "simpleProperty",
        "password"
    })
    public static class Subscriber {

        @XmlElement(name = "Code", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String code;
        @XmlElement(name = "RegistrationTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String registrationTime;
        @XmlElement(name = "Lang", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String lang;
        @XmlElement(name = "SMSLang", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String smsLang;
        @XmlElement(name = "BelToAreaID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String belToAreaID;
        @XmlElement(name = "MainProductID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String mainProductID;
        @XmlElement(name = "SimpleProperty", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected List<SimpleProperty> simpleProperty;
        @XmlElement(name = "Password", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String password;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the registrationTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationTime() {
            return registrationTime;
        }

        /**
         * Sets the value of the registrationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationTime(String value) {
            this.registrationTime = value;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

        /**
         * Gets the value of the smsLang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMSLang() {
            return smsLang;
        }

        /**
         * Sets the value of the smsLang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMSLang(String value) {
            this.smsLang = value;
        }

        /**
         * Gets the value of the belToAreaID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBelToAreaID() {
            return belToAreaID;
        }

        /**
         * Sets the value of the belToAreaID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBelToAreaID(String value) {
            this.belToAreaID = value;
        }

        /**
         * Gets the value of the mainProductID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainProductID() {
            return mainProductID;
        }

        /**
         * Sets the value of the mainProductID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainProductID(String value) {
            this.mainProductID = value;
        }

        /**
         * Gets the value of the simpleProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getSimpleProperty() {
            if (simpleProperty == null) {
                simpleProperty = new ArrayList<SimpleProperty>();
            }
            return this.simpleProperty;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }

}
