
package com.huawei.ocs55.bcservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGroupMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberShortNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubGrpMemberInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroupMemberInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubGroupMember", propOrder = {
    "memberShortNo",
    "subGrpMemberInfo"
})
public class SubGroupMember {

    @XmlElement(name = "MemberShortNo")
    protected String memberShortNo;
    @XmlElement(name = "SubGrpMemberInfo")
    protected SubGroupMemberInfo subGrpMemberInfo;

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
     * Gets the value of the subGrpMemberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupMemberInfo }
     *     
     */
    public SubGroupMemberInfo getSubGrpMemberInfo() {
        return subGrpMemberInfo;
    }

    /**
     * Sets the value of the subGrpMemberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupMemberInfo }
     *     
     */
    public void setSubGrpMemberInfo(SubGroupMemberInfo value) {
        this.subGrpMemberInfo = value;
    }

}
