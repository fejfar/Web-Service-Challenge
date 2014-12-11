package com.ciandt.ffejfar.webServiceChallenge.account.service.test;



import org.junit.Test;

import junit.framework.Assert;

import com.ciandt.ffejfar.webServiceChallenge.account.service.AccountService;
import com.ciandt.ffejfar.webServiceChallenge.account.service.impl.AccountServiceImpl;

public class AccountServiceTest {
	
	@Test
	public void testIsCpfAlmostReal(){
		AccountService service = new AccountServiceImpl();
		
		Assert.assertTrue(service.isCpfReal("blablablacpf"));
		Assert.assertFalse(service.isCpfReal("lablablacpf"));
	}
	@Test
	public void testGetAccountFromCpf(){
		
		AccountServiceImpl s = new AccountServiceImpl();
		
//		Assert.assertEquals(s.cpfAccounts.get("4014014101"), s.cpfAccounts.get(1));
	}
	
	
}
