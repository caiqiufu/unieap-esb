
package com.huawei.ocs55.arservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryLoanLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryLoanLogResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanLogSummary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotalDebtAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="BlacklistStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BlacelistDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoanLogDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InitLoanAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="initLoanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InitLoanPoundage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="RepaymentAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="LoanStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PaidAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RemainingAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="GraceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RepaymentLogDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OperDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InitLoanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InitLoanAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="InitLoanPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RepayAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RepayPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RemainingAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="RemainingPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "QueryLoanLogResult", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", propOrder = {
    "loanLogSummary",
    "loanLogDetail",
    "repaymentLogDetail"
})
public class QueryLoanLogResult {

    @XmlElement(name = "LoanLogSummary")
    protected QueryLoanLogResult.LoanLogSummary loanLogSummary;
    @XmlElement(name = "LoanLogDetail")
    protected List<QueryLoanLogResult.LoanLogDetail> loanLogDetail;
    @XmlElement(name = "RepaymentLogDetail")
    protected List<QueryLoanLogResult.RepaymentLogDetail> repaymentLogDetail;

    /**
     * Gets the value of the loanLogSummary property.
     * 
     * @return
     *     possible object is
     *     {@link QueryLoanLogResult.LoanLogSummary }
     *     
     */
    public QueryLoanLogResult.LoanLogSummary getLoanLogSummary() {
        return loanLogSummary;
    }

    /**
     * Sets the value of the loanLogSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryLoanLogResult.LoanLogSummary }
     *     
     */
    public void setLoanLogSummary(QueryLoanLogResult.LoanLogSummary value) {
        this.loanLogSummary = value;
    }

    /**
     * Gets the value of the loanLogDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanLogDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanLogDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryLoanLogResult.LoanLogDetail }
     * 
     * 
     */
    public List<QueryLoanLogResult.LoanLogDetail> getLoanLogDetail() {
        if (loanLogDetail == null) {
            loanLogDetail = new ArrayList<QueryLoanLogResult.LoanLogDetail>();
        }
        return this.loanLogDetail;
    }

