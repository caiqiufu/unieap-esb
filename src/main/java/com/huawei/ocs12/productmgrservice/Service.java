
package com.huawei.ocs12.productmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
 *       &lt;sequence>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}SimplePropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ComplexProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ComplexPropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "simpleProperty",
    "complexProperty"
})
@XmlSeeAlso({
    com.huawei.ocs12.productmgrservice.Product.Service.class
})
public class Service
    extends IdName
{

    @XmlElement(name = "SimpleProperty")
    protected List<SimplePropertyDefinition> simpleProperty;
    @XmlElement(name = "ComplexProperty")
    protected List<ComplexPropertyDefinition> complexProperty;

    /**
     * Gets the value of the simpleProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyDefinition }
     * 
     * 
     */
    public List<SimplePropertyDefinition> getSimpleProperty() {
        if (simpleProperty == null) {
            simpleProperty = new ArrayList<SimplePropertyDefinition>();
        }
        return this.simpleProperty;
    }

    /**
     * Gets the value of the complexProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexPropertyDefinition }
     * 
     * 
     */
    public List<ComplexPropertyDefinition> getComplexProperty() {
        if (complexProperty == null) {
            complexProperty = new ArrayList<ComplexPropertyDefinition>();
        }
        return this.complexProperty;
    }

}
