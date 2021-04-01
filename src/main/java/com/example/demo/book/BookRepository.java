package com.example.demo.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
