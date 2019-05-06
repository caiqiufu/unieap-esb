
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanChgInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanChgInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldLoanAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NewLoanAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LoanPaymentAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LoanInterestAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanChgInfo", propOrder = {
    "oldLoanAmt",
    "newLoanAmt",
    "loanPaymentAmt",
    "loanInterestAmt",
    "currencyID"
})
public class LoanChgInfo {

    @XmlElement(name = "OldLoanAmt")
    protected long oldLoanAmt;
    @XmlElement(name = "NewLoanAmt")
    protected long newLoanAmt;
    @XmlElement(name = "LoanPaymentAmt")
    protected long loanPaymentAmt;
    @XmlElement(name = "LoanInterestAmt")
    protected long loanInterestAmt;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;

    /**
     * Gets the value of the oldLoanAmt property.
     * 
     */
    public long getOldLoanAmt() {
        return oldLoanAmt;
    }

    /**
     * Sets the value of the oldLoanAmt property.
     * 
     */
    public void setOldLoanAmt(long value) {
        this.oldLoanAmt = value;
    }

    /**
     * Gets the value of the newLoanAmt property.
     * 
     */
    public long getNewLoanAmt() {
        return newLoanAmt;
    }

    /**
     * Sets the value of the newLoanAmt property.
     * 
     */
    public void setNewLoanAmt(long value) {
        this.newLoanAmt = value;
    }

    /**
     * Gets the value of the loanPaymentAmt property.
     * 
     */
    public long getLoanPaymentAmt() {
        return loanPaymentAmt;
    }

    /**
     * Sets the value of the loanPaymentAmt property.
     * 
     */
    public void setLoanPaymentAmt(long value) {
        this.loanPaymentAmt = value;
    }

    /**
     * Gets the value of the loanInterestAmt property.
     * 
     */
    public long getLoanInterestAmt() {
        return loanInterestAmt;
    }

    /**
     * Sets the value of the loanInterestAmt property.
     * 
     */
    public void setLoanInterestAmt(long value) {
        this.loanInterestAmt = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

}
