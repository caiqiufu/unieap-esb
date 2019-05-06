
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUGList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUGList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CUGId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUGName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUGList", propOrder = {

})
public class CUGList {

    @XmlElement(name = "CUGId", required = true, nillable = true)
    protected String cugId;
    @XmlElement(name = "CUGName", required = true, nillable = true)
    protected String cugName;

    /**
     * Gets the value of the cugId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGId() {
        return cugId;
    }

    /**
     * Sets the value of the cugId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGId(String value) {
        this.cugId = value;
    }

    /**
     * Gets the value of the cugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGName() {
        return cugName;
    }

    /**
     * Sets the value of the cugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGName(String value) {
        this.cugName = value;
    }

}
