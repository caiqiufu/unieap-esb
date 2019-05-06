
package com.huawei.ocs55.businessmgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryInterActLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInterActLogResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryInterActLogList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QueryInterActLog" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Processtag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "QueryInterActLogResult", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", propOrder = {
    "queryInterActLogList"
})
public class QueryInterActLogResult {

    @XmlElement(name = "QueryInterActLogList")
    protected QueryInterActLogResult.QueryInterActLogList queryInterActLogList;

    /**
     * Gets the value of the queryInterActLogList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryInterActLogResult.QueryInterActLogList }
     *     
     */
    public QueryInterActLogResult.QueryInterActLogList getQueryInterActLogList() {
        return queryInterActLogList;
    }

    /**
     * Sets the value of the queryInterActLogList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryInterActLogResult.QueryInterActLogList }
     *     
     */
    public void setQueryInterActLogList(QueryInterActLogResult.QueryInterActLogList value) {
        this.queryInterActLogList = value;
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
     *         &lt;element name="QueryInterActLog" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Processtag" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "queryInterActLog"
    })
    public static class QueryInterActLogList {

        @XmlElement(name = "QueryInterActLog", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
        protected List<QueryInterActLogResult.QueryInterActLogList.QueryInterActLog> queryInterActLog;

        /**
         * Gets the value of the queryInterActLog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queryInterActLog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueryInterActLog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryInterActLogResult.QueryInterActLogList.QueryInterActLog }
         * 
         * 
         */
        public List<QueryInterActLogResult.QueryInterActLogList.QueryInterActLog> getQueryInterActLog() {
            if (queryInterActLog == null) {
                queryInterActLog = new ArrayList<QueryInterActLogResult.QueryInterActLogList.QueryInterActLog>();
            }
            return this.queryInterActLog;
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
         *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Processtag" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        public static class QueryInterActLog {

            @XmlElement(name = "MSISDN", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String msisdn;
            @XmlElement(name = "TradeType", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected int tradeType;
            @XmlElement(name = "Processtag", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr")
            protected int processtag;
            @XmlElement(name = "TradeTime", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String tradeTime;
            @XmlElement(name = "OperatorID", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String operatorID;
            @XmlElement(name = "Content", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String content;
            @XmlElement(name = "Remark", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/businessmgr", required = true)
            protected String remark;

            /**
             * Gets the value of the msisdn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMSISDN() {
                return msisdn;
            }

            /**
             * Sets the value of the msisdn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMSISDN(String value) {
                this.msisdn = value;
            }

            /**
             * Gets the value of the tradeType property.
             * 
             */
            public int getTradeType() {
                return tradeType;
            }

            /**
             * Sets the value of the tradeType property.
             * 
             */
            public void setTradeType(int value) {
                this.tradeType = value;
            }

            /**
             * Gets the value of the processtag property.
             * 
             */
            public int getProcesstag() {
                return processtag;
            }

            /**
             * Sets the value of the processtag property.
             * 
             */
            public void setProcesstag(int value) {
                this.processtag = value;
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

            /**
             * Gets the value of the operatorID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperatorID() {
                return operatorID;
            }

            /**
             * Sets the value of the operatorID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperatorID(String value) {
                this.operatorID = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContent(String value) {
                this.content = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
            }

        }

    }

}
