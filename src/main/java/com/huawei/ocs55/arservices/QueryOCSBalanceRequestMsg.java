
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
 *         &lt;element name="QueryOCSBalanceRequest" type="{http://www.huawei.com/bme/cbsinterface/arservices}QueryOCSBalanceRequest"/>
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
    "queryOCSBalanceRequest"
})
@XmlRootElement(name = "QueryOCSBalanceRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
public class QueryOCSBalanceRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryOCSBalanceRequest", namespace = "", required = true)
    protected QueryOCSBalanceRequest queryOCSBalanceRequest;

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
     * Gets the value of the queryOCSBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOCSBalanceRequest }
     *     
     */
    public QueryOCSBalanceRequest getQueryOCSBalanceRequest() {
        return queryOCSBalanceRequest;
    }

    /**
     * Sets the value of the queryOCSBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOCSBalanceRequest }
     *     
     */
    public void setQueryOCSBalanceRequest(QueryOCSBalanceRequest value) {
        this.queryOCSBalanceRequest = value;
    }

}
