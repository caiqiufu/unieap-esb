
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAppendantProductResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAppendantProductResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductOrderInfo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}ProductOrderInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAppendantProductResult", propOrder = {
    "productOrderInfo",
    "subscriberNo"
})
public class ChangeAppendantProductResult {

    @XmlElement(name = "ProductOrderInfo")
    protected List<ProductOrderInfoType> productOrderInfo;
    @XmlElement(name = "SubscriberNo")
    protected List<String> subscriberNo;

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

}
