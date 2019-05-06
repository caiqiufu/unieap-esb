
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BonusValidityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BonusValidityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BonusList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BonusInfo" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="BonusAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="ValidType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ValidityDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/all>
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
@XmlType(name = "BonusValidityRequest", propOrder = {
    "subscriberNo",
    "bonusList"
})
public class BonusValidityRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "BonusList", required = true)
    protected BonusValidityRequest.BonusList bonusList;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the bonusList property.
     * 
     * @return
     *     possible object is
     *     {@link BonusValidityRequest.BonusList }
     *     
     */
    public BonusValidityRequest.BonusList getBonusList() {
        return bonusList;
    }

    /**
     * Sets the value of the bonusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BonusValidityRequest.BonusList }
     *     
     */
    public void setBonusList(BonusValidityRequest.BonusList value) {
        this.bonusList = value;
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
     *         &lt;element name="BonusInfo" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="BonusAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="ValidType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ValidityDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    @XmlType(name = "", propOrder = {
        "bonusInfo"
    })
    public static class BonusList {

        @XmlElement(name = "BonusInfo", required = true)
        protected List<BonusValidityRequest.BonusList.BonusInfo> bonusInfo;

        /**
         * Gets the value of the bonusInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bonusInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBonusInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BonusValidityRequest.BonusList.BonusInfo }
         * 
         * 
         */
        public List<BonusValidityRequest.BonusList.BonusInfo> getBonusInfo() {
            if (bonusInfo == null) {
                bonusInfo = new ArrayList<BonusValidityRequest.BonusList.BonusInfo>();
            }
            return this.bonusInfo;
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
         *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="BonusAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="ValidType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ValidityDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        public static class BonusInfo {

            @XmlElement(name = "AccountType")
            protected int accountType;
            @XmlElement(name = "BonusAmount")
            protected long bonusAmount;
            @XmlElement(name = "ValidType")
            protected int validType;
            @XmlElement(name = "ValidityDays")
            protected int validityDays;

            /**
             * Gets the value of the accountType property.
             * 
             */
            public int getAccountType() {
                return accountType;
            }

            /**
             * Sets the value of the accountType property.
             * 
             */
            public void setAccountType(int value) {
                this.accountType = value;
            }

            /**
             * Gets the value of the bonusAmount property.
             * 
             */
            public long getBonusAmount() {
                return bonusAmount;
            }

            /**
             * Sets the value of the bonusAmount property.
             * 
             */
            public void setBonusAmount(long value) {
                this.bonusAmount = value;
            }

            /**
             * Gets the value of the validType property.
             * 
             */
            public int getValidType() {
                return validType;
            }

            /**
             * Sets the value of the validType property.
             * 
             */
            public void setValidType(int value) {
                this.validType = value;
            }

            /**
             * Gets the value of the validityDays property.
             * 
             */
            public int getValidityDays() {
                return validityDays;
            }

            /**
             * Sets the value of the validityDays property.
             * 
             */
            public void setValidityDays(int value) {
                this.validityDays = value;
            }

        }

    }

}
