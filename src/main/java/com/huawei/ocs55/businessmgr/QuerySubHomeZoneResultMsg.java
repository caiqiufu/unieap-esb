
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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader"/>
 *         &lt;element name="QuerySubHomeZoneResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QuerySubHomeZoneResult"/>
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
    "querySubHomeZoneResult"
})
@XmlRootElement(name = "QuerySubHomeZoneResultMsg")
public class QuerySubHomeZoneResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubHomeZoneResult", namespace = "", required = true)
    protected QuerySubHomeZoneResult querySubHomeZoneResult;

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
     * Gets the value of the querySubHomeZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubHomeZoneResult }
     *     
     */
    public QuerySubHomeZoneResult getQuerySubHomeZoneResult() {
        return querySubHomeZoneResult;
    }

    /**
     * Sets the value of the querySubHomeZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubHomeZoneResult }
     *     
     */
    public void setQuerySubHomeZoneResult(QuerySubHomeZoneResult value) {
        this.querySubHomeZoneResult = value;
    }

}
