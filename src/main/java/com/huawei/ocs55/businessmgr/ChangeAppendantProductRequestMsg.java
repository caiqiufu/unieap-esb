
package com.huawei.ocs55.businessmgr;

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
 *         &lt;element name="ChangeAppendantProductRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ChangeAppendantProductRequest"/>
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
    "changeAppendantProductRequest"
})
@XmlRootElement(name = "ChangeAppendantProductRequestMsg")
public class ChangeAppendantProductRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ChangeAppendantProductRequest", namespace = "", required = true)
    protected ChangeAppendantProductRequest changeAppendantProductRequest;

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
     * Gets the value of the changeAppendantProductRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeAppendantProductRequest }
     *     
     */
    public ChangeAppendantProductRequest getChangeAppendantProductRequest() {
        return changeAppendantProductRequest;
    }

    /**
     * Sets the value of the changeAppendantProductRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeAppendantProductRequest }
     *     
     */
    public void setChangeAppendantProductRequest(ChangeAppendantProductRequest value) {
        this.changeAppendantProductRequest = value;
    }

}
