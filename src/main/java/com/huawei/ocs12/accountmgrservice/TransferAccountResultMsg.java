
package com.huawei.ocs12.accountmgrservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ResultHeader" type="{http://www.huawei.com/bme/cbsinterface/common}ResultHeader"/>
 *         &lt;element name="TransferAccountResult" type="{http://www.huawei.com/bme/cbsinterface/cbs/accountmgr}TransferAccountResult"/>
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
    "resultHeader",
    "transferAccountResult"
})
@XmlRootElement(name = "TransferAccountResultMsg", namespace = "http://www.huawei.com/bme/cbsinterface/cbs/accountmgrmsg")
public class TransferAccountResultMsg {

    @XmlElement(name = "ResultHeader", namespace = "", required = true)
    protected ResultHeader resultHeader;
    @XmlElement(name = "TransferAccountResult", namespace = "", required = true)
    protected TransferAccountResult transferAccountResult;

    /**
     * Gets the value of the resultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResultHeader }
     *     
     */
    public ResultHeader getResultHeader() {
        return resultHeader;
    }

    /**
     * Sets the value of the resultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultHeader }
     *     
     */
    public void setResultHeader(ResultHeader value) {
        this.resultHeader = value;
    }

    /**
     * Gets the value of the transferAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountResult }
     *     
     */
    public TransferAccountResult getTransferAccountResult() {
        return transferAccountResult;
    }

    /**
     * Sets the value of the transferAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountResult }
     *     
     */
    public void setTransferAccountResult(TransferAccountResult value) {
        this.transferAccountResult = value;
    }

}
