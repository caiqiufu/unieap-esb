
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBalanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transferor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BalanceChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HandlingChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="LifeCycleChgInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FreeUnitChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}FreeUnitChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CreditChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CreditChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transferee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BalanceChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HandlingChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="LoanChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}LoanChgInfo" minOccurs="0"/>
 *                   &lt;element name="LifeCycleChgInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FreeUnitChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}FreeUnitChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CreditChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CreditChgInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransferBalanceResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "transferor",
    "transferee"
})
public class TransferBalanceResult {

    @XmlElement(name = "Transferor")
    protected TransferBalanceResult.Transferor transferor;
    @XmlElement(name = "Transferee")
    protected TransferBalanceResult.Transferee transferee;

    /**
     * Gets the value of the transferor property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceResult.Transferor }
     *     
     */
    public TransferBalanceResult.Transferor getTransferor() {
        return transferor;
    }

    /**
     * Sets the value of the transferor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceResult.Transferor }
     *     
     */
    public void setTransferor(TransferBalanceResult.Transferor value) {
        this.transferor = value;
    }

    /**
     * Gets the value of the transferee property.
     * 
     * @return
     *     possible object is
     *     {@link TransferBalanceResult.Transferee }
     *     
     */
    public TransferBalanceResult.Transferee getTransferee() {
        return transferee;
    }

