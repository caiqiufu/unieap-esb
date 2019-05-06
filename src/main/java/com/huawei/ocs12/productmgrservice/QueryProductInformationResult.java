
package com.huawei.ocs12.productmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductInformationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductInformationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Product" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductType"/>
 *                   &lt;element name="TypeDetail" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductTypeDetail"/>
 *                   &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Paymode" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Paymode" minOccurs="0"/>
 *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EffType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}EffMode" minOccurs="0"/>
 *                   &lt;element name="ExpType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}EffMode" minOccurs="0"/>
 *                   &lt;element name="SimpleProperty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppendantProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
 *                 &lt;sequence>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SimpleProperty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductInformationResult", propOrder = {
    "product",
    "appendantProduct"
})
public class QueryProductInformationResult {

    @XmlElement(name = "Product")
    protected QueryProductInformationResult.Product product;
    @XmlElement(name = "AppendantProduct")
    protected List<QueryProductInformationResult.AppendantProduct> appendantProduct;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link QueryProductInformationResult.Product }
     *     
     */
    public QueryProductInformationResult.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProductInformationResult.Product }
     *     
     */
    public void setProduct(QueryProductInformationResult.Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the appendantProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendantProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendantProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryProductInformationResult.AppendantProduct }
     * 
     * 
     */
    public List<QueryProductInformationResult.AppendantProduct> getAppendantProduct() {
        if (appendantProduct == null) {
            appendantProduct = new ArrayList<QueryProductInformationResult.AppendantProduct>();
        }
        return this.appendantProduct;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName">
     *       &lt;sequence>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SimpleProperty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
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
    @XmlType(name = "", propOrder = {
        "effectiveDate",
        "expireDate",
        "simpleProperty"
    })
    public static class AppendantProduct
        extends IdName
    {

        @XmlElement(name = "EffectiveDate", required = true)
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate", required = true)
        protected String expireDate;
        @XmlElement(name = "SimpleProperty")
        protected List<QueryProductInformationResult.AppendantProduct.SimpleProperty> simpleProperty;

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
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
         * {@link QueryProductInformationResult.AppendantProduct.SimpleProperty }
         * 
         * 
         */
        public List<QueryProductInformationResult.AppendantProduct.SimpleProperty> getSimpleProperty() {
            if (simpleProperty == null) {
                simpleProperty = new ArrayList<QueryProductInformationResult.AppendantProduct.SimpleProperty>();
            }
            return this.simpleProperty;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "value"
        })
        public static class SimpleProperty {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductType"/>
     *         &lt;element name="TypeDetail" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}ProductTypeDetail"/>
     *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Paymode" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}Paymode" minOccurs="0"/>
     *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EffType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}EffMode" minOccurs="0"/>
     *         &lt;element name="ExpType" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}EffMode" minOccurs="0"/>
     *         &lt;element name="SimpleProperty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "version",
        "type",
        "typeDetail",
        "brandId",
        "brandName",
        "paymode",
        "remark",
        "effectiveDate",
        "expireDate",
        "effType",
        "expType",
        "simpleProperty"
    })
    public static class Product {

        @XmlElement(name = "Id", required = true)
        protected String id;
        @XmlElement(name = "Name", required = true)
        protected String name;
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
        @XmlElement(name = "EffectiveDate", required = true)
        protected String effectiveDate;
        @XmlElement(name = "ExpireDate", required = true)
        protected String expireDate;
        @XmlElement(name = "EffType")
        protected String effType;
        @XmlElement(name = "ExpType")
        protected String expType;
        @XmlElement(name = "SimpleProperty")
        protected List<QueryProductInformationResult.Product.SimpleProperty> simpleProperty;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveDate(String value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpireDate(String value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the effType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffType() {
            return effType;
        }

        /**
         * Sets the value of the effType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffType(String value) {
            this.effType = value;
        }

        /**
         * Gets the value of the expType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpType() {
            return expType;
        }

        /**
         * Sets the value of the expType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpType(String value) {
            this.expType = value;
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
         * {@link QueryProductInformationResult.Product.SimpleProperty }
         * 
         * 
         */
        public List<QueryProductInformationResult.Product.SimpleProperty> getSimpleProperty() {
            if (simpleProperty == null) {
                simpleProperty = new ArrayList<QueryProductInformationResult.Product.SimpleProperty>();
            }
            return this.simpleProperty;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "value"
        })
        public static class SimpleProperty {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
