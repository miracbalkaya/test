package com.example.demo.episodeFaculty;

import com.example.demo.book.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
@RequestMapping("/view1")

public class EpisodeFacultyController {

    @Autowired
    private EpisodeFacultyService service;

    @GetMapping
    public List<EpisodeFacultyEntity> getview1()  {
        return service.getview1();
    }
}
