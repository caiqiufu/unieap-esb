
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubHomeZoneResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubHomeZoneResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeZoneNoInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HomeZoneNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "QuerySubHomeZoneResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "homeZoneNoInfo"
})
public class QuerySubHomeZoneResult {

    @XmlElement(name = "HomeZoneNoInfo")
    protected List<QuerySubHomeZoneResult.HomeZoneNoInfo> homeZoneNoInfo;

    /**
     * Gets the value of the homeZoneNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeZoneNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeZoneNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubHomeZoneResult.HomeZoneNoInfo }
     * 
     * 
     */
    public List<QuerySubHomeZoneResult.HomeZoneNoInfo> getHomeZoneNoInfo() {
        if (homeZoneNoInfo == null) {
            homeZoneNoInfo = new ArrayList<QuerySubHomeZoneResult.HomeZoneNoInfo>();
        }
        return this.homeZoneNoInfo;
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
     *         &lt;element name="HomeZoneNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "homeZoneNo",
        "effectiveDate",
        "expireDate",
        "zoneName"
    })
    public static class HomeZoneNoInfo {

        @XmlElement(name = "HomeZoneNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, type = Integer.class, nillable = true)
        protected Integer homeZoneNo;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String effectiveDate;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String expireDate;
        @XmlElement(name = "ZoneName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String zoneName;

        /**
         * Gets the value of the homeZoneNo property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHomeZoneNo() {
            return homeZoneNo;
        }

        /**
         * Sets the value of the homeZoneNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHomeZoneNo(Integer value) {
            this.homeZoneNo = value;
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
         * Gets the value of the zoneName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneName() {
            return zoneName;
        }

        /**
         * Sets the value of the zoneName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneName(String value) {
            this.zoneName = value;
        }

    }

}
