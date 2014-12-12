package com.ciandt.ffejfar.webServiceChallenge.test.util;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml",
		"classpath:WEB-INF/application-web-context.xml" })
public abstract class JunitSpringTestUtil {

	@BeforeClass
	public static void setupSpring() {

	}
}