package com.spring.practice.cardinalities.onetoone.bidirectional.personpassport;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passportNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    @ToString.Exclude  // Exclude the Person field from toString
    private Person person;

    // Constructors, getters, and setters
    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                // other fields
                '}';
    }

}