
package com.huawei.ocs55.bcservices;

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
 *         &lt;element name="ChangeSubOfferingResult" type="{http://www.huawei.com/bme/cbsinterface/bcservices}ChangeSubOfferingResult" minOccurs="0"/>
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
    "changeSubOfferingResult"
})
@XmlRootElement(name = "ChangeSubOfferingResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
public class ChangeSubOfferingResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "ChangeSubOfferingResult", namespace = "")
    protected ChangeSubOfferingResult changeSubOfferingResult;

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
     * Gets the value of the changeSubOfferingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubOfferingResult }
     *     
     */
    public ChangeSubOfferingResult getChangeSubOfferingResult() {
        return changeSubOfferingResult;
    }

    /**
     * Sets the value of the changeSubOfferingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubOfferingResult }
     *     
     */
    public void setChangeSubOfferingResult(ChangeSubOfferingResult value) {
        this.changeSubOfferingResult = value;
    }

}
