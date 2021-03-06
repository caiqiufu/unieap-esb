
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
 *         &lt;element name="ChangeSubIdentityRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeSubIdentityRequest"/>
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
    "changeSubIdentityRequest"
})
@XmlRootElement(name = "ChangeSubIdentityRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class ChangeSubIdentityRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeSubIdentityRequest", namespace = "", required = true)
    protected ChangeSubIdentityRequest changeSubIdentityRequest;

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
     * Gets the value of the changeSubIdentityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubIdentityRequest }
     *     
     */
    public ChangeSubIdentityRequest getChangeSubIdentityRequest() {
        return changeSubIdentityRequest;
    }

    /**
     * Sets the value of the changeSubIdentityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubIdentityRequest }
     *     
     */
    public void setChangeSubIdentityRequest(ChangeSubIdentityRequest value) {
        this.changeSubIdentityRequest = value;
    }

}
