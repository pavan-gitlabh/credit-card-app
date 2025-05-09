package com.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.creditcard.creditcard.command.repository")
@EnableRedisRepositories(basePackages = "com.creditcard.creditcard.query.repository")
public class CreditCardApplication {
	public static void main(String[] args) {
		SpringApplication.run(CreditCardApplication.class, args);
	}
}
