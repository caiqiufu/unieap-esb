
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPromotionPlanResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPromotionPlanResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPlan" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}PromotionPlanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPromotionPlanResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "promotionPlan"
})
public class QueryPromotionPlanResult {

    @XmlElement(name = "PromotionPlan", required = true)
    protected PromotionPlanType promotionPlan;

    /**
     * Gets the value of the promotionPlan property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionPlanType }
     *     
     */
    public PromotionPlanType getPromotionPlan() {
        return promotionPlan;
    }

    /**
     * Sets the value of the promotionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionPlanType }
     *     
     */
    public void setPromotionPlan(PromotionPlanType value) {
        this.promotionPlan = value;
    }

}
