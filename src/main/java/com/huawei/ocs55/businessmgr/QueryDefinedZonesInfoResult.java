
package com.huawei.ocs55.businessmgr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDefinedZonesInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDefinedZonesInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefinedZonesInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ZoneType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "QueryDefinedZonesInfoResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "definedZonesInfo"
})
public class QueryDefinedZonesInfoResult {

    @XmlElement(name = "DefinedZonesInfo")
    protected List<QueryDefinedZonesInfoResult.DefinedZonesInfo> definedZonesInfo;

    /**
     * Gets the value of the definedZonesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definedZonesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedZonesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryDefinedZonesInfoResult.DefinedZonesInfo }
     * 
     * 
     */
    public List<QueryDefinedZonesInfoResult.DefinedZonesInfo> getDefinedZonesInfo() {
        if (definedZonesInfo == null) {
            definedZonesInfo = new ArrayList<QueryDefinedZonesInfoResult.DefinedZonesInfo>();
        }
        return this.definedZonesInfo;
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
     *         &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="ZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ZoneType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "zoneID",
        "zoneName",
        "zoneType"
    })
    public static class DefinedZonesInfo {

        @XmlElement(name = "ZoneID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, nillable = true)
        protected BigInteger zoneID;
        @XmlElement(name = "ZoneName", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String zoneName;
        @XmlElement(name = "ZoneType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer zoneType;

        /**
         * Gets the value of the zoneID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getZoneID() {
            return zoneID;
        }

        /**
         * Sets the value of the zoneID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setZoneID(BigInteger value) {
            this.zoneID = value;
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

        /**
         * Gets the value of the zoneType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZoneType() {
            return zoneType;
        }

        /**
         * Sets the value of the zoneType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZoneType(Integer value) {
            this.zoneType = value;
        }

    }

}
