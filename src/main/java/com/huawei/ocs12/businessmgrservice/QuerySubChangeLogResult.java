
package com.huawei.ocs12.businessmgrservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubChangeLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySubChangeLogResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubChangeLogList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubChangeLog" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OldState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NewState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OperTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OldPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="NewPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="OldPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="NewPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "QuerySubChangeLogResult", propOrder = {
    "subChangeLogList"
})
public class QuerySubChangeLogResult {

    @XmlElement(name = "SubChangeLogList")
    protected QuerySubChangeLogResult.SubChangeLogList subChangeLogList;

    /**
     * Gets the value of the subChangeLogList property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySubChangeLogResult.SubChangeLogList }
     *     
     */
    public QuerySubChangeLogResult.SubChangeLogList getSubChangeLogList() {
        return subChangeLogList;
    }

    /**
     * Sets the value of the subChangeLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySubChangeLogResult.SubChangeLogList }
     *     
     */
    public void setSubChangeLogList(QuerySubChangeLogResult.SubChangeLogList value) {
        this.subChangeLogList = value;
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
     *         &lt;element name="SubChangeLog" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OldState" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NewState" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OperTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OldPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="NewPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="OldPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="NewPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NewSuspendStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NewDisableStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "subChangeLog"
    })
    public static class SubChangeLogList {

        @XmlElement(name = "SubChangeLog", required = true)
        protected List<QuerySubChangeLogResult.SubChangeLogList.SubChangeLog> subChangeLog;

        /**
         * Gets the value of the subChangeLog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subChangeLog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubChangeLog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuerySubChangeLogResult.SubChangeLogList.SubChangeLog }
         * 
         * 
         */
        public List<QuerySubChangeLogResult.SubChangeLogList.SubChangeLog> getSubChangeLog() {
            if (subChangeLog == null) {
                subChangeLog = new ArrayList<QuerySubChangeLogResult.SubChangeLogList.SubChangeLog>();
            }
            return this.subChangeLog;
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
         *         &lt;element name="MainProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OldState" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NewState" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OperTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OldPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="NewPrepaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="OldPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="NewPospaidBal" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="NewActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OldActiveStop" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {

        })
        public static class SubChangeLog {

            @XmlElement(name = "MainProductID", required = true)
            protected String mainProductID;
            @XmlElement(name = "OldState", required = true)
            protected String oldState;
            @XmlElement(name = "NewState", required = true)
            protected String newState;
            @XmlElement(name = "OperType")
            protected int operType;
            @XmlElement(name = "Operator", required = true)
            protected String operator;
            @XmlElement(name = "OperTime", required = true)
            protected String operTime;
            @XmlElement(name = "OldPrepaidBal")
            protected long oldPrepaidBal;
            @XmlElement(name = "NewPrepaidBal")
            protected long newPrepaidBal;
            @XmlElement(name = "OldPospaidBal")
            protected long oldPospaidBal;
            @XmlElement(name = "NewPospaidBal")
            protected long newPospaidBal;
            @XmlElement(name = "NewActiveStop", required = true)
            protected String newActiveStop;
            @XmlElement(name = "OldActiveStop", required = true)
            protected String oldActiveStop;
            @XmlElement(name = "OldValue")
            protected String oldValue;
            @XmlElement(name = "NewValue")
            protected String newValue;
            @XmlElement(name = "NewSuspendStop", required = true)
            protected String newSuspendStop;
            @XmlElement(name = "NewDisableStop", required = true)
            protected String newDisableStop;

            /**
             * Gets the value of the mainProductID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMainProductID() {
                return mainProductID;
            }

            /**
             * Sets the value of the mainProductID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMainProductID(String value) {
                this.mainProductID = value;
            }

            /**
             * Gets the value of the oldState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOldState() {
                return oldState;
            }

            /**
             * Sets the value of the oldState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOldState(String value) {
                this.oldState = value;
            }

            /**
             * Gets the value of the newState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewState() {
                return newState;
            }

            /**
             * Sets the value of the newState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewState(String value) {
                this.newState = value;
            }

            /**
             * Gets the value of the operType property.
             * 
             */
            public int getOperType() {
                return operType;
            }

            /**
             * Sets the value of the operType property.
             * 
             */
            public void setOperType(int value) {
                this.operType = value;
            }

            /**
             * Gets the value of the operator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperator() {
                return operator;
            }

            /**
             * Sets the value of the operator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperator(String value) {
                this.operator = value;
            }

            /**
             * Gets the value of the operTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperTime() {
                return operTime;
            }

            /**
             * Sets the value of the operTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperTime(String value) {
                this.operTime = value;
            }

            /**
             * Gets the value of the oldPrepaidBal property.
             * 
             */
            public long getOldPrepaidBal() {
                return oldPrepaidBal;
            }

            /**
             * Sets the value of the oldPrepaidBal property.
             * 
             */
            public void setOldPrepaidBal(long value) {
                this.oldPrepaidBal = value;
            }

            /**
             * Gets the value of the newPrepaidBal property.
             * 
             */
            public long getNewPrepaidBal() {
                return newPrepaidBal;
            }

            /**
             * Sets the value of the newPrepaidBal property.
             * 
             */
            public void setNewPrepaidBal(long value) {
                this.newPrepaidBal = value;
            }

            /**
             * Gets the value of the oldPospaidBal property.
             * 
             */
            public long getOldPospaidBal() {
                return oldPospaidBal;
            }

            /**
             * Sets the value of the oldPospaidBal property.
             * 
             */
            public void setOldPospaidBal(long value) {
                this.oldPospaidBal = value;
            }

            /**
             * Gets the value of the newPospaidBal property.
             * 
             */
            public long getNewPospaidBal() {
                return newPospaidBal;
            }

            /**
             * Sets the value of the newPospaidBal property.
             * 
             */
            public void setNewPospaidBal(long value) {
                this.newPospaidBal = value;
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
             * Gets the value of the oldActiveStop property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOldActiveStop() {
                return oldActiveStop;
            }

            /**
             * Sets the value of the oldActiveStop property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOldActiveStop(String value) {
                this.oldActiveStop = value;
            }

            /**
             * Gets the value of the oldValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOldValue() {
                return oldValue;
            }

            /**
             * Sets the value of the oldValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOldValue(String value) {
                this.oldValue = value;
            }

            /**
             * Gets the value of the newValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewValue() {
                return newValue;
            }

            /**
             * Sets the value of the newValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewValue(String value) {
                this.newValue = value;
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

    }

}
