package com.spring.practice.cardinalities.onetomany.unidirectional.authorbook;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author author;  // Unidirectional relationship from Book to Author

    // Constructors, getters, setters

    // Other book-related fields and methods
}