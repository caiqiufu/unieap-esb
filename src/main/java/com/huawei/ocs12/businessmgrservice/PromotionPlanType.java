
package com.huawei.ocs12.businessmgrservice;

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
 *       &lt;all>
 *         &lt;element name="PromotionPlanID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromoPlanStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromotionPlanEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionPlanType", propOrder = {

})
public class PromotionPlanType {

    @XmlElement(name = "PromotionPlanID", required = true)
    protected String promotionPlanID;
    @XmlElement(name = "PromoPlanStartDateTime", required = true)
    protected String promoPlanStartDateTime;
    @XmlElement(name = "PromotionPlanEndDate", required = true)
    protected String promotionPlanEndDate;

    /**
     * Gets the value of the promotionPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanID() {
        return promotionPlanID;
    }

    /**
     * Sets the value of the promotionPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanID(String value) {
        this.promotionPlanID = value;
    }

    /**
     * Gets the value of the promoPlanStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoPlanStartDateTime() {
        return promoPlanStartDateTime;
    }

    /**
     * Sets the value of the promoPlanStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoPlanStartDateTime(String value) {
        this.promoPlanStartDateTime = value;
    }

    /**
     * Gets the value of the promotionPlanEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanEndDate() {
        return promotionPlanEndDate;
    }

    /**
     * Sets the value of the promotionPlanEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanEndDate(String value) {
        this.promotionPlanEndDate = value;
    }

}
