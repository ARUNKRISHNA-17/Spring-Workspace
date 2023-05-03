package com.example.demo.Maprepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Map.Questions;

public interface QuestionsRepo extends JpaRepository<Questions, Integer>
{
	@Query(value="select * from questions",nativeQuery = true)
	public List<Questions> getAllData(Questions qq);
}
