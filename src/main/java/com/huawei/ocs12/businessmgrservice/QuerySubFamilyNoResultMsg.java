
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
 *         &lt;element name="QuerySubFamilyNoResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QuerySubFamilyNoResult"/>
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
    "querySubFamilyNoResult"
})
@XmlRootElement(name = "QuerySubFamilyNoResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class QuerySubFamilyNoResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QuerySubFamilyNoResult", namespace = "", required = true)
    protected QuerySubFamilyNoResult querySubFamilyNoResult;

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
     * Gets the value of the querySubFamilyNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubFamilyNoResult }
     *     
     */
    public QuerySubFamilyNoResult getQuerySubFamilyNoResult() {
        return querySubFamilyNoResult;
    }

    /**
     * Sets the value of the querySubFamilyNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubFamilyNoResult }
     *     
     */
    public void setQuerySubFamilyNoResult(QuerySubFamilyNoResult value) {
        this.querySubFamilyNoResult = value;
    }

}
