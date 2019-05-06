
package com.huawei.ocs55.acctmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustSubAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustSubAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModifySubAcctList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ModifySubAcct" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifySubAcctType" maxOccurs="10"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustSubAccountRequest", propOrder = {

})
public class AdjustSubAccountRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "ModifySubAcctList", required = true)
    protected AdjustSubAccountRequest.ModifySubAcctList modifySubAcctList;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

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
     * Gets the value of the modifySubAcctList property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustSubAccountRequest.ModifySubAcctList }
     *     
     */
    public AdjustSubAccountRequest.ModifySubAcctList getModifySubAcctList() {
        return modifySubAcctList;
    }

    /**
     * Sets the value of the modifySubAcctList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustSubAccountRequest.ModifySubAcctList }
     *     
     */
    public void setModifySubAcctList(AdjustSubAccountRequest.ModifySubAcctList value) {
        this.modifySubAcctList = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
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
     *         &lt;element name="ModifySubAcct" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}ModifySubAcctType" maxOccurs="10"/>
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
        "modifySubAcct"
    })
    public static class ModifySubAcctList {

        @XmlElement(name = "ModifySubAcct", required = true)
        protected List<ModifySubAcctType> modifySubAcct;

        /**
         * Gets the value of the modifySubAcct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifySubAcct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifySubAcct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModifySubAcctType }
         * 
         * 
         */
        public List<ModifySubAcctType> getModifySubAcct() {
            if (modifySubAcct == null) {
                modifySubAcct = new ArrayList<ModifySubAcctType>();
            }
            return this.modifySubAcct;
        }

    }

}
