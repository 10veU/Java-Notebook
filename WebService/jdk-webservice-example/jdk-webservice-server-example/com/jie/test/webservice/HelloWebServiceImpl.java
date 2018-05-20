package com.jie.test.webservice;

import javax.jws.WebService;

@WebService
public class HelloWebServiceImpl implements HelloWebService{

	@Override
	public String HelloWebService(String name) {
		System.out.println("HelloWebService" + name);
		return "HelloWebService" + name ;
	}

}
