
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OldPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequest", propOrder = {
    "subscriberNo",
    "oldPassword",
    "newPassword",
    "handlingChargeFlag"
})
public class ChangePasswordRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OldPassword", required = true)
    protected String oldPassword;
    @XmlElement(name = "NewPassword", required = true)
    protected String newPassword;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;

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
     * Gets the value of the oldPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the value of the oldPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPassword(String value) {
        this.oldPassword = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
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

}
