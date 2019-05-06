
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ActiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *           &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveMode", propOrder = {
    "mode",
    "activeTime",
    "activeTimeLimit"
})
public class ActiveMode {

    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElement(name = "ActiveTime")
    protected String activeTime;
    @XmlElement(name = "ActiveTimeLimit")
    protected String activeTimeLimit;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the activeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * Sets the value of the activeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTime(String value) {
        this.activeTime = value;
    }

    /**
     * Gets the value of the activeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTimeLimit() {
        return activeTimeLimit;
    }

    /**
     * Sets the value of the activeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTimeLimit(String value) {
        this.activeTimeLimit = value;
    }

}
