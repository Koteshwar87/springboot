package com.person.admin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.person.admin.demo.controller","com.person.admin.demo.service"})
public class PersonAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonAdminApplication.class, args);
	}

}

