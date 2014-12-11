package com.ciandt.ffejfar.webServiceChallenge.account.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccountList {

	public static AccountList accountList = null;
	public HashMap<String, Account> cpfBalanceMap;
	public List<Account> list = null;

	private AccountList() {
		list = new ArrayList<Account>();
		// if (cpfBalanceMap == null)
		cpfBalanceMap = new HashMap<String, Account>();

		if (list.isEmpty())
			generateAccounts();

		if (cpfBalanceMap.isEmpty())
			generateMap();

	}
	
	public static AccountList getInstance() {
		if ( accountList == null ) {
			accountList = new AccountList();
		}
		return accountList;
	}

	public void generateMap() {
		for (Account account : list) {
			cpfBalanceMap.put(account.getCpf(), account);
		}
	}

	public void generateAccounts() {
		Account c1 = new Account();
		c1.setAccount("01212121212");
		c1.setBalance(10000000);
		c1.setBranch("0102");
		c1.setCpf("cpfconta1");

		Account c2 = new Account();
		c2.setAccount("01313131313");
		c2.setBalance(5);
		c2.setBranch("0202");
		c2.setCpf("cpfconta2");

		Account c3 = new Account();
		c3.setAccount("01414141414");
		c3.setBalance(999999999);
		c3.setBranch("0302");
		c3.setCpf("cpfconta3");

		Account c4 = new Account();
		c4.setAccount("01515151515");
		c4.setBalance(550);
		c4.setBranch("0402");
		c4.setCpf("cpfconta4");

		Account c5 = new Account();
		c5.setAccount("0");
		c5.setBalance(100);
		c5.setBranch("001");
		c5.setCpf("00100100101");

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);

	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		for (Account account : list) {
			str.append("***ACCOUNT***\n");
			str.append("Account Number: ");
			str.append(account.getAccount());
			str.append("\n");
			str.append("Branch Number: ");
			str.append(account.getBranch());
			str.append("\n");
			str.append("CPF: ");
			str.append(account.getCpf());
			str.append("\n");
			str.append("Balance: ");
			str.append(account.getBalance());
			str.append("\n");
		}
		return str.toString();
	}

	public Account getAccountByCpf(String cpf) {
		return cpfBalanceMap.get(cpf);
	}

	public void updateBalance(String cpf, float value, Operation op) {
		if (op == Operation.DRAW) {
			Account ac = cpfBalanceMap.get(cpf);
			ac.setBalance(ac.getBalance()-value);
			cpfBalanceMap.put(cpf, ac);
		}
		if (op == Operation.DEPOSIT){
			Account ac = cpfBalanceMap.get(cpf);
			ac.setBalance(ac.getBalance()+value);
			cpfBalanceMap.put(cpf, ac);
		}
	}

}
