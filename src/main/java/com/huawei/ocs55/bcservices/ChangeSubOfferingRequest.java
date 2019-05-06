
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeSubOfferingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubOfferingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
 *         &lt;element name="PrimaryOffering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
 *                   &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/>
 *                   &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplementaryOffering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
 *                           &lt;sequence>
 *                             &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
 *                             &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *                             &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
 *                             &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
 *                             &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/>
 *                             &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/>
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
@XmlType(name = "ChangeSubOfferingRequest", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "subAccessCode",
    "primaryOffering",
    "supplementaryOffering"
})
public class ChangeSubOfferingRequest {

    @XmlElement(name = "SubAccessCode", required = true)
    protected SubAccessCode subAccessCode;
    @XmlElement(name = "PrimaryOffering")
    protected ChangeSubOfferingRequest.PrimaryOffering primaryOffering;
    @XmlElement(name = "SupplementaryOffering")
    protected ChangeSubOfferingRequest.SupplementaryOffering supplementaryOffering;

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
     * Gets the value of the primaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubOfferingRequest.PrimaryOffering }
     *     
     */
    public ChangeSubOfferingRequest.PrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }

    /**
     * Sets the value of the primaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubOfferingRequest.PrimaryOffering }
     *     
     */
    public void setPrimaryOffering(ChangeSubOfferingRequest.PrimaryOffering value) {
        this.primaryOffering = value;
    }

    /**
     * Gets the value of the supplementaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSubOfferingRequest.SupplementaryOffering }
     *     
     */
    public ChangeSubOfferingRequest.SupplementaryOffering getSupplementaryOffering() {
        return supplementaryOffering;
    }

    /**
     * Sets the value of the supplementaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSubOfferingRequest.SupplementaryOffering }
     *     
     */
    public void setSupplementaryOffering(ChangeSubOfferingRequest.SupplementaryOffering value) {
        this.supplementaryOffering = value;
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
     *         &lt;element name="OldPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
     *         &lt;element name="NewPrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/>
     *         &lt;element name="NewBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "oldPrimaryOffering",
        "newPrimaryOffering",
        "newBrand",
        "effectiveTime"
    })
    public static class PrimaryOffering {

        @XmlElement(name = "OldPrimaryOffering", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected OfferingKey oldPrimaryOffering;
        @XmlElement(name = "NewPrimaryOffering", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected POfferingInst newPrimaryOffering;
        @XmlElement(name = "NewBrand", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected String newBrand;
        @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected EffectMode effectiveTime;

        /**
         * Gets the value of the oldPrimaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingKey }
         *     
         */
        public OfferingKey getOldPrimaryOffering() {
            return oldPrimaryOffering;
        }

        /**
         * Sets the value of the oldPrimaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingKey }
         *     
         */
        public void setOldPrimaryOffering(OfferingKey value) {
            this.oldPrimaryOffering = value;
        }

        /**
         * Gets the value of the newPrimaryOffering property.
         * 
         * @return
         *     possible object is
         *     {@link POfferingInst }
         *     
         */
        public POfferingInst getNewPrimaryOffering() {
            return newPrimaryOffering;
        }

        /**
         * Sets the value of the newPrimaryOffering property.
         * 
         * @param value
         *     allowed object is
         *     {@link POfferingInst }
         *     
         */
        public void setNewPrimaryOffering(POfferingInst value) {
            this.newPrimaryOffering = value;
        }

        /**
         * Gets the value of the newBrand property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewBrand() {
            return newBrand;
        }

        /**
         * Sets the value of the newBrand property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewBrand(String value) {
            this.newBrand = value;
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
     *         &lt;element name="AddOffering" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
     *                 &lt;sequence>
     *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
     *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
     *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DelOffering" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
     *                   &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
     *                   &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/>
     *                   &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/>
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
        "addOffering",
        "delOffering",
        "modifyOffering"
    })
    public static class SupplementaryOffering {

        @XmlElement(name = "AddOffering", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected List<ChangeSubOfferingRequest.SupplementaryOffering.AddOffering> addOffering;
        @XmlElement(name = "DelOffering", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected List<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering> delOffering;
        @XmlElement(name = "ModifyOffering", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected List<ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering> modifyOffering;

        /**
         * Gets the value of the addOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubOfferingRequest.SupplementaryOffering.AddOffering }
         * 
         * 
         */
        public List<ChangeSubOfferingRequest.SupplementaryOffering.AddOffering> getAddOffering() {
            if (addOffering == null) {
                addOffering = new ArrayList<ChangeSubOfferingRequest.SupplementaryOffering.AddOffering>();
            }
            return this.addOffering;
        }

        /**
         * Gets the value of the delOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubOfferingRequest.SupplementaryOffering.DelOffering }
         * 
         * 
         */
        public List<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering> getDelOffering() {
            if (delOffering == null) {
                delOffering = new ArrayList<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering>();
            }
            return this.delOffering;
        }

        /**
         * Gets the value of the modifyOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering }
         * 
         * 
         */
        public List<ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering> getModifyOffering() {
            if (modifyOffering == null) {
                modifyOffering = new ArrayList<ChangeSubOfferingRequest.SupplementaryOffering.ModifyOffering>();
            }
            return this.modifyOffering;
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
         *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
         *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
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
            "effectiveTime",
            "expirationTime",
            "activationTime"
        })
        public static class AddOffering
            extends OfferingInst
        {

            @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected EffectMode effectiveTime;
            @XmlElement(name = "ExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected String expirationTime;
            @XmlElement(name = "ActivationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected ActiveMode activationTime;

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
         *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
         *         &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty">
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
            "offeringKey",
            "additionalProperty"
        })
        public static class DelOffering {

            @XmlElement(name = "OfferingKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected OfferingKey offeringKey;
            @XmlElement(name = "AdditionalProperty", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected List<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty> additionalProperty;

            /**
             * Gets the value of the offeringKey property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingKey }
             *     
             */
            public OfferingKey getOfferingKey() {
                return offeringKey;
            }

            /**
             * Sets the value of the offeringKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingKey }
             *     
             */
            public void setOfferingKey(OfferingKey value) {
                this.offeringKey = value;
            }

            /**
             * Gets the value of the additionalProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty }
             * 
             * 
             */
            public List<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty> getAdditionalProperty() {
                if (additionalProperty == null) {
                    additionalProperty = new ArrayList<ChangeSubOfferingRequest.SupplementaryOffering.DelOffering.AdditionalProperty>();
                }
                return this.additionalProperty;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdditionalProperty
                extends SimpleProperty
            {


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
         *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
         *         &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/>
         *         &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingExpireMode" minOccurs="0"/>
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
            "offeringKey",
            "newEffectiveTime",
            "newExpirationTime"
        })
        public static class ModifyOffering {

            @XmlElement(name = "OfferingKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
            protected OfferingKey offeringKey;
            @XmlElement(name = "NewEffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected String newEffectiveTime;
            @XmlElement(name = "NewExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
            protected OfferingExpireMode newExpirationTime;

            /**
             * Gets the value of the offeringKey property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingKey }
             *     
             */
            public OfferingKey getOfferingKey() {
                return offeringKey;
            }

            /**
             * Sets the value of the offeringKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingKey }
             *     
             */
            public void setOfferingKey(OfferingKey value) {
                this.offeringKey = value;
            }

            /**
             * Gets the value of the newEffectiveTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewEffectiveTime() {
                return newEffectiveTime;
            }

            /**
             * Sets the value of the newEffectiveTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewEffectiveTime(String value) {
                this.newEffectiveTime = value;
            }

            /**
             * Gets the value of the newExpirationTime property.
             * 
             * @return
             *     possible object is
             *     {@link OfferingExpireMode }
             *     
             */
            public OfferingExpireMode getNewExpirationTime() {
                return newExpirationTime;
            }

            /**
             * Sets the value of the newExpirationTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferingExpireMode }
             *     
             */
            public void setNewExpirationTime(OfferingExpireMode value) {
                this.newExpirationTime = value;
            }

        }

    }

}
