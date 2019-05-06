
package com.huawei.ocs12.productmgrservice;

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
 *         &lt;element name="QueryProductsByNewSubscriberResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}QueryProductsByNewSubscriberResult"/>
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
    "queryProductsByNewSubscriberResult"
})
@XmlRootElement(name = "QueryProductsByNewSubscriberResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/productmgrmsg")
public class QueryProductsByNewSubscriberResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryProductsByNewSubscriberResult", namespace = "", required = true)
    protected QueryProductsByNewSubscriberResult queryProductsByNewSubscriberResult;

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
     * Gets the value of the queryProductsByNewSubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProductsByNewSubscriberResult }
     *     
     */
    public QueryProductsByNewSubscriberResult getQueryProductsByNewSubscriberResult() {
        return queryProductsByNewSubscriberResult;
    }

    /**
     * Sets the value of the queryProductsByNewSubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProductsByNewSubscriberResult }
     *     
     */
    public void setQueryProductsByNewSubscriberResult(QueryProductsByNewSubscriberResult value) {
        this.queryProductsByNewSubscriberResult = value;
    }

}
