
package com.huawei.ocs55.acctmgr;

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
 *         &lt;element name="RequestHeader" type="{http://www.huawei.com/bme/cbsinterface/common}RequestHeader"/>
 *         &lt;element name="AdjustSubAccountRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AdjustSubAccountRequest"/>
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
    "adjustSubAccountRequest"
})
@XmlRootElement(name = "AdjustSubAccountRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class AdjustSubAccountRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "AdjustSubAccountRequest", namespace = "", required = true)
    protected AdjustSubAccountRequest adjustSubAccountRequest;

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
     * Gets the value of the adjustSubAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustSubAccountRequest }
     *     
     */
    public AdjustSubAccountRequest getAdjustSubAccountRequest() {
        return adjustSubAccountRequest;
    }

    /**
     * Sets the value of the adjustSubAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustSubAccountRequest }
     *     
     */
    public void setAdjustSubAccountRequest(AdjustSubAccountRequest value) {
        this.adjustSubAccountRequest = value;
    }

}
