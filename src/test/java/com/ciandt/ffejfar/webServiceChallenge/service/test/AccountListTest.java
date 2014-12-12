package com.ciandt.ffejfar.webServiceChallenge.service.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ciandt.ffejfar.webServiceChallenge.account.DAO.AccountDAO;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Account;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.AccountList;
import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Operation;
import com.ciandt.ffejfar.webServiceChallenge.test.util.JunitSpringTestUtil;

public class AccountListTest extends JunitSpringTestUtil {

	@Autowired
	public AccountList al;

	@Autowired
	public AccountDAO adao;

	@Before
	public void setup() {

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

		float balance = adao.getAccountByCpf(cpf).getBalance();

		adao.updateBalance(cpf, 50, Operation.DRAW);

		Assert.assertEquals(balance - 50, adao.getAccountByCpf(cpf)
				.getBalance(), 0);

		System.out.println(al.toString());
	}

	@Test
	public void getAccountByCPF() {
		Account acc = new Account();
		String cpf = al.list.get(0).getCpf();
		Assert.assertNotNull(al.cpfBalanceMap.get(cpf));
		acc = adao.getAccountByCpf(cpf);

		Assert.assertEquals(cpf, acc.getCpf());

	}
}
