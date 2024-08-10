package com.spring.practice.cardinalities.onetomany.unidirectional.authorbook;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Constructors, getters, setters

    // Other author-related fields and methods
}
