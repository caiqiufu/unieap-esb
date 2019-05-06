
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SimpleProperty" type="{http://www.huawei.com/bme/cbsinterface/cbs/businessmgr}SimpleProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "id",
    "simpleProperty"
})
@XmlSeeAlso({
    com.huawei.ocs12.businessmgrservice.NewSubscriberExtRequest.Product.class,
    com.huawei.ocs12.businessmgrservice.SubscribeAppendantProductRequest.Product.class,
    com.huawei.ocs12.businessmgrservice.BatchOperationRequest.BatchSubscribe.Product.class,
    com.huawei.ocs12.businessmgrservice.BatchOperationRequest.BatchChangeMainProduct.Product.class,
    com.huawei.ocs12.businessmgrservice.BatchOperationRequest.BatchChangeMainProduct.RemovedProduct.class,
    com.huawei.ocs12.businessmgrservice.ChangeMainProdRequest.Product.class,
    com.huawei.ocs12.businessmgrservice.ChangeMainProdRequest.RemovedProduct.class,
    com.huawei.ocs12.businessmgrservice.IntegrationEnquiryResult.SubscriberInfo.Product.class,
    com.huawei.ocs12.businessmgrservice.BatchSubscribeAppProductRequest.Product.class,
    com.huawei.ocs12.businessmgrservice.QuerySubscriberProductInfoResult.Product.class,
    com.huawei.ocs12.businessmgrservice.ChangeAppendantProductRequest.Product.class,
    com.huawei.ocs12.businessmgrservice.QueryBasicInfoResult.Subscriber.Product.class
})
public class Product {

    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "SimpleProperty")
    protected List<SimpleProperty> simpleProperty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the simpleProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleProperty }
     * 
     * 
     */
    public List<SimpleProperty> getSimpleProperty() {
        if (simpleProperty == null) {
            simpleProperty = new ArrayList<SimpleProperty>();
        }
        return this.simpleProperty;
    }

}
