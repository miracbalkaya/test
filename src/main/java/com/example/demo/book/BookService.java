package com.example.demo.book;

import com.example.demo.db.dog.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public interface BookService {

    List<Book> getBook();

}
