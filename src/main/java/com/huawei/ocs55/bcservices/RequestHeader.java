
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnershipInfo" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}OwnershipInfo" minOccurs="0"/>
 *         &lt;element name="AccessSecurity" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}SecurityInfo"/>
 *         &lt;element name="OperatorInfo" type="{http://www.huawei.com/bme/cbsinterface/cbscommon}OperatorInfo" minOccurs="0"/>
 *         &lt;element name="AccessMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeFormat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "RequestHeader", namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon", propOrder = {
    "version",
    "businessCode",
    "messageSeq",
    "ownershipInfo",
    "accessSecurity",
    "operatorInfo",
    "accessMode",
    "msgLanguageCode",
    "timeFormat",
    "additionalProperty"
})
public class RequestHeader {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "BusinessCode")
    protected String businessCode;
    @XmlElement(name = "MessageSeq", required = true)
    protected String messageSeq;
    @XmlElement(name = "OwnershipInfo")
    protected OwnershipInfo ownershipInfo;
    @XmlElement(name = "AccessSecurity", required = true)
    protected SecurityInfo accessSecurity;
    @XmlElement(name = "OperatorInfo")
    protected OperatorInfo operatorInfo;
    @XmlElement(name = "AccessMode")
    protected String accessMode;
    @XmlElement(name = "MsgLanguageCode")
    protected String msgLanguageCode;
    @XmlElement(name = "TimeFormat")
    protected RequestHeader.TimeFormat timeFormat;
    @XmlElement(name = "AdditionalProperty")
    protected List<RequestHeader.AdditionalProperty> additionalProperty;

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
     * Gets the value of the businessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Sets the value of the businessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * Gets the value of the messageSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSeq() {
        return messageSeq;
    }

    /**
     * Sets the value of the messageSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSeq(String value) {
        this.messageSeq = value;
    }

    /**
     * Gets the value of the ownershipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipInfo }
     *     
     */
    public OwnershipInfo getOwnershipInfo() {
        return ownershipInfo;
    }

    /**
     * Sets the value of the ownershipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipInfo }
     *     
     */
    public void setOwnershipInfo(OwnershipInfo value) {
        this.ownershipInfo = value;
    }

    /**
     * Gets the value of the accessSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfo }
     *     
     */
    public SecurityInfo getAccessSecurity() {
        return accessSecurity;
    }

    /**
     * Sets the value of the accessSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfo }
     *     
     */
    public void setAccessSecurity(SecurityInfo value) {
        this.accessSecurity = value;
    }

    /**
     * Gets the value of the operatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorInfo }
     *     
     */
    public OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    /**
     * Sets the value of the operatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorInfo }
     *     
     */
    public void setOperatorInfo(OperatorInfo value) {
        this.operatorInfo = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMode(String value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the msgLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    /**
     * Sets the value of the msgLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgLanguageCode(String value) {
        this.msgLanguageCode = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.TimeFormat }
     *     
     */
    public RequestHeader.TimeFormat getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.TimeFormat }
     *     
     */
    public void setTimeFormat(RequestHeader.TimeFormat value) {
        this.timeFormat = value;
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
     * {@link RequestHeader.AdditionalProperty }
     * 
     * 
     */
    public List<RequestHeader.AdditionalProperty> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<RequestHeader.AdditionalProperty>();
        }
        return this.additionalProperty;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "code",
        "value"
    })
    public static class AdditionalProperty {

        @XmlElement(name = "Code", namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon", required = true)
        protected String code;
        @XmlElement(name = "Value", namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon", required = true)
        protected String value;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *         &lt;element name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "timeType",
        "timeZoneID"
    })
    public static class TimeFormat {

        @XmlElement(name = "TimeType", namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon", required = true)
        protected String timeType;
        @XmlElement(name = "TimeZoneID", namespace = "http://www.huawei.com/bme/cbsinterface/cbscommon")
        protected String timeZoneID;

        /**
         * Gets the value of the timeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeType() {
            return timeType;
        }

        /**
         * Sets the value of the timeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeType(String value) {
            this.timeType = value;
        }

        /**
         * Gets the value of the timeZoneID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeZoneID() {
            return timeZoneID;
        }

        /**
         * Sets the value of the timeZoneID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeZoneID(String value) {
            this.timeZoneID = value;
        }

    }

}
