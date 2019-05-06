
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BalanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ReservedAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepositFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RefundFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="BalanceDetail" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BalanceInstanceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AcctBalOriginal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OriginalID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PrimaryIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "AcctBalance", propOrder = {
    "balanceType",
    "balanceTypeName",
    "totalAmount",
    "reservedAmount",
    "depositFlag",
    "refundFlag",
    "currencyID",
    "balanceDetail"
})
public class AcctBalance {

    @XmlElement(name = "BalanceType", required = true)
    protected String balanceType;
    @XmlElement(name = "BalanceTypeName")
    protected String balanceTypeName;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "ReservedAmount")
    protected Long reservedAmount;
    @XmlElement(name = "DepositFlag", required = true)
    protected String depositFlag;
    @XmlElement(name = "RefundFlag", required = true)
    protected String refundFlag;
    @XmlElement(name = "CurrencyID", required = true)
    protected BigInteger currencyID;
    @XmlElement(name = "BalanceDetail", required = true)
    protected List<AcctBalance.BalanceDetail> balanceDetail;

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
     * Gets the value of the reservedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservedAmount() {
        return reservedAmount;
    }

    /**
     * Sets the value of the reservedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservedAmount(Long value) {
        this.reservedAmount = value;
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

    /**
     * Gets the value of the balanceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalance.BalanceDetail }
     * 
     * 
     */
    public List<AcctBalance.BalanceDetail> getBalanceDetail() {
        if (balanceDetail == null) {
            balanceDetail = new ArrayList<AcctBalance.BalanceDetail>();
        }
        return this.balanceDetail;
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
     *       &lt;sequence>
     *         &lt;element name="BalanceInstanceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AcctBalOriginal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OriginalID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PrimaryIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "balanceInstanceID",
        "amount",
        "initialAmount",
        "effectiveTime",
        "expireTime",
        "acctBalOriginal",
        "lastUpdateTime",
        "primaryIdentity"
    })
    public static class BalanceDetail {

        @XmlElement(name = "BalanceInstanceID")
        protected long balanceInstanceID;
        @XmlElement(name = "Amount")
        protected long amount;
        @XmlElement(name = "InitialAmount")
        protected long initialAmount;
        @XmlElement(name = "EffectiveTime", required = true)
        protected String effectiveTime;
        @XmlElement(name = "ExpireTime", required = true)
        protected String expireTime;
        @XmlElement(name = "AcctBalOriginal")
        protected AcctBalance.BalanceDetail.AcctBalOriginal acctBalOriginal;
        @XmlElement(name = "LastUpdateTime")
        protected String lastUpdateTime;
        @XmlElement(name = "PrimaryIdentity")
        protected String primaryIdentity;

        /**
         * Gets the value of the balanceInstanceID property.
         * 
         */
        public long getBalanceInstanceID() {
            return balanceInstanceID;
        }

        /**
         * Sets the value of the balanceInstanceID property.
         * 
         */
        public void setBalanceInstanceID(long value) {
            this.balanceInstanceID = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         */
        public long getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         */
        public void setAmount(long value) {
            this.amount = value;
        }

        /**
         * Gets the value of the initialAmount property.
         * 
         */
        public long getInitialAmount() {
            return initialAmount;
        }

        /**
         * Sets the value of the initialAmount property.
         * 
         */
        public void setInitialAmount(long value) {
            this.initialAmount = value;
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
         * Gets the value of the acctBalOriginal property.
         * 
         * @return
         *     possible object is
         *     {@link AcctBalance.BalanceDetail.AcctBalOriginal }
         *     
         */
        public AcctBalance.BalanceDetail.AcctBalOriginal getAcctBalOriginal() {
            return acctBalOriginal;
        }

        /**
         * Sets the value of the acctBalOriginal property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcctBalance.BalanceDetail.AcctBalOriginal }
         *     
         */
        public void setAcctBalOriginal(AcctBalance.BalanceDetail.AcctBalOriginal value) {
            this.acctBalOriginal = value;
        }

        /**
         * Gets the value of the lastUpdateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        /**
         * Sets the value of the lastUpdateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastUpdateTime(String value) {
            this.lastUpdateTime = value;
        }

        /**
         * Gets the value of the primaryIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryIdentity() {
            return primaryIdentity;
        }

        /**
         * Sets the value of the primaryIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryIdentity(String value) {
            this.primaryIdentity = value;
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
         *       &lt;sequence>
         *         &lt;element name="OriginalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OriginalID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "originalType",
            "originalID"
        })
        public static class AcctBalOriginal {

            @XmlElement(name = "OriginalType", required = true)
            protected String originalType;
            @XmlElement(name = "OriginalID")
            protected long originalID;

            /**
             * Gets the value of the originalType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalType() {
                return originalType;
            }

            /**
             * Sets the value of the originalType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalType(String value) {
                this.originalType = value;
            }

            /**
             * Gets the value of the originalID property.
             * 
             */
            public long getOriginalID() {
                return originalID;
            }

            /**
             * Sets the value of the originalID property.
             * 
             */
            public void setOriginalID(long value) {
                this.originalID = value;
            }

        }

    }

}
