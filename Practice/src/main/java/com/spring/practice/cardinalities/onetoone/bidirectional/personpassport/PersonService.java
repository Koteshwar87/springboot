package com.spring.practice.cardinalities.onetoone.bidirectional.personpassport;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePersonWithPassport() {
        Person person = new Person();
        person.setName("John Doe");

        Passport passport = new Passport();
        passport.setPassportNumber("AB123456");
        passport.setPerson(person);

        person.setPassport(passport);

        personRepository.save(person);
    }

    public void printAllPersons() {
        System.out.println("All Persons:");
        personRepository.findAll().forEach(System.out::println);
    }
}