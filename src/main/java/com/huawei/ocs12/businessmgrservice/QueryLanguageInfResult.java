
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLanguageInfResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLanguageInfResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SMSLang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortalLang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLanguageInfResult", propOrder = {
    "lang",
    "smsLang",
    "portalLang"
})
public class QueryLanguageInfResult {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "SMSLang", required = true)
    protected String smsLang;
    @XmlElement(name = "PortalLang", required = true)
    protected String portalLang;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the smsLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSLang() {
        return smsLang;
    }

    /**
     * Sets the value of the smsLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSLang(String value) {
        this.smsLang = value;
    }

    /**
     * Gets the value of the portalLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalLang() {
        return portalLang;
    }

    /**
     * Sets the value of the portalLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalLang(String value) {
        this.portalLang = value;
    }

}
