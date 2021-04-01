package com.example.demo.db.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Dogs")
public class DogsController {
    @Autowired
    DogsService service;

    @GetMapping
    public List<Dog> getDogs() {
        return service.getDogs();
    }
}