    /**
     * Sets the value of the transferee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferBalanceResult.Transferee }
     *     
     */
    public void setTransferee(TransferBalanceResult.Transferee value) {
        this.transferee = value;
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
     *         &lt;element name="BalanceChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceChgInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HandlingChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="LoanChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}LoanChgInfo" minOccurs="0"/>
     *         &lt;element name="LifeCycleChgInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FreeUnitChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}FreeUnitChgInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CreditChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CreditChgInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "balanceChgInfo",
        "handlingChargeAmt",
        "currencyID",
        "loanChgInfo",
        "lifeCycleChgInfo",
        "freeUnitChgInfo",
        "creditChgInfo"
    })
    public static class Transferee {

        @XmlElement(name = "BalanceChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<BalanceChgInfo> balanceChgInfo;
        @XmlElement(name = "HandlingChargeAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long handlingChargeAmt;
        @XmlElement(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected BigInteger currencyID;
        @XmlElement(name = "LoanChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected LoanChgInfo loanChgInfo;
        @XmlElement(name = "LifeCycleChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected TransferBalanceResult.Transferee.LifeCycleChgInfo lifeCycleChgInfo;
        @XmlElement(name = "FreeUnitChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<FreeUnitChgInfo> freeUnitChgInfo;
        @XmlElement(name = "CreditChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<CreditChgInfo> creditChgInfo;

        /**
         * Gets the value of the balanceChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BalanceChgInfo }
         * 
         * 
         */
        public List<BalanceChgInfo> getBalanceChgInfo() {
            if (balanceChgInfo == null) {
                balanceChgInfo = new ArrayList<BalanceChgInfo>();
            }
            return this.balanceChgInfo;
        }

        /**
         * Gets the value of the handlingChargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHandlingChargeAmt() {
            return handlingChargeAmt;
        }

        /**
         * Sets the value of the handlingChargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHandlingChargeAmt(Long value) {
            this.handlingChargeAmt = value;
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
         * Gets the value of the loanChgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link LoanChgInfo }
         *     
         */
        public LoanChgInfo getLoanChgInfo() {
            return loanChgInfo;
        }

        /**
         * Sets the value of the loanChgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoanChgInfo }
         *     
         */
        public void setLoanChgInfo(LoanChgInfo value) {
            this.loanChgInfo = value;
        }

        /**
         * Gets the value of the lifeCycleChgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TransferBalanceResult.Transferee.LifeCycleChgInfo }
         *     
         */
        public TransferBalanceResult.Transferee.LifeCycleChgInfo getLifeCycleChgInfo() {
            return lifeCycleChgInfo;
        }

        /**
         * Sets the value of the lifeCycleChgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferBalanceResult.Transferee.LifeCycleChgInfo }
         *     
         */
        public void setLifeCycleChgInfo(TransferBalanceResult.Transferee.LifeCycleChgInfo value) {
            this.lifeCycleChgInfo = value;
        }

        /**
         * Gets the value of the freeUnitChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeUnitChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeUnitChgInfo }
         * 
         * 
         */
        public List<FreeUnitChgInfo> getFreeUnitChgInfo() {
            if (freeUnitChgInfo == null) {
                freeUnitChgInfo = new ArrayList<FreeUnitChgInfo>();
            }
            return this.freeUnitChgInfo;
        }

        /**
         * Gets the value of the creditChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreditChgInfo }
         * 
         * 
         */
        public List<CreditChgInfo> getCreditChgInfo() {
            if (creditChgInfo == null) {
                creditChgInfo = new ArrayList<CreditChgInfo>();
            }
            return this.creditChgInfo;
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
         *         &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "oldLifeCycleStatus",
            "newLifeCycleStatus",
            "chgValidity"
        })
        public static class LifeCycleChgInfo {

            @XmlElement(name = "OldLifeCycleStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected List<TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus> oldLifeCycleStatus;
            @XmlElement(name = "NewLifeCycleStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected List<TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus> newLifeCycleStatus;
            @XmlElement(name = "ChgValidity", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected BigInteger chgValidity;

            /**
             * Gets the value of the oldLifeCycleStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the oldLifeCycleStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOldLifeCycleStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus }
             * 
             * 
             */
            public List<TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus> getOldLifeCycleStatus() {
                if (oldLifeCycleStatus == null) {
                    oldLifeCycleStatus = new ArrayList<TransferBalanceResult.Transferee.LifeCycleChgInfo.OldLifeCycleStatus>();
                }
                return this.oldLifeCycleStatus;
            }

            /**
             * Gets the value of the newLifeCycleStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the newLifeCycleStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNewLifeCycleStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus }
             * 
             * 
             */
            public List<TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus> getNewLifeCycleStatus() {
                if (newLifeCycleStatus == null) {
                    newLifeCycleStatus = new ArrayList<TransferBalanceResult.Transferee.LifeCycleChgInfo.NewLifeCycleStatus>();
                }
                return this.newLifeCycleStatus;
            }

            /**
             * Gets the value of the chgValidity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getChgValidity() {
                return chgValidity;
            }

            /**
             * Sets the value of the chgValidity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setChgValidity(BigInteger value) {
                this.chgValidity = value;
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
             *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "statusName",
                "statusExpireTime",
                "statusIndex"
            })
            public static class NewLifeCycleStatus {

                @XmlElement(name = "StatusName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusName;
                @XmlElement(name = "StatusExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusExpireTime;
                @XmlElement(name = "StatusIndex", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusIndex;

                /**
                 * Gets the value of the statusName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusName() {
                    return statusName;
                }

                /**
                 * Sets the value of the statusName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusName(String value) {
                    this.statusName = value;
                }

                /**
                 * Gets the value of the statusExpireTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusExpireTime() {
                    return statusExpireTime;
                }

                /**
                 * Sets the value of the statusExpireTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusExpireTime(String value) {
                    this.statusExpireTime = value;
                }

                /**
                 * Gets the value of the statusIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusIndex() {
                    return statusIndex;
                }

                /**
                 * Sets the value of the statusIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusIndex(String value) {
                    this.statusIndex = value;
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
             *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "statusName",
                "statusExpireTime",
                "statusIndex"
            })
            public static class OldLifeCycleStatus {

                @XmlElement(name = "StatusName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusName;
                @XmlElement(name = "StatusExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusExpireTime;
                @XmlElement(name = "StatusIndex", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusIndex;

                /**
                 * Gets the value of the statusName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusName() {
                    return statusName;
                }

                /**
                 * Sets the value of the statusName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusName(String value) {
                    this.statusName = value;
                }

                /**
                 * Gets the value of the statusExpireTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusExpireTime() {
                    return statusExpireTime;
                }

                /**
                 * Sets the value of the statusExpireTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusExpireTime(String value) {
                    this.statusExpireTime = value;
                }

                /**
                 * Gets the value of the statusIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusIndex() {
                    return statusIndex;
                }

                /**
                 * Sets the value of the statusIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusIndex(String value) {
                    this.statusIndex = value;
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
     *         &lt;element name="BalanceChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceChgInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HandlingChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="LifeCycleChgInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FreeUnitChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}FreeUnitChgInfo" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CreditChgInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CreditChgInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "balanceChgInfo",
        "handlingChargeAmt",
        "currencyID",
        "lifeCycleChgInfo",
        "freeUnitChgInfo",
        "creditChgInfo"
    })
    public static class Transferor {

        @XmlElement(name = "BalanceChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<BalanceChgInfo> balanceChgInfo;
        @XmlElement(name = "HandlingChargeAmt", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long handlingChargeAmt;
        @XmlElement(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected BigInteger currencyID;
        @XmlElement(name = "LifeCycleChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected TransferBalanceResult.Transferor.LifeCycleChgInfo lifeCycleChgInfo;
        @XmlElement(name = "FreeUnitChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<FreeUnitChgInfo> freeUnitChgInfo;
        @XmlElement(name = "CreditChgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<CreditChgInfo> creditChgInfo;

        /**
         * Gets the value of the balanceChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBalanceChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BalanceChgInfo }
         * 
         * 
         */
        public List<BalanceChgInfo> getBalanceChgInfo() {
            if (balanceChgInfo == null) {
                balanceChgInfo = new ArrayList<BalanceChgInfo>();
            }
            return this.balanceChgInfo;
        }

        /**
         * Gets the value of the handlingChargeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getHandlingChargeAmt() {
            return handlingChargeAmt;
        }

        /**
         * Sets the value of the handlingChargeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHandlingChargeAmt(Long value) {
            this.handlingChargeAmt = value;
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
         * Gets the value of the lifeCycleChgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TransferBalanceResult.Transferor.LifeCycleChgInfo }
         *     
         */
        public TransferBalanceResult.Transferor.LifeCycleChgInfo getLifeCycleChgInfo() {
            return lifeCycleChgInfo;
        }

        /**
         * Sets the value of the lifeCycleChgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferBalanceResult.Transferor.LifeCycleChgInfo }
         *     
         */
        public void setLifeCycleChgInfo(TransferBalanceResult.Transferor.LifeCycleChgInfo value) {
            this.lifeCycleChgInfo = value;
        }

        /**
         * Gets the value of the freeUnitChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeUnitChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeUnitChgInfo }
         * 
         * 
         */
        public List<FreeUnitChgInfo> getFreeUnitChgInfo() {
            if (freeUnitChgInfo == null) {
                freeUnitChgInfo = new ArrayList<FreeUnitChgInfo>();
            }
            return this.freeUnitChgInfo;
        }

        /**
         * Gets the value of the creditChgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditChgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditChgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreditChgInfo }
         * 
         * 
         */
        public List<CreditChgInfo> getCreditChgInfo() {
            if (creditChgInfo == null) {
                creditChgInfo = new ArrayList<CreditChgInfo>();
            }
            return this.creditChgInfo;
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
         *         &lt;element name="OldLifeCycleStatus" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NewLifeCycleStatus" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChgValidity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "oldLifeCycleStatus",
            "newLifeCycleStatus",
            "chgValidity"
        })
        public static class LifeCycleChgInfo {

            @XmlElement(name = "OldLifeCycleStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected List<TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus> oldLifeCycleStatus;
            @XmlElement(name = "NewLifeCycleStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected List<TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus> newLifeCycleStatus;
            @XmlElement(name = "ChgValidity", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
            protected BigInteger chgValidity;

            /**
             * Gets the value of the oldLifeCycleStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the oldLifeCycleStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOldLifeCycleStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus }
             * 
             * 
             */
            public List<TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus> getOldLifeCycleStatus() {
                if (oldLifeCycleStatus == null) {
                    oldLifeCycleStatus = new ArrayList<TransferBalanceResult.Transferor.LifeCycleChgInfo.OldLifeCycleStatus>();
                }
                return this.oldLifeCycleStatus;
            }

            /**
             * Gets the value of the newLifeCycleStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the newLifeCycleStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNewLifeCycleStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus }
             * 
             * 
             */
            public List<TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus> getNewLifeCycleStatus() {
                if (newLifeCycleStatus == null) {
                    newLifeCycleStatus = new ArrayList<TransferBalanceResult.Transferor.LifeCycleChgInfo.NewLifeCycleStatus>();
                }
                return this.newLifeCycleStatus;
            }

            /**
             * Gets the value of the chgValidity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getChgValidity() {
                return chgValidity;
            }

            /**
             * Sets the value of the chgValidity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setChgValidity(BigInteger value) {
                this.chgValidity = value;
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
             *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "statusName",
                "statusExpireTime",
                "statusIndex"
            })
            public static class NewLifeCycleStatus {

                @XmlElement(name = "StatusName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusName;
                @XmlElement(name = "StatusExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusExpireTime;
                @XmlElement(name = "StatusIndex", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusIndex;

                /**
                 * Gets the value of the statusName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusName() {
                    return statusName;
                }

                /**
                 * Sets the value of the statusName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusName(String value) {
                    this.statusName = value;
                }

                /**
                 * Gets the value of the statusExpireTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusExpireTime() {
                    return statusExpireTime;
                }

                /**
                 * Sets the value of the statusExpireTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusExpireTime(String value) {
                    this.statusExpireTime = value;
                }

                /**
                 * Gets the value of the statusIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusIndex() {
                    return statusIndex;
                }

                /**
                 * Sets the value of the statusIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusIndex(String value) {
                    this.statusIndex = value;
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
             *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusExpireTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="StatusIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "statusName",
                "statusExpireTime",
                "statusIndex"
            })
            public static class OldLifeCycleStatus {

                @XmlElement(name = "StatusName", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusName;
                @XmlElement(name = "StatusExpireTime", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusExpireTime;
                @XmlElement(name = "StatusIndex", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
                protected String statusIndex;

                /**
                 * Gets the value of the statusName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusName() {
                    return statusName;
                }

                /**
                 * Sets the value of the statusName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusName(String value) {
                    this.statusName = value;
                }

                /**
                 * Gets the value of the statusExpireTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusExpireTime() {
                    return statusExpireTime;
                }

                /**
                 * Sets the value of the statusExpireTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusExpireTime(String value) {
                    this.statusExpireTime = value;
                }

                /**
                 * Gets the value of the statusIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusIndex() {
                    return statusIndex;
                }

                /**
                 * Sets the value of the statusIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusIndex(String value) {
                    this.statusIndex = value;
                }

            }

        }

    }

}
