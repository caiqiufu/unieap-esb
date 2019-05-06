
package com.huawei.ocs55.arservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubGroupAccessCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGroupAccessCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubGroupAccessCode", propOrder = {
    "subGroupKey",
    "subGroupCode"
})
public class SubGroupAccessCode {

    @XmlElement(name = "SubGroupKey")
    protected String subGroupKey;
    @XmlElement(name = "SubGroupCode")
    protected String subGroupCode;

    /**
     * Gets the value of the subGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupKey() {
        return subGroupKey;
    }

    /**
     * Sets the value of the subGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupKey(String value) {
        this.subGroupKey = value;
    }

    /**
     * Gets the value of the subGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Sets the value of the subGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupCode(String value) {
        this.subGroupCode = value;
    }

}
