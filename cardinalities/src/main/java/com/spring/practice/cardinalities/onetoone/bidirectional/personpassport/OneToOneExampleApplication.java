package com.spring.practice.cardinalities.onetoone.bidirectional.personpassport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
In this scenario:
        A Person can have only one Passport.
        A Passport is associated with exactly one Person.

For the Person and Passport example:

Person Table:
Columns: id, name, passport_id

Passport Table:
Columns: id, passportNumber, person_id
*/

@SpringBootApplication
public class OneToOneExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonService personService) {
        return args -> {
            personService.savePersonWithPassport();
            personService.printAllPersons();
        };
    }
}