    /**
     * Gets the value of the repaymentLogDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentLogDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentLogDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryLoanLogResult.RepaymentLogDetail }
     * 
     * 
     */
    public List<QueryLoanLogResult.RepaymentLogDetail> getRepaymentLogDetail() {
        if (repaymentLogDetail == null) {
            repaymentLogDetail = new ArrayList<QueryLoanLogResult.RepaymentLogDetail>();
        }
        return this.repaymentLogDetail;
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
     *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InitLoanAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="initLoanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InitLoanPoundage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="RepaymentAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="LoanStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PaidAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RemainingAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="GraceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "loanID",
        "initLoanAMT",
        "initLoanDate",
        "initLoanPoundage",
        "repaymentAMT",
        "loanStatus",
        "paidAMT",
        "remainingAMT",
        "graceDate",
        "additionalProperty"
    })
    public static class LoanLogDetail {

        @XmlElement(name = "LoanID", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String loanID;
        @XmlElement(name = "InitLoanAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long initLoanAMT;
        @XmlElement(namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String initLoanDate;
        @XmlElement(name = "InitLoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected Long initLoanPoundage;
        @XmlElement(name = "RepaymentAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long repaymentAMT;
        @XmlElement(name = "LoanStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String loanStatus;
        @XmlElement(name = "PaidAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long paidAMT;
        @XmlElement(name = "RemainingAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long remainingAMT;
        @XmlElement(name = "GraceDate", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected String graceDate;
        @XmlElement(name = "AdditionalProperty", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<QueryLoanLogResult.LoanLogDetail.AdditionalProperty> additionalProperty;

        /**
         * Gets the value of the loanID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoanID() {
            return loanID;
        }

        /**
         * Sets the value of the loanID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoanID(String value) {
            this.loanID = value;
        }

        /**
         * Gets the value of the initLoanAMT property.
         * 
         */
        public long getInitLoanAMT() {
            return initLoanAMT;
        }

        /**
         * Sets the value of the initLoanAMT property.
         * 
         */
        public void setInitLoanAMT(long value) {
            this.initLoanAMT = value;
        }

        /**
         * Gets the value of the initLoanDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitLoanDate() {
            return initLoanDate;
        }

        /**
         * Sets the value of the initLoanDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitLoanDate(String value) {
            this.initLoanDate = value;
        }

        /**
         * Gets the value of the initLoanPoundage property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInitLoanPoundage() {
            return initLoanPoundage;
        }

        /**
         * Sets the value of the initLoanPoundage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInitLoanPoundage(Long value) {
            this.initLoanPoundage = value;
        }

        /**
         * Gets the value of the repaymentAMT property.
         * 
         */
        public long getRepaymentAMT() {
            return repaymentAMT;
        }

        /**
         * Sets the value of the repaymentAMT property.
         * 
         */
        public void setRepaymentAMT(long value) {
            this.repaymentAMT = value;
        }

        /**
         * Gets the value of the loanStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoanStatus() {
            return loanStatus;
        }

        /**
         * Sets the value of the loanStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoanStatus(String value) {
            this.loanStatus = value;
        }

        /**
         * Gets the value of the paidAMT property.
         * 
         */
        public long getPaidAMT() {
            return paidAMT;
        }

        /**
         * Sets the value of the paidAMT property.
         * 
         */
        public void setPaidAMT(long value) {
            this.paidAMT = value;
        }

        /**
         * Gets the value of the remainingAMT property.
         * 
         */
        public long getRemainingAMT() {
            return remainingAMT;
        }

        /**
         * Sets the value of the remainingAMT property.
         * 
         */
        public void setRemainingAMT(long value) {
            this.remainingAMT = value;
        }

        /**
         * Gets the value of the graceDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraceDate() {
            return graceDate;
        }

        /**
         * Sets the value of the graceDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraceDate(String value) {
            this.graceDate = value;
        }

        /**
         * Gets the value of the additionalProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryLoanLogResult.LoanLogDetail.AdditionalProperty }
         * 
         * 
         */
        public List<QueryLoanLogResult.LoanLogDetail.AdditionalProperty> getAdditionalProperty() {
            if (additionalProperty == null) {
                additionalProperty = new ArrayList<QueryLoanLogResult.LoanLogDetail.AdditionalProperty>();
            }
            return this.additionalProperty;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "code",
            "value"
        })
        public static class AdditionalProperty {

            @XmlElement(name = "Code", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String code;
            @XmlElement(name = "Value", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String value;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

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
     *         &lt;element name="TotalDebtAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="BlacklistStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BlacelistDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AdditionalProperty" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "totalDebtAMT",
        "blacklistStatus",
        "blacelistDate",
        "additionalProperty"
    })
    public static class LoanLogSummary {

        @XmlElement(name = "TotalDebtAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long totalDebtAMT;
        @XmlElement(name = "BlacklistStatus", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String blacklistStatus;
        @XmlElement(name = "BlacelistDate", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String blacelistDate;
        @XmlElement(name = "AdditionalProperty", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected List<QueryLoanLogResult.LoanLogSummary.AdditionalProperty> additionalProperty;

        /**
         * Gets the value of the totalDebtAMT property.
         * 
         */
        public long getTotalDebtAMT() {
            return totalDebtAMT;
        }

        /**
         * Sets the value of the totalDebtAMT property.
         * 
         */
        public void setTotalDebtAMT(long value) {
            this.totalDebtAMT = value;
        }

        /**
         * Gets the value of the blacklistStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlacklistStatus() {
            return blacklistStatus;
        }

        /**
         * Sets the value of the blacklistStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlacklistStatus(String value) {
            this.blacklistStatus = value;
        }

        /**
         * Gets the value of the blacelistDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlacelistDate() {
            return blacelistDate;
        }

        /**
         * Sets the value of the blacelistDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlacelistDate(String value) {
            this.blacelistDate = value;
        }

        /**
         * Gets the value of the additionalProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueryLoanLogResult.LoanLogSummary.AdditionalProperty }
         * 
         * 
         */
        public List<QueryLoanLogResult.LoanLogSummary.AdditionalProperty> getAdditionalProperty() {
            if (additionalProperty == null) {
                additionalProperty = new ArrayList<QueryLoanLogResult.LoanLogSummary.AdditionalProperty>();
            }
            return this.additionalProperty;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "code",
            "value"
        })
        public static class AdditionalProperty {

            @XmlElement(name = "Code", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String code;
            @XmlElement(name = "Value", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
            protected String value;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

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
     *         &lt;element name="OperDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OperType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InitLoanDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InitLoanAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="InitLoanPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RepayAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RepayPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RemainingAMT" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="RemainingPoundage" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "operDate",
        "operType",
        "initLoanDate",
        "initLoanAMT",
        "initLoanPoundage",
        "repayAMT",
        "repayPoundage",
        "remainingAMT",
        "remainingPoundage"
    })
    public static class RepaymentLogDetail {

        @XmlElement(name = "OperDate", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String operDate;
        @XmlElement(name = "OperType", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String operType;
        @XmlElement(name = "InitLoanDate", namespace = "http://www.huawei.com/bme/cbsinterface/arservices", required = true)
        protected String initLoanDate;
        @XmlElement(name = "InitLoanAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long initLoanAMT;
        @XmlElement(name = "InitLoanPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long initLoanPoundage;
        @XmlElement(name = "RepayAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long repayAMT;
        @XmlElement(name = "RepayPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long repayPoundage;
        @XmlElement(name = "RemainingAMT", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long remainingAMT;
        @XmlElement(name = "RemainingPoundage", namespace = "http://www.huawei.com/bme/cbsinterface/arservices")
        protected long remainingPoundage;

        /**
         * Gets the value of the operDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperDate() {
            return operDate;
        }

        /**
         * Sets the value of the operDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperDate(String value) {
            this.operDate = value;
        }

        /**
         * Gets the value of the operType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperType() {
            return operType;
        }

        /**
         * Sets the value of the operType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperType(String value) {
            this.operType = value;
        }

        /**
         * Gets the value of the initLoanDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitLoanDate() {
            return initLoanDate;
        }

        /**
         * Sets the value of the initLoanDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitLoanDate(String value) {
            this.initLoanDate = value;
        }

        /**
         * Gets the value of the initLoanAMT property.
         * 
         */
        public long getInitLoanAMT() {
            return initLoanAMT;
        }

        /**
         * Sets the value of the initLoanAMT property.
         * 
         */
        public void setInitLoanAMT(long value) {
            this.initLoanAMT = value;
        }

        /**
         * Gets the value of the initLoanPoundage property.
         * 
         */
        public long getInitLoanPoundage() {
            return initLoanPoundage;
        }

        /**
         * Sets the value of the initLoanPoundage property.
         * 
         */
        public void setInitLoanPoundage(long value) {
            this.initLoanPoundage = value;
        }

        /**
         * Gets the value of the repayAMT property.
         * 
         */
        public long getRepayAMT() {
            return repayAMT;
        }

        /**
         * Sets the value of the repayAMT property.
         * 
         */
        public void setRepayAMT(long value) {
            this.repayAMT = value;
        }

        /**
         * Gets the value of the repayPoundage property.
         * 
         */
        public long getRepayPoundage() {
            return repayPoundage;
        }

        /**
         * Sets the value of the repayPoundage property.
         * 
         */
        public void setRepayPoundage(long value) {
            this.repayPoundage = value;
        }

        /**
         * Gets the value of the remainingAMT property.
         * 
         */
        public long getRemainingAMT() {
            return remainingAMT;
        }

        /**
         * Sets the value of the remainingAMT property.
         * 
         */
        public void setRemainingAMT(long value) {
            this.remainingAMT = value;
        }

        /**
         * Gets the value of the remainingPoundage property.
         * 
         */
        public long getRemainingPoundage() {
            return remainingPoundage;
        }

        /**
         * Sets the value of the remainingPoundage property.
         * 
         */
        public void setRemainingPoundage(long value) {
            this.remainingPoundage = value;
        }

    }

}
