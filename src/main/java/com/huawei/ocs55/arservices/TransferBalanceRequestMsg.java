
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
 *         &lt;element name="TransferBalanceRequest" type="{http://www.huawei.com/bme/cbsinterface/arservices}TransferBalanceRequest"/>
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
    "transferBalanceRequest"
})
@XmlRootElement(name = "TransferBalanceRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
public class TransferBalanceRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "TransferBalanceRequest", namespace = "", required = true)
    protected TransferBalanceRequest transferBalanceRequest;

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
     * Gets the value of the transferBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceRequest }
     *     
     */
    public TransferBalanceRequest getTransferBalanceRequest() {
        return transferBalanceRequest;
    }

    /**
     * Sets the value of the transferBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceRequest }
     *     
     */
    public void setTransferBalanceRequest(TransferBalanceRequest value) {
        this.transferBalanceRequest = value;
    }

}
