package com.javatechie.springjenkinsexample;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsExampleApplicationTests {
	
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);
	


	@Test
	void contextLoads() {
		logger.info("Welcome to jenkins Test!!!");
	}

}
