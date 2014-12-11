package com.ciandt.ffejfar.webServiceChallenge.entry.service.impl;

import org.springframework.stereotype.Service;

import com.ciandt.ffejfar.webServiceChallenge.account.pojo.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Operation;
import com.ciandt.ffejfar.webServiceChallenge.entry.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService {

	public void draw(float value) {
		AccountList al = AccountList.getInstance();
		String cpf = al.list.get(3).getCpf();
		al.updateBalance(cpf, value, Operation.DRAW);
		
	}

	public void deposit(float value) {
		AccountList al = AccountList.getInstance();
		String cpf = al.list.get(3).getCpf();
		al.updateBalance(cpf, value, Operation.DEPOSIT);

	}


}
