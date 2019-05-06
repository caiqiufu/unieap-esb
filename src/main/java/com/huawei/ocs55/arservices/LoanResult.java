
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LoanBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RepayAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ETUGracePeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="GracePeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LoanInterestAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "loanAmount",
    "loanBalanceAmount",
    "repayAmount",
    "etuGracePeriod",
    "gracePeriod",
    "loanInterestAmt"
})
public class LoanResult {

    @XmlElement(name = "LoanAmount")
    protected long loanAmount;
    @XmlElement(name = "LoanBalanceAmount")
    protected long loanBalanceAmount;
    @XmlElement(name = "RepayAmount")
    protected long repayAmount;
    @XmlElement(name = "ETUGracePeriod", required = true)
    protected BigInteger etuGracePeriod;
    @XmlElement(name = "GracePeriod", required = true)
    protected BigInteger gracePeriod;
    @XmlElementRef(name = "LoanInterestAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> loanInterestAmt;

    /**
     * Gets the value of the loanAmount property.
     * 
     */
    public long getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     */
    public void setLoanAmount(long value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanBalanceAmount property.
     * 
     */
    public long getLoanBalanceAmount() {
        return loanBalanceAmount;
    }

    /**
     * Sets the value of the loanBalanceAmount property.
     * 
     */
    public void setLoanBalanceAmount(long value) {
        this.loanBalanceAmount = value;
    }

    /**
     * Gets the value of the repayAmount property.
     * 
     */
    public long getRepayAmount() {
        return repayAmount;
    }

    /**
     * Sets the value of the repayAmount property.
     * 
     */
    public void setRepayAmount(long value) {
        this.repayAmount = value;
    }

    /**
     * Gets the value of the etuGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getETUGracePeriod() {
        return etuGracePeriod;
    }

    /**
     * Sets the value of the etuGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setETUGracePeriod(BigInteger value) {
        this.etuGracePeriod = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGracePeriod(BigInteger value) {
        this.gracePeriod = value;
    }

    /**
     * Gets the value of the loanInterestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLoanInterestAmt() {
        return loanInterestAmt;
    }

    /**
     * Sets the value of the loanInterestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLoanInterestAmt(JAXBElement<Long> value) {
        this.loanInterestAmt = value;
    }

}
