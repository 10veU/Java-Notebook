package com.jie.test.webserviceserver;

import javax.xml.ws.Endpoint;

import com.jie.test.webservice.HelloWebServiceImpl;
/*
 * ����webservice
 */
public class WebServiceServer {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8088/HelloWebService/", new HelloWebServiceImpl());
		System.out.println("WebService�����ɹ�......");
		
	}
}
