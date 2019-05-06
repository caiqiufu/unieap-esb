
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccountRechargeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAccountRechargeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountRechargeResult", propOrder = {
    "acctChgRec"
})
public class SubAccountRechargeResult {

    @XmlElement(name = "AcctChgRec")
    protected AcctChgRecType acctChgRec;

    /**
     * Gets the value of the acctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getAcctChgRec() {
        return acctChgRec;
    }

    /**
     * Sets the value of the acctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setAcctChgRec(AcctChgRecType value) {
        this.acctChgRec = value;
    }

}
