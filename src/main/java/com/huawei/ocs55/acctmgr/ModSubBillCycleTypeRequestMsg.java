
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
 *         &lt;element name="ModSubBillCycleTypeRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModSubBillCycleTypeRequest"/>
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
    "modSubBillCycleTypeRequest"
})
@XmlRootElement(name = "ModSubBillCycleTypeRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class ModSubBillCycleTypeRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ModSubBillCycleTypeRequest", namespace = "", required = true)
    protected ModSubBillCycleTypeRequest modSubBillCycleTypeRequest;

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
     * Gets the value of the modSubBillCycleTypeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ModSubBillCycleTypeRequest }
     *     
     */
    public ModSubBillCycleTypeRequest getModSubBillCycleTypeRequest() {
        return modSubBillCycleTypeRequest;
    }

    /**
     * Sets the value of the modSubBillCycleTypeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModSubBillCycleTypeRequest }
     *     
     */
    public void setModSubBillCycleTypeRequest(ModSubBillCycleTypeRequest value) {
        this.modSubBillCycleTypeRequest = value;
    }

}
