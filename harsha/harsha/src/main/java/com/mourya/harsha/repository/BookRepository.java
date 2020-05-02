package com.mourya.harsha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mourya.harsha.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
