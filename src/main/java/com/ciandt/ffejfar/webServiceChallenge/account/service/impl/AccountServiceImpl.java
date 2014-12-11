package com.ciandt.ffejfar.webServiceChallenge.account.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Account;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	public Map<String, List<String>> cpfAccounts;

	public List<Account> getAccounts() {
		AccountList al = AccountList.getInstance();
		return al.list;
	}

	public boolean isCpfReal(String string) {
		if (string.equals("blablablacpf"))
			return true;
		return false;
	}

}
