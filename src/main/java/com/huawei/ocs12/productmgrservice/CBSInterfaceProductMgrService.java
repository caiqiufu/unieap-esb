
package com.huawei.ocs12.productmgrservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CBSInterfaceProductMgrService", targetNamespace = "http://www.huawei.com/bme/cbsinterface/cbs/productmgr", wsdlLocation = "file:/E:/OneDrive/09-tt/unieap/unieap-esb/src/main/resources/wsdl/ocs12/META-INF_ProductMgr/CBSInterfaceProductMgrService.wsdl")
public class CBSInterfaceProductMgrService
    extends Service
{

    private final static URL CBSINTERFACEPRODUCTMGRSERVICE_WSDL_LOCATION;
    private final static WebServiceException CBSINTERFACEPRODUCTMGRSERVICE_EXCEPTION;
    private final static QName CBSINTERFACEPRODUCTMGRSERVICE_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/cbs/productmgr", "CBSInterfaceProductMgrService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/OneDrive/09-tt/unieap/unieap-esb/src/main/resources/wsdl/ocs12/META-INF_ProductMgr/CBSInterfaceProductMgrService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CBSINTERFACEPRODUCTMGRSERVICE_WSDL_LOCATION = url;
        CBSINTERFACEPRODUCTMGRSERVICE_EXCEPTION = e;
    }

    public CBSInterfaceProductMgrService() {
        super(__getWsdlLocation(), CBSINTERFACEPRODUCTMGRSERVICE_QNAME);
    }

    public CBSInterfaceProductMgrService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CBSINTERFACEPRODUCTMGRSERVICE_QNAME, features);
    }

    public CBSInterfaceProductMgrService(URL wsdlLocation) {
        super(wsdlLocation, CBSINTERFACEPRODUCTMGRSERVICE_QNAME);
    }

    public CBSInterfaceProductMgrService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CBSINTERFACEPRODUCTMGRSERVICE_QNAME, features);
    }

    public CBSInterfaceProductMgrService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CBSInterfaceProductMgrService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CBSInterfaceProductMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceProductMgrServiceSOAP11port_http")
    public CBSInterfaceProductMgrServicePortType getCBSInterfaceProductMgrServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://www.huawei.com/bme/cbsinterface/cbs/productmgr", "CBSInterfaceProductMgrServiceSOAP11port_http"), CBSInterfaceProductMgrServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBSInterfaceProductMgrServicePortType
     */
    @WebEndpoint(name = "CBSInterfaceProductMgrServiceSOAP11port_http")
    public CBSInterfaceProductMgrServicePortType getCBSInterfaceProductMgrServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.huawei.com/bme/cbsinterface/cbs/productmgr", "CBSInterfaceProductMgrServiceSOAP11port_http"), CBSInterfaceProductMgrServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CBSINTERFACEPRODUCTMGRSERVICE_EXCEPTION!= null) {
            throw CBSINTERFACEPRODUCTMGRSERVICE_EXCEPTION;
        }
        return CBSINTERFACEPRODUCTMGRSERVICE_WSDL_LOCATION;
    }

}