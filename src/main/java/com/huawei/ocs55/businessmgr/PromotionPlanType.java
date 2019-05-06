
package com.huawei.ocs55.businessmgr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPlanID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PromotionPlanStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromotionPlanEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionPlanType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "promotionPlanID",
    "promotionPlanStartDateTime",
    "promotionPlanEndDateTime"
})
public class PromotionPlanType {

    @XmlElement(name = "PromotionPlanID", required = true)
    protected BigInteger promotionPlanID;
    @XmlElement(name = "PromotionPlanStartDateTime", required = true)
    protected String promotionPlanStartDateTime;
    @XmlElement(name = "PromotionPlanEndDateTime", required = true)
    protected String promotionPlanEndDateTime;

    /**
     * Gets the value of the promotionPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPromotionPlanID() {
        return promotionPlanID;
    }

    /**
     * Sets the value of the promotionPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPromotionPlanID(BigInteger value) {
        this.promotionPlanID = value;
    }

    /**
     * Gets the value of the promotionPlanStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanStartDateTime() {
        return promotionPlanStartDateTime;
    }

    /**
     * Sets the value of the promotionPlanStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanStartDateTime(String value) {
        this.promotionPlanStartDateTime = value;
    }

    /**
     * Gets the value of the promotionPlanEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanEndDateTime() {
        return promotionPlanEndDateTime;
    }

    /**
     * Sets the value of the promotionPlanEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanEndDateTime(String value) {
        this.promotionPlanEndDateTime = value;
    }

}
