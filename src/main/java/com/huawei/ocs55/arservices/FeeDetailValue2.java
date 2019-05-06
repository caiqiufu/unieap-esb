
package com.huawei.ocs55.arservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailValue2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailValue2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChargeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferingID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SalesAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ChargeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DiscountAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="WaiveAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ResTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResModeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://cbs.huawei.com/ar/wsservice/arcommon}Tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalProperty" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferingName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailValue2", propOrder = {
    "chargeSeq",
    "chargeCode",
    "offeringID",
    "salesAmount",
    "unitPrice",
    "chargeAmt",
    "discountAmt",
    "waiveAmt",
    "resTypeID",
    "resModeID",
    "tax",
    "additionalProperty",
    "offeringName"
})
public class FeeDetailValue2 {

    @XmlElement(name = "ChargeSeq", required = true)
    protected String chargeSeq;
    @XmlElement(name = "ChargeCode", required = true)
    protected String chargeCode;
    @XmlElement(name = "OfferingID")
    protected BigInteger offeringID;
    @XmlElement(name = "SalesAmount")
    protected BigInteger salesAmount;
    @XmlElement(name = "UnitPrice")
    protected Long unitPrice;
    @XmlElement(name = "ChargeAmt")
    protected long chargeAmt;
    @XmlElement(name = "DiscountAmt")
    protected long discountAmt;
    @XmlElement(name = "WaiveAmt")
    protected long waiveAmt;
    @XmlElement(name = "ResTypeID")
    protected String resTypeID;
    @XmlElement(name = "ResModeID")
    protected String resModeID;
    @XmlElement(name = "Tax")
    protected List<Tax> tax;
    @XmlElement(name = "AdditionalProperty")
    protected List<SimpleProperty> additionalProperty;
    @XmlElement(name = "OfferingName")
    protected Object offeringName;

    /**
     * Gets the value of the chargeSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeSeq() {
        return chargeSeq;
    }

    /**
     * Sets the value of the chargeSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeSeq(String value) {
        this.chargeSeq = value;
    }

    /**
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Gets the value of the offeringID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferingID() {
        return offeringID;
    }

    /**
     * Sets the value of the offeringID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferingID(BigInteger value) {
        this.offeringID = value;
    }

    /**
     * Gets the value of the salesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesAmount() {
        return salesAmount;
    }

    /**
     * Sets the value of the salesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesAmount(BigInteger value) {
        this.salesAmount = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitPrice(Long value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the chargeAmt property.
     * 
     */
    public long getChargeAmt() {
        return chargeAmt;
    }

    /**
     * Sets the value of the chargeAmt property.
     * 
     */
    public void setChargeAmt(long value) {
        this.chargeAmt = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     */
    public long getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     */
    public void setDiscountAmt(long value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the waiveAmt property.
     * 
     */
    public long getWaiveAmt() {
        return waiveAmt;
    }

    /**
     * Sets the value of the waiveAmt property.
     * 
     */
    public void setWaiveAmt(long value) {
        this.waiveAmt = value;
    }

    /**
     * Gets the value of the resTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResTypeID() {
        return resTypeID;
    }

    /**
     * Sets the value of the resTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResTypeID(String value) {
        this.resTypeID = value;
    }

    /**
     * Gets the value of the resModeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResModeID() {
        return resModeID;
    }

    /**
     * Sets the value of the resModeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResModeID(String value) {
        this.resModeID = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimpleProperty>();
        }
        return this.additionalProperty;
    }

    /**
     * Gets the value of the offeringName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferingName() {
        return offeringName;
    }

    /**
     * Sets the value of the offeringName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferingName(Object value) {
        this.offeringName = value;
    }

}
