
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOCSBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOCSBalanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctList" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BalanceResult" type="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctBalance" maxOccurs="unbounded"/>
 *                   &lt;element name="AccountCredit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreditLimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalCreditAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="TotalUsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="TotalRemainAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="CreditAmountInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FreeUnitItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FreeUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MeasureUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalInitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TotalUnusedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="FreeUnitItemDetail" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="CurrentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FreeUnitOrigin" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;choice>
 *                                         &lt;element name="OfferingKey" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}OfferingKey">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RollOverFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LastRollOveredTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "QueryOCSBalanceResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "acctList",
    "freeUnitItem"
})
public class QueryOCSBalanceResult {

    @XmlElement(name = "AcctList", required = true)
    protected List<QueryOCSBalanceResult.AcctList> acctList;
    @XmlElement(name = "FreeUnitItem")
    protected List<QueryOCSBalanceResult.FreeUnitItem> freeUnitItem;

    /**
     * Gets the value of the acctList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOCSBalanceResult.AcctList }
     * 
     * 
     */
    public List<QueryOCSBalanceResult.AcctList> getAcctList() {
        if (acctList == null) {
            acctList = new ArrayList<QueryOCSBalanceResult.AcctList>();
        }
        return this.acctList;
    }

    /**
     * Gets the value of the freeUnitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOCSBalanceResult.FreeUnitItem }
     * 
     * 
     */
    public List<QueryOCSBalanceResult.FreeUnitItem> getFreeUnitItem() {
        if (freeUnitItem == null) {
            freeUnitItem = new ArrayList<QueryOCSBalanceResult.FreeUnitItem>();
        }
        return this.freeUnitItem;
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
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BalanceResult" type="{http://cbs.huawei.com/ar/wsservice/arcommon}AcctBalance" maxOccurs="unbounded"/>
     *         &lt;element name="AccountCredit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditLimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TotalCreditAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="TotalUsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="TotalRemainAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="CreditAmountInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "acctKey",
        "balanceResult",
        "accountCredit"
    })
    public static class AcctList {

