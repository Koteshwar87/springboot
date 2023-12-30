package com.spring.practice.prototype.correctexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrototypeScopeExample implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private PrototypeDependentService prototypeDependentService;

    public static void main(String[] args) {
        SpringApplication.run(PrototypeScopeExample.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Simulate handling multiple requests
        for (int i = 1; i <= 3; i++) {
            // Manually request a new instance of the prototype-scoped bean
            PrototypeScopedBean prototypeScopedBean = applicationContext.getBean(PrototypeScopedBean.class);

            // Use the prototype-scoped bean to process the request
            String result = prototypeDependentService.processRequest(prototypeScopedBean);
            System.out.println(result);
        }
    }
}