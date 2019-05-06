
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
 *         &lt;element name="BalanceToValidityResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}BalanceToValidityResult"/>
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
    "balanceToValidityResult"
})
@XmlRootElement(name = "BalanceToValidityResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class BalanceToValidityResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "BalanceToValidityResult", namespace = "", required = true)
    protected BalanceToValidityResult balanceToValidityResult;

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
     * Gets the value of the balanceToValidityResult property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceToValidityResult }
     *     
     */
    public BalanceToValidityResult getBalanceToValidityResult() {
        return balanceToValidityResult;
    }

    /**
     * Sets the value of the balanceToValidityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceToValidityResult }
     *     
     */
    public void setBalanceToValidityResult(BalanceToValidityResult value) {
        this.balanceToValidityResult = value;
    }

}
