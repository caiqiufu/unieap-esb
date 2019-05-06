
package com.huawei.ocs55.arservices;

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
 *         &lt;element name="QueryLoanLogResult" type="{http://www.huawei.com/bme/cbsinterface/arservices}QueryLoanLogResult"/>
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
    "queryLoanLogResult"
})
@XmlRootElement(name = "QueryLoanLogResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
public class QueryLoanLogResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "QueryLoanLogResult", namespace = "", required = true)
    protected QueryLoanLogResult queryLoanLogResult;

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
     * Gets the value of the queryLoanLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryLoanLogResult }
     *     
     */
    public QueryLoanLogResult getQueryLoanLogResult() {
        return queryLoanLogResult;
    }

    /**
     * Sets the value of the queryLoanLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryLoanLogResult }
     *     
     */
    public void setQueryLoanLogResult(QueryLoanLogResult value) {
        this.queryLoanLogResult = value;
    }

}
