package com.example.demo.episodeFaculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpsodeFacultyServiceImpl implements EpisodeFacultyService{

    @Autowired
    private EpisodeFacultyRepository episodeFacultyRepository;

    @Override
    public List<EpisodeFacultyEntity> getview1(){
        return episodeFacultyRepository.findAll();
    }
}
