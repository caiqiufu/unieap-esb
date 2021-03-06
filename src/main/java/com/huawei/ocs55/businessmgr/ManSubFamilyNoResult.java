
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManSubFamilyNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManSubFamilyNoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginOperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManSubFamilyNoResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "originTransactionID",
    "originOperatorID",
    "operateFee"
})
public class ManSubFamilyNoResult {

    @XmlElement(name = "OriginTransactionID")
    protected String originTransactionID;
    @XmlElement(name = "OriginOperatorID")
    protected String originOperatorID;
    @XmlElement(name = "OperateFee")
    protected String operateFee;

    /**
     * Gets the value of the originTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }

    /**
     * Sets the value of the originTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTransactionID(String value) {
        this.originTransactionID = value;
    }

    /**
     * Gets the value of the originOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginOperatorID() {
        return originOperatorID;
    }

    /**
     * Sets the value of the originOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginOperatorID(String value) {
        this.originOperatorID = value;
    }

    /**
     * Gets the value of the operateFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateFee() {
        return operateFee;
    }

    /**
     * Sets the value of the operateFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateFee(String value) {
        this.operateFee = value;
    }

}
