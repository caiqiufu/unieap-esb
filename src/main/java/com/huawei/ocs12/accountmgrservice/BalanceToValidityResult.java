
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceToValidityResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceToValidityResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType"/>
 *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceToValidityResult", propOrder = {

})
public class BalanceToValidityResult {

    @XmlElement(name = "AcctChgRec", required = true)
    protected AcctChgRecType acctChgRec;
    @XmlElement(name = "NewActiveStop", required = true)
    protected String newActiveStop;
    @XmlElement(name = "NewSuspendStop", required = true)
    protected String newSuspendStop;
    @XmlElement(name = "NewDisableStop", required = true)
    protected String newDisableStop;

    /**
     * Gets the value of the acctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getAcctChgRec() {
        return acctChgRec;
    }

    /**
     * Sets the value of the acctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setAcctChgRec(AcctChgRecType value) {
        this.acctChgRec = value;
    }

    /**
     * Gets the value of the newActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewActiveStop() {
        return newActiveStop;
    }

    /**
     * Sets the value of the newActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewActiveStop(String value) {
        this.newActiveStop = value;
    }

    /**
     * Gets the value of the newSuspendStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSuspendStop() {
        return newSuspendStop;
    }

    /**
     * Sets the value of the newSuspendStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSuspendStop(String value) {
        this.newSuspendStop = value;
    }

    /**
     * Gets the value of the newDisableStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDisableStop() {
        return newDisableStop;
    }

    /**
     * Sets the value of the newDisableStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDisableStop(String value) {
        this.newDisableStop = value;
    }

}
