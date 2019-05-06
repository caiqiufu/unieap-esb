
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyCFNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyCFNoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusyCFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoAnswerCFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoReachableCFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyCFNoRequest", propOrder = {
    "subscriberNo",
    "busyCFNo",
    "noAnswerCFNo",
    "noReachableCFNo"
})
public class ModifyCFNoRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "BusyCFNo")
    protected String busyCFNo;
    @XmlElement(name = "NoAnswerCFNo")
    protected String noAnswerCFNo;
    @XmlElement(name = "NoReachableCFNo")
    protected String noReachableCFNo;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the busyCFNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyCFNo() {
        return busyCFNo;
    }

    /**
     * Sets the value of the busyCFNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyCFNo(String value) {
        this.busyCFNo = value;
    }

    /**
     * Gets the value of the noAnswerCFNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAnswerCFNo() {
        return noAnswerCFNo;
    }

    /**
     * Sets the value of the noAnswerCFNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAnswerCFNo(String value) {
        this.noAnswerCFNo = value;
    }

    /**
     * Gets the value of the noReachableCFNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReachableCFNo() {
        return noReachableCFNo;
    }

    /**
     * Sets the value of the noReachableCFNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReachableCFNo(String value) {
        this.noReachableCFNo = value;
    }

}
