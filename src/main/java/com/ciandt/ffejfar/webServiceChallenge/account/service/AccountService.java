package com.ciandt.ffejfar.webServiceChallenge.account.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Account;

@WebService(name="AccountService")
public interface AccountService {
	
	@WebMethod
	public List<Account> getAccounts();

	@WebMethod
	public boolean isCpfReal(String string);
}
