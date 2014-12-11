package com.ciandt.ffejfar.webservicechallenge.helloworld.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	@WebMethod
	public String sayHelloWorld();
}
