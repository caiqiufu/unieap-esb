
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeBillMedium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeBillMedium">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeBillMedium", propOrder = {
    "bmCode",
    "bmType"
})
public class FreeBillMedium {

    @XmlElement(name = "BMCode", required = true)
    protected String bmCode;
    @XmlElement(name = "BMType", required = true)
    protected String bmType;

    /**
     * Gets the value of the bmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMCode() {
        return bmCode;
    }

    /**
     * Sets the value of the bmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMCode(String value) {
        this.bmCode = value;
    }

    /**
     * Gets the value of the bmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMType() {
        return bmType;
    }

    /**
     * Sets the value of the bmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMType(String value) {
        this.bmType = value;
    }

}
