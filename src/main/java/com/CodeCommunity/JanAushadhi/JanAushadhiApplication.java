package com.CodeCommunity.JanAushadhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JanAushadhiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanAushadhiApplication.class, args);
	}
}
