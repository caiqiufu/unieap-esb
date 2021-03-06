
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconnectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconnectRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Common"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscriberNo"
})
public class ReconnectRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected Common subscriberNo;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link Common }
     *     
     */
    public Common getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Common }
     *     
     */
    public void setSubscriberNo(Common value) {
        this.subscriberNo = value;
    }

}
