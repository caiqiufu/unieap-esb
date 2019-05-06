
package com.huawei.ocs55.arservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOCSBalanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOCSBalanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryObj">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
 *                   &lt;element name="GroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
 *                 &lt;/choice>
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
@XmlType(name = "QueryOCSBalanceRequest", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "queryObj"
})
public class QueryOCSBalanceRequest {

    @XmlElement(name = "QueryObj", required = true)
    protected QueryOCSBalanceRequest.QueryObj queryObj;

    /**
     * Gets the value of the queryObj property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOCSBalanceRequest.QueryObj }
     *     
     */
    public QueryOCSBalanceRequest.QueryObj getQueryObj() {
        return queryObj;
    }

    /**
     * Sets the value of the queryObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOCSBalanceRequest.QueryObj }
     *     
     */
    public void setQueryObj(QueryOCSBalanceRequest.QueryObj value) {
        this.queryObj = value;
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
     *       &lt;choice>
     *         &lt;element name="SubAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubAccessCode"/>
     *         &lt;element name="GroupAccessCode" type="{http://cbs.huawei.com/ar/wsservice/arcommon}SubGroupAccessCode"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subAccessCode",
        "groupAccessCode"
    })
    public static class QueryObj {

        @XmlElement(name = "SubAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubAccessCode subAccessCode;
        @XmlElement(name = "GroupAccessCode", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected SubGroupAccessCode groupAccessCode;

        /**
         * Gets the value of the subAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubAccessCode }
         *     
         */
        public SubAccessCode getSubAccessCode() {
            return subAccessCode;
        }

        /**
         * Sets the value of the subAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubAccessCode }
         *     
         */
        public void setSubAccessCode(SubAccessCode value) {
            this.subAccessCode = value;
        }

        /**
         * Gets the value of the groupAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public SubGroupAccessCode getGroupAccessCode() {
            return groupAccessCode;
        }

        /**
         * Sets the value of the groupAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubGroupAccessCode }
         *     
         */
        public void setGroupAccessCode(SubGroupAccessCode value) {
            this.groupAccessCode = value;
        }

    }

}
