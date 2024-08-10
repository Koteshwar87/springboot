package com.spring.practice.cardinalities.onetomany.unidirectional.authorbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*

In this scenario:
        An Author can have multiple Book entities associated with it.
        A Book can have only one Author.

Unidirectional One-to-Many Relationship (Author and Book)
For the unidirectional one-to-many relationship between Author and Book:

Author Table:
Columns: id, name

Book Table:
Columns: id, title, author_id

*/


@SpringBootApplication
public class UnidirectionalExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnidirectionalExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookService bookService) {
        return args -> {
            bookService.saveBookWithAuthor();
            bookService.printAllBooks();
        };
    }
}
