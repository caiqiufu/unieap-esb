
package com.huawei.ocs55.bcservices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmtKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SmtClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SmtInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}StatementInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement", propOrder = {
    "smtKey",
    "invoiceType",
    "smtClass",
    "smtInfo"
})
public class Statement {

    @XmlElement(name = "SmtKey", required = true)
    protected String smtKey;
    @XmlElement(name = "InvoiceType", required = true)
    protected BigInteger invoiceType;
    @XmlElement(name = "SmtClass", required = true)
    protected String smtClass;
    @XmlElement(name = "SmtInfo", required = true)
    protected StatementInfo smtInfo;

    /**
     * Gets the value of the smtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtKey() {
        return smtKey;
    }

    /**
     * Sets the value of the smtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtKey(String value) {
        this.smtKey = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvoiceType(BigInteger value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the smtClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtClass() {
        return smtClass;
    }

    /**
     * Sets the value of the smtClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtClass(String value) {
        this.smtClass = value;
    }

    /**
     * Gets the value of the smtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatementInfo }
     *     
     */
    public StatementInfo getSmtInfo() {
        return smtInfo;
    }

    /**
     * Sets the value of the smtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementInfo }
     *     
     */
    public void setSmtInfo(StatementInfo value) {
        this.smtInfo = value;
    }

}
