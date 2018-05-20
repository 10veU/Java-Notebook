package com.jie.test.webservice_client;

import com.jie.test.webservice.HelloWebServiceImpl;
import com.jie.test.webservice.HelloWebServiceImplService;

/*
 * µ÷ÓÃwebservice
 */
public class ClientTest {
	public static void main(String[] args) {
		HelloWebServiceImplService factory = new HelloWebServiceImplService();
		HelloWebServiceImpl helloWebService= factory.getHelloWebServiceImplPort();
		helloWebService.helloWebService("TOM(TCP/IP Monitor......)");
	}
}
