package com.example.demo.ORepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.OneToOne.OQues;

public interface QRepository extends JpaRepository<OQues, Integer> 
{
	@Query(value="select * from OQues where qno=:id",nativeQuery = true)
	public List<OQues> getInfo();
}
