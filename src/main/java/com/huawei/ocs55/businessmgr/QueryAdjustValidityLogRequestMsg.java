
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
 *         &lt;element name="QueryAdjustValidityLogRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QueryAdjustValidityLogRequest"/>
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
    "queryAdjustValidityLogRequest"
})
@XmlRootElement(name = "QueryAdjustValidityLogRequestMsg")
public class QueryAdjustValidityLogRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryAdjustValidityLogRequest", namespace = "", required = true)
    protected QueryAdjustValidityLogRequest queryAdjustValidityLogRequest;

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
     * Gets the value of the queryAdjustValidityLogRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryAdjustValidityLogRequest }
     *     
     */
    public QueryAdjustValidityLogRequest getQueryAdjustValidityLogRequest() {
        return queryAdjustValidityLogRequest;
    }

    /**
     * Sets the value of the queryAdjustValidityLogRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryAdjustValidityLogRequest }
     *     
     */
    public void setQueryAdjustValidityLogRequest(QueryAdjustValidityLogRequest value) {
        this.queryAdjustValidityLogRequest = value;
    }

}
