
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryChildLimitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryChildLimitResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Limitation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Consumption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AvailableLimitation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryChildLimitResult", propOrder = {
    "limitation",
    "consumption",
    "availableLimitation"
})
public class QueryChildLimitResult {

    @XmlElement(name = "Limitation")
    protected int limitation;
    @XmlElement(name = "Consumption")
    protected int consumption;
    @XmlElement(name = "AvailableLimitation")
    protected int availableLimitation;

    /**
     * Gets the value of the limitation property.
     * 
     */
    public int getLimitation() {
        return limitation;
    }

    /**
     * Sets the value of the limitation property.
     * 
     */
    public void setLimitation(int value) {
        this.limitation = value;
    }

    /**
     * Gets the value of the consumption property.
     * 
     */
    public int getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     */
    public void setConsumption(int value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the availableLimitation property.
     * 
     */
    public int getAvailableLimitation() {
        return availableLimitation;
    }

    /**
     * Sets the value of the availableLimitation property.
     * 
     */
    public void setAvailableLimitation(int value) {
        this.availableLimitation = value;
    }

}
