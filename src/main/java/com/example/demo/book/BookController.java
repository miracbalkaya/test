package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<BookEntity> getBook() {
        return service.getBook();
    }

   // @PostMapping("/miraç")
}
