
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteSubscriberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSubscriberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PoolDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuspendStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSubscriberResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "activationDate",
    "accountBalance",
    "poolDays",
    "language",
    "mainProductID",
    "suspendStop",
    "disableDays",
    "status",
    "activeStop"
})
public class DeleteSubscriberResult {

    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "AccountBalance")
    protected Long accountBalance;
    @XmlElement(name = "PoolDays")
    protected Long poolDays;
    @XmlElement(name = "Language")
    protected Integer language;
    @XmlElement(name = "MainProductID")
    protected Integer mainProductID;
    @XmlElement(name = "SuspendStop")
    protected String suspendStop;
    @XmlElement(name = "DisableDays")
    protected Long disableDays;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "ActiveStop")
    protected String activeStop;

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountBalance(Long value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the poolDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoolDays() {
        return poolDays;
    }

    /**
     * Sets the value of the poolDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoolDays(Long value) {
        this.poolDays = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLanguage(Integer value) {
        this.language = value;
    }

    /**
     * Gets the value of the mainProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainProductID() {
        return mainProductID;
    }

    /**
     * Sets the value of the mainProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainProductID(Integer value) {
        this.mainProductID = value;
    }

    /**
     * Gets the value of the suspendStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendStop() {
        return suspendStop;
    }

    /**
     * Sets the value of the suspendStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendStop(String value) {
        this.suspendStop = value;
    }

    /**
     * Gets the value of the disableDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisableDays() {
        return disableDays;
    }

    /**
     * Sets the value of the disableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisableDays(Long value) {
        this.disableDays = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the activeStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStop() {
        return activeStop;
    }

    /**
     * Sets the value of the activeStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStop(String value) {
        this.activeStop = value;
    }

}
