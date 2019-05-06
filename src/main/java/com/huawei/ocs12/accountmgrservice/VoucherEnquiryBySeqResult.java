
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherEnquiryBySeqResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherEnquiryBySeqResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaceValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardCosID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStopDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotCardFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OprDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherEnquiryBySeqResult", propOrder = {

})
public class VoucherEnquiryBySeqResult {

    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "BatchNo")
    protected String batchNo;
    @XmlElementRef(name = "FaceValue", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> faceValue;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CardCosID")
    protected String cardCosID;
    @XmlElement(name = "CardStartDate")
    protected String cardStartDate;
    @XmlElement(name = "CardStopDate")
    protected String cardStopDate;
    @XmlElementRef(name = "HotCardFlag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hotCardFlag;
    @XmlElement(name = "OprDateTime")
    protected String oprDateTime;
    @XmlElement(name = "OprType")
    protected String oprType;
    @XmlElement(name = "ChargeNumber")
    protected String chargeNumber;
    @XmlElement(name = "TradeTime")
    protected String tradeTime;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the faceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFaceValue() {
        return faceValue;
    }

    /**
     * Sets the value of the faceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFaceValue(JAXBElement<Integer> value) {
        this.faceValue = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the cardCosID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCosID() {
        return cardCosID;
    }

    /**
     * Sets the value of the cardCosID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCosID(String value) {
        this.cardCosID = value;
    }

    /**
     * Gets the value of the cardStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStartDate() {
        return cardStartDate;
    }

    /**
     * Sets the value of the cardStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStartDate(String value) {
        this.cardStartDate = value;
    }

    /**
     * Gets the value of the cardStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStopDate() {
        return cardStopDate;
    }

    /**
     * Sets the value of the cardStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStopDate(String value) {
        this.cardStopDate = value;
    }

    /**
     * Gets the value of the hotCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHotCardFlag() {
        return hotCardFlag;
    }

    /**
     * Sets the value of the hotCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHotCardFlag(JAXBElement<Integer> value) {
        this.hotCardFlag = value;
    }

    /**
     * Gets the value of the oprDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprDateTime() {
        return oprDateTime;
    }

    /**
     * Sets the value of the oprDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprDateTime(String value) {
        this.oprDateTime = value;
    }

    /**
     * Gets the value of the oprType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprType() {
        return oprType;
    }

    /**
     * Sets the value of the oprType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprType(String value) {
        this.oprType = value;
    }

    /**
     * Gets the value of the chargeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeNumber() {
        return chargeNumber;
    }

    /**
     * Sets the value of the chargeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeNumber(String value) {
        this.chargeNumber = value;
    }

    /**
     * Gets the value of the tradeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeTime() {
        return tradeTime;
    }

    /**
     * Sets the value of the tradeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeTime(String value) {
        this.tradeTime = value;
    }

}
