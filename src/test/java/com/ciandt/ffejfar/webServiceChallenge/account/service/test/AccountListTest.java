package com.ciandt.ffejfar.webServiceChallenge.account.service.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Account;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Operation;

public class AccountListTest {

	public AccountList al;

	@Before
	public void setup() {
		al = AccountList.getInstance();

	}

	@Test
	public void generateAccountsTest() {
		Assert.assertNotNull(al.list);
		Assert.assertEquals(al.list.get(0).getCpf(), "cpfconta1");
	}

	@Test
	public void updateBalance() {
		String cpf = al.list.get(3).getCpf();
		Assert.assertNotNull(al.cpfBalanceMap);

		float balance = al.getAccountByCpf(cpf).getBalance();

		al.updateBalance(cpf, 50, Operation.DRAW);

		Assert.assertEquals(balance - 50, al.getAccountByCpf(cpf).getBalance(),
				0);

		System.out.println(al.toString());
	}

	@Test
	public void getAccountByCPF() {
		Account acc = new Account();
		String cpf = al.list.get(0).getCpf();
		Assert.assertNotNull(al.cpfBalanceMap.get(cpf));
		acc = al.getAccountByCpf(cpf);

		Assert.assertEquals(cpf, acc.getCpf());

	}
}
