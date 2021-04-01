package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
@Service
@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> getBook() {
        return  bookRepository.findAll();

    }
}
