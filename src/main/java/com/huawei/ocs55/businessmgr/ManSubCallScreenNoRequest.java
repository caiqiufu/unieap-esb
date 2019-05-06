
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManSubCallScreenNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManSubCallScreenNoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallScreenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallScreenNoInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callScreenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManSubCallScreenNoRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscriberNo",
    "callScreenType",
    "callScreenNoInfo",
    "operationType"
})
public class ManSubCallScreenNoRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "CallScreenType")
    protected String callScreenType;
    @XmlElement(name = "CallScreenNoInfo")
    protected List<ManSubCallScreenNoRequest.CallScreenNoInfo> callScreenNoInfo;
    @XmlElement(name = "OperationType")
    protected int operationType;

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
     * Gets the value of the callScreenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallScreenType() {
        return callScreenType;
    }

    /**
     * Sets the value of the callScreenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallScreenType(String value) {
        this.callScreenType = value;
    }

    /**
     * Gets the value of the callScreenNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callScreenNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallScreenNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManSubCallScreenNoRequest.CallScreenNoInfo }
     * 
     * 
     */
    public List<ManSubCallScreenNoRequest.CallScreenNoInfo> getCallScreenNoInfo() {
        if (callScreenNoInfo == null) {
            callScreenNoInfo = new ArrayList<ManSubCallScreenNoRequest.CallScreenNoInfo>();
        }
        return this.callScreenNoInfo;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
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
     *         &lt;element name="callScreenNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="weekStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="weekStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="routeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IRRouteFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RoutingMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "callScreenNo",
        "effectiveDate",
        "expireDate",
        "weekStart",
        "weekStop",
        "routeNumber",
        "irRouteFlag",
        "routingMethod"
    })
    public static class CallScreenNoInfo {

        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String callScreenNo;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String effectiveDate;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String expireDate;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String weekStart;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String weekStop;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String routeNumber;
        @XmlElement(name = "IRRouteFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer irRouteFlag;
        @XmlElement(name = "RoutingMethod", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer routingMethod;

        /**
         * Gets the value of the callScreenNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallScreenNo() {
            return callScreenNo;
        }

        /**
         * Sets the value of the callScreenNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallScreenNo(String value) {
            this.callScreenNo = value;
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
         * Gets the value of the weekStart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeekStart() {
            return weekStart;
        }

        /**
         * Sets the value of the weekStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeekStart(String value) {
            this.weekStart = value;
        }

        /**
         * Gets the value of the weekStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeekStop() {
            return weekStop;
        }

        /**
         * Sets the value of the weekStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeekStop(String value) {
            this.weekStop = value;
        }

        /**
         * Gets the value of the routeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteNumber() {
            return routeNumber;
        }

        /**
         * Sets the value of the routeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteNumber(String value) {
            this.routeNumber = value;
        }

        /**
         * Gets the value of the irRouteFlag property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIRRouteFlag() {
            return irRouteFlag;
        }

        /**
         * Sets the value of the irRouteFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIRRouteFlag(Integer value) {
            this.irRouteFlag = value;
        }

        /**
         * Gets the value of the routingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRoutingMethod() {
            return routingMethod;
        }

        /**
         * Sets the value of the routingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRoutingMethod(Integer value) {
            this.routingMethod = value;
        }

    }

}
