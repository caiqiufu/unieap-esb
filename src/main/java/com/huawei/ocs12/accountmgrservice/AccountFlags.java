
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFlags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="activationStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negativeBarringStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFeePeriodWarningActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisionPeriodExpiryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceFeePeriodExpiryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupervisionPeriodWarningActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountFlags", propOrder = {

})
public class AccountFlags {

    protected String activationStatusFlag;
    protected String negativeBarringStatusFlag;
    protected String serviceFeePeriodWarningActiveFlag;
    protected String supervisionPeriodExpiryFlag;
    protected String serviceFeePeriodExpiryFlag;
    @XmlElement(name = "SupervisionPeriodWarningActiveFlag")
    protected String supervisionPeriodWarningActiveFlag;

    /**
     * Gets the value of the activationStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationStatusFlag() {
        return activationStatusFlag;
    }

    /**
     * Sets the value of the activationStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationStatusFlag(String value) {
        this.activationStatusFlag = value;
    }

    /**
     * Gets the value of the negativeBarringStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeBarringStatusFlag() {
        return negativeBarringStatusFlag;
    }

    /**
     * Sets the value of the negativeBarringStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeBarringStatusFlag(String value) {
        this.negativeBarringStatusFlag = value;
    }

    /**
     * Gets the value of the serviceFeePeriodWarningActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeePeriodWarningActiveFlag() {
        return serviceFeePeriodWarningActiveFlag;
    }

    /**
     * Sets the value of the serviceFeePeriodWarningActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeePeriodWarningActiveFlag(String value) {
        this.serviceFeePeriodWarningActiveFlag = value;
    }

    /**
     * Gets the value of the supervisionPeriodExpiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisionPeriodExpiryFlag() {
        return supervisionPeriodExpiryFlag;
    }

    /**
     * Sets the value of the supervisionPeriodExpiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisionPeriodExpiryFlag(String value) {
        this.supervisionPeriodExpiryFlag = value;
    }

    /**
     * Gets the value of the serviceFeePeriodExpiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeePeriodExpiryFlag() {
        return serviceFeePeriodExpiryFlag;
    }

    /**
     * Sets the value of the serviceFeePeriodExpiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeePeriodExpiryFlag(String value) {
        this.serviceFeePeriodExpiryFlag = value;
    }

    /**
     * Gets the value of the supervisionPeriodWarningActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisionPeriodWarningActiveFlag() {
        return supervisionPeriodWarningActiveFlag;
    }

    /**
     * Sets the value of the supervisionPeriodWarningActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisionPeriodWarningActiveFlag(String value) {
        this.supervisionPeriodWarningActiveFlag = value;
    }

}
