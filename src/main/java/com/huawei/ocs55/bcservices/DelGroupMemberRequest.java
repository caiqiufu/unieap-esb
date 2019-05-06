
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelGroupMemberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelGroupMemberRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/>
 *         &lt;element name="GroupMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
 *         &lt;element name="PaymentRelation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NewDFTAcct" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="DelGroupMemberOffering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelGroupMemberRequest", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "subGroupAccessCode",
    "groupMember",
    "paymentRelation",
    "delGroupMemberOffering",
    "effectiveTime"
})
public class DelGroupMemberRequest {

    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupMember", required = true)
    protected SubAccessCode groupMember;
    @XmlElement(name = "PaymentRelation")
    protected DelGroupMemberRequest.PaymentRelation paymentRelation;
    @XmlElement(name = "DelGroupMemberOffering")
    protected DelGroupMemberRequest.DelGroupMemberOffering delGroupMemberOffering;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;

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
     * Gets the value of the groupMember property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCode }
     *     
     */
    public SubAccessCode getGroupMember() {
        return groupMember;
    }

    /**
     * Sets the value of the groupMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCode }
     *     
     */
    public void setGroupMember(SubAccessCode value) {
        this.groupMember = value;
    }

    /**
     * Gets the value of the paymentRelation property.
     * 
     * @return
     *     possible object is
     *     {@link DelGroupMemberRequest.PaymentRelation }
     *     
     */
    public DelGroupMemberRequest.PaymentRelation getPaymentRelation() {
        return paymentRelation;
    }

    /**
     * Sets the value of the paymentRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelGroupMemberRequest.PaymentRelation }
     *     
     */
    public void setPaymentRelation(DelGroupMemberRequest.PaymentRelation value) {
        this.paymentRelation = value;
    }

    /**
     * Gets the value of the delGroupMemberOffering property.
     * 
     * @return
     *     possible object is
     *     {@link DelGroupMemberRequest.DelGroupMemberOffering }
     *     
     */
    public DelGroupMemberRequest.DelGroupMemberOffering getDelGroupMemberOffering() {
        return delGroupMemberOffering;
    }

    /**
     * Sets the value of the delGroupMemberOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelGroupMemberRequest.DelGroupMemberOffering }
     *     
     */
    public void setDelGroupMemberOffering(DelGroupMemberRequest.DelGroupMemberOffering value) {
        this.delGroupMemberOffering = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link EffectMode }
     *     
     */
    public EffectMode getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectMode }
     *     
     */
    public void setEffectiveTime(EffectMode value) {
        this.effectiveTime = value;
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
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey" maxOccurs="unbounded"/>
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
        "offeringKey"
    })
    public static class DelGroupMemberOffering {

        @XmlElement(name = "OfferingKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected List<OfferingKey> offeringKey;

        /**
         * Gets the value of the offeringKey property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offeringKey property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferingKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferingKey }
         * 
         * 
         */
        public List<OfferingKey> getOfferingKey() {
            if (offeringKey == null) {
                offeringKey = new ArrayList<OfferingKey>();
            }
            return this.offeringKey;
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
     *         &lt;element name="NewDFTAcct" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DelPayRelation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "newDFTAcct",
        "delPayRelation"
    })
    public static class PaymentRelation {

        @XmlElement(name = "NewDFTAcct", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected DelGroupMemberRequest.PaymentRelation.NewDFTAcct newDFTAcct;
        @XmlElement(name = "DelPayRelation", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected List<DelGroupMemberRequest.PaymentRelation.DelPayRelation> delPayRelation;

        /**
         * Gets the value of the newDFTAcct property.
         * 
         * @return
         *     possible object is
         *     {@link DelGroupMemberRequest.PaymentRelation.NewDFTAcct }
         *     
         */
        public DelGroupMemberRequest.PaymentRelation.NewDFTAcct getNewDFTAcct() {
            return newDFTAcct;
        }

        /**
         * Sets the value of the newDFTAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link DelGroupMemberRequest.PaymentRelation.NewDFTAcct }
         *     
         */
        public void setNewDFTAcct(DelGroupMemberRequest.PaymentRelation.NewDFTAcct value) {
            this.newDFTAcct = value;
        }

        /**
         * Gets the value of the delPayRelation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delPayRelation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelPayRelation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DelGroupMemberRequest.PaymentRelation.DelPayRelation }
         * 
         * 
         */
        public List<DelGroupMemberRequest.PaymentRelation.DelPayRelation> getDelPayRelation() {
            if (delPayRelation == null) {
                delPayRelation = new ArrayList<DelGroupMemberRequest.PaymentRelation.DelPayRelation>();
            }
            return this.delPayRelation;
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
         *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "payRelationKey"
        })
        public static class DelPayRelation {

            @XmlElement(name = "PayRelationKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String payRelationKey;

            /**
             * Gets the value of the payRelationKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayRelationKey() {
                return payRelationKey;
            }

            /**
             * Sets the value of the payRelationKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayRelationKey(String value) {
                this.payRelationKey = value;
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
         *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "payRelationKey",
            "acctKey"
        })
        public static class NewDFTAcct {

            @XmlElement(name = "PayRelationKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String payRelationKey;
            @XmlElement(name = "AcctKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String acctKey;

            /**
             * Gets the value of the payRelationKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayRelationKey() {
                return payRelationKey;
            }

            /**
             * Sets the value of the payRelationKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayRelationKey(String value) {
                this.payRelationKey = value;
            }

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

        }

    }

}
