
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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader"/>
 *         &lt;element name="QuerySubscriberProductInfoResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QuerySubscriberProductInfoResult"/>
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
    "resultHeader",
    "querySubscriberProductInfoResult"
})
@XmlRootElement(name = "QuerySubscriberProductInfoResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class QuerySubscriberProductInfoResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubscriberProductInfoResult", namespace = "", required = true, nillable = true)
    protected QuerySubscriberProductInfoResult querySubscriberProductInfoResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the querySubscriberProductInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubscriberProductInfoResult }
     *     
     */
    public QuerySubscriberProductInfoResult getQuerySubscriberProductInfoResult() {
        return querySubscriberProductInfoResult;
    }

    /**
     * Sets the value of the querySubscriberProductInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubscriberProductInfoResult }
     *     
     */
    public void setQuerySubscriberProductInfoResult(QuerySubscriberProductInfoResult value) {
        this.querySubscriberProductInfoResult = value;
    }

}
