
package com.huawei.ocs12.businessmgrservice;

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
 *         &lt;element name="ModifyPosUserStateRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ModifyPosUserStateRequest"/>
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
    "modifyPosUserStateRequest"
})
@XmlRootElement(name = "ModifyPosUserStateRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class ModifyPosUserStateRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ModifyPosUserStateRequest", namespace = "", required = true)
    protected ModifyPosUserStateRequest modifyPosUserStateRequest;

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
     * Gets the value of the modifyPosUserStateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyPosUserStateRequest }
     *     
     */
    public ModifyPosUserStateRequest getModifyPosUserStateRequest() {
        return modifyPosUserStateRequest;
    }

    /**
     * Sets the value of the modifyPosUserStateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyPosUserStateRequest }
     *     
     */
    public void setModifyPosUserStateRequest(ModifyPosUserStateRequest value) {
        this.modifyPosUserStateRequest = value;
    }

}
