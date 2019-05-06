
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeGroupOfferingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeGroupOfferingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyOffering" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
 *                   &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *                   &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
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
@XmlType(name = "ChangeGroupOfferingResult", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "modifyOffering"
})
public class ChangeGroupOfferingResult {

    @XmlElement(name = "ModifyOffering")
    protected List<ChangeGroupOfferingResult.ModifyOffering> modifyOffering;

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
     * {@link ChangeGroupOfferingResult.ModifyOffering }
     * 
     * 
     */
    public List<ChangeGroupOfferingResult.ModifyOffering> getModifyOffering() {
        if (modifyOffering == null) {
            modifyOffering = new ArrayList<ChangeGroupOfferingResult.ModifyOffering>();
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OfferingKey" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingKey"/>
     *         &lt;element name="NewEffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
     *         &lt;element name="NewExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
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
        @XmlElement(name = "NewEffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String newEffectiveTime;
        @XmlElement(name = "NewExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String newExpirationTime;

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
         *     {@link String }
         *     
         */
        public String getNewExpirationTime() {
            return newExpirationTime;
        }

        /**
         * Sets the value of the newExpirationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewExpirationTime(String value) {
            this.newExpirationTime = value;
        }

    }

}
