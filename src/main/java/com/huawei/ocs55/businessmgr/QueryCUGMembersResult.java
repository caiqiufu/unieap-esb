
package com.huawei.ocs55.businessmgr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCUGMembersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCUGMembersResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUGName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUGType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CUGMemberAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnedMemberAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CUGMemberList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "QueryCUGMembersResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "cugid",
    "cugName",
    "applyTime",
    "expireTime",
    "cugType",
    "cugMemberAmt",
    "returnedMemberAmt",
    "cugMemberList"
})
public class QueryCUGMembersResult {

    @XmlElement(name = "CUGID")
    protected String cugid;
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
    @XmlElement(name = "ReturnedMemberAmt")
    protected Integer returnedMemberAmt;
    @XmlElement(name = "CUGMemberList")
    protected List<QueryCUGMembersResult.CUGMemberList> cugMemberList;

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

    /**
     * Gets the value of the returnedMemberAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedMemberAmt() {
        return returnedMemberAmt;
    }

    /**
     * Sets the value of the returnedMemberAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedMemberAmt(Integer value) {
        this.returnedMemberAmt = value;
    }

    /**
     * Gets the value of the cugMemberList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cugMemberList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUGMemberList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCUGMembersResult.CUGMemberList }
     * 
     * 
     */
    public List<QueryCUGMembersResult.CUGMemberList> getCUGMemberList() {
        if (cugMemberList == null) {
            cugMemberList = new ArrayList<QueryCUGMembersResult.CUGMemberList>();
        }
        return this.cugMemberList;
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
     *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "subscriberNo"
    })
    public static class CUGMemberList {

        @XmlElement(name = "SubscriberNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String subscriberNo;

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

    }

}
