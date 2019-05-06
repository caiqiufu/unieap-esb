
package com.huawei.ocs12.productmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductsByNewSubscriberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductsByNewSubscriberRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeDetail" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductTypeDetail"/>
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paymode" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Paymode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductsByNewSubscriberRequest", propOrder = {
    "typeDetail",
    "brandId",
    "paymode"
})
public class QueryProductsByNewSubscriberRequest {

    @XmlElement(name = "TypeDetail", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String typeDetail;
    @XmlElement(name = "BrandId")
    protected String brandId;
    @XmlElement(name = "Paymode")
    protected String paymode;

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDetail(String value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the paymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymode() {
        return paymode;
    }

    /**
     * Sets the value of the paymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymode(String value) {
        this.paymode = value;
    }

}
