
package com.huawei.ocs55.arservices;

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
 *         &lt;element name="AdjustmentRequest" type="{http://www.huawei.com/bme/cbsinterface/arservices}AdjustmentRequest"/>
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
    "adjustmentRequest"
})
@XmlRootElement(name = "AdjustmentRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
public class AdjustmentRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "AdjustmentRequest", namespace = "", required = true)
    protected AdjustmentRequest adjustmentRequest;

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
     * Gets the value of the adjustmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentRequest }
     *     
     */
    public AdjustmentRequest getAdjustmentRequest() {
        return adjustmentRequest;
    }

    /**
     * Sets the value of the adjustmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentRequest }
     *     
     */
    public void setAdjustmentRequest(AdjustmentRequest value) {
        this.adjustmentRequest = value;
    }

}
