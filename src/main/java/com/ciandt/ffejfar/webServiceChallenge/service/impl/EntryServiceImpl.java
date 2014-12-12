package com.ciandt.ffejfar.webServiceChallenge.service.impl;

import javax.jws.WebMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.ffejfar.webServiceChallenge.domain.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.domain.Operation;
import com.ciandt.ffejfar.webServiceChallenge.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private AccountList al;
	
	@WebMethod
	public void draw(float value) {
		AccountList al = AccountList.getInstance();
		String cpf = al.list.get(3).getCpf();
		al.updateBalance(cpf, value, Operation.DRAW);
		
	}

	@WebMethod
	public void deposit(float value) {
		AccountList al = AccountList.getInstance();
		String cpf = al.list.get(3).getCpf();
		al.updateBalance(cpf, value, Operation.DEPOSIT);

	}


}
