
package com.huawei.ocs55.bcservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxChargeCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ExceptionRate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxException", propOrder = {
    "taxChargeCode",
    "exceptionRate"
})
public class TaxException {

    @XmlElement(name = "TaxChargeCode", required = true)
    protected BigInteger taxChargeCode;
    @XmlElement(name = "ExceptionRate", required = true)
    protected BigInteger exceptionRate;

    /**
     * Gets the value of the taxChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxChargeCode() {
        return taxChargeCode;
    }

    /**
     * Sets the value of the taxChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxChargeCode(BigInteger value) {
        this.taxChargeCode = value;
    }

    /**
     * Gets the value of the exceptionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExceptionRate() {
        return exceptionRate;
    }

    /**
     * Sets the value of the exceptionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExceptionRate(BigInteger value) {
        this.exceptionRate = value;
    }

}
