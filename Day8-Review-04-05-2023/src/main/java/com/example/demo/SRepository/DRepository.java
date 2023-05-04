package com.example.demo.SRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.ShoeBase.ShoeDetails;

public interface DRepository extends JpaRepository<ShoeDetails, Integer> 
{
	@Query(value="select * from shoe",nativeQuery = true)
	public List<ShoeDetails> getAll();
}
