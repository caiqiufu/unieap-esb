
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
 *         &lt;element name="QuerySubCallScreenNoResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QuerySubCallScreenNoResult"/>
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
    "querySubCallScreenNoResult"
})
@XmlRootElement(name = "QuerySubCallScreenNoResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class QuerySubCallScreenNoResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubCallScreenNoResult", namespace = "", required = true)
    protected QuerySubCallScreenNoResult querySubCallScreenNoResult;

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
     * Gets the value of the querySubCallScreenNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubCallScreenNoResult }
     *     
     */
    public QuerySubCallScreenNoResult getQuerySubCallScreenNoResult() {
        return querySubCallScreenNoResult;
    }

    /**
     * Sets the value of the querySubCallScreenNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubCallScreenNoResult }
     *     
     */
    public void setQuerySubCallScreenNoResult(QuerySubCallScreenNoResult value) {
        this.querySubCallScreenNoResult = value;
    }

}
