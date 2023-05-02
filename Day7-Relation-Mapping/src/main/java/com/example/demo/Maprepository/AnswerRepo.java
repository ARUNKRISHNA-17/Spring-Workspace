package com.example.demo.Maprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Map.Answers;

public interface AnswerRepo extends JpaRepository<Answers, Integer> {

}
