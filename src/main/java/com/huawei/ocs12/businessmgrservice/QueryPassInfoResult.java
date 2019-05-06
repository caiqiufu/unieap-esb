
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPassInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPassInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PassStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayCapEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonthCapEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPassInfoResult", propOrder = {
    "returnCode",
    "passStartTime",
    "passEndTime",
    "dayCapEndTime",
    "monthCapEndTime"
})
public class QueryPassInfoResult {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElementRef(name = "PassStartTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passStartTime;
    @XmlElementRef(name = "PassEndTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passEndTime;
    @XmlElementRef(name = "DayCapEndTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayCapEndTime;
    @XmlElementRef(name = "MonthCapEndTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monthCapEndTime;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the passStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassStartTime() {
        return passStartTime;
    }

    /**
     * Sets the value of the passStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassStartTime(JAXBElement<String> value) {
        this.passStartTime = value;
    }

    /**
     * Gets the value of the passEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassEndTime() {
        return passEndTime;
    }

    /**
     * Sets the value of the passEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassEndTime(JAXBElement<String> value) {
        this.passEndTime = value;
    }

    /**
     * Gets the value of the dayCapEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayCapEndTime() {
        return dayCapEndTime;
    }

    /**
     * Sets the value of the dayCapEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayCapEndTime(JAXBElement<String> value) {
        this.dayCapEndTime = value;
    }

    /**
     * Gets the value of the monthCapEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonthCapEndTime() {
        return monthCapEndTime;
    }

    /**
     * Sets the value of the monthCapEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonthCapEndTime(JAXBElement<String> value) {
        this.monthCapEndTime = value;
    }

}
