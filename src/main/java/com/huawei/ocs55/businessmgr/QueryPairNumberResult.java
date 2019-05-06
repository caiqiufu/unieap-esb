
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPairNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPairNumberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PairNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPairNumberResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "queryResult",
    "pairNumber"
})
public class QueryPairNumberResult {

    @XmlElement(name = "QueryResult")
    protected int queryResult;
    @XmlElement(name = "PairNumber")
    protected String pairNumber;

    /**
     * Gets the value of the queryResult property.
     * 
     */
    public int getQueryResult() {
        return queryResult;
    }

    /**
     * Sets the value of the queryResult property.
     * 
     */
    public void setQueryResult(int value) {
        this.queryResult = value;
    }

    /**
     * Gets the value of the pairNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairNumber() {
        return pairNumber;
    }

    /**
     * Sets the value of the pairNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairNumber(String value) {
        this.pairNumber = value;
    }

}
