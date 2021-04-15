package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonsServiceImpl implements LessonsService{

    @Autowired
    private LessonsRepository lessonsRepository;


    @Override
    public List<LessonsEntity> getlessons() {
        return  lessonsRepository.findAll();

    }
}
