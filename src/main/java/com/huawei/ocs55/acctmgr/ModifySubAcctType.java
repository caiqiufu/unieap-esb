
package com.huawei.ocs55.acctmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySubAcctType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySubAcctType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrAcctChgValidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySubAcctType", propOrder = {

})
public class ModifySubAcctType {

    @XmlElement(name = "AccountID", required = true)
    protected String accountID;
    @XmlElement(name = "CurrAcctChgAmt")
    protected long currAcctChgAmt;
    @XmlElement(name = "CurrAcctChgValidity")
    protected int currAcctChgValidity;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the currAcctChgAmt property.
     * 
     */
    public long getCurrAcctChgAmt() {
        return currAcctChgAmt;
    }

    /**
     * Sets the value of the currAcctChgAmt property.
     * 
     */
    public void setCurrAcctChgAmt(long value) {
        this.currAcctChgAmt = value;
    }

    /**
     * Gets the value of the currAcctChgValidity property.
     * 
     */
    public int getCurrAcctChgValidity() {
        return currAcctChgValidity;
    }

    /**
     * Sets the value of the currAcctChgValidity property.
     * 
     */
    public void setCurrAcctChgValidity(int value) {
        this.currAcctChgValidity = value;
    }

}
