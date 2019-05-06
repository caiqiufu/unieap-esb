
package com.huawei.ocs12.businessmgrservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManCUGInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManCUGInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUGID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CUGName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUGType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CUGMemberAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManCUGInfoResult", propOrder = {
    "cugid",
    "cugName",
    "applyTime",
    "expireTime",
    "cugType",
    "cugMemberAmt"
})
public class ManCUGInfoResult {

    @XmlElement(name = "CUGID")
    protected BigInteger cugid;
    @XmlElement(name = "CUGName")
    protected String cugName;
    @XmlElement(name = "ApplyTime")
    protected String applyTime;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;
    @XmlElement(name = "CUGType")
    protected BigInteger cugType;
    @XmlElement(name = "CUGMemberAmt")
    protected Integer cugMemberAmt;

    /**
     * Gets the value of the cugid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCUGID() {
        return cugid;
    }

    /**
     * Sets the value of the cugid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCUGID(BigInteger value) {
        this.cugid = value;
    }

    /**
     * Gets the value of the cugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUGName() {
        return cugName;
    }

    /**
     * Sets the value of the cugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUGName(String value) {
        this.cugName = value;
    }

    /**
     * Gets the value of the applyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * Sets the value of the applyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTime(String value) {
        this.applyTime = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

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
     * Gets the value of the cugMemberAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCUGMemberAmt() {
        return cugMemberAmt;
    }

    /**
     * Sets the value of the cugMemberAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCUGMemberAmt(Integer value) {
        this.cugMemberAmt = value;
    }

}
