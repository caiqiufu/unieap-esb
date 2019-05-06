
package com.huawei.ocs12.businessmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAccumulatedPassInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAccumulatedPassInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DayPassUsage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MonthPassUsage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAccumulatedPassInfoResult", propOrder = {
    "returnCode",
    "dayPassUsage",
    "monthPassUsage"
})
public class QueryAccumulatedPassInfoResult {

    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "DayPassUsage")
    protected long dayPassUsage;
    @XmlElement(name = "MonthPassUsage")
    protected long monthPassUsage;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the dayPassUsage property.
     * 
     */
    public long getDayPassUsage() {
        return dayPassUsage;
    }

    /**
     * Sets the value of the dayPassUsage property.
     * 
     */
    public void setDayPassUsage(long value) {
        this.dayPassUsage = value;
    }

    /**
     * Gets the value of the monthPassUsage property.
     * 
     */
    public long getMonthPassUsage() {
        return monthPassUsage;
    }

    /**
     * Sets the value of the monthPassUsage property.
     * 
     */
    public void setMonthPassUsage(long value) {
        this.monthPassUsage = value;
    }

}
