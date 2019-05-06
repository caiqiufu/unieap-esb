
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
 *         &lt;element name="QueryTransferLogRequest" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}QueryTransferLogRequest"/>
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
    "queryTransferLogRequest"
})
@XmlRootElement(name = "QueryTransferLogRequestMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class QueryTransferLogRequestMsg {

    @XmlElement(name = "RequestHeader", namespace = "", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "QueryTransferLogRequest", namespace = "", required = true)
    protected QueryTransferLogRequest queryTransferLogRequest;

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
     * Gets the value of the queryTransferLogRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTransferLogRequest }
     *     
     */
    public QueryTransferLogRequest getQueryTransferLogRequest() {
        return queryTransferLogRequest;
    }

    /**
     * Sets the value of the queryTransferLogRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTransferLogRequest }
     *     
     */
    public void setQueryTransferLogRequest(QueryTransferLogRequest value) {
        this.queryTransferLogRequest = value;
    }

}
