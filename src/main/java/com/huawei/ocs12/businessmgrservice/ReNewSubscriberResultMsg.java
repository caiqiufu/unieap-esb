
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
 *         &lt;element name="ReNewSubscriberResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ReNewSubscriberResult"/>
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
    "reNewSubscriberResult"
})
@XmlRootElement(name = "ReNewSubscriberResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgrmsg")
public class ReNewSubscriberResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "ReNewSubscriberResult", namespace = "", required = true)
    protected ReNewSubscriberResult reNewSubscriberResult;

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
     * Gets the value of the reNewSubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReNewSubscriberResult }
     *     
     */
    public ReNewSubscriberResult getReNewSubscriberResult() {
        return reNewSubscriberResult;
    }

    /**
     * Sets the value of the reNewSubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReNewSubscriberResult }
     *     
     */
    public void setReNewSubscriberResult(ReNewSubscriberResult value) {
        this.reNewSubscriberResult = value;
    }

}
