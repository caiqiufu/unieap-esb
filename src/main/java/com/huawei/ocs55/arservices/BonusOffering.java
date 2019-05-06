
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BonusOffering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BonusOffering">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferInstID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="OfferID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="OwnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerInstID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BonusOffering", propOrder = {
    "offerInstID",
    "offerID",
    "ownType",
    "ownerInstID",
    "applyTime",
    "expireTime"
})
public class BonusOffering {

    @XmlElement(name = "OfferInstID", required = true)
    protected BigInteger offerInstID;
    @XmlElement(name = "OfferID", required = true)
    protected BigInteger offerID;
    @XmlElement(name = "OwnType", required = true)
    protected String ownType;
    @XmlElement(name = "OwnerInstID", required = true)
    protected BigInteger ownerInstID;
    @XmlElement(name = "ApplyTime", required = true)
    protected String applyTime;
    @XmlElement(name = "ExpireTime", required = true)
    protected String expireTime;

    /**
     * Gets the value of the offerInstID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferInstID() {
        return offerInstID;
    }

    /**
     * Sets the value of the offerInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferInstID(BigInteger value) {
        this.offerInstID = value;
    }

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferID(BigInteger value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the ownType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnType() {
        return ownType;
    }

    /**
     * Sets the value of the ownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnType(String value) {
        this.ownType = value;
    }

    /**
     * Gets the value of the ownerInstID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerInstID() {
        return ownerInstID;
    }

    /**
     * Sets the value of the ownerInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerInstID(BigInteger value) {
        this.ownerInstID = value;
    }

    /**
     * Gets the value of the applyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * Sets the value of the applyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTime(String value) {
        this.applyTime = value;
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
