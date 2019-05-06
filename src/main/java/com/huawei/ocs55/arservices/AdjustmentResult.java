
package com.huawei.ocs55.arservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdjustmentInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}BalanceChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreeUnitAdjustmentInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}FreeUnitChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditAdjustmentInfo" type="{http://cbs.huawei.com/ar/wsservice/arcommon}CreditChgInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "acctKey",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "creditAdjustmentInfo"
})
public class AdjustmentResult {

    @XmlElement(name = "AcctKey", required = true)
    protected String acctKey;
    @XmlElement(name = "AdjustmentInfo")
    protected List<BalanceChgInfo> adjustmentInfo;
    @XmlElement(name = "FreeUnitAdjustmentInfo")
    protected List<FreeUnitChgInfo> freeUnitAdjustmentInfo;
    @XmlElement(name = "CreditAdjustmentInfo")
    protected List<CreditChgInfo> creditAdjustmentInfo;

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
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfo }
     * 
     * 
     */
    public List<BalanceChgInfo> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BalanceChgInfo>();
        }
        return this.adjustmentInfo;
    }

    /**
     * Gets the value of the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitChgInfo }
     * 
     * 
     */
    public List<FreeUnitChgInfo> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<FreeUnitChgInfo>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the creditAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfo }
     * 
     * 
     */
    public List<CreditChgInfo> getCreditAdjustmentInfo() {
        if (creditAdjustmentInfo == null) {
            creditAdjustmentInfo = new ArrayList<CreditChgInfo>();
        }
        return this.creditAdjustmentInfo;
    }

}
