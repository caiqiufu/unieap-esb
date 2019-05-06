
package com.huawei.ocs55.acctmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyAcctFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyAcctFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrAcctChgAmt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GLID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinMeasureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpireTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrAcctChgDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreateAcctItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentApplyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyAcctFeeType", propOrder = {

})
public class ModifyAcctFeeType {

    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "CurrAcctChgAmt")
    protected long currAcctChgAmt;
    @XmlElement(name = "GLID")
    protected Integer glid;
    @XmlElement(name = "MinMeasureId")
    protected Integer minMeasureId;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ExpireTime")
    protected String expireTime;
    @XmlElement(name = "CurrAcctChgDay")
    protected Integer currAcctChgDay;
    @XmlElement(name = "CreateAcctItem")
    protected Integer createAcctItem;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "CurrentApplyDate")
    protected String currentApplyDate;
    @XmlElement(name = "CurrentExpiryDate")
    protected String currentExpiryDate;
    @XmlElement(name = "ApplyTime")
    protected String applyTime;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the currAcctChgAmt property.
     * 
     */
    public long getCurrAcctChgAmt() {
        return currAcctChgAmt;
    }

    /**
     * Sets the value of the currAcctChgAmt property.
     * 
     */
    public void setCurrAcctChgAmt(long value) {
        this.currAcctChgAmt = value;
    }

    /**
     * Gets the value of the glid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGLID() {
        return glid;
    }

    /**
     * Sets the value of the glid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGLID(Integer value) {
        this.glid = value;
    }

    /**
     * Gets the value of the minMeasureId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinMeasureId() {
        return minMeasureId;
    }

    /**
     * Sets the value of the minMeasureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinMeasureId(Integer value) {
        this.minMeasureId = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
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
     * Gets the value of the currAcctChgDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrAcctChgDay() {
        return currAcctChgDay;
    }

    /**
     * Sets the value of the currAcctChgDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrAcctChgDay(Integer value) {
        this.currAcctChgDay = value;
    }

    /**
     * Gets the value of the createAcctItem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreateAcctItem() {
        return createAcctItem;
    }

    /**
     * Sets the value of the createAcctItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreateAcctItem(Integer value) {
        this.createAcctItem = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the currentApplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentApplyDate() {
        return currentApplyDate;
    }

    /**
     * Sets the value of the currentApplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentApplyDate(String value) {
        this.currentApplyDate = value;
    }

    /**
     * Gets the value of the currentExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentExpiryDate() {
        return currentExpiryDate;
    }

    /**
     * Sets the value of the currentExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentExpiryDate(String value) {
        this.currentExpiryDate = value;
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

}
