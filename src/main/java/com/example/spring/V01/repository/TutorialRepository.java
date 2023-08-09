package com.example.spring.V01.repository;

import java.util.List;

import com.example.spring.V01.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findAll();
    Tutorial getTutorialById(long id);
}