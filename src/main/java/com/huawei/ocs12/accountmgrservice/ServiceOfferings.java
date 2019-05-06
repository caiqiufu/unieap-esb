
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOfferings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOfferings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="serviceOfferingActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOfferingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOfferings", propOrder = {

})
public class ServiceOfferings {

    @XmlElement(required = true)
    protected String serviceOfferingActiveFlag;
    protected int serviceOfferingID;

    /**
     * Gets the value of the serviceOfferingActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOfferingActiveFlag() {
        return serviceOfferingActiveFlag;
    }

    /**
     * Sets the value of the serviceOfferingActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOfferingActiveFlag(String value) {
        this.serviceOfferingActiveFlag = value;
    }

    /**
     * Gets the value of the serviceOfferingID property.
     * 
     */
    public int getServiceOfferingID() {
        return serviceOfferingID;
    }

    /**
     * Sets the value of the serviceOfferingID property.
     * 
     */
    public void setServiceOfferingID(int value) {
        this.serviceOfferingID = value;
    }

}
