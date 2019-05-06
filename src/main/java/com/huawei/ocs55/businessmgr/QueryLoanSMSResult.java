
package com.huawei.ocs55.businessmgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLoanSMSResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLoanSMSResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscirberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SMSAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLoanSMSResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subscirberNo",
    "smsAmount"
})
public class QueryLoanSMSResult {

    @XmlElement(name = "SubscirberNo", required = true)
    protected String subscirberNo;
    @XmlElement(name = "SMSAmount")
    protected int smsAmount;

    /**
     * Gets the value of the subscirberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscirberNo() {
        return subscirberNo;
    }

    /**
     * Sets the value of the subscirberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscirberNo(String value) {
        this.subscirberNo = value;
    }

    /**
     * Gets the value of the smsAmount property.
     * 
     */
    public int getSMSAmount() {
        return smsAmount;
    }

    /**
     * Sets the value of the smsAmount property.
     * 
     */
    public void setSMSAmount(int value) {
        this.smsAmount = value;
    }

}
