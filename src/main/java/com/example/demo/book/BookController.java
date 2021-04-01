package com.example.demo.book;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/book")

public class BookController {

    private final BookService service;

    public BookController(@Qualifier("bookService") BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getBook() {
        return service.getBook();
    }
}
