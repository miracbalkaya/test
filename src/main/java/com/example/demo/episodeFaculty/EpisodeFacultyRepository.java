package com.example.demo.episodeFaculty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeFacultyRepository extends JpaRepository<EpisodeFacultyEntity,Integer>{
}
