
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCUGListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCUGListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubscriberNumberNAI" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberNumberNAI" minOccurs="0"/>
 *         &lt;element name="communityInformationCurrent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="communityInformationNew" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountActivationFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCUGListRequest", propOrder = {
    "subscriberNo",
    "subscriberNumberNAI",
    "communityInformationCurrent",
    "communityInformationNew",
    "accountActivationFlag"
})
public class UpdateCUGListRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "SubscriberNumberNAI")
    protected Integer subscriberNumberNAI;
    @XmlElement(required = true)
    protected String communityInformationCurrent;
    @XmlElement(required = true)
    protected String communityInformationNew;
    protected Integer accountActivationFlag;

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
     * Gets the value of the subscriberNumberNAI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriberNumberNAI() {
        return subscriberNumberNAI;
    }

    /**
     * Sets the value of the subscriberNumberNAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriberNumberNAI(Integer value) {
        this.subscriberNumberNAI = value;
    }

    /**
     * Gets the value of the communityInformationCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityInformationCurrent() {
        return communityInformationCurrent;
    }

    /**
     * Sets the value of the communityInformationCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityInformationCurrent(String value) {
        this.communityInformationCurrent = value;
    }

    /**
     * Gets the value of the communityInformationNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityInformationNew() {
        return communityInformationNew;
    }

    /**
     * Sets the value of the communityInformationNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityInformationNew(String value) {
        this.communityInformationNew = value;
    }

    /**
     * Gets the value of the accountActivationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountActivationFlag() {
        return accountActivationFlag;
    }

    /**
     * Sets the value of the accountActivationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountActivationFlag(Integer value) {
        this.accountActivationFlag = value;
    }

}
