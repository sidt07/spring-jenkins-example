package com.javatechie.springjenkinsexample;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsExampleApplication {
	
public static org.slf4j.Logger logger=LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);
	
	
    @PostConstruct
	public void init() {
		logger.info(" Application Inside init");
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsExampleApplication.class, args);
	}

}
