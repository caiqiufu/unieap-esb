
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
 *         &lt;element name="QueryPaymentPlanResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}QueryPaymentPlanResult"/>
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
    "queryPaymentPlanResult"
})
@XmlRootElement(name = "QueryPaymentPlanResultMsg")
public class QueryPaymentPlanResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryPaymentPlanResult", namespace = "", required = true)
    protected QueryPaymentPlanResult queryPaymentPlanResult;

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
     * Gets the value of the queryPaymentPlanResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentPlanResult }
     *     
     */
    public QueryPaymentPlanResult getQueryPaymentPlanResult() {
        return queryPaymentPlanResult;
    }

    /**
     * Sets the value of the queryPaymentPlanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentPlanResult }
     *     
     */
    public void setQueryPaymentPlanResult(QueryPaymentPlanResult value) {
        this.queryPaymentPlanResult = value;
    }

}
