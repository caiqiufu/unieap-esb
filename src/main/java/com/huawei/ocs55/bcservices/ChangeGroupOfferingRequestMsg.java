
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
 *         &lt;element name="ChangeGroupOfferingRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeGroupOfferingRequest"/>
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
    "changeGroupOfferingRequest"
})
@XmlRootElement(name = "ChangeGroupOfferingRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class ChangeGroupOfferingRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeGroupOfferingRequest", namespace = "", required = true)
    protected ChangeGroupOfferingRequest changeGroupOfferingRequest;

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
     * Gets the value of the changeGroupOfferingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeGroupOfferingRequest }
     *     
     */
    public ChangeGroupOfferingRequest getChangeGroupOfferingRequest() {
        return changeGroupOfferingRequest;
    }

    /**
     * Sets the value of the changeGroupOfferingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeGroupOfferingRequest }
     *     
     */
    public void setChangeGroupOfferingRequest(ChangeGroupOfferingRequest value) {
        this.changeGroupOfferingRequest = value;
    }

}
