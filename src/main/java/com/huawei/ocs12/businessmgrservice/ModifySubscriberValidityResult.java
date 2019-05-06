
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySubscriberValidityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySubscriberValidityResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainBalance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountFlagsAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountFlagsBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySubscriberValidityResult", propOrder = {
    "status",
    "activeStop",
    "suspendStop",
    "disableStop",
    "mainBalance",
    "activationDate",
    "accountFlagsAfter",
    "accountFlagsBefore"
})
public class ModifySubscriberValidityResult {

    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "ActiveStop", required = true)
    protected String activeStop;
    @XmlElement(name = "SuspendStop", required = true)
    protected String suspendStop;
    @XmlElement(name = "DisableStop", required = true)
    protected String disableStop;
    @XmlElement(name = "MainBalance")
    protected Long mainBalance;
    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "AccountFlagsAfter")
    protected String accountFlagsAfter;
    @XmlElement(name = "AccountFlagsBefore")
    protected String accountFlagsBefore;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
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
     * Gets the value of the disableStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableStop() {
        return disableStop;
    }

    /**
     * Sets the value of the disableStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableStop(String value) {
        this.disableStop = value;
    }

    /**
     * Gets the value of the mainBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainBalance() {
        return mainBalance;
    }

    /**
     * Sets the value of the mainBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainBalance(Long value) {
        this.mainBalance = value;
    }

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
     * Gets the value of the accountFlagsAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsAfter() {
        return accountFlagsAfter;
    }

    /**
     * Sets the value of the accountFlagsAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsAfter(String value) {
        this.accountFlagsAfter = value;
    }

    /**
     * Gets the value of the accountFlagsBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsBefore() {
        return accountFlagsBefore;
    }

    /**
     * Sets the value of the accountFlagsBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsBefore(String value) {
        this.accountFlagsBefore = value;
    }

}
