package com.ciandt.ffejfar.webServiceChallenge.entry.service.test;

import org.junit.Assert;
import org.junit.Test;

import com.ciandt.ffejfar.webServiceChallenge.account.pojo.Account;
import com.ciandt.ffejfar.webServiceChallenge.entry.service.impl.EntryServiceImpl;

public class EntryServiceTest {
	@Test
	public void drawTest() {
		EntryServiceImpl service = new EntryServiceImpl();
		service.draw(50);
		
		
		
//		Assert.assertEquals(50, Account.demoAccount.getBalance(),0);;
	}

}
