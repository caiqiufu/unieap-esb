
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMainProdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeMainProdResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderInfo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ProductOrderInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginOperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountFlagsAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountFlagsBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeMainProdResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "productOrderInfo",
    "subscriberNo",
    "originTransactionID",
    "originOperatorID",
    "accountFlagsAfter",
    "accountFlagsBefore",
    "status",
    "operateFee"
})
public class ChangeMainProdResult {

    @XmlElement(name = "ProductOrderInfo")
    protected List<ProductOrderInfoType> productOrderInfo;
    @XmlElement(name = "SubscriberNo")
    protected List<String> subscriberNo;
    @XmlElement(name = "OriginTransactionID")
    protected String originTransactionID;
    @XmlElement(name = "OriginOperatorID")
    protected String originOperatorID;
    @XmlElement(name = "AccountFlagsAfter")
    protected String accountFlagsAfter;
    @XmlElement(name = "AccountFlagsBefore")
    protected String accountFlagsBefore;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OperateFee")
    protected String operateFee;

    /**
     * Gets the value of the productOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOrderInfoType }
     * 
     * 
     */
    public List<ProductOrderInfoType> getProductOrderInfo() {
        if (productOrderInfo == null) {
            productOrderInfo = new ArrayList<ProductOrderInfoType>();
        }
        return this.productOrderInfo;
    }

    /**
     * Gets the value of the subscriberNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubscriberNo() {
        if (subscriberNo == null) {
            subscriberNo = new ArrayList<String>();
        }
        return this.subscriberNo;
    }

    /**
     * Gets the value of the originTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }

    /**
     * Sets the value of the originTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTransactionID(String value) {
        this.originTransactionID = value;
    }

    /**
     * Gets the value of the originOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginOperatorID() {
        return originOperatorID;
    }

    /**
     * Sets the value of the originOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginOperatorID(String value) {
        this.originOperatorID = value;
    }

    /**
     * Gets the value of the accountFlagsAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsAfter() {
        return accountFlagsAfter;
    }

    /**
     * Sets the value of the accountFlagsAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsAfter(String value) {
        this.accountFlagsAfter = value;
    }

    /**
     * Gets the value of the accountFlagsBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFlagsBefore() {
        return accountFlagsBefore;
    }

    /**
     * Sets the value of the accountFlagsBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFlagsBefore(String value) {
        this.accountFlagsBefore = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the operateFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateFee() {
        return operateFee;
    }

    /**
     * Sets the value of the operateFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateFee(String value) {
        this.operateFee = value;
    }

}
