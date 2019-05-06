
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MainAcctBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainAcctBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BalanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DepositFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RefundFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "MainAcctBalance", propOrder = {
    "balanceType",
    "balanceTypeName",
    "totalAmount",
    "depositFlag",
    "refundFlag",
    "currencyID"
})
public class MainAcctBalance {

    @XmlElement(name = "BalanceType", required = true)
    protected String balanceType;
    @XmlElement(name = "BalanceTypeName")
    protected String balanceTypeName;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "DepositFlag", required = true)
    protected String depositFlag;
    @XmlElement(name = "RefundFlag", required = true)
    protected String refundFlag;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the balanceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    /**
     * Sets the value of the balanceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceTypeName(String value) {
        this.balanceTypeName = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the depositFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositFlag() {
        return depositFlag;
    }

    /**
     * Sets the value of the depositFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositFlag(String value) {
        this.depositFlag = value;
    }

    /**
     * Gets the value of the refundFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFlag() {
        return refundFlag;
    }

    /**
     * Sets the value of the refundFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundFlag(String value) {
        this.refundFlag = value;
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
