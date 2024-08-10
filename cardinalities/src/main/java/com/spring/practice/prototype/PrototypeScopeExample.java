package com.spring.practice.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeScopeExample implements CommandLineRunner {

    @Autowired
    private RequestHandlingService requestHandlingService;

    public static void main(String[] args) {
        SpringApplication.run(PrototypeScopeExample.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Simulate handling multiple requests
        for (int i = 1; i <= 3; i++) {
            String result = requestHandlingService.handleRequest();
            System.out.println(result);
        }
    }
}
