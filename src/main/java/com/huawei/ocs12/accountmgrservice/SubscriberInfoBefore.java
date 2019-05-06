
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberInfoBefore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberInfoBefore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainProductTempExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OldMainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentMainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActiveStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuspendStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisableStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PoolStopDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountFlags" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AccountFlags" minOccurs="0"/>
 *         &lt;element name="promotionPlanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceOfferings" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ServiceOfferings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LifeCycleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberInfoBefore", propOrder = {
    "mainProductTempExpiryDate",
    "oldMainProductID",
    "currentMainProductID",
    "activeStopDateTime",
    "suspendStopDateTime",
    "disableStopDateTime",
    "poolStopDateTime",
    "accountFlags",
    "promotionPlanID",
    "serviceOfferings",
    "lifeCycleState"
})
public class SubscriberInfoBefore {

    @XmlElement(name = "MainProductTempExpiryDate", required = true, nillable = true)
    protected String mainProductTempExpiryDate;
    @XmlElement(name = "OldMainProductID", required = true, nillable = true)
    protected String oldMainProductID;
    @XmlElement(name = "CurrentMainProductID", required = true, nillable = true)
    protected String currentMainProductID;
    @XmlElement(name = "ActiveStopDateTime", required = true, nillable = true)
    protected String activeStopDateTime;
    @XmlElement(name = "SuspendStopDateTime", required = true, nillable = true)
    protected String suspendStopDateTime;
    @XmlElement(name = "DisableStopDateTime", required = true, nillable = true)
    protected String disableStopDateTime;
    @XmlElement(name = "PoolStopDateTime", required = true, nillable = true)
    protected String poolStopDateTime;
    @XmlElement(name = "AccountFlags")
    protected AccountFlags accountFlags;
    protected String promotionPlanID;
    @XmlElement(name = "ServiceOfferings")
    protected List<ServiceOfferings> serviceOfferings;
    @XmlElement(name = "LifeCycleState")
    protected String lifeCycleState;

    /**
     * Gets the value of the mainProductTempExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainProductTempExpiryDate() {
        return mainProductTempExpiryDate;
    }

    /**
     * Sets the value of the mainProductTempExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainProductTempExpiryDate(String value) {
        this.mainProductTempExpiryDate = value;
    }

    /**
     * Gets the value of the oldMainProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMainProductID() {
        return oldMainProductID;
    }

    /**
     * Sets the value of the oldMainProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMainProductID(String value) {
        this.oldMainProductID = value;
    }

    /**
     * Gets the value of the currentMainProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentMainProductID() {
        return currentMainProductID;
    }

    /**
     * Sets the value of the currentMainProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentMainProductID(String value) {
        this.currentMainProductID = value;
    }

    /**
     * Gets the value of the activeStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStopDateTime() {
        return activeStopDateTime;
    }

    /**
     * Sets the value of the activeStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStopDateTime(String value) {
        this.activeStopDateTime = value;
    }

    /**
     * Gets the value of the suspendStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendStopDateTime() {
        return suspendStopDateTime;
    }

    /**
     * Sets the value of the suspendStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendStopDateTime(String value) {
        this.suspendStopDateTime = value;
    }

    /**
     * Gets the value of the disableStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableStopDateTime() {
        return disableStopDateTime;
    }

    /**
     * Sets the value of the disableStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableStopDateTime(String value) {
        this.disableStopDateTime = value;
    }

    /**
     * Gets the value of the poolStopDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolStopDateTime() {
        return poolStopDateTime;
    }

    /**
     * Sets the value of the poolStopDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolStopDateTime(String value) {
        this.poolStopDateTime = value;
    }

    /**
     * Gets the value of the accountFlags property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFlags }
     *     
     */
    public AccountFlags getAccountFlags() {
        return accountFlags;
    }

    /**
     * Sets the value of the accountFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFlags }
     *     
     */
    public void setAccountFlags(AccountFlags value) {
        this.accountFlags = value;
    }

    /**
     * Gets the value of the promotionPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanID() {
        return promotionPlanID;
    }

    /**
     * Sets the value of the promotionPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanID(String value) {
        this.promotionPlanID = value;
    }

    /**
     * Gets the value of the serviceOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOfferings }
     * 
     * 
     */
    public List<ServiceOfferings> getServiceOfferings() {
        if (serviceOfferings == null) {
            serviceOfferings = new ArrayList<ServiceOfferings>();
        }
        return this.serviceOfferings;
    }

    /**
     * Gets the value of the lifeCycleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * Sets the value of the lifeCycleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleState(String value) {
        this.lifeCycleState = value;
    }

}
