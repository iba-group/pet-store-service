package com.ibagroup.petstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PetStoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetStoreServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Hello world!");
		};
	}

}
