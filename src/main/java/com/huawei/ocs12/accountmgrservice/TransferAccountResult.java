
package com.huawei.ocs12.accountmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAccountResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TransfereeHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransferorHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TransfereeAcctChgList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransferorAcctChgList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransfereeOldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransfereeNewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferorOldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferorNewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoanPoundage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAccountResult", propOrder = {

})
public class TransferAccountResult {

    @XmlElementRef(name = "TransfereeHandlingCharge", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transfereeHandlingCharge;
    @XmlElementRef(name = "TransferorHandlingCharge", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transferorHandlingCharge;
    @XmlElement(name = "TransfereeAcctChgList")
    protected TransferAccountResult.TransfereeAcctChgList transfereeAcctChgList;
    @XmlElement(name = "TransferorAcctChgList")
    protected TransferAccountResult.TransferorAcctChgList transferorAcctChgList;
    @XmlElement(name = "TransfereeOldActiveStop")
    protected String transfereeOldActiveStop;
    @XmlElement(name = "TransfereeNewActiveStop")
    protected String transfereeNewActiveStop;
    @XmlElement(name = "TransferorOldActiveStop")
    protected String transferorOldActiveStop;
    @XmlElement(name = "TransferorNewActiveStop")
    protected String transferorNewActiveStop;
    @XmlElement(name = "LoanAmount")
    protected Integer loanAmount;
    @XmlElement(name = "LoanPoundage")
    protected Integer loanPoundage;

    /**
     * Gets the value of the transfereeHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransfereeHandlingCharge() {
        return transfereeHandlingCharge;
    }

    /**
     * Sets the value of the transfereeHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransfereeHandlingCharge(JAXBElement<Long> value) {
        this.transfereeHandlingCharge = value;
    }

    /**
     * Gets the value of the transferorHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransferorHandlingCharge() {
        return transferorHandlingCharge;
    }

    /**
     * Sets the value of the transferorHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransferorHandlingCharge(JAXBElement<Long> value) {
        this.transferorHandlingCharge = value;
    }

    /**
     * Gets the value of the transfereeAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountResult.TransfereeAcctChgList }
     *     
     */
    public TransferAccountResult.TransfereeAcctChgList getTransfereeAcctChgList() {
        return transfereeAcctChgList;
    }

    /**
     * Sets the value of the transfereeAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountResult.TransfereeAcctChgList }
     *     
     */
    public void setTransfereeAcctChgList(TransferAccountResult.TransfereeAcctChgList value) {
        this.transfereeAcctChgList = value;
    }

    /**
     * Gets the value of the transferorAcctChgList property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountResult.TransferorAcctChgList }
     *     
     */
    public TransferAccountResult.TransferorAcctChgList getTransferorAcctChgList() {
        return transferorAcctChgList;
    }

    /**
     * Sets the value of the transferorAcctChgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountResult.TransferorAcctChgList }
     *     
     */
    public void setTransferorAcctChgList(TransferAccountResult.TransferorAcctChgList value) {
        this.transferorAcctChgList = value;
    }

    /**
     * Gets the value of the transfereeOldActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeOldActiveStop() {
        return transfereeOldActiveStop;
    }

    /**
     * Sets the value of the transfereeOldActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeOldActiveStop(String value) {
        this.transfereeOldActiveStop = value;
    }

    /**
     * Gets the value of the transfereeNewActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransfereeNewActiveStop() {
        return transfereeNewActiveStop;
    }

    /**
     * Sets the value of the transfereeNewActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransfereeNewActiveStop(String value) {
        this.transfereeNewActiveStop = value;
    }

    /**
     * Gets the value of the transferorOldActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorOldActiveStop() {
        return transferorOldActiveStop;
    }

    /**
     * Sets the value of the transferorOldActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorOldActiveStop(String value) {
        this.transferorOldActiveStop = value;
    }

    /**
     * Gets the value of the transferorNewActiveStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferorNewActiveStop() {
        return transferorNewActiveStop;
    }

    /**
     * Sets the value of the transferorNewActiveStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferorNewActiveStop(String value) {
        this.transferorNewActiveStop = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanAmount(Integer value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanPoundage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPoundage() {
        return loanPoundage;
    }

    /**
     * Sets the value of the loanPoundage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPoundage(Integer value) {
        this.loanPoundage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctChgRec"
    })
    public static class TransfereeAcctChgList {

        @XmlElement(name = "AcctChgRec", required = true)
        protected List<AcctChgRecType> acctChgRec;

        /**
         * Gets the value of the acctChgRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctChgRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctChgRecType }
         * 
         * 
         */
        public List<AcctChgRecType> getAcctChgRec() {
            if (acctChgRec == null) {
                acctChgRec = new ArrayList<AcctChgRecType>();
            }
            return this.acctChgRec;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AcctChgRec" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}AcctChgRecType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctChgRec"
    })
    public static class TransferorAcctChgList {

        @XmlElement(name = "AcctChgRec", required = true)
        protected List<AcctChgRecType> acctChgRec;

        /**
         * Gets the value of the acctChgRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctChgRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctChgRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcctChgRecType }
         * 
         * 
         */
        public List<AcctChgRecType> getAcctChgRec() {
            if (acctChgRec == null) {
                acctChgRec = new ArrayList<AcctChgRecType>();
            }
            return this.acctChgRec;
        }

    }

}
