
package com.huawei.ocs55.acctmgr;

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
 *         &lt;element name="ExchangeAccountResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ExchangeAccountResult"/>
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
    "exchangeAccountResult"
})
@XmlRootElement(name = "ExchangeAccountResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class ExchangeAccountResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "ExchangeAccountResult", namespace = "", required = true)
    protected ExchangeAccountResult exchangeAccountResult;

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
     * Gets the value of the exchangeAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeAccountResult }
     *     
     */
    public ExchangeAccountResult getExchangeAccountResult() {
        return exchangeAccountResult;
    }

    /**
     * Sets the value of the exchangeAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeAccountResult }
     *     
     */
    public void setExchangeAccountResult(ExchangeAccountResult value) {
        this.exchangeAccountResult = value;
    }

}
