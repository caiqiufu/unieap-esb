
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManSubFamilyNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManSubFamilyNoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FamilyNoInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FamilyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phoneNoOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="NewFamilyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AppProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubscriberNumberNAI" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberNumberNAI" minOccurs="0"/>
 *         &lt;element name="AccessMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsConfirm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManSubFamilyNoRequest", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscriberNo",
    "familyNoInfo",
    "operationType",
    "handlingChargeFlag",
    "subscriberNumberNAI",
    "accessMethod",
    "isConfirm"
})
public class ManSubFamilyNoRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "FamilyNoInfo")
    protected List<ManSubFamilyNoRequest.FamilyNoInfo> familyNoInfo;
    @XmlElement(name = "OperationType")
    protected int operationType;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "SubscriberNumberNAI")
    protected Integer subscriberNumberNAI;
    @XmlElement(name = "AccessMethod")
    protected Integer accessMethod;
    @XmlElement(name = "IsConfirm")
    protected Integer isConfirm;

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
     * {@link ManSubFamilyNoRequest.FamilyNoInfo }
     * 
     * 
     */
    public List<ManSubFamilyNoRequest.FamilyNoInfo> getFamilyNoInfo() {
        if (familyNoInfo == null) {
            familyNoInfo = new ArrayList<ManSubFamilyNoRequest.FamilyNoInfo>();
        }
        return this.familyNoInfo;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the handlingChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingChargeFlag() {
        return handlingChargeFlag;
    }

    /**
     * Sets the value of the handlingChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingChargeFlag(Integer value) {
        this.handlingChargeFlag = value;
    }

    /**
     * Gets the value of the subscriberNumberNAI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriberNumberNAI() {
        return subscriberNumberNAI;
    }

    /**
     * Sets the value of the subscriberNumberNAI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriberNumberNAI(Integer value) {
        this.subscriberNumberNAI = value;
    }

    /**
     * Gets the value of the accessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessMethod() {
        return accessMethod;
    }

    /**
     * Sets the value of the accessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessMethod(Integer value) {
        this.accessMethod = value;
    }

    /**
     * Gets the value of the isConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsConfirm() {
        return isConfirm;
    }

    /**
     * Sets the value of the isConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsConfirm(Integer value) {
        this.isConfirm = value;
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
     *         &lt;element name="phoneNoOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="NewFamilyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AppProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "phoneNoOrder",
        "newFamilyNo",
        "subGroupType",
        "effectiveDate",
        "expireDate",
        "appProductID"
    })
    public static class FamilyNoInfo {

        @XmlElement(name = "FamilyNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected String familyNo;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer phoneNoOrder;
        @XmlElement(name = "NewFamilyNo", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String newFamilyNo;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String subGroupType;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String effectiveDate;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected String expireDate;
        @XmlElement(name = "AppProductID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
        protected Integer appProductID;

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
         * Gets the value of the phoneNoOrder property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPhoneNoOrder() {
            return phoneNoOrder;
        }

        /**
         * Sets the value of the phoneNoOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPhoneNoOrder(Integer value) {
            this.phoneNoOrder = value;
        }

        /**
         * Gets the value of the newFamilyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewFamilyNo() {
            return newFamilyNo;
        }

        /**
         * Sets the value of the newFamilyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewFamilyNo(String value) {
            this.newFamilyNo = value;
        }

        /**
         * Gets the value of the subGroupType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubGroupType() {
            return subGroupType;
        }

        /**
         * Sets the value of the subGroupType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubGroupType(String value) {
            this.subGroupType = value;
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
         * Gets the value of the appProductID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAppProductID() {
            return appProductID;
        }

        /**
         * Sets the value of the appProductID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAppProductID(Integer value) {
            this.appProductID = value;
        }

    }

}
