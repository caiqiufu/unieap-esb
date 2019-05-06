
package com.huawei.ocs55.businessmgr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySCPCBPNumberSgmntsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySCPCBPNumberSgmntsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCPID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CBPID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberSegmentsList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumberStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NumberStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "QuerySCPCBPNumberSgmntsResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "scpid",
    "cbpid",
    "numberSegmentsList"
})
public class QuerySCPCBPNumberSgmntsResult {

    @XmlElement(name = "SCPID")
    protected BigInteger scpid;
    @XmlElement(name = "CBPID")
    protected BigInteger cbpid;
    @XmlElement(name = "NumberSegmentsList")
    protected List<QuerySCPCBPNumberSgmntsResult.NumberSegmentsList> numberSegmentsList;

    /**
     * Gets the value of the scpid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSCPID() {
        return scpid;
    }

    /**
     * Sets the value of the scpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSCPID(BigInteger value) {
        this.scpid = value;
    }

    /**
     * Gets the value of the cbpid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCBPID() {
        return cbpid;
    }

    /**
     * Sets the value of the cbpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCBPID(BigInteger value) {
        this.cbpid = value;
    }

    /**
     * Gets the value of the numberSegmentsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberSegmentsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberSegmentsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySCPCBPNumberSgmntsResult.NumberSegmentsList }
     * 
     * 
     */
    public List<QuerySCPCBPNumberSgmntsResult.NumberSegmentsList> getNumberSegmentsList() {
        if (numberSegmentsList == null) {
            numberSegmentsList = new ArrayList<QuerySCPCBPNumberSgmntsResult.NumberSegmentsList>();
        }
        return this.numberSegmentsList;
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
     *         &lt;element name="NumberStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NumberStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "numberStart",
        "numberStop"
    })
    public static class NumberSegmentsList {

        @XmlElement(name = "NumberStart", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String numberStart;
        @XmlElement(name = "NumberStop", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String numberStop;

        /**
         * Gets the value of the numberStart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberStart() {
            return numberStart;
        }

        /**
         * Sets the value of the numberStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberStart(String value) {
            this.numberStart = value;
        }

        /**
         * Gets the value of the numberStop property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberStop() {
            return numberStop;
        }

        /**
         * Sets the value of the numberStop property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberStop(String value) {
            this.numberStop = value;
        }

    }

}
