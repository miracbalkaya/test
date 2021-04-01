package com.example.demo.db.dog;

import com.example.demo.db.dog.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog,Integer>{
}
