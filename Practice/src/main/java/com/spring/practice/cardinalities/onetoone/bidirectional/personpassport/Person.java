package com.spring.practice.cardinalities.onetoone.bidirectional.personpassport;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude  // Exclude the Passport field from toString
    private Passport passport;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name ='" + name + '\'' +
                ", passport = " + passport.getPassportNumber() +
                // other fields
                '}';
    }
}
