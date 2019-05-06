
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPassCapEventInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPassCapEventInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CapEventInfo" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CapEventTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CycleStartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CycleEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CapValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "QueryPassCapEventInfoResult", propOrder = {
    "returnCode",
    "capEventInfo"
})
public class QueryPassCapEventInfoResult {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "CapEventInfo")
    protected List<QueryPassCapEventInfoResult.CapEventInfo> capEventInfo;

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
     * Gets the value of the capEventInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capEventInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapEventInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPassCapEventInfoResult.CapEventInfo }
     * 
     * 
     */
    public List<QueryPassCapEventInfoResult.CapEventInfo> getCapEventInfo() {
        if (capEventInfo == null) {
            capEventInfo = new ArrayList<QueryPassCapEventInfoResult.CapEventInfo>();
        }
        return this.capEventInfo;
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
     *         &lt;element name="CapType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CapEventTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CycleStartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CycleEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CapValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "capType",
        "capEventTime",
        "cycleStartTime",
        "cycleEndTime",
        "capValue"
    })
    public static class CapEventInfo {

        @XmlElement(name = "CapType")
        protected int capType;
        @XmlElement(name = "CapEventTime", required = true)
        protected String capEventTime;
        @XmlElement(name = "CycleStartTime", required = true)
        protected String cycleStartTime;
        @XmlElement(name = "CycleEndTime", required = true)
        protected String cycleEndTime;
        @XmlElement(name = "CapValue")
        protected long capValue;

        /**
         * Gets the value of the capType property.
         * 
         */
        public int getCapType() {
            return capType;
        }

        /**
         * Sets the value of the capType property.
         * 
         */
        public void setCapType(int value) {
            this.capType = value;
        }

        /**
         * Gets the value of the capEventTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCapEventTime() {
            return capEventTime;
        }

        /**
         * Sets the value of the capEventTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCapEventTime(String value) {
            this.capEventTime = value;
        }

        /**
         * Gets the value of the cycleStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleStartTime() {
            return cycleStartTime;
        }

        /**
         * Sets the value of the cycleStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleStartTime(String value) {
            this.cycleStartTime = value;
        }

        /**
         * Gets the value of the cycleEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCycleEndTime() {
            return cycleEndTime;
        }

        /**
         * Sets the value of the cycleEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCycleEndTime(String value) {
            this.cycleEndTime = value;
        }

        /**
         * Gets the value of the capValue property.
         * 
         */
        public long getCapValue() {
            return capValue;
        }

        /**
         * Sets the value of the capValue property.
         * 
         */
        public void setCapValue(long value) {
            this.capValue = value;
        }

    }

}
