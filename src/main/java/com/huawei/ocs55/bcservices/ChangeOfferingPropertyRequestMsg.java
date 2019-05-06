
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}RequestHeader"/>
 *         &lt;element name="ChangeOfferingPropertyRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeOfferingPropertyRequest"/>
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
    "requestHeader",
    "changeOfferingPropertyRequest"
})
@XmlRootElement(name = "ChangeOfferingPropertyRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class ChangeOfferingPropertyRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeOfferingPropertyRequest", namespace = "", required = true)
    protected ChangeOfferingPropertyRequest changeOfferingPropertyRequest;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the changeOfferingPropertyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOfferingPropertyRequest }
     *     
     */
    public ChangeOfferingPropertyRequest getChangeOfferingPropertyRequest() {
        return changeOfferingPropertyRequest;
    }

    /**
     * Sets the value of the changeOfferingPropertyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOfferingPropertyRequest }
     *     
     */
    public void setChangeOfferingPropertyRequest(ChangeOfferingPropertyRequest value) {
        this.changeOfferingPropertyRequest = value;
    }

}
