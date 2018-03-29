package com.yep.creater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CreaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreaterApplication.class, args);
	}
}
