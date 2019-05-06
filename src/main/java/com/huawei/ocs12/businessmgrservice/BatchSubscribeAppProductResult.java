
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchSubscribeAppProductResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchSubscribeAppProductResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberProdOrderInfo" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SubscriberProdOrderInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSubscribeAppProductResult", propOrder = {
    "subscriberProdOrderInfo"
})
public class BatchSubscribeAppProductResult {

    @XmlElement(name = "SubscriberProdOrderInfo")
    protected List<SubscriberProdOrderInfoType> subscriberProdOrderInfo;

    /**
     * Gets the value of the subscriberProdOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberProdOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberProdOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberProdOrderInfoType }
     * 
     * 
     */
    public List<SubscriberProdOrderInfoType> getSubscriberProdOrderInfo() {
        if (subscriberProdOrderInfo == null) {
            subscriberProdOrderInfo = new ArrayList<SubscriberProdOrderInfoType>();
        }
        return this.subscriberProdOrderInfo;
    }

}
