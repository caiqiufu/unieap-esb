
package com.huawei.ocs55.bcservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGroupMemberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGroupMemberRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/>
 *         &lt;element name="GroupMember">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
 *                   &lt;element name="SubGrpMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupMember" minOccurs="0"/>
 *                   &lt;element name="SubInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DisplayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="PaymentLimit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PaymentLimitInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="AddPayRelation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PayRelation" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/>
 *                                       &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PaymentLimitInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *         &lt;element name="GroupMemberOffering" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
 *                 &lt;sequence>
 *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
 *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGroupMemberRequest", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "subGroupAccessCode",
    "groupMember",
    "paymentRelation",
    "groupMemberOffering",
    "effectiveTime",
    "expirationTime"
})
public class AddGroupMemberRequest {

    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupMember", required = true)
    protected AddGroupMemberRequest.GroupMember groupMember;
    @XmlElement(name = "PaymentRelation")
    protected AddGroupMemberRequest.PaymentRelation paymentRelation;
    @XmlElement(name = "GroupMemberOffering")
    protected List<AddGroupMemberRequest.GroupMemberOffering> groupMemberOffering;
    @XmlElement(name = "EffectiveTime", required = true)
    protected EffectMode effectiveTime;
    @XmlElement(name = "ExpirationTime")
    protected String expirationTime;

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
     *     {@link AddGroupMemberRequest.GroupMember }
     *     
     */
    public AddGroupMemberRequest.GroupMember getGroupMember() {
        return groupMember;
    }

    /**
     * Sets the value of the groupMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddGroupMemberRequest.GroupMember }
     *     
     */
    public void setGroupMember(AddGroupMemberRequest.GroupMember value) {
        this.groupMember = value;
    }

    /**
     * Gets the value of the paymentRelation property.
     * 
     * @return
     *     possible object is
     *     {@link AddGroupMemberRequest.PaymentRelation }
     *     
     */
    public AddGroupMemberRequest.PaymentRelation getPaymentRelation() {
        return paymentRelation;
    }

    /**
     * Sets the value of the paymentRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddGroupMemberRequest.PaymentRelation }
     *     
     */
    public void setPaymentRelation(AddGroupMemberRequest.PaymentRelation value) {
        this.paymentRelation = value;
    }

