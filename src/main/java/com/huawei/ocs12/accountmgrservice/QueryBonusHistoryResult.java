
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBonusHistoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBonusHistoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryBonusHistoryResultInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BonusType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="BonusAmountInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="BonusAccountType1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BonusAmount1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusAccountType2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BonusAmount2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusAccountType3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BonusAmount3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusAccountType4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BonusAmount4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusAccountType5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BonusAmount5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BonusBalanceInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="BonusBalance1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusBalance2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusBalance3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusBalance4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="BonusBalance5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Subscriberstatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "QueryBonusHistoryResult", propOrder = {
    "queryBonusHistoryResultInfo"
})
public class QueryBonusHistoryResult {

    @XmlElement(name = "QueryBonusHistoryResultInfo")
    protected List<QueryBonusHistoryResult.QueryBonusHistoryResultInfo> queryBonusHistoryResultInfo;

    /**
     * Gets the value of the queryBonusHistoryResultInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryBonusHistoryResultInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryBonusHistoryResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryBonusHistoryResult.QueryBonusHistoryResultInfo }
     * 
     * 
     */
    public List<QueryBonusHistoryResult.QueryBonusHistoryResultInfo> getQueryBonusHistoryResultInfo() {
        if (queryBonusHistoryResultInfo == null) {
            queryBonusHistoryResultInfo = new ArrayList<QueryBonusHistoryResult.QueryBonusHistoryResultInfo>();
        }
        return this.queryBonusHistoryResultInfo;
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
     *       &lt;all>
     *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BonusType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="BonusAmountInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="BonusAccountType1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BonusAmount1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusAccountType2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BonusAmount2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusAccountType3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BonusAmount3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusAccountType4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BonusAmount4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusAccountType5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BonusAmount5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BonusBalanceInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="BonusBalance1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusBalance2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusBalance3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusBalance4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BonusBalance5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Subscriberstatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class QueryBonusHistoryResultInfo {

        @XmlElement(name = "TransactionDateTime")
        protected String transactionDateTime;
        @XmlElement(name = "BonusType")
        protected Integer bonusType;
        @XmlElement(name = "BonusAmountInfo")
        protected QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusAmountInfo bonusAmountInfo;
        @XmlElement(name = "BonusBalanceInfo")
        protected QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusBalanceInfo bonusBalanceInfo;
        @XmlElement(name = "Subscriberstatus")
        protected Integer subscriberstatus;

        /**
         * Gets the value of the transactionDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionDateTime() {
            return transactionDateTime;
        }

        /**
         * Sets the value of the transactionDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionDateTime(String value) {
            this.transactionDateTime = value;
        }

        /**
         * Gets the value of the bonusType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBonusType() {
            return bonusType;
        }

        /**
         * Sets the value of the bonusType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBonusType(Integer value) {
            this.bonusType = value;
        }

        /**
         * Gets the value of the bonusAmountInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusAmountInfo }
         *     
         */
        public QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusAmountInfo getBonusAmountInfo() {
            return bonusAmountInfo;
        }

        /**
         * Sets the value of the bonusAmountInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusAmountInfo }
         *     
         */
        public void setBonusAmountInfo(QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusAmountInfo value) {
            this.bonusAmountInfo = value;
        }

        /**
         * Gets the value of the bonusBalanceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusBalanceInfo }
         *     
         */
        public QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusBalanceInfo getBonusBalanceInfo() {
            return bonusBalanceInfo;
        }

        /**
         * Sets the value of the bonusBalanceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusBalanceInfo }
         *     
         */
        public void setBonusBalanceInfo(QueryBonusHistoryResult.QueryBonusHistoryResultInfo.BonusBalanceInfo value) {
            this.bonusBalanceInfo = value;
        }

        /**
         * Gets the value of the subscriberstatus property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSubscriberstatus() {
            return subscriberstatus;
        }

        /**
         * Sets the value of the subscriberstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSubscriberstatus(Integer value) {
            this.subscriberstatus = value;
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
         *       &lt;all>
         *         &lt;element name="BonusAccountType1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BonusAmount1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusAccountType2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BonusAmount2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusAccountType3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BonusAmount3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusAccountType4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BonusAmount4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusAccountType5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BonusAmount5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class BonusAmountInfo {

            @XmlElement(name = "BonusAccountType1")
            protected Integer bonusAccountType1;
            @XmlElement(name = "BonusAmount1")
            protected Long bonusAmount1;
            @XmlElement(name = "BonusAccountType2")
            protected Integer bonusAccountType2;
            @XmlElement(name = "BonusAmount2")
            protected Long bonusAmount2;
            @XmlElement(name = "BonusAccountType3")
            protected Integer bonusAccountType3;
            @XmlElement(name = "BonusAmount3")
            protected Long bonusAmount3;
            @XmlElement(name = "BonusAccountType4")
            protected Integer bonusAccountType4;
            @XmlElement(name = "BonusAmount4")
            protected Long bonusAmount4;
            @XmlElement(name = "BonusAccountType5")
            protected Integer bonusAccountType5;
            @XmlElement(name = "BonusAmount5")
            protected Long bonusAmount5;

            /**
             * Gets the value of the bonusAccountType1 property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBonusAccountType1() {
                return bonusAccountType1;
            }

            /**
             * Sets the value of the bonusAccountType1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBonusAccountType1(Integer value) {
                this.bonusAccountType1 = value;
            }

            /**
             * Gets the value of the bonusAmount1 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusAmount1() {
                return bonusAmount1;
            }

            /**
             * Sets the value of the bonusAmount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusAmount1(Long value) {
                this.bonusAmount1 = value;
            }

            /**
             * Gets the value of the bonusAccountType2 property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBonusAccountType2() {
                return bonusAccountType2;
            }

            /**
             * Sets the value of the bonusAccountType2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBonusAccountType2(Integer value) {
                this.bonusAccountType2 = value;
            }

            /**
             * Gets the value of the bonusAmount2 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusAmount2() {
                return bonusAmount2;
            }

            /**
             * Sets the value of the bonusAmount2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusAmount2(Long value) {
                this.bonusAmount2 = value;
            }

            /**
             * Gets the value of the bonusAccountType3 property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBonusAccountType3() {
                return bonusAccountType3;
            }

            /**
             * Sets the value of the bonusAccountType3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBonusAccountType3(Integer value) {
                this.bonusAccountType3 = value;
            }

            /**
             * Gets the value of the bonusAmount3 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusAmount3() {
                return bonusAmount3;
            }

            /**
             * Sets the value of the bonusAmount3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusAmount3(Long value) {
                this.bonusAmount3 = value;
            }

            /**
             * Gets the value of the bonusAccountType4 property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBonusAccountType4() {
                return bonusAccountType4;
            }

            /**
             * Sets the value of the bonusAccountType4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBonusAccountType4(Integer value) {
                this.bonusAccountType4 = value;
            }

            /**
             * Gets the value of the bonusAmount4 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusAmount4() {
                return bonusAmount4;
            }

            /**
             * Sets the value of the bonusAmount4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusAmount4(Long value) {
                this.bonusAmount4 = value;
            }

            /**
             * Gets the value of the bonusAccountType5 property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBonusAccountType5() {
                return bonusAccountType5;
            }

            /**
             * Sets the value of the bonusAccountType5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBonusAccountType5(Integer value) {
                this.bonusAccountType5 = value;
            }

            /**
             * Gets the value of the bonusAmount5 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusAmount5() {
                return bonusAmount5;
            }

            /**
             * Sets the value of the bonusAmount5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusAmount5(Long value) {
                this.bonusAmount5 = value;
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
         *       &lt;all>
         *         &lt;element name="BonusBalance1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusBalance2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusBalance3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusBalance4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BonusBalance5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class BonusBalanceInfo {

            @XmlElement(name = "BonusBalance1")
            protected Long bonusBalance1;
            @XmlElement(name = "BonusBalance2")
            protected Long bonusBalance2;
            @XmlElement(name = "BonusBalance3")
            protected Long bonusBalance3;
            @XmlElement(name = "BonusBalance4")
            protected Long bonusBalance4;
            @XmlElement(name = "BonusBalance5")
            protected Long bonusBalance5;

            /**
             * Gets the value of the bonusBalance1 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusBalance1() {
                return bonusBalance1;
            }

            /**
             * Sets the value of the bonusBalance1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusBalance1(Long value) {
                this.bonusBalance1 = value;
            }

            /**
             * Gets the value of the bonusBalance2 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusBalance2() {
                return bonusBalance2;
            }

            /**
             * Sets the value of the bonusBalance2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusBalance2(Long value) {
                this.bonusBalance2 = value;
            }

            /**
             * Gets the value of the bonusBalance3 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusBalance3() {
                return bonusBalance3;
            }

            /**
             * Sets the value of the bonusBalance3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusBalance3(Long value) {
                this.bonusBalance3 = value;
            }

            /**
             * Gets the value of the bonusBalance4 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusBalance4() {
                return bonusBalance4;
            }

            /**
             * Sets the value of the bonusBalance4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusBalance4(Long value) {
                this.bonusBalance4 = value;
            }

            /**
             * Gets the value of the bonusBalance5 property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getBonusBalance5() {
                return bonusBalance5;
            }

            /**
             * Sets the value of the bonusBalance5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setBonusBalance5(Long value) {
                this.bonusBalance5 = value;
            }

        }

    }

}
