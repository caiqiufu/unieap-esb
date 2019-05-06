
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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}ResultHeader"/>
 *         &lt;element name="QueryGroupListBySubscriberResult" type="{http://www.huawei.com/bme/cbsinterface/bcservices}QueryGroupListBySubscriberResult"/>
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
    "queryGroupListBySubscriberResult"
})
@XmlRootElement(name = "QueryGroupListBySubscriberResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class QueryGroupListBySubscriberResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryGroupListBySubscriberResult", namespace = "", required = true)
    protected QueryGroupListBySubscriberResult queryGroupListBySubscriberResult;

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
     * Gets the value of the queryGroupListBySubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryGroupListBySubscriberResult }
     *     
     */
    public QueryGroupListBySubscriberResult getQueryGroupListBySubscriberResult() {
        return queryGroupListBySubscriberResult;
    }

    /**
     * Sets the value of the queryGroupListBySubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryGroupListBySubscriberResult }
     *     
     */
    public void setQueryGroupListBySubscriberResult(QueryGroupListBySubscriberResult value) {
        this.queryGroupListBySubscriberResult = value;
    }

}
