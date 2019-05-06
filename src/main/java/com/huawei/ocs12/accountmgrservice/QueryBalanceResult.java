
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BalanceRecord" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}BalanceRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceResult", propOrder = {
    "balanceRecord"
})
public class QueryBalanceResult {

    @XmlElement(name = "BalanceRecord")
    protected List<BalanceRecordType> balanceRecord;

    /**
     * Gets the value of the balanceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceRecordType }
     * 
     * 
     */
    public List<BalanceRecordType> getBalanceRecord() {
        if (balanceRecord == null) {
            balanceRecord = new ArrayList<BalanceRecordType>();
        }
        return this.balanceRecord;
    }

}
