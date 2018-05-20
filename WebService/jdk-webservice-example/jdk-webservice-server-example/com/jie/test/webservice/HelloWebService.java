package com.jie.test.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * SEI
 */
@WebService
public interface HelloWebService {
	@WebMethod
	public String HelloWebService(String name);
}
