
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySubscriberStateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySubscriberStateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuspendDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ModifySubscriberStateRequest", propOrder = {
    "subscriberNo",
    "operateType",
    "suspendDays",
    "handlingChargeFlag"
})
public class ModifySubscriberStateRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "OperateType")
    protected int operateType;
    @XmlElement(name = "SuspendDays")
    protected Integer suspendDays;
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
     * Gets the value of the operateType property.
     * 
     */
    public int getOperateType() {
        return operateType;
    }

    /**
     * Sets the value of the operateType property.
     * 
     */
    public void setOperateType(int value) {
        this.operateType = value;
    }

    /**
     * Gets the value of the suspendDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendDays() {
        return suspendDays;
    }

    /**
     * Sets the value of the suspendDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendDays(Integer value) {
        this.suspendDays = value;
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
