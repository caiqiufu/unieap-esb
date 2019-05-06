
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesInfo", propOrder = {
    "salesChannelID",
    "salesID"
})
public class SalesInfo {

    @XmlElement(name = "SalesChannelID")
    protected String salesChannelID;
    @XmlElement(name = "SalesID")
    protected String salesID;

    /**
     * Gets the value of the salesChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelID() {
        return salesChannelID;
    }

    /**
     * Sets the value of the salesChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelID(String value) {
        this.salesChannelID = value;
    }

    /**
     * Gets the value of the salesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesID() {
        return salesID;
    }

    /**
     * Sets the value of the salesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesID(String value) {
        this.salesID = value;
    }

}
