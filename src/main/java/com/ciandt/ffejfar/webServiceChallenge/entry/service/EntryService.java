package com.ciandt.ffejfar.webServiceChallenge.entry.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="EntryService")
public interface EntryService {
	
	@WebMethod
	public void draw(float value);
	@WebMethod
	public void deposit(float value);
	
	
}
