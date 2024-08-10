package com.spring.practice.cardinalities.onetomany.unidirectional.authorbook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}