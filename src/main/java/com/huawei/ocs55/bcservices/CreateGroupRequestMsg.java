
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
 *         &lt;element name="CreateGroupRequest" type="{http://www.huawei.com/bme/cbsinterface/bcservices}CreateGroupRequest"/>
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
    "createGroupRequest"
})
@XmlRootElement(name = "CreateGroupRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class CreateGroupRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "CreateGroupRequest", namespace = "", required = true)
    protected CreateGroupRequest createGroupRequest;

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
     * Gets the value of the createGroupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupRequest }
     *     
     */
    public CreateGroupRequest getCreateGroupRequest() {
        return createGroupRequest;
    }

    /**
     * Sets the value of the createGroupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupRequest }
     *     
     */
    public void setCreateGroupRequest(CreateGroupRequest value) {
        this.createGroupRequest = value;
    }

}
