
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
 *         &lt;element name="QueryPassInfoRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QueryPassInfoRequest"/>
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
    "queryPassInfoRequest"
})
@XmlRootElement(name = "QueryPassInfoRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class QueryPassInfoRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryPassInfoRequest", namespace = "", required = true)
    protected QueryPassInfoRequest queryPassInfoRequest;

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
     * Gets the value of the queryPassInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPassInfoRequest }
     *     
     */
    public QueryPassInfoRequest getQueryPassInfoRequest() {
        return queryPassInfoRequest;
    }

    /**
     * Sets the value of the queryPassInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPassInfoRequest }
     *     
     */
    public void setQueryPassInfoRequest(QueryPassInfoRequest value) {
        this.queryPassInfoRequest = value;
    }

}
