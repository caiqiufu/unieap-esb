
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubLowBalPrtResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubLowBalPrtResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubLowBalPrt" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CallLowBalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BalanceUpGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BalanceLowGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubLowBalPrtResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "subLowBalPrt"
})
public class QuerySubLowBalPrtResult {

    @XmlElement(name = "SubLowBalPrt", required = true)
    protected List<QuerySubLowBalPrtResult.SubLowBalPrt> subLowBalPrt;

    /**
     * Gets the value of the subLowBalPrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLowBalPrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLowBalPrt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySubLowBalPrtResult.SubLowBalPrt }
     * 
     * 
     */
    public List<QuerySubLowBalPrtResult.SubLowBalPrt> getSubLowBalPrt() {
        if (subLowBalPrt == null) {
            subLowBalPrt = new ArrayList<QuerySubLowBalPrtResult.SubLowBalPrt>();
        }
        return this.subLowBalPrt;
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
     *       &lt;all>
     *         &lt;element name="CallLowBalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="BalanceUpGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="BalanceLowGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SubLowBalPrt {

        @XmlElement(name = "CallLowBalType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, type = Integer.class, nillable = true)
        protected Integer callLowBalType;
        @XmlElement(name = "BalanceUpGate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, type = Integer.class, nillable = true)
        protected Integer balanceUpGate;
        @XmlElement(name = "BalanceLowGate", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true, type = Integer.class, nillable = true)
        protected Integer balanceLowGate;
        @XmlElementRef(name = "Action", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> action;
        @XmlElementRef(name = "MessageID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> messageID;

        /**
         * Gets the value of the callLowBalType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCallLowBalType() {
            return callLowBalType;
        }

        /**
         * Sets the value of the callLowBalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCallLowBalType(Integer value) {
            this.callLowBalType = value;
        }

        /**
         * Gets the value of the balanceUpGate property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBalanceUpGate() {
            return balanceUpGate;
        }

        /**
         * Sets the value of the balanceUpGate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBalanceUpGate(Integer value) {
            this.balanceUpGate = value;
        }

        /**
         * Gets the value of the balanceLowGate property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBalanceLowGate() {
            return balanceLowGate;
        }

        /**
         * Sets the value of the balanceLowGate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBalanceLowGate(Integer value) {
            this.balanceLowGate = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setAction(JAXBElement<Integer> value) {
            this.action = value;
        }

        /**
         * Gets the value of the messageID property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getMessageID() {
            return messageID;
        }

        /**
         * Sets the value of the messageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setMessageID(JAXBElement<Integer> value) {
            this.messageID = value;
        }

    }

}
