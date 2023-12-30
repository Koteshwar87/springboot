package com.spring.practice.cardinalities.onetoone.bidirectional.personpassport;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}