
package com.huawei.ocs55.acctmgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeAccountResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExchangeHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriAcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType"/>
 *         &lt;element name="DesAcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeAccountResult", propOrder = {

})
public class ExchangeAccountResult {

    @XmlElementRef(name = "ExchangeHandlingCharge", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> exchangeHandlingCharge;
    @XmlElement(name = "OriAcctChgRec", required = true)
    protected AcctChgRecType oriAcctChgRec;
    @XmlElement(name = "DesAcctChgRec", required = true)
    protected AcctChgRecType desAcctChgRec;

    /**
     * Gets the value of the exchangeHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExchangeHandlingCharge() {
        return exchangeHandlingCharge;
    }

    /**
     * Sets the value of the exchangeHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExchangeHandlingCharge(JAXBElement<Long> value) {
        this.exchangeHandlingCharge = value;
    }

    /**
     * Gets the value of the oriAcctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getOriAcctChgRec() {
        return oriAcctChgRec;
    }

    /**
     * Sets the value of the oriAcctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setOriAcctChgRec(AcctChgRecType value) {
        this.oriAcctChgRec = value;
    }

    /**
     * Gets the value of the desAcctChgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChgRecType }
     *     
     */
    public AcctChgRecType getDesAcctChgRec() {
        return desAcctChgRec;
    }

    /**
     * Sets the value of the desAcctChgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChgRecType }
     *     
     */
    public void setDesAcctChgRec(AcctChgRecType value) {
        this.desAcctChgRec = value;
    }

}
