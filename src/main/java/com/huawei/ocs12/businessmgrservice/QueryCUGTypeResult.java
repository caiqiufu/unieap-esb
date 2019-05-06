
package com.huawei.ocs12.businessmgrservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCUGTypeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCUGTypeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUGTypeList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUGType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CUGTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "QueryCUGTypeResult", propOrder = {
    "cugTypeList"
})
public class QueryCUGTypeResult {

    @XmlElement(name = "CUGTypeList")
    protected List<QueryCUGTypeResult.CUGTypeList> cugTypeList;

    /**
     * Gets the value of the cugTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cugTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUGTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCUGTypeResult.CUGTypeList }
     * 
     * 
     */
    public List<QueryCUGTypeResult.CUGTypeList> getCUGTypeList() {
        if (cugTypeList == null) {
            cugTypeList = new ArrayList<QueryCUGTypeResult.CUGTypeList>();
        }
        return this.cugTypeList;
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
     *         &lt;element name="CUGType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="CUGTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "cugType",
        "cugTypeName"
    })
    public static class CUGTypeList {

        @XmlElement(name = "CUGType", required = true)
        protected BigInteger cugType;
        @XmlElement(name = "CUGTypeName", required = true)
        protected String cugTypeName;

        /**
         * Gets the value of the cugType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCUGType() {
            return cugType;
        }

        /**
         * Sets the value of the cugType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCUGType(BigInteger value) {
            this.cugType = value;
        }

        /**
         * Gets the value of the cugTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUGTypeName() {
            return cugTypeName;
        }

        /**
         * Sets the value of the cugTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUGTypeName(String value) {
            this.cugTypeName = value;
        }

    }

}
