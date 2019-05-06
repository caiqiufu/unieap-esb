
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
 *         &lt;element name="UnSubscribeAppendantProductExtResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}UnSubscribeAppendantProductExtResult"/>
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
    "unSubscribeAppendantProductExtResult"
})
@XmlRootElement(name = "UnSubscribeAppendantProductExtResultMsg")
public class UnSubscribeAppendantProductExtResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "UnSubscribeAppendantProductExtResult", namespace = "", required = true)
    protected UnSubscribeAppendantProductExtResult unSubscribeAppendantProductExtResult;

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
     * Gets the value of the unSubscribeAppendantProductExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnSubscribeAppendantProductExtResult }
     *     
     */
    public UnSubscribeAppendantProductExtResult getUnSubscribeAppendantProductExtResult() {
        return unSubscribeAppendantProductExtResult;
    }

    /**
     * Sets the value of the unSubscribeAppendantProductExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnSubscribeAppendantProductExtResult }
     *     
     */
    public void setUnSubscribeAppendantProductExtResult(UnSubscribeAppendantProductExtResult value) {
        this.unSubscribeAppendantProductExtResult = value;
    }

}
