
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
 *         &lt;element name="AdjustmentResult" type="{http://www.huawei.com/bme/cbsinterface/arservices}AdjustmentResult"/>
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
    "adjustmentResult"
})
@XmlRootElement(name = "AdjustmentResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
public class AdjustmentResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "AdjustmentResult", namespace = "", required = true)
    protected AdjustmentResult adjustmentResult;

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
     * Gets the value of the adjustmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentResult }
     *     
     */
    public AdjustmentResult getAdjustmentResult() {
        return adjustmentResult;
    }

    /**
     * Sets the value of the adjustmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentResult }
     *     
     */
    public void setAdjustmentResult(AdjustmentResult value) {
        this.adjustmentResult = value;
    }

}
