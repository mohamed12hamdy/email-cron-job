package com.example.emailcronJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmailCronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailCronJobApplication.class, args);
	}

}
