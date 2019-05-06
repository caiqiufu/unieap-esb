
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubIdentityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubIdentity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RelatedSubIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubIdentity", propOrder = {
    "subIdentityType",
    "subIdentity",
    "primaryFlag",
    "relatedSubIdentity"
})
public class SubIdentity {

    @XmlElement(name = "SubIdentityType", required = true)
    protected String subIdentityType;
    @XmlElement(name = "SubIdentity", required = true)
    protected String subIdentity;
    @XmlElement(name = "PrimaryFlag", required = true)
    protected String primaryFlag;
    @XmlElement(name = "RelatedSubIdentity")
    protected String relatedSubIdentity;

    /**
     * Gets the value of the subIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubIdentityType() {
        return subIdentityType;
    }

    /**
     * Sets the value of the subIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIdentityType(String value) {
        this.subIdentityType = value;
    }

    /**
     * Gets the value of the subIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubIdentity() {
        return subIdentity;
    }

    /**
     * Sets the value of the subIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIdentity(String value) {
        this.subIdentity = value;
    }

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFlag(String value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the relatedSubIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedSubIdentity() {
        return relatedSubIdentity;
    }

    /**
     * Sets the value of the relatedSubIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedSubIdentity(String value) {
        this.relatedSubIdentity = value;
    }

}
