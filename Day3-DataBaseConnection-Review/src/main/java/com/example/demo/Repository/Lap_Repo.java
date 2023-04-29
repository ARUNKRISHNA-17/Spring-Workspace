package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.review.Laptop_DBMS;

import jakarta.transaction.Transactional;

public interface Lap_Repo extends JpaRepository<Laptop_DBMS,Integer> 
{
	Laptop_DBMS findByusername(String username);
	
    public List<Laptop_DBMS> findByCPU(String CPU);
	
	@Query(value="select * from lap_review", nativeQuery= true)
	public List<Laptop_DBMS> getAllData();
	
	@Query(value="select * from lap_review where userid=:id", nativeQuery= true)
	public List<Laptop_DBMS> byuserid(@Param("id")int id);
	
	@Query(value="select * from lap_review where userid between :start and :end",nativeQuery= true)
	public List<Laptop_DBMS> startend(@Param("start") int start ,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from lap_review where userid=?1 and username=?2",nativeQuery= true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);

	@Modifying
	@Transactional
	@Query(value="update lap_review set userid=:id where username=:uname",nativeQuery= true)
	public void updateDetails(@Param("id")int id,@Param("uname")String uname);
}
