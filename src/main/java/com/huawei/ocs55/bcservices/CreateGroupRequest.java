
package com.huawei.ocs55.bcservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateGroupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterCustomer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/>
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OpType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UserCustomer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/>
 *                     &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Account" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Group">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubGroupInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroup" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrimaryOffering" type="{http://www.huawei.com/bme/cbsinterface/bccommon}POfferingInst"/>
 *         &lt;element name="SupplementaryOffering" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
 *                 &lt;sequence>
 *                   &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/>
 *                   &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
 *                   &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
 *                   &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddressInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SalesInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateGroupRequest", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", propOrder = {
    "registerCustomer",
    "userCustomer",
    "account",
    "group",
    "primaryOffering",
    "supplementaryOffering",
    "addressInfo",
    "salesInfo"
})
public class CreateGroupRequest {

    @XmlElement(name = "RegisterCustomer", required = true)
    protected CreateGroupRequest.RegisterCustomer registerCustomer;
    @XmlElement(name = "UserCustomer")
    protected CreateGroupRequest.UserCustomer userCustomer;
    @XmlElement(name = "Account")
    protected CreateGroupRequest.Account account;
    @XmlElement(name = "Group", required = true)
    protected CreateGroupRequest.Group group;
    @XmlElement(name = "PrimaryOffering", required = true)
    protected POfferingInst primaryOffering;
    @XmlElement(name = "SupplementaryOffering")
    protected List<CreateGroupRequest.SupplementaryOffering> supplementaryOffering;
    @XmlElement(name = "AddressInfo")
    protected List<Address> addressInfo;
    @XmlElement(name = "SalesInfo")
    protected SalesInfo salesInfo;

    /**
     * Gets the value of the registerCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupRequest.RegisterCustomer }
     *     
     */
    public CreateGroupRequest.RegisterCustomer getRegisterCustomer() {
        return registerCustomer;
    }

    /**
     * Sets the value of the registerCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupRequest.RegisterCustomer }
     *     
     */
    public void setRegisterCustomer(CreateGroupRequest.RegisterCustomer value) {
        this.registerCustomer = value;
    }

    /**
     * Gets the value of the userCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupRequest.UserCustomer }
     *     
     */
    public CreateGroupRequest.UserCustomer getUserCustomer() {
        return userCustomer;
    }

