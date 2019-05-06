
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryGroupListBySubscriberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryGroupListBySubscriberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GroupAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MemberTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MemberProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
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
@XmlType(name = "QueryGroupListBySubscriberResult", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "groupList"
})
public class QueryGroupListBySubscriberResult {

    @XmlElement(name = "GroupList")
    protected List<QueryGroupListBySubscriberResult.GroupList> groupList;

    /**
     * Gets the value of the groupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryGroupListBySubscriberResult.GroupList }
     * 
     * 
     */
    public List<QueryGroupListBySubscriberResult.GroupList> getGroupList() {
        if (groupList == null) {
            groupList = new ArrayList<QueryGroupListBySubscriberResult.GroupList>();
        }
        return this.groupList;
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
     *         &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="GroupAccountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MemberTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MemberProperty" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
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
        "subGroupKey",
        "subGroupCode",
        "subGroupType",
        "groupAccountCode",
        "memberTypeCode",
        "memberShortNo",
        "memberProperty",
        "effectiveTime",
        "expirationTime"
    })
    public static class GroupList {

        @XmlElement(name = "SubGroupKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String subGroupKey;
        @XmlElement(name = "SubGroupCode", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String subGroupCode;
        @XmlElement(name = "SubGroupType", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String subGroupType;
        @XmlElement(name = "GroupAccountCode", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String groupAccountCode;
        @XmlElement(name = "MemberTypeCode", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String memberTypeCode;
        @XmlElement(name = "MemberShortNo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected String memberShortNo;
        @XmlElement(name = "MemberProperty", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected List<SimpleProperty> memberProperty;
        @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String effectiveTime;
        @XmlElement(name = "ExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String expirationTime;

        /**
         * Gets the value of the subGroupKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubGroupKey() {
            return subGroupKey;
        }

        /**
         * Sets the value of the subGroupKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubGroupKey(String value) {
            this.subGroupKey = value;
        }

        /**
         * Gets the value of the subGroupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubGroupCode() {
            return subGroupCode;
        }

        /**
         * Sets the value of the subGroupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubGroupCode(String value) {
            this.subGroupCode = value;
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
         * Gets the value of the groupAccountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupAccountCode() {
            return groupAccountCode;
        }

        /**
         * Sets the value of the groupAccountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupAccountCode(String value) {
            this.groupAccountCode = value;
        }

        /**
         * Gets the value of the memberTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberTypeCode() {
            return memberTypeCode;
        }

        /**
         * Sets the value of the memberTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberTypeCode(String value) {
            this.memberTypeCode = value;
        }

        /**
         * Gets the value of the memberShortNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberShortNo() {
            return memberShortNo;
        }

        /**
         * Sets the value of the memberShortNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberShortNo(String value) {
            this.memberShortNo = value;
        }

        /**
         * Gets the value of the memberProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleProperty }
         * 
         * 
         */
        public List<SimpleProperty> getMemberProperty() {
            if (memberProperty == null) {
                memberProperty = new ArrayList<SimpleProperty>();
            }
            return this.memberProperty;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffectiveTime(String value) {
            this.effectiveTime = value;
        }

        /**
         * Gets the value of the expirationTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationTime() {
            return expirationTime;
        }

        /**
         * Sets the value of the expirationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationTime(String value) {
            this.expirationTime = value;
        }

    }

}
