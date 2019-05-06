
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeSubLowBalPrtRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSubLowBalPrtRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowBalPrt" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CallLowBalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BalanceUpGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BalanceLowGate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ChangeSubLowBalPrtRequest", propOrder = {
    "subscriberNo",
    "lowBalPrt"
})
public class ChangeSubLowBalPrtRequest {

    @XmlElement(name = "SubscriberNo", required = true)
    protected String subscriberNo;
    @XmlElement(name = "LowBalPrt", required = true)
    protected List<ChangeSubLowBalPrtRequest.LowBalPrt> lowBalPrt;

    /**
     * Gets the value of the subscriberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Sets the value of the subscriberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Gets the value of the lowBalPrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowBalPrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowBalPrt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeSubLowBalPrtRequest.LowBalPrt }
     * 
     * 
     */
    public List<ChangeSubLowBalPrtRequest.LowBalPrt> getLowBalPrt() {
        if (lowBalPrt == null) {
            lowBalPrt = new ArrayList<ChangeSubLowBalPrtRequest.LowBalPrt>();
        }
        return this.lowBalPrt;
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
     *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    public static class LowBalPrt {

        @XmlElement(name = "CallLowBalType")
        protected int callLowBalType;
        @XmlElement(name = "BalanceUpGate")
        protected int balanceUpGate;
        @XmlElement(name = "BalanceLowGate")
        protected int balanceLowGate;
        @XmlElement(name = "Action")
        protected Integer action;
        @XmlElement(name = "MessageID")
        protected Integer messageID;
        @XmlElement(name = "OperationType")
        protected int operationType;

        /**
         * Gets the value of the callLowBalType property.
         * 
         */
        public int getCallLowBalType() {
            return callLowBalType;
        }

        /**
         * Sets the value of the callLowBalType property.
         * 
         */
        public void setCallLowBalType(int value) {
            this.callLowBalType = value;
        }

        /**
         * Gets the value of the balanceUpGate property.
         * 
         */
        public int getBalanceUpGate() {
            return balanceUpGate;
        }

        /**
         * Sets the value of the balanceUpGate property.
         * 
         */
        public void setBalanceUpGate(int value) {
            this.balanceUpGate = value;
        }

        /**
         * Gets the value of the balanceLowGate property.
         * 
         */
        public int getBalanceLowGate() {
            return balanceLowGate;
        }

        /**
         * Sets the value of the balanceLowGate property.
         * 
         */
        public void setBalanceLowGate(int value) {
            this.balanceLowGate = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAction(Integer value) {
            this.action = value;
        }

        /**
         * Gets the value of the messageID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMessageID() {
            return messageID;
        }

        /**
         * Sets the value of the messageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMessageID(Integer value) {
            this.messageID = value;
        }

        /**
         * Gets the value of the operationType property.
         * 
         */
        public int getOperationType() {
            return operationType;
        }

        /**
         * Sets the value of the operationType property.
         * 
         */
        public void setOperationType(int value) {
            this.operationType = value;
        }

    }

}
