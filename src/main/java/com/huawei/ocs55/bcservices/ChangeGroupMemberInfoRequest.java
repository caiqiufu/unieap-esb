
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeGroupMemberInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeGroupMemberInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubGroupAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupAccessCode"/>
 *         &lt;element name="GroupMember">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
 *                   &lt;element name="SubGroupMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupMemberInfo"/>
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
@XmlType(name = "ChangeGroupMemberInfoRequest", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "subGroupAccessCode",
    "groupMember"
})
public class ChangeGroupMemberInfoRequest {

    @XmlElement(name = "SubGroupAccessCode", required = true)
    protected SubGroupAccessCode subGroupAccessCode;
    @XmlElement(name = "GroupMember", required = true)
    protected ChangeGroupMemberInfoRequest.GroupMember groupMember;

    /**
     * Gets the value of the subGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public SubGroupAccessCode getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Sets the value of the subGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCode }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCode value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Gets the value of the groupMember property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeGroupMemberInfoRequest.GroupMember }
     *     
     */
    public ChangeGroupMemberInfoRequest.GroupMember getGroupMember() {
        return groupMember;
    }

    /**
     * Sets the value of the groupMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeGroupMemberInfoRequest.GroupMember }
     *     
     */
    public void setGroupMember(ChangeGroupMemberInfoRequest.GroupMember value) {
        this.groupMember = value;
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
     *         &lt;element name="SubAccessCode" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubAccessCode"/>
     *         &lt;element name="SubGroupMember" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupMemberInfo"/>
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
        "subAccessCode",
        "subGroupMember"
    })
    public static class GroupMember {

        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "SubGroupMember", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected SubGroupMemberInfo subGroupMember;

        /**
         * Gets the value of the subAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubAccessCode() {
            return subAccessCode;
        }

        /**
         * Sets the value of the subAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubAccessCode(SubAccessCode value) {
            this.subAccessCode = value;
        }

        /**
         * Gets the value of the subGroupMember property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupMemberInfo }
         *     
         */
        public SubGroupMemberInfo getSubGroupMember() {
            return subGroupMember;
        }

        /**
         * Sets the value of the subGroupMember property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupMemberInfo }
         *     
         */
        public void setSubGroupMember(SubGroupMemberInfo value) {
            this.subGroupMember = value;
        }

    }

}