        @XmlElement(name = "AcctKey", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String acctKey;
        @XmlElement(name = "BalanceResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected List<AcctBalance> balanceResult;
        @XmlElement(name = "AccountCredit", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<QueryOCSBalanceResult.AcctList.AccountCredit> accountCredit;

        /**
         * Gets the value of the acctKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctKey() {
            return acctKey;
        }

        /**
         * Sets the value of the acctKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctKey(String value) {
            this.acctKey = value;
        }

        /**
         * Gets the value of the balanceResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctBalance }
         * 
         * 
         */
        public List<AcctBalance> getBalanceResult() {
            if (balanceResult == null) {
                balanceResult = new ArrayList<AcctBalance>();
            }
            return this.balanceResult;
        }

        /**
         * Gets the value of the accountCredit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountCredit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountCredit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryOCSBalanceResult.AcctList.AccountCredit }
         * 
         * 
         */
        public List<QueryOCSBalanceResult.AcctList.AccountCredit> getAccountCredit() {
            if (accountCredit == null) {
                accountCredit = new ArrayList<QueryOCSBalanceResult.AcctList.AccountCredit>();
            }
            return this.accountCredit;
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
         *         &lt;element name="CreditLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditLimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TotalCreditAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="TotalUsageAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="TotalRemainAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="CreditAmountInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        @XmlType(name = "", propOrder = {
            "creditLimitType",
            "creditLimitTypeName",
            "totalCreditAmount",
            "totalUsageAmount",
            "totalRemainAmount",
            "currencyID",
            "creditAmountInfo"
        })
        public static class AccountCredit {

            @XmlElement(name = "CreditLimitType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected String creditLimitType;
            @XmlElement(name = "CreditLimitTypeName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected String creditLimitTypeName;
            @XmlElement(name = "TotalCreditAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long totalCreditAmount;
            @XmlElement(name = "TotalUsageAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long totalUsageAmount;
            @XmlElement(name = "TotalRemainAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long totalRemainAmount;
            @XmlElement(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected BigInteger currencyID;
            @XmlElement(name = "CreditAmountInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected List<QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo> creditAmountInfo;

            /**
             * Gets the value of the creditLimitType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditLimitType() {
                return creditLimitType;
            }

            /**
             * Sets the value of the creditLimitType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditLimitType(String value) {
                this.creditLimitType = value;
            }

            /**
             * Gets the value of the creditLimitTypeName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditLimitTypeName() {
                return creditLimitTypeName;
            }

            /**
             * Sets the value of the creditLimitTypeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditLimitTypeName(String value) {
                this.creditLimitTypeName = value;
            }

            /**
             * Gets the value of the totalCreditAmount property.
             * 
             */
            public long getTotalCreditAmount() {
                return totalCreditAmount;
            }

            /**
             * Sets the value of the totalCreditAmount property.
             * 
             */
            public void setTotalCreditAmount(long value) {
                this.totalCreditAmount = value;
            }

            /**
             * Gets the value of the totalUsageAmount property.
             * 
             */
            public long getTotalUsageAmount() {
                return totalUsageAmount;
            }

            /**
             * Sets the value of the totalUsageAmount property.
             * 
             */
            public void setTotalUsageAmount(long value) {
                this.totalUsageAmount = value;
            }

            /**
             * Gets the value of the totalRemainAmount property.
             * 
             */
            public long getTotalRemainAmount() {
                return totalRemainAmount;
            }

            /**
             * Sets the value of the totalRemainAmount property.
             * 
             */
            public void setTotalRemainAmount(long value) {
                this.totalRemainAmount = value;
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
             * Gets the value of the creditAmountInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the creditAmountInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCreditAmountInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo }
             * 
             * 
             */
            public List<QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo> getCreditAmountInfo() {
                if (creditAmountInfo == null) {
                    creditAmountInfo = new ArrayList<QueryOCSBalanceResult.AcctList.AccountCredit.CreditAmountInfo>();
                }
                return this.creditAmountInfo;
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
             *         &lt;element name="CreditInstID" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="LimitClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "creditInstID",
                "limitClass",
                "amount",
                "effectiveTime",
                "expireTime"
            })
            public static class CreditAmountInfo {

                @XmlElement(name = "CreditInstID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
                protected long creditInstID;
                @XmlElement(name = "LimitClass", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String limitClass;
                @XmlElement(name = "Amount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
                protected long amount;
                @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String effectiveTime;
                @XmlElement(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String expireTime;

                /**
                 * Gets the value of the creditInstID property.
                 * 
                 */
                public long getCreditInstID() {
                    return creditInstID;
                }

                /**
                 * Sets the value of the creditInstID property.
                 * 
                 */
                public void setCreditInstID(long value) {
                    this.creditInstID = value;
                }

                /**
                 * Gets the value of the limitClass property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLimitClass() {
                    return limitClass;
                }

                /**
                 * Sets the value of the limitClass property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLimitClass(String value) {
                    this.limitClass = value;
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

            }

        }

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
     *         &lt;element name="FreeUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FreeUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MeasureUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalInitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TotalUnusedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="FreeUnitItemDetail" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="CurrentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FreeUnitOrigin" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;choice>
     *                               &lt;element name="OfferingKey" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}OfferingKey">
     *                                       &lt;sequence>
     *                                         &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;/sequence>
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RollOverFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LastRollOveredTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "freeUnitType",
        "freeUnitTypeName",
        "measureUnit",
        "measureUnitName",
        "totalInitialAmount",
        "totalUnusedAmount",
        "freeUnitItemDetail"
    })
    public static class FreeUnitItem {

        @XmlElement(name = "FreeUnitType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String freeUnitType;
        @XmlElement(name = "FreeUnitTypeName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String freeUnitTypeName;
        @XmlElement(name = "MeasureUnit", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String measureUnit;
        @XmlElement(name = "MeasureUnitName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String measureUnitName;
        @XmlElement(name = "TotalInitialAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long totalInitialAmount;
        @XmlElement(name = "TotalUnusedAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long totalUnusedAmount;
        @XmlElement(name = "FreeUnitItemDetail", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected List<QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail> freeUnitItemDetail;

        /**
         * Gets the value of the freeUnitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeUnitType() {
            return freeUnitType;
        }

        /**
         * Sets the value of the freeUnitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeUnitType(String value) {
            this.freeUnitType = value;
        }

        /**
         * Gets the value of the freeUnitTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeUnitTypeName() {
            return freeUnitTypeName;
        }

        /**
         * Sets the value of the freeUnitTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeUnitTypeName(String value) {
            this.freeUnitTypeName = value;
        }

        /**
         * Gets the value of the measureUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasureUnit() {
            return measureUnit;
        }

        /**
         * Sets the value of the measureUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasureUnit(String value) {
            this.measureUnit = value;
        }

        /**
         * Gets the value of the measureUnitName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasureUnitName() {
            return measureUnitName;
        }

        /**
         * Sets the value of the measureUnitName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasureUnitName(String value) {
            this.measureUnitName = value;
        }

        /**
         * Gets the value of the totalInitialAmount property.
         * 
         */
        public long getTotalInitialAmount() {
            return totalInitialAmount;
        }

        /**
         * Sets the value of the totalInitialAmount property.
         * 
         */
        public void setTotalInitialAmount(long value) {
            this.totalInitialAmount = value;
        }

        /**
         * Gets the value of the totalUnusedAmount property.
         * 
         */
        public long getTotalUnusedAmount() {
            return totalUnusedAmount;
        }

        /**
         * Sets the value of the totalUnusedAmount property.
         * 
         */
        public void setTotalUnusedAmount(long value) {
            this.totalUnusedAmount = value;
        }

        /**
         * Gets the value of the freeUnitItemDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeUnitItemDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeUnitItemDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail }
         * 
         * 
         */
        public List<QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail> getFreeUnitItemDetail() {
            if (freeUnitItemDetail == null) {
                freeUnitItemDetail = new ArrayList<QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail>();
            }
            return this.freeUnitItemDetail;
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
         *         &lt;element name="FreeUnitInstanceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="CurrentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="EffectiveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FreeUnitOrigin" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;choice>
         *                     &lt;element name="OfferingKey" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}OfferingKey">
         *                             &lt;sequence>
         *                               &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;/sequence>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RollOverFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LastRollOveredTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "freeUnitInstanceID",
            "initialAmount",
            "currentAmount",
            "effectiveTime",
            "expireTime",
            "freeUnitOrigin",
            "rollOverFlag",
            "lastRollOveredTime"
        })
        public static class FreeUnitItemDetail {

            @XmlElement(name = "FreeUnitInstanceID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long freeUnitInstanceID;
            @XmlElement(name = "InitialAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long initialAmount;
            @XmlElement(name = "CurrentAmount", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected long currentAmount;
            @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String effectiveTime;
            @XmlElement(name = "ExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String expireTime;
            @XmlElement(name = "FreeUnitOrigin", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin freeUnitOrigin;
            @XmlElement(name = "RollOverFlag", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String rollOverFlag;
            @XmlElement(name = "LastRollOveredTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected String lastRollOveredTime;

            /**
             * Gets the value of the freeUnitInstanceID property.
             * 
             */
            public long getFreeUnitInstanceID() {
                return freeUnitInstanceID;
            }

            /**
             * Sets the value of the freeUnitInstanceID property.
             * 
             */
            public void setFreeUnitInstanceID(long value) {
                this.freeUnitInstanceID = value;
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
             * Gets the value of the currentAmount property.
             * 
             */
            public long getCurrentAmount() {
                return currentAmount;
            }

            /**
             * Sets the value of the currentAmount property.
             * 
             */
            public void setCurrentAmount(long value) {
                this.currentAmount = value;
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
             * Gets the value of the freeUnitOrigin property.
             * 
             * @return
             *     possible object is
             *     {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin }
             *     
             */
            public QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin getFreeUnitOrigin() {
                return freeUnitOrigin;
            }

            /**
             * Sets the value of the freeUnitOrigin property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin }
             *     
             */
            public void setFreeUnitOrigin(QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin value) {
                this.freeUnitOrigin = value;
            }

            /**
             * Gets the value of the rollOverFlag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRollOverFlag() {
                return rollOverFlag;
            }

            /**
             * Sets the value of the rollOverFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRollOverFlag(String value) {
                this.rollOverFlag = value;
            }

            /**
             * Gets the value of the lastRollOveredTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastRollOveredTime() {
                return lastRollOveredTime;
            }

            /**
             * Sets the value of the lastRollOveredTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastRollOveredTime(String value) {
                this.lastRollOveredTime = value;
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
             *         &lt;element name="OriginType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;choice>
             *           &lt;element name="OfferingKey" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}OfferingKey">
             *                   &lt;sequence>
             *                     &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;/sequence>
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="PlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;/choice>
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
                "originType",
                "offeringKey",
                "planID"
            })
            public static class FreeUnitOrigin {

                @XmlElement(name = "OriginType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String originType;
                @XmlElement(name = "OfferingKey", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
                protected QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey offeringKey;
                @XmlElementRef(name = "PlanID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", type = JAXBElement.class, required = false)
                protected JAXBElement<Long> planID;

                /**
                 * Gets the value of the originType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginType() {
                    return originType;
                }

                /**
                 * Sets the value of the originType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginType(String value) {
                    this.originType = value;
                }

                /**
                 * Gets the value of the offeringKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey }
                 *     
                 */
                public QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey getOfferingKey() {
                    return offeringKey;
                }

                /**
                 * Sets the value of the offeringKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey }
                 *     
                 */
                public void setOfferingKey(QueryOCSBalanceResult.FreeUnitItem.FreeUnitItemDetail.FreeUnitOrigin.OfferingKey value) {
                    this.offeringKey = value;
                }

                /**
                 * Gets the value of the planID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                 *     
                 */
                public JAXBElement<Long> getPlanID() {
                    return planID;
                }

                /**
                 * Sets the value of the planID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                 *     
                 */
                public void setPlanID(JAXBElement<Long> value) {
                    this.planID = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://cbs.huawei.com/ar/wsservice/arcommon}OfferingKey">
                 *       &lt;sequence>
                 *         &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "offeringName"
                })
                public static class OfferingKey
                    extends com.huawei.ocs55.arservices.OfferingKey
                {

                    @XmlElement(name = "OfferingName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                    protected String offeringName;

                    /**
                     * Gets the value of the offeringName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOfferingName() {
                        return offeringName;
                    }

                    /**
                     * Sets the value of the offeringName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOfferingName(String value) {
                        this.offeringName = value;
                    }

                }

            }

        }

    }

}
