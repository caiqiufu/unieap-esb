
package com.huawei.ocs12.businessmgrservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMainProdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMainProdRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Common">
 *       &lt;sequence>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewBrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewMainProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HandlingChargeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidMode" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ValidMode"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                 &lt;sequence>
 *                   &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RemovedProduct" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
 *                 &lt;sequence>
 *                   &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ppsAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="posAcctCredit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ppsAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="posAcctInitBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="newBillcycleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BCChangeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubscriberNumberNAI" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberNumberNAI" minOccurs="0"/>
 *         &lt;element name="ExternalData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainProductAction" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}MainProductAction" minOccurs="0"/>
 *         &lt;element name="MainProductTempID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainProductTempExpiryType" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}MainProductTempExpiryType" minOccurs="0"/>
 *         &lt;element name="MainProductTempExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountActivationFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMainProdRequest", propOrder = {
    "imsi",
    "newBrandId",
    "newMainProductId",
    "handlingChargeFlag",
    "validMode",
    "effectiveDate",
    "product",
    "removedProduct",
    "custID",
    "ppsAcctCredit",
    "posAcctCredit",
    "ppsAcctInitBal",
    "posAcctInitBal",
    "newBillcycleType",
    "bcChangeMode",
    "subscriberNumberNAI",
    "externalData1",
    "mainProductAction",
    "mainProductTempID",
    "mainProductTempExpiryType",
    "mainProductTempExpiryDate",
    "externalData2",
    "accountActivationFlag"
})
public class ChangeMainProdRequest
    extends Common
{

    protected String imsi;
    @XmlElement(name = "NewBrandId")
    protected String newBrandId;
    @XmlElement(name = "NewMainProductId", required = true)
    protected String newMainProductId;
    @XmlElement(name = "HandlingChargeFlag")
    protected Integer handlingChargeFlag;
    @XmlElement(name = "ValidMode", required = true)
    protected String validMode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "Product")
    protected List<ChangeMainProdRequest.Product> product;
    @XmlElement(name = "RemovedProduct")
    protected List<ChangeMainProdRequest.RemovedProduct> removedProduct;
    @XmlElement(name = "CustID")
    protected String custID;
    protected Long ppsAcctCredit;
    protected Long posAcctCredit;
    protected Long ppsAcctInitBal;
    protected Long posAcctInitBal;
    protected Integer newBillcycleType;
    @XmlElement(name = "BCChangeMode")
    protected Integer bcChangeMode;
    @XmlElement(name = "SubscriberNumberNAI")
    protected Integer subscriberNumberNAI;
    @XmlElement(name = "ExternalData1")
    protected String externalData1;
    @XmlElement(name = "MainProductAction")
    protected Integer mainProductAction;
    @XmlElement(name = "MainProductTempID")
    protected String mainProductTempID;
    @XmlElement(name = "MainProductTempExpiryType")
    protected BigInteger mainProductTempExpiryType;
    @XmlElement(name = "MainProductTempExpiryDate")
    protected String mainProductTempExpiryDate;
    @XmlElement(name = "ExternalData2")
    protected String externalData2;
    protected Integer accountActivationFlag;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the newBrandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBrandId() {
        return newBrandId;
    }

    /**
     * Sets the value of the newBrandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBrandId(String value) {
        this.newBrandId = value;
    }

    /**
     * Gets the value of the newMainProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMainProductId() {
        return newMainProductId;
    }

    /**
     * Sets the value of the newMainProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMainProductId(String value) {
        this.newMainProductId = value;
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
     * Gets the value of the validMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidMode() {
        return validMode;
    }

    /**
     * Sets the value of the validMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidMode(String value) {
        this.validMode = value;
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
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeMainProdRequest.Product }
     * 
     * 
     */
    public List<ChangeMainProdRequest.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<ChangeMainProdRequest.Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the removedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeMainProdRequest.RemovedProduct }
     * 
     * 
     */
    public List<ChangeMainProdRequest.RemovedProduct> getRemovedProduct() {
        if (removedProduct == null) {
            removedProduct = new ArrayList<ChangeMainProdRequest.RemovedProduct>();
        }
        return this.removedProduct;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the ppsAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPpsAcctCredit() {
        return ppsAcctCredit;
    }

    /**
     * Sets the value of the ppsAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPpsAcctCredit(Long value) {
        this.ppsAcctCredit = value;
    }

    /**
     * Gets the value of the posAcctCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosAcctCredit() {
        return posAcctCredit;
    }

    /**
     * Sets the value of the posAcctCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosAcctCredit(Long value) {
        this.posAcctCredit = value;
    }

    /**
     * Gets the value of the ppsAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPpsAcctInitBal() {
        return ppsAcctInitBal;
    }

    /**
     * Sets the value of the ppsAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPpsAcctInitBal(Long value) {
        this.ppsAcctInitBal = value;
    }

    /**
     * Gets the value of the posAcctInitBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosAcctInitBal() {
        return posAcctInitBal;
    }

    /**
     * Sets the value of the posAcctInitBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosAcctInitBal(Long value) {
        this.posAcctInitBal = value;
    }

    /**
     * Gets the value of the newBillcycleType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewBillcycleType() {
        return newBillcycleType;
    }

    /**
     * Sets the value of the newBillcycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewBillcycleType(Integer value) {
        this.newBillcycleType = value;
    }

    /**
     * Gets the value of the bcChangeMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBCChangeMode() {
        return bcChangeMode;
    }

    /**
     * Sets the value of the bcChangeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBCChangeMode(Integer value) {
        this.bcChangeMode = value;
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
     * Gets the value of the externalData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalData1() {
        return externalData1;
    }

    /**
     * Sets the value of the externalData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalData1(String value) {
        this.externalData1 = value;
    }

    /**
     * Gets the value of the mainProductAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainProductAction() {
        return mainProductAction;
    }

    /**
     * Sets the value of the mainProductAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainProductAction(Integer value) {
        this.mainProductAction = value;
    }

    /**
     * Gets the value of the mainProductTempID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainProductTempID() {
        return mainProductTempID;
    }

    /**
     * Sets the value of the mainProductTempID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainProductTempID(String value) {
        this.mainProductTempID = value;
    }

    /**
     * Gets the value of the mainProductTempExpiryType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMainProductTempExpiryType() {
        return mainProductTempExpiryType;
    }

    /**
     * Sets the value of the mainProductTempExpiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMainProductTempExpiryType(BigInteger value) {
        this.mainProductTempExpiryType = value;
    }

    /**
     * Gets the value of the mainProductTempExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainProductTempExpiryDate() {
        return mainProductTempExpiryDate;
    }

    /**
     * Sets the value of the mainProductTempExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainProductTempExpiryDate(String value) {
        this.mainProductTempExpiryDate = value;
    }

    /**
     * Gets the value of the externalData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalData2() {
        return externalData2;
    }

    /**
     * Sets the value of the externalData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalData2(String value) {
        this.externalData2 = value;
    }

    /**
     * Gets the value of the accountActivationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountActivationFlag() {
        return accountActivationFlag;
    }

    /**
     * Sets the value of the accountActivationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountActivationFlag(Integer value) {
        this.accountActivationFlag = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *       &lt;sequence>
     *         &lt;element name="BindSubscriberNo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}BindSubscriberNo" maxOccurs="unbounded" minOccurs="0"/>
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
        "bindSubscriberNo"
    })
    public static class Product
        extends com.huawei.ocs12.businessmgrservice.Product
    {

        @XmlElement(name = "BindSubscriberNo")
        protected List<BindSubscriberNo> bindSubscriberNo;

        /**
         * Gets the value of the bindSubscriberNo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bindSubscriberNo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBindSubscriberNo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BindSubscriberNo }
         * 
         * 
         */
        public List<BindSubscriberNo> getBindSubscriberNo() {
            if (bindSubscriberNo == null) {
                bindSubscriberNo = new ArrayList<BindSubscriberNo>();
            }
            return this.bindSubscriberNo;
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
     *     &lt;extension base="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}Product">
     *       &lt;sequence>
     *         &lt;element name="ProductOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "productOrderKey"
    })
    public static class RemovedProduct
        extends com.huawei.ocs12.businessmgrservice.Product
    {

        @XmlElement(name = "ProductOrderKey")
        protected String productOrderKey;

        /**
         * Gets the value of the productOrderKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductOrderKey() {
            return productOrderKey;
        }

        /**
         * Sets the value of the productOrderKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductOrderKey(String value) {
            this.productOrderKey = value;
        }

    }

}
