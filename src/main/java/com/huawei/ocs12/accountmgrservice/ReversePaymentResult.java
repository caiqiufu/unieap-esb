
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
 * <p>Java class for ReversePaymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReversePaymentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctChgRecList">
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
 *         &lt;element name="InternalSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ReversePaymentResult", propOrder = {

})
public class ReversePaymentResult {

    @XmlElement(name = "NewBalance", required = true, type = Long.class, nillable = true)
    protected Long newBalance;
    @XmlElement(name = "NewActiveStop", required = true)
    protected String newActiveStop;
    @XmlElement(name = "AcctChgRecList", required = true)
    protected ReversePaymentResult.AcctChgRecList acctChgRecList;
    @XmlElement(name = "InternalSerialNo")
    protected String internalSerialNo;
    @XmlElementRef(name = "LoanAmount", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loanAmount;
    @XmlElementRef(name = "LoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loanPoundage;

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewBalance(Long value) {
        this.newBalance = value;
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
     * Gets the value of the acctChgRecList property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentResult.AcctChgRecList }
     *     
     */
    public ReversePaymentResult.AcctChgRecList getAcctChgRecList() {
        return acctChgRecList;
    }

    /**
     * Sets the value of the acctChgRecList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentResult.AcctChgRecList }
     *     
     */
    public void setAcctChgRecList(ReversePaymentResult.AcctChgRecList value) {
        this.acctChgRecList = value;
    }

    /**
     * Gets the value of the internalSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSerialNo() {
        return internalSerialNo;
    }

    /**
     * Sets the value of the internalSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSerialNo(String value) {
        this.internalSerialNo = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoanAmount(JAXBElement<Integer> value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanPoundage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoanPoundage() {
        return loanPoundage;
    }

    /**
     * Sets the value of the loanPoundage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoanPoundage(JAXBElement<Integer> value) {
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
    public static class AcctChgRecList {

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
