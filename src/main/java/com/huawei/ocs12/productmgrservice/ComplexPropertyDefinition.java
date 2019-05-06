
package com.huawei.ocs12.productmgrservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexPropertyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexPropertyDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
 *       &lt;sequence>
 *         &lt;element name="isMultiValue" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}isNull"/>
 *         &lt;element name="MultiMaxNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SimplePropertyDefinition" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}SimplePropertyDefinition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexPropertyDefinition", propOrder = {
    "isMultiValue",
    "multiMaxNum",
    "remark",
    "simplePropertyDefinition"
})
public class ComplexPropertyDefinition
    extends IdName
{

    @XmlElement(required = true)
    protected String isMultiValue;
    @XmlElement(name = "MultiMaxNum")
    protected BigInteger multiMaxNum;
    @XmlElement(name = "Remark", required = true)
    protected String remark;
    @XmlElement(name = "SimplePropertyDefinition", required = true)
    protected List<SimplePropertyDefinition> simplePropertyDefinition;

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

    /**
     * Gets the value of the simplePropertyDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simplePropertyDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimplePropertyDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyDefinition }
     * 
     * 
     */
    public List<SimplePropertyDefinition> getSimplePropertyDefinition() {
        if (simplePropertyDefinition == null) {
            simplePropertyDefinition = new ArrayList<SimplePropertyDefinition>();
        }
        return this.simplePropertyDefinition;
    }

}
