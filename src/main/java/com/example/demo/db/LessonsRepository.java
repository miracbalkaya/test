package com.example.demo.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends JpaRepository<LessonsEntity,Integer> {
}
