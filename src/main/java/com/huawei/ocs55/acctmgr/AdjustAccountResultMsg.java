
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
 *         &lt;element name="AdjustAccountResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AdjustAccountResult"/>
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
    "adjustAccountResult"
})
@XmlRootElement(name = "AdjustAccountResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class AdjustAccountResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "AdjustAccountResult", namespace = "", required = true, nillable = true)
    protected AdjustAccountResult adjustAccountResult;

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
     * Gets the value of the adjustAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustAccountResult }
     *     
     */
    public AdjustAccountResult getAdjustAccountResult() {
        return adjustAccountResult;
    }

    /**
     * Sets the value of the adjustAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustAccountResult }
     *     
     */
    public void setAdjustAccountResult(AdjustAccountResult value) {
        this.adjustAccountResult = value;
    }

}
