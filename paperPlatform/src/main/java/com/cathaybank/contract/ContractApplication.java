package com.cathaybank.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({ "com.cathaybank.contract" })
public class ContractApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ContractApplication.class, args);
	}

}
