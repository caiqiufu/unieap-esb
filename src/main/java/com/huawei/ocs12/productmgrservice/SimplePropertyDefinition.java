
package com.huawei.ocs12.productmgrservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimplePropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimplePropertyDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
 *       &lt;sequence>
 *         &lt;element name="ValueFrom">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="4050000"/>
 *               &lt;enumeration value="4050001"/>
 *               &lt;enumeration value="4050002"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisplayMode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="4050000"/>
 *               &lt;enumeration value="4050001"/>
 *               &lt;enumeration value="4050002"/>
 *               &lt;enumeration value="4050003"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EnumKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isNull" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}isNull" minOccurs="0"/>
 *         &lt;element name="isMultiValue" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}isNull"/>
 *         &lt;element name="MultiMaxNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RegExpr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimplePropertyDefinition", propOrder = {
    "valueFrom",
    "displayMode",
    "enumKey",
    "minValue",
    "maxValue",
    "isNull",
    "isMultiValue",
    "multiMaxNum",
    "regExpr",
    "defaultValue",
    "remark"
})
public class SimplePropertyDefinition
    extends IdName
{

    @XmlElement(name = "ValueFrom", required = true)
    protected String valueFrom;
    @XmlElement(name = "DisplayMode", required = true)
    protected String displayMode;
    @XmlElement(name = "EnumKey")
    protected String enumKey;
    @XmlElement(name = "MinValue")
    protected BigInteger minValue;
    @XmlElement(name = "MaxValue")
    protected BigInteger maxValue;
    protected String isNull;
    @XmlElement(required = true)
    protected String isMultiValue;
    @XmlElement(name = "MultiMaxNum")
    protected BigInteger multiMaxNum;
    @XmlElement(name = "RegExpr")
    protected String regExpr;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "Remark", required = true)
    protected String remark;

    /**
     * Gets the value of the valueFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFrom() {
        return valueFrom;
    }

    /**
     * Sets the value of the valueFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFrom(String value) {
        this.valueFrom = value;
    }

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMode(String value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the enumKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumKey() {
        return enumKey;
    }

    /**
     * Sets the value of the enumKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumKey(String value) {
        this.enumKey = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinValue(BigInteger value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxValue(BigInteger value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the isNull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNull() {
        return isNull;
    }

    /**
     * Sets the value of the isNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNull(String value) {
        this.isNull = value;
    }

    /**
     * Gets the value of the isMultiValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiValue() {
        return isMultiValue;
    }

    /**
     * Sets the value of the isMultiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiValue(String value) {
        this.isMultiValue = value;
    }

    /**
     * Gets the value of the multiMaxNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiMaxNum() {
        return multiMaxNum;
    }

    /**
     * Sets the value of the multiMaxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiMaxNum(BigInteger value) {
        this.multiMaxNum = value;
    }

    /**
     * Gets the value of the regExpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExpr() {
        return regExpr;
    }

    /**
     * Sets the value of the regExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExpr(String value) {
        this.regExpr = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
