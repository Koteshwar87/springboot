package com.spring.practice.cardinalities.onetomany.unidirectional.authorbook;

import jakarta.transaction.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void saveBookWithAuthor() {
        Author author = new Author();
        author.setName("John Doe");

        Book book = new Book();
        book.setTitle("Spring Boot Basics");
        book.setAuthor(author);

        bookRepository.save(book);
    }

    public void printAllBooks() {
        System.out.println("All Books:");
        bookRepository.findAll().forEach(System.out::println);
    }
}