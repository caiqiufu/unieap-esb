
package com.huawei.ocs12.accountmgrservice;

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
 *         &lt;element name="ExchangeAccountRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ExchangeAccountRequest"/>
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
    "exchangeAccountRequest"
})
@XmlRootElement(name = "ExchangeAccountRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class ExchangeAccountRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "ExchangeAccountRequest", namespace = "", required = true)
    protected ExchangeAccountRequest exchangeAccountRequest;

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
     * Gets the value of the exchangeAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeAccountRequest }
     *     
     */
    public ExchangeAccountRequest getExchangeAccountRequest() {
        return exchangeAccountRequest;
    }

    /**
     * Sets the value of the exchangeAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeAccountRequest }
     *     
     */
    public void setExchangeAccountRequest(ExchangeAccountRequest value) {
        this.exchangeAccountRequest = value;
    }

}
