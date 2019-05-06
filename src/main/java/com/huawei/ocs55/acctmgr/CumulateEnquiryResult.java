
package com.huawei.ocs55.acctmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CumulateEnquiryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CumulateEnquiryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CumulativeItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/all>
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
@XmlType(name = "CumulateEnquiryResult", propOrder = {
    "cumulativeItem"
})
public class CumulateEnquiryResult {

    @XmlElement(name = "CumulativeItem")
    protected List<CumulateEnquiryResult.CumulativeItem> cumulativeItem;

    /**
     * Gets the value of the cumulativeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulativeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulativeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CumulateEnquiryResult.CumulativeItem }
     * 
     * 
     */
    public List<CumulateEnquiryResult.CumulativeItem> getCumulativeItem() {
        if (cumulativeItem == null) {
            cumulativeItem = new ArrayList<CumulateEnquiryResult.CumulativeItem>();
        }
        return this.cumulativeItem;
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
     *       &lt;all>
     *         &lt;element name="CumulateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CumulateBeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CumulateEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CumulativeAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CumulativeItem {

        @XmlElement(name = "CumulateID", required = true, type = Integer.class, nillable = true)
        protected Integer cumulateID;
        @XmlElement(name = "CumulateBeginTime", required = true)
        protected String cumulateBeginTime;
        @XmlElement(name = "CumulateEndTime", required = true)
        protected String cumulateEndTime;
        @XmlElement(name = "CumulativeAmt", required = true, type = Long.class, nillable = true)
        protected Long cumulativeAmt;

        /**
         * Gets the value of the cumulateID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCumulateID() {
            return cumulateID;
        }

        /**
         * Sets the value of the cumulateID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCumulateID(Integer value) {
            this.cumulateID = value;
        }

        /**
         * Gets the value of the cumulateBeginTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCumulateBeginTime() {
            return cumulateBeginTime;
        }

        /**
         * Sets the value of the cumulateBeginTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCumulateBeginTime(String value) {
            this.cumulateBeginTime = value;
        }

        /**
         * Gets the value of the cumulateEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCumulateEndTime() {
            return cumulateEndTime;
        }

        /**
         * Sets the value of the cumulateEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCumulateEndTime(String value) {
            this.cumulateEndTime = value;
        }

        /**
         * Gets the value of the cumulativeAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getCumulativeAmt() {
            return cumulativeAmt;
        }

        /**
         * Sets the value of the cumulativeAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setCumulativeAmt(Long value) {
            this.cumulativeAmt = value;
        }

    }

}
