
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubFamilyNoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubFamilyNoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyNoInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FamilyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="AppendentProductKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="originTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxFaFAllowedflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubFamilyNoResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "familyNoInfo",
    "originTransactionID",
    "maxFaFAllowedflag"
})
public class QuerySubFamilyNoResult {

    @XmlElement(name = "FamilyNoInfo")
    protected List<QuerySubFamilyNoResult.FamilyNoInfo> familyNoInfo;
    protected String originTransactionID;
    @XmlElement(name = "MaxFaFAllowedflag")
    protected Integer maxFaFAllowedflag;

    /**
     * Gets the value of the familyNoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyNoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyNoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubFamilyNoResult.FamilyNoInfo }
     * 
     * 
     */
    public List<QuerySubFamilyNoResult.FamilyNoInfo> getFamilyNoInfo() {
        if (familyNoInfo == null) {
            familyNoInfo = new ArrayList<QuerySubFamilyNoResult.FamilyNoInfo>();
        }
        return this.familyNoInfo;
    }

    /**
     * Gets the value of the originTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }

    /**
     * Sets the value of the originTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTransactionID(String value) {
        this.originTransactionID = value;
    }

    /**
     * Gets the value of the maxFaFAllowedflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFaFAllowedflag() {
        return maxFaFAllowedflag;
    }

    /**
     * Sets the value of the maxFaFAllowedflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFaFAllowedflag(Integer value) {
        this.maxFaFAllowedflag = value;
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
     *         &lt;element name="FamilyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="AppendentProductKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "familyNo",
        "effectiveDate",
        "expireDate",
        "groupType",
        "appendentProductKey"
    })
    public static class FamilyNoInfo {

        @XmlElement(name = "FamilyNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String familyNo;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String effectiveDate;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String expireDate;
        @XmlElement(name = "GroupType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, type = Integer.class, nillable = true)
        protected Integer groupType;
        @XmlElement(name = "AppendentProductKey", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer appendentProductKey;

        /**
         * Gets the value of the familyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyNo() {
            return familyNo;
        }

        /**
         * Sets the value of the familyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyNo(String value) {
            this.familyNo = value;
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
         * Gets the value of the groupType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGroupType() {
            return groupType;
        }

        /**
         * Sets the value of the groupType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGroupType(Integer value) {
            this.groupType = value;
        }

        /**
         * Gets the value of the appendentProductKey property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAppendentProductKey() {
            return appendentProductKey;
        }

        /**
         * Sets the value of the appendentProductKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAppendentProductKey(Integer value) {
            this.appendentProductKey = value;
        }

    }

}
