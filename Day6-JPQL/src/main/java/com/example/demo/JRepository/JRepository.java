package com.example.demo.JRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.JPQL.JExample;

public interface JRepository extends JpaRepository<JExample, Integer>
{
	@Query(value="select * from JExample",nativeQuery = true)
	public List<JExample> getAllData();
	
	@Query(value="select * from JExample where eid=:id",nativeQuery = true)
	public List<JExample> byename(@Param("id")int id);
}
