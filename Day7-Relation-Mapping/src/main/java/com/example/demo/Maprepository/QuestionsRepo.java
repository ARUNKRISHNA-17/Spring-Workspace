package com.example.demo.Maprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Map.Questions;

public interface QuestionsRepo extends JpaRepository<Questions, Integer> {

}
