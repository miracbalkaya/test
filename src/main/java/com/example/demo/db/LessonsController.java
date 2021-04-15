package com.example.demo.db;

import com.example.demo.book.BookEntity;
import com.example.demo.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lessons")

public class LessonsController {

    @Autowired
    private LessonsService service;

    @GetMapping
    public List<LessonsEntity> getlessons() {
        return service.getlessons();
    }



}
