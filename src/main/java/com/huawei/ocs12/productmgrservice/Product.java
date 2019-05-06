
package com.huawei.ocs12.productmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductType"/>
 *         &lt;element name="TypeDetail" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductTypeDetail"/>
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paymode" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Paymode" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}SimplePropertyDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Service">
 *                 &lt;sequence>
 *                   &lt;element name="SelectType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}SelectType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "version",
    "type",
    "typeDetail",
    "brandId",
    "brandName",
    "paymode",
    "remark",
    "simpleProperty",
    "service"
})
public class Product
    extends IdName
{

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "TypeDetail", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String typeDetail;
    @XmlElement(name = "BrandId")
    protected String brandId;
    @XmlElement(name = "BrandName")
    protected String brandName;
    @XmlElement(name = "Paymode")
    protected String paymode;
    @XmlElement(name = "Remark", required = true)
    protected String remark;
    @XmlElement(name = "SimpleProperty")
    protected List<SimplePropertyDefinition> simpleProperty;
    @XmlElement(name = "Service")
    protected List<Product.Service> service;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDetail(String value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the paymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymode() {
        return paymode;
    }

    /**
     * Sets the value of the paymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymode(String value) {
        this.paymode = value;
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
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product.Service }
     * 
     * 
     */
    public List<Product.Service> getService() {
        if (service == null) {
            service = new ArrayList<Product.Service>();
        }
        return this.service;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Service">
     *       &lt;sequence>
     *         &lt;element name="SelectType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}SelectType"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "selectType"
    })
    public static class Service
        extends com.huawei.ocs12.productmgrservice.Service
    {

        @XmlElement(name = "SelectType", required = true)
        protected String selectType;

        /**
         * Gets the value of the selectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectType() {
            return selectType;
        }

        /**
         * Sets the value of the selectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectType(String value) {
            this.selectType = value;
        }

    }

}
