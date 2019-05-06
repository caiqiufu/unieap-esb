
package com.huawei.ocs55.bcservices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubBasicInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubBasicInfo" minOccurs="0"/>
 *         &lt;element name="UserCustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubIdentity" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubIdentity" maxOccurs="unbounded"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveTimeLimit" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime" minOccurs="0"/>
 *         &lt;element name="ConsumptionLimit" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="MesureType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                       &lt;element name="MesureID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                       &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                       &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", propOrder = {
    "subBasicInfo",
    "userCustomerKey",
    "subIdentity",
    "brand",
    "subClass",
    "networkType",
    "subPassword",
    "status",
    "activeTimeLimit",
    "consumptionLimit"
})
@XmlSeeAlso({
    com.huawei.ocs55.bcservices.QueryCustomerInfoResult.Subscriber.SubscriberInfo.class
})
public class Subscriber {

    @XmlElement(name = "SubBasicInfo")
    protected SubBasicInfo subBasicInfo;
    @XmlElement(name = "UserCustomerKey")
    protected String userCustomerKey;
    @XmlElement(name = "SubIdentity", required = true)
    protected List<SubIdentity> subIdentity;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "SubClass")
    protected String subClass;
    @XmlElement(name = "NetworkType")
    protected String networkType;
    @XmlElement(name = "SubPassword")
    protected String subPassword;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ActiveTimeLimit")
    protected String activeTimeLimit;
    @XmlElement(name = "ConsumptionLimit")
    protected List<Subscriber.ConsumptionLimit> consumptionLimit;

    /**
     * Gets the value of the subBasicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubBasicInfo }
     *     
     */
    public SubBasicInfo getSubBasicInfo() {
        return subBasicInfo;
    }

    /**
     * Sets the value of the subBasicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBasicInfo }
     *     
     */
    public void setSubBasicInfo(SubBasicInfo value) {
        this.subBasicInfo = value;
    }

    /**
     * Gets the value of the userCustomerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCustomerKey() {
        return userCustomerKey;
    }

    /**
     * Sets the value of the userCustomerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCustomerKey(String value) {
        this.userCustomerKey = value;
    }

    /**
     * Gets the value of the subIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubIdentity }
     * 
     * 
     */
    public List<SubIdentity> getSubIdentity() {
        if (subIdentity == null) {
            subIdentity = new ArrayList<SubIdentity>();
        }
        return this.subIdentity;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the subClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClass() {
        return subClass;
    }

    /**
     * Sets the value of the subClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClass(String value) {
        this.subClass = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the subPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPassword() {
        return subPassword;
    }

    /**
     * Sets the value of the subPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPassword(String value) {
        this.subPassword = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the activeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTimeLimit() {
        return activeTimeLimit;
    }

    /**
     * Sets the value of the activeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTimeLimit(String value) {
        this.activeTimeLimit = value;
    }

    /**
     * Gets the value of the consumptionLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscriber.ConsumptionLimit }
     * 
     * 
     */
    public List<Subscriber.ConsumptionLimit> getConsumptionLimit() {
        if (consumptionLimit == null) {
            consumptionLimit = new ArrayList<Subscriber.ConsumptionLimit>();
        }
        return this.consumptionLimit;
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
     *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="MesureType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *             &lt;element name="MesureID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *           &lt;/sequence>
     *           &lt;sequence>
     *             &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *             &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *           &lt;/sequence>
     *         &lt;/choice>
     *         &lt;element name="LimitParam" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "content"
    })
    public static class ConsumptionLimit {

        @XmlElementRefs({
            @XmlElementRef(name = "MesureType", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitValue", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MesureID", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitType", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CurrencyID", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LimitParam", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "UnitType", namespace = "http://www.huawei.com/bme/cbsinterface/bccommon", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "LimitValue" is used by two different parts of a schema. See: 
         * line 501 of file:/E:/OneDrive/09-tt/unieap/unieap-esb/src/main/resources/wsdl/ocs55/CBSInterface_BC_Common.xsd
         * line 497 of file:/E:/OneDrive/09-tt/unieap/unieap-esb/src/main/resources/wsdl/ocs55/CBSInterface_BC_Common.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link Long }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link Subscriber.ConsumptionLimit.LimitParam }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<?>>();
            }
            return this.content;
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
         *         &lt;element name="ParamCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ParamValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "paramCode",
            "paramValue"
        })
        public static class LimitParam {

            @XmlElement(name = "ParamCode", required = true)
            protected String paramCode;
            @XmlElement(name = "ParamValue")
            protected long paramValue;

            /**
             * Gets the value of the paramCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParamCode() {
                return paramCode;
            }

            /**
             * Sets the value of the paramCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParamCode(String value) {
                this.paramCode = value;
            }

            /**
             * Gets the value of the paramValue property.
             * 
             */
            public long getParamValue() {
                return paramValue;
            }

            /**
             * Sets the value of the paramValue property.
             * 
             */
            public void setParamValue(long value) {
                this.paramValue = value;
            }

        }

    }

}
