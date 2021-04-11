package com.javatpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
