package com.ciandt.ffejfar.webServiceChallenge.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.ffejfar.webServiceChallenge.domain.Account;
import com.ciandt.ffejfar.webServiceChallenge.domain.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.domain.Operation;

@Service
public class AccountDAO implements BaseDAO {

	@Autowired
	private AccountList al;
	
	public AccountDAO() {
		super();
	}
	
	public void updateBalance(String cpf, float value, Operation op) {
		 
			 
		if (op == Operation.DRAW) {
			Account ac = al.cpfBalanceMap.get(cpf);
			ac.setBalance(ac.getBalance()-value);
			al.cpfBalanceMap.put(cpf, ac);
		}
		if (op == Operation.DEPOSIT){
			Account ac = al.cpfBalanceMap.get(cpf);
			ac.setBalance(ac.getBalance()+value);
			al.cpfBalanceMap.put(cpf, ac);
		}
	}
	
	public Account getAccountByCpf(String cpf) {
		
		return al.cpfBalanceMap.get(cpf);
	}

}