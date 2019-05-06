
package com.huawei.ocs12.accountmgrservice;

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
 *         &lt;element name="SubAccountRechargeResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}SubAccountRechargeResult"/>
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
    "subAccountRechargeResult"
})
@XmlRootElement(name = "SubAccountRechargeResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class SubAccountRechargeResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "SubAccountRechargeResult", namespace = "", required = true)
    protected SubAccountRechargeResult subAccountRechargeResult;

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
     * Gets the value of the subAccountRechargeResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccountRechargeResult }
     *     
     */
    public SubAccountRechargeResult getSubAccountRechargeResult() {
        return subAccountRechargeResult;
    }

    /**
     * Sets the value of the subAccountRechargeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccountRechargeResult }
     *     
     */
    public void setSubAccountRechargeResult(SubAccountRechargeResult value) {
        this.subAccountRechargeResult = value;
    }

}
