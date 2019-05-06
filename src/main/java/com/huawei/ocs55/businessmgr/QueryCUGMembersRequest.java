
package com.huawei.ocs55.businessmgr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCUGMembersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCUGMembersRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CUGID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "QueryCUGMembersRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "operationType",
    "cugid"
})
public class QueryCUGMembersRequest {

    @XmlElement(name = "OperationType", required = true)
    protected BigInteger operationType;
    @XmlElement(name = "CUGID", required = true)
    protected String cugid;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperationType(BigInteger value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the cugid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGID() {
        return cugid;
    }

    /**
     * Sets the value of the cugid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGID(String value) {
        this.cugid = value;
    }

}
