package com.example.demo.db.dog;

import com.example.demo.db.dog.Dog;
import com.example.demo.db.dog.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogsService {
    @Autowired
    DogRepository repository;

    public List<Dog> getDogs() {
        return (List<Dog>) repository.findAll();
    }
}
