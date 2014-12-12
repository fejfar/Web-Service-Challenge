package com.ciandt.ffejfar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ciandt.ffejfar.webServiceChallenge.domain.AccountList;

@Configuration
public class ConfigSpring {
	
	@Bean
    public AccountList accountList() {
        return AccountList.getInstance();
    }
	
}
