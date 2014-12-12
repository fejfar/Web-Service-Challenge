package com.ciandt.ffejfar.webServiceChallenge.service.impl;

import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;

import org.springframework.stereotype.Service;

import com.ciandt.ffejfar.webServiceChallenge.domain.Account;
import com.ciandt.ffejfar.webServiceChallenge.domain.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	public Map<String, List<String>> cpfAccounts;

	@WebMethod
	public List<Account> getAccounts() {
		AccountList al = AccountList.getInstance();
		return al.list;
	}

	@WebMethod
	public boolean isCpfReal(String string) {
		if (string.equals("blablablacpf"))
			return true;
		return false;
	}

}
