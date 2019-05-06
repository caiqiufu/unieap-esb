
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffEnquiryBySubscriberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffEnquiryBySubscriberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TariffDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDesc10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffEnquiryBySubscriberResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "tariffDesc1",
    "tariffDesc2",
    "tariffDesc3",
    "tariffDesc4",
    "tariffDesc5",
    "tariffDesc6",
    "tariffDesc7",
    "tariffDesc8",
    "tariffDesc9",
    "tariffDesc10"
})
public class TariffEnquiryBySubscriberResult {

    @XmlElementRef(name = "TariffDesc1", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc1;
    @XmlElementRef(name = "TariffDesc2", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc2;
    @XmlElementRef(name = "TariffDesc3", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc3;
    @XmlElementRef(name = "TariffDesc4", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc4;
    @XmlElementRef(name = "TariffDesc5", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc5;
    @XmlElementRef(name = "TariffDesc6", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc6;
    @XmlElementRef(name = "TariffDesc7", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc7;
    @XmlElementRef(name = "TariffDesc8", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc8;
    @XmlElementRef(name = "TariffDesc9", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc9;
    @XmlElementRef(name = "TariffDesc10", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tariffDesc10;

    /**
     * Gets the value of the tariffDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc1() {
        return tariffDesc1;
    }

    /**
     * Sets the value of the tariffDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc1(JAXBElement<String> value) {
        this.tariffDesc1 = value;
    }

    /**
     * Gets the value of the tariffDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc2() {
        return tariffDesc2;
    }

    /**
     * Sets the value of the tariffDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc2(JAXBElement<String> value) {
        this.tariffDesc2 = value;
    }

    /**
     * Gets the value of the tariffDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc3() {
        return tariffDesc3;
    }

    /**
     * Sets the value of the tariffDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc3(JAXBElement<String> value) {
        this.tariffDesc3 = value;
    }

    /**
     * Gets the value of the tariffDesc4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc4() {
        return tariffDesc4;
    }

    /**
     * Sets the value of the tariffDesc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc4(JAXBElement<String> value) {
        this.tariffDesc4 = value;
    }

    /**
     * Gets the value of the tariffDesc5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc5() {
        return tariffDesc5;
    }

    /**
     * Sets the value of the tariffDesc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc5(JAXBElement<String> value) {
        this.tariffDesc5 = value;
    }

    /**
     * Gets the value of the tariffDesc6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc6() {
        return tariffDesc6;
    }

    /**
     * Sets the value of the tariffDesc6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc6(JAXBElement<String> value) {
        this.tariffDesc6 = value;
    }

    /**
     * Gets the value of the tariffDesc7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc7() {
        return tariffDesc7;
    }

    /**
     * Sets the value of the tariffDesc7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc7(JAXBElement<String> value) {
        this.tariffDesc7 = value;
    }

    /**
     * Gets the value of the tariffDesc8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc8() {
        return tariffDesc8;
    }

    /**
     * Sets the value of the tariffDesc8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc8(JAXBElement<String> value) {
        this.tariffDesc8 = value;
    }

    /**
     * Gets the value of the tariffDesc9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc9() {
        return tariffDesc9;
    }

    /**
     * Sets the value of the tariffDesc9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc9(JAXBElement<String> value) {
        this.tariffDesc9 = value;
    }

    /**
     * Gets the value of the tariffDesc10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTariffDesc10() {
        return tariffDesc10;
    }

    /**
     * Sets the value of the tariffDesc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTariffDesc10(JAXBElement<String> value) {
        this.tariffDesc10 = value;
    }

}
