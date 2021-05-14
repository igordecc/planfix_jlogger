package com.planfix_jlogger.planfix_jlogger;

import com.planfix_jlogger.planfix_jlogger.restclient.PlanfixClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanfixJloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanfixJloggerApplication.class, args);
		PlanfixClient.loggin();
	}

}
