
package com.huawei.ocs12.productmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryProductsByReplacingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryProductsByReplacingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdName" type="{http://www.huawei.com/bme/cbsinterface/cbs/productmgr}IdName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryProductsByReplacingResult", propOrder = {
    "idName"
})
public class QueryProductsByReplacingResult {

    @XmlElement(name = "IdName")
    protected List<IdName> idName;

    /**
     * Gets the value of the idName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdName }
     * 
     * 
     */
    public List<IdName> getIdName() {
        if (idName == null) {
            idName = new ArrayList<IdName>();
        }
        return this.idName;
    }

}
