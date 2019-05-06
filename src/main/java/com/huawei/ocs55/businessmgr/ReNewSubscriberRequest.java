
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReNewSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReNewSubscriberRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Subscriber">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Subscriber">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Account" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReNewSubscriberRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscriberNo",
    "subscriber",
    "account",
    "product",
    "custID"
})
public class ReNewSubscriberRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "Subscriber", required = true)
    protected ReNewSubscriberRequest.Subscriber subscriber;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "Product")
    protected List<Product> product;
    @XmlElement(name = "CustID")
    protected String custID;

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
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link ReNewSubscriberRequest.Subscriber }
     *     
     */
    public ReNewSubscriberRequest.Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReNewSubscriberRequest.Subscriber }
     *     
     */
    public void setSubscriber(ReNewSubscriberRequest.Subscriber value) {
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
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Subscriber">
     *       &lt;sequence>
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "subscriberNo",
        "password",
        "scpid",
        "cbpid"
    })
    public static class Subscriber
        extends com.huawei.ocs55.businessmgr.Subscriber
    {

        @XmlElement(name = "SubscriberNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String subscriberNo;
        @XmlElement(name = "Password", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String password;
        @XmlElement(name = "SCPID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer scpid;
        @XmlElement(name = "CBPID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer cbpid;

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

        /**
         * Gets the value of the scpid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSCPID() {
            return scpid;
        }

        /**
         * Sets the value of the scpid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSCPID(Integer value) {
            this.scpid = value;
        }

        /**
         * Gets the value of the cbpid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCBPID() {
            return cbpid;
        }

        /**
         * Sets the value of the cbpid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCBPID(Integer value) {
            this.cbpid = value;
        }

    }

}
