
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalanceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;sequence>
 *             &lt;element name="OffsetUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="OffsetValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SelectInstanceMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="ValidityExtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="Owner" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
 *                   &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
 *                   &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAdjustment", propOrder = {
    "balanceType",
    "balanceID",
    "adjustmentType",
    "adjustmentAmt",
    "currencyID",
    "effectiveTime",
    "expireTime",
    "offsetUnit",
    "offsetValue",
    "selectInstanceMode",
    "validityExtMethod",
    "owner"
})
public class BalanceAdjustment {

    @XmlElement(name = "BalanceType")
    protected String balanceType;
    @XmlElement(name = "BalanceID")
    protected Long balanceID;
    @XmlElement(name = "AdjustmentType")
    protected String adjustmentType;
    @XmlElement(name = "AdjustmentAmt")
    protected Long adjustmentAmt;
    @XmlElement(name = "CurrencyID")
    protected BigInteger currencyID;
    @XmlElement(name = "EffectiveTime")
    protected String effectiveTime;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;
    @XmlElement(name = "OffsetUnit")
    protected String offsetUnit;
    @XmlElement(name = "OffsetValue")
    protected BigInteger offsetValue;
    @XmlElement(name = "SelectInstanceMode")
    protected String selectInstanceMode;
    @XmlElement(name = "ValidityExtMethod")
    protected String validityExtMethod;
    @XmlElement(name = "Owner")
    protected BalanceAdjustment.Owner owner;

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
     * Gets the value of the balanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceID() {
        return balanceID;
    }

    /**
     * Sets the value of the balanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceID(Long value) {
        this.balanceID = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Sets the value of the adjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentAmt(Long value) {
        this.adjustmentAmt = value;
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

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

    /**
     * Gets the value of the offsetUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetUnit() {
        return offsetUnit;
    }

    /**
     * Sets the value of the offsetUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetUnit(String value) {
        this.offsetUnit = value;
    }

    /**
     * Gets the value of the offsetValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetValue() {
        return offsetValue;
    }

    /**
     * Sets the value of the offsetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetValue(BigInteger value) {
        this.offsetValue = value;
    }

    /**
     * Gets the value of the selectInstanceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectInstanceMode() {
        return selectInstanceMode;
    }

    /**
     * Sets the value of the selectInstanceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectInstanceMode(String value) {
        this.selectInstanceMode = value;
    }

    /**
     * Gets the value of the validityExtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityExtMethod() {
        return validityExtMethod;
    }

    /**
     * Sets the value of the validityExtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityExtMethod(String value) {
        this.validityExtMethod = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAdjustment.Owner }
     *     
     */
    public BalanceAdjustment.Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAdjustment.Owner }
     *     
     */
    public void setOwner(BalanceAdjustment.Owner value) {
        this.owner = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
     *         &lt;element name="SubGroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
     *         &lt;element name="CustAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CustAccessCode"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subAccessCode",
        "subGroupAccessCode",
        "custAccessCode"
    })
    public static class Owner {

        @XmlElement(name = "SubAccessCode")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "SubGroupAccessCode")
        protected SubGroupAccessCode subGroupAccessCode;
        @XmlElement(name = "CustAccessCode")
        protected CustAccessCode custAccessCode;

        /**
         * Gets the value of the subAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubAccessCode() {
            return subAccessCode;
        }

        /**
         * Sets the value of the subAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubAccessCode(SubAccessCode value) {
            this.subAccessCode = value;
        }

        /**
         * Gets the value of the subGroupAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public SubGroupAccessCode getSubGroupAccessCode() {
            return subGroupAccessCode;
        }

        /**
         * Sets the value of the subGroupAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public void setSubGroupAccessCode(SubGroupAccessCode value) {
            this.subGroupAccessCode = value;
        }

        /**
         * Gets the value of the custAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link CustAccessCode }
         *     
         */
        public CustAccessCode getCustAccessCode() {
            return custAccessCode;
        }

        /**
         * Sets the value of the custAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustAccessCode }
         *     
         */
        public void setCustAccessCode(CustAccessCode value) {
            this.custAccessCode = value;
        }

    }

}
