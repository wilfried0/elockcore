package com.assam.elockcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.assam")
public class ElockcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElockcoreApplication.class, args);
	}

}