    /**
     * Gets the value of the groupMemberOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupMemberOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupMemberOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddGroupMemberRequest.GroupMemberOffering }
     * 
     * 
     */
    public List<AddGroupMemberRequest.GroupMemberOffering> getGroupMemberOffering() {
        if (groupMemberOffering == null) {
            groupMemberOffering = new ArrayList<AddGroupMemberRequest.GroupMemberOffering>();
        }
        return this.groupMemberOffering;
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
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
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
     *         &lt;element name="SubClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
     *         &lt;element name="SubGrpMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupMember" minOccurs="0"/>
     *         &lt;element name="SubInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DisplayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "subClass",
        "subAccessCode",
        "subGrpMember",
        "subInfo"
    })
    public static class GroupMember {

        @XmlElement(name = "SubClass", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected String subClass;
        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "SubGrpMember", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected SubGroupMember subGrpMember;
        @XmlElement(name = "SubInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected AddGroupMemberRequest.GroupMember.SubInfo subInfo;

        /**
         * Gets the value of the subClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubClass() {
            return subClass;
        }

        /**
         * Sets the value of the subClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubClass(String value) {
            this.subClass = value;
        }

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
         * Gets the value of the subGrpMember property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupMember }
         *     
         */
        public SubGroupMember getSubGrpMember() {
            return subGrpMember;
        }

        /**
         * Sets the value of the subGrpMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupMember }
         *     
         */
        public void setSubGrpMember(SubGroupMember value) {
            this.subGrpMember = value;
        }

        /**
         * Gets the value of the subInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AddGroupMemberRequest.GroupMember.SubInfo }
         *     
         */
        public AddGroupMemberRequest.GroupMember.SubInfo getSubInfo() {
            return subInfo;
        }

        /**
         * Sets the value of the subInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddGroupMemberRequest.GroupMember.SubInfo }
         *     
         */
        public void setSubInfo(AddGroupMemberRequest.GroupMember.SubInfo value) {
            this.subInfo = value;
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
         *         &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WrittenLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IVRLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DisplayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "networkType",
            "numberType",
            "writtenLang",
            "ivrLang",
            "displayNumber"
        })
        public static class SubInfo {

            @XmlElement(name = "NetworkType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String networkType;
            @XmlElement(name = "NumberType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String numberType;
            @XmlElement(name = "WrittenLang", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String writtenLang;
            @XmlElement(name = "IVRLang", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String ivrLang;
            @XmlElement(name = "DisplayNumber", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String displayNumber;

            /**
             * Gets the value of the networkType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetworkType() {
                return networkType;
            }

            /**
             * Sets the value of the networkType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetworkType(String value) {
                this.networkType = value;
            }

            /**
             * Gets the value of the numberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberType() {
                return numberType;
            }

            /**
             * Sets the value of the numberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberType(String value) {
                this.numberType = value;
            }

            /**
             * Gets the value of the writtenLang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWrittenLang() {
                return writtenLang;
            }

            /**
             * Sets the value of the writtenLang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWrittenLang(String value) {
                this.writtenLang = value;
            }

            /**
             * Gets the value of the ivrLang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIVRLang() {
                return ivrLang;
            }

            /**
             * Sets the value of the ivrLang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIVRLang(String value) {
                this.ivrLang = value;
            }

            /**
             * Gets the value of the displayNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayNumber() {
                return displayNumber;
            }

            /**
             * Sets the value of the displayNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayNumber(String value) {
                this.displayNumber = value;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
     *       &lt;sequence>
     *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
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
        "activationTime"
    })
    public static class GroupMemberOffering
        extends OfferingInst
    {

        @XmlElement(name = "ActivationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected ActiveMode activationTime;

        /**
         * Gets the value of the activationTime property.
         * 
         * @return
         *     possible object is
         *     {@link ActiveMode }
         *     
         */
        public ActiveMode getActivationTime() {
            return activationTime;
        }

        /**
         * Sets the value of the activationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActiveMode }
         *     
         */
        public void setActivationTime(ActiveMode value) {
            this.activationTime = value;
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
     *                   &lt;element name="PaymentLimit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PaymentLimitInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
     *                                   &lt;/extension>
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
     *         &lt;element name="AddPayRelation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PayRelation" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/>
     *                             &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PaymentLimitInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
     *                                   &lt;/extension>
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
        "addPayRelation"
    })
    public static class PaymentRelation {

        @XmlElement(name = "NewDFTAcct", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected AddGroupMemberRequest.PaymentRelation.NewDFTAcct newDFTAcct;
        @XmlElement(name = "AddPayRelation", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected AddGroupMemberRequest.PaymentRelation.AddPayRelation addPayRelation;

        /**
         * Gets the value of the newDFTAcct property.
         * 
         * @return
         *     possible object is
         *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct }
         *     
         */
        public AddGroupMemberRequest.PaymentRelation.NewDFTAcct getNewDFTAcct() {
            return newDFTAcct;
        }

        /**
         * Sets the value of the newDFTAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct }
         *     
         */
        public void setNewDFTAcct(AddGroupMemberRequest.PaymentRelation.NewDFTAcct value) {
            this.newDFTAcct = value;
        }

        /**
         * Gets the value of the addPayRelation property.
         * 
         * @return
         *     possible object is
         *     {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation }
         *     
         */
        public AddGroupMemberRequest.PaymentRelation.AddPayRelation getAddPayRelation() {
            return addPayRelation;
        }

        /**
         * Sets the value of the addPayRelation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation }
         *     
         */
        public void setAddPayRelation(AddGroupMemberRequest.PaymentRelation.AddPayRelation value) {
            this.addPayRelation = value;
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
         *         &lt;element name="PayRelation" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/>
         *                   &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PaymentLimit" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PaymentLimitInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
         *                         &lt;/extension>
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
            "payRelation",
            "paymentLimit"
        })
        public static class AddPayRelation {

            @XmlElement(name = "PayRelation", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected List<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation> payRelation;
            @XmlElement(name = "PaymentLimit", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected List<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit> paymentLimit;

            /**
             * Gets the value of the payRelation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the payRelation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPayRelation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation }
             * 
             * 
             */
            public List<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation> getPayRelation() {
                if (payRelation == null) {
                    payRelation = new ArrayList<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PayRelation>();
                }
                return this.payRelation;
            }

            /**
             * Gets the value of the paymentLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paymentLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaymentLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit }
             * 
             * 
             */
            public List<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit> getPaymentLimit() {
                if (paymentLimit == null) {
                    paymentLimit = new ArrayList<AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit>();
                }
                return this.paymentLimit;
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
             *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="PayRelExtRule" type="{http://www.huawei.com/bme/cbsinterface/bccommon}PayRelExtRule" minOccurs="0"/>
             *         &lt;element name="OnlyPayRelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "acctKey",
                "priority",
                "payRelExtRule",
                "onlyPayRelFlag",
                "paymentLimitKey"
            })
            public static class PayRelation {

                @XmlElement(name = "PayRelationKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected String payRelationKey;
                @XmlElement(name = "AcctKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected String acctKey;
                @XmlElement(name = "Priority", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected BigInteger priority;
                @XmlElement(name = "PayRelExtRule", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
                protected PayRelExtRule payRelExtRule;
                @XmlElement(name = "OnlyPayRelFlag", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
                protected String onlyPayRelFlag;
                @XmlElement(name = "PaymentLimitKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
                protected String paymentLimitKey;

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

                /**
                 * Gets the value of the priority property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPriority(BigInteger value) {
                    this.priority = value;
                }

                /**
                 * Gets the value of the payRelExtRule property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PayRelExtRule }
                 *     
                 */
                public PayRelExtRule getPayRelExtRule() {
                    return payRelExtRule;
                }

                /**
                 * Sets the value of the payRelExtRule property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PayRelExtRule }
                 *     
                 */
                public void setPayRelExtRule(PayRelExtRule value) {
                    this.payRelExtRule = value;
                }

                /**
                 * Gets the value of the onlyPayRelFlag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnlyPayRelFlag() {
                    return onlyPayRelFlag;
                }

                /**
                 * Sets the value of the onlyPayRelFlag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnlyPayRelFlag(String value) {
                    this.onlyPayRelFlag = value;
                }

                /**
                 * Gets the value of the paymentLimitKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaymentLimitKey() {
                    return paymentLimitKey;
                }

                /**
                 * Sets the value of the paymentLimitKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaymentLimitKey(String value) {
                    this.paymentLimitKey = value;
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
             *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PaymentLimitInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
             *               &lt;/extension>
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
                "paymentLimitKey",
                "paymentLimitInfo"
            })
            public static class PaymentLimit {

                @XmlElement(name = "PaymentLimitKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected String paymentLimitKey;
                @XmlElement(name = "PaymentLimitInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

                /**
                 * Gets the value of the paymentLimitKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaymentLimitKey() {
                    return paymentLimitKey;
                }

                /**
                 * Sets the value of the paymentLimitKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaymentLimitKey(String value) {
                    this.paymentLimitKey = value;
                }

                /**
                 * Gets the value of the paymentLimitInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                    return paymentLimitInfo;
                }

                /**
                 * Sets the value of the paymentLimitInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public void setPaymentLimitInfo(AddGroupMemberRequest.PaymentRelation.AddPayRelation.PaymentLimit.PaymentLimitInfo value) {
                    this.paymentLimitInfo = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PaymentLimitInfo
                    extends com.huawei.ocs55.bcservices.PaymentLimit
                {


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
         *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PaymentLimit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PaymentLimitInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
         *                         &lt;/extension>
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
            "payRelationKey",
            "acctKey",
            "paymentLimit"
        })
        public static class NewDFTAcct {

            @XmlElement(name = "PayRelationKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String payRelationKey;
            @XmlElement(name = "AcctKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String acctKey;
            @XmlElement(name = "PaymentLimit", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit paymentLimit;

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

            /**
             * Gets the value of the paymentLimit property.
             * 
             * @return
             *     possible object is
             *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit }
             *     
             */
            public AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit getPaymentLimit() {
                return paymentLimit;
            }

            /**
             * Sets the value of the paymentLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit }
             *     
             */
            public void setPaymentLimit(AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit value) {
                this.paymentLimit = value;
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
             *         &lt;element name="PaymentLimitKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PaymentLimitInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
             *               &lt;/extension>
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
                "paymentLimitKey",
                "paymentLimitInfo"
            })
            public static class PaymentLimit {

                @XmlElement(name = "PaymentLimitKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
                protected String paymentLimitKey;
                @XmlElement(name = "PaymentLimitInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
                protected AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo paymentLimitInfo;

                /**
                 * Gets the value of the paymentLimitKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaymentLimitKey() {
                    return paymentLimitKey;
                }

                /**
                 * Sets the value of the paymentLimitKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaymentLimitKey(String value) {
                    this.paymentLimitKey = value;
                }

                /**
                 * Gets the value of the paymentLimitInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo getPaymentLimitInfo() {
                    return paymentLimitInfo;
                }

                /**
                 * Sets the value of the paymentLimitInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo }
                 *     
                 */
                public void setPaymentLimitInfo(AddGroupMemberRequest.PaymentRelation.NewDFTAcct.PaymentLimit.PaymentLimitInfo value) {
                    this.paymentLimitInfo = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}PaymentLimit">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PaymentLimitInfo
                    extends com.huawei.ocs55.bcservices.PaymentLimit
                {


                }

            }

        }

    }

}
