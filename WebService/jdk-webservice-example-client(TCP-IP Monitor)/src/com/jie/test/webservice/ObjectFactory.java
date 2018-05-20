
package com.jie.test.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jie.test.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloWebServiceResponse_QNAME = new QName("http://webservice.test.jie.com/", "HelloWebServiceResponse");
    private final static QName _HelloWebService_QNAME = new QName("http://webservice.test.jie.com/", "HelloWebService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jie.test.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloWebServiceResponse }
     * 
     */
    public HelloWebServiceResponse createHelloWebServiceResponse() {
        return new HelloWebServiceResponse();
    }

    /**
     * Create an instance of {@link HelloWebService }
     * 
     */
    public HelloWebService createHelloWebService() {
        return new HelloWebService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWebServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.test.jie.com/", name = "HelloWebServiceResponse")
    public JAXBElement<HelloWebServiceResponse> createHelloWebServiceResponse(HelloWebServiceResponse value) {
        return new JAXBElement<HelloWebServiceResponse>(_HelloWebServiceResponse_QNAME, HelloWebServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWebService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.test.jie.com/", name = "HelloWebService")
    public JAXBElement<HelloWebService> createHelloWebService(HelloWebService value) {
        return new JAXBElement<HelloWebService>(_HelloWebService_QNAME, HelloWebService.class, null, value);
    }

}