    /**
     * Sets the value of the userCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupRequest.UserCustomer }
     *     
     */
    public void setUserCustomer(CreateGroupRequest.UserCustomer value) {
        this.userCustomer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupRequest.Account }
     *     
     */
    public CreateGroupRequest.Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupRequest.Account }
     *     
     */
    public void setAccount(CreateGroupRequest.Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupRequest.Group }
     *     
     */
    public CreateGroupRequest.Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupRequest.Group }
     *     
     */
    public void setGroup(CreateGroupRequest.Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the primaryOffering property.
     * 
     * @return
     *     possible object is
     *     {@link POfferingInst }
     *     
     */
    public POfferingInst getPrimaryOffering() {
        return primaryOffering;
    }

    /**
     * Sets the value of the primaryOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link POfferingInst }
     *     
     */
    public void setPrimaryOffering(POfferingInst value) {
        this.primaryOffering = value;
    }

    /**
     * Gets the value of the supplementaryOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementaryOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementaryOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateGroupRequest.SupplementaryOffering }
     * 
     * 
     */
    public List<CreateGroupRequest.SupplementaryOffering> getSupplementaryOffering() {
        if (supplementaryOffering == null) {
            supplementaryOffering = new ArrayList<CreateGroupRequest.SupplementaryOffering>();
        }
        return this.supplementaryOffering;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<Address>();
        }
        return this.addressInfo;
    }

    /**
     * Gets the value of the salesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInfo }
     *     
     */
    public SalesInfo getSalesInfo() {
        return salesInfo;
    }

    /**
     * Sets the value of the salesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInfo }
     *     
     */
    public void setSalesInfo(SalesInfo value) {
        this.salesInfo = value;
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
     *         &lt;element name="PayRelationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AcctInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}AccountInfo" minOccurs="0"/>
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
        "payRelationKey",
        "acctKey",
        "acctInfo"
    })
    public static class Account {

        @XmlElement(name = "PayRelationKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String payRelationKey;
        @XmlElement(name = "AcctKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String acctKey;
        @XmlElement(name = "AcctInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected AccountInfo acctInfo;

        /**
         * Gets the value of the payRelationKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayRelationKey() {
            return payRelationKey;
        }

        /**
         * Sets the value of the payRelationKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayRelationKey(String value) {
            this.payRelationKey = value;
        }

        /**
         * Gets the value of the acctKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctKey() {
            return acctKey;
        }

        /**
         * Sets the value of the acctKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctKey(String value) {
            this.acctKey = value;
        }

        /**
         * Gets the value of the acctInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AccountInfo }
         *     
         */
        public AccountInfo getAcctInfo() {
            return acctInfo;
        }

        /**
         * Sets the value of the acctInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountInfo }
         *     
         */
        public void setAcctInfo(AccountInfo value) {
            this.acctInfo = value;
        }

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
     *         &lt;element name="SubGroupInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}SubGroup" minOccurs="0"/>
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
        "subGroupInfo"
    })
    public static class Group {

        @XmlElement(name = "SubGroupKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String subGroupKey;
        @XmlElement(name = "SubGroupInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected SubGroup subGroupInfo;

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
         * Gets the value of the subGroupInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroup }
         *     
         */
        public SubGroup getSubGroupInfo() {
            return subGroupInfo;
        }

        /**
         * Sets the value of the subGroupInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroup }
         *     
         */
        public void setSubGroupInfo(SubGroup value) {
            this.subGroupInfo = value;
        }

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
     *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/>
     *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="OpType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custKey",
        "custInfo",
        "individualInfo",
        "orgInfo"
    })
    public static class RegisterCustomer {

        @XmlElement(name = "CustKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String custKey;
        @XmlElement(name = "CustInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected CustInfo custInfo;
        @XmlElement(name = "IndividualInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected IndividualInfo individualInfo;
        @XmlElement(name = "OrgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected OrgInfo orgInfo;
        @XmlAttribute(name = "OpType", required = true)
        protected String opType;

        /**
         * Gets the value of the custKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustKey() {
            return custKey;
        }

        /**
         * Sets the value of the custKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustKey(String value) {
            this.custKey = value;
        }

        /**
         * Gets the value of the custInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfo }
         *     
         */
        public CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Sets the value of the custInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfo }
         *     
         */
        public void setCustInfo(CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the individualInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualInfo }
         *     
         */
        public IndividualInfo getIndividualInfo() {
            return individualInfo;
        }

        /**
         * Sets the value of the individualInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualInfo }
         *     
         */
        public void setIndividualInfo(IndividualInfo value) {
            this.individualInfo = value;
        }

        /**
         * Gets the value of the orgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OrgInfo }
         *     
         */
        public OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgInfo }
         *     
         */
        public void setOrgInfo(OrgInfo value) {
            this.orgInfo = value;
        }

        /**
         * Gets the value of the opType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpType() {
            return opType;
        }

        /**
         * Sets the value of the opType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpType(String value) {
            this.opType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingInst">
     *       &lt;sequence>
     *         &lt;element name="OfferingOwner" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OfferingOwner" minOccurs="0"/>
     *         &lt;element name="EffectiveTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}EffectMode"/>
     *         &lt;element name="ExpirationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}DateTime"/>
     *         &lt;element name="ActivationTime" type="{http://www.huawei.com/bme/cbsinterface/bccommon}ActiveMode" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offeringOwner",
        "effectiveTime",
        "expirationTime",
        "activationTime"
    })
    public static class SupplementaryOffering
        extends OfferingInst
    {

        @XmlElement(name = "OfferingOwner", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected OfferingOwner offeringOwner;
        @XmlElement(name = "EffectiveTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected EffectMode effectiveTime;
        @XmlElement(name = "ExpirationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String expirationTime;
        @XmlElement(name = "ActivationTime", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected ActiveMode activationTime;

        /**
         * Gets the value of the offeringOwner property.
         * 
         * @return
         *     possible object is
         *     {@link OfferingOwner }
         *     
         */
        public OfferingOwner getOfferingOwner() {
            return offeringOwner;
        }

        /**
         * Sets the value of the offeringOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferingOwner }
         *     
         */
        public void setOfferingOwner(OfferingOwner value) {
            this.offeringOwner = value;
        }

        /**
         * Gets the value of the effectiveTime property.
         * 
         * @return
         *     possible object is
         *     {@link EffectMode }
         *     
         */
        public EffectMode getEffectiveTime() {
            return effectiveTime;
        }

        /**
         * Sets the value of the effectiveTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link EffectMode }
         *     
         */
        public void setEffectiveTime(EffectMode value) {
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

        /**
         * Gets the value of the activationTime property.
         * 
         * @return
         *     possible object is
         *     {@link ActiveMode }
         *     
         */
        public ActiveMode getActivationTime() {
            return activationTime;
        }

        /**
         * Sets the value of the activationTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActiveMode }
         *     
         */
        public void setActivationTime(ActiveMode value) {
            this.activationTime = value;
        }

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
     *         &lt;element name="CustKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CustInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}CustInfo" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="IndividualInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}IndividualInfo" minOccurs="0"/>
     *           &lt;element name="OrgInfo" type="{http://www.huawei.com/bme/cbsinterface/bccommon}OrgInfo" minOccurs="0"/>
     *         &lt;/choice>
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
        "custKey",
        "custInfo",
        "individualInfo",
        "orgInfo"
    })
    public static class UserCustomer {

        @XmlElement(name = "CustKey", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices", required = true)
        protected String custKey;
        @XmlElement(name = "CustInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected CustInfo custInfo;
        @XmlElement(name = "IndividualInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected IndividualInfo individualInfo;
        @XmlElement(name = "OrgInfo", namespace = "http://www.huawei.com/bme/cbsinterface/bcservices")
        protected OrgInfo orgInfo;

        /**
         * Gets the value of the custKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustKey() {
            return custKey;
        }

        /**
         * Sets the value of the custKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustKey(String value) {
            this.custKey = value;
        }

        /**
         * Gets the value of the custInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustInfo }
         *     
         */
        public CustInfo getCustInfo() {
            return custInfo;
        }

        /**
         * Sets the value of the custInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustInfo }
         *     
         */
        public void setCustInfo(CustInfo value) {
            this.custInfo = value;
        }

        /**
         * Gets the value of the individualInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IndividualInfo }
         *     
         */
        public IndividualInfo getIndividualInfo() {
            return individualInfo;
        }

        /**
         * Sets the value of the individualInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndividualInfo }
         *     
         */
        public void setIndividualInfo(IndividualInfo value) {
            this.individualInfo = value;
        }

        /**
         * Gets the value of the orgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OrgInfo }
         *     
         */
        public OrgInfo getOrgInfo() {
            return orgInfo;
        }

        /**
         * Sets the value of the orgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgInfo }
         *     
         */
        public void setOrgInfo(OrgInfo value) {
            this.orgInfo = value;
        }

    }

}
