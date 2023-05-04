package com.example.demo.SRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.ShoeBase.ShoeInfo;

import jakarta.transaction.Transactional;

public interface IRepository extends JpaRepository<ShoeInfo, Integer> 
{
	//Get All Details
	@Query(value="select * from shoe_info",nativeQuery = true)
	public List<ShoeInfo> getAll();
	
	//Get one particular data
	@Query(value="select * from shoe_info where shoeratingsoutof10=:id",nativeQuery = true)
	public List<ShoeInfo> getDataById(@Param("id")int id);
	
	//Get between two data
	@Query(value="select * from shoe_info where shoeratingsoutof10 between :start and :end",nativeQuery = true)
	public List<ShoeInfo> getDataBetween(@Param("start")int start,@Param("end")int end);
	
	//Delete By ID
	@Modifying
	@Transactional
	@Query(value="delete from shoe_info where shoeratingsoutof10=:num",nativeQuery = true)
	public void deleteData(@Param("num")int num);
	
	//Update Data
	@Modifying
	@Transactional
	@Query(value="update shoe_info set shoematerial=:value where shoeratingsoutof10=:id",nativeQuery = true)
	public void updateDetails(@Param("value")String value,@Param("id")int id);
	
	//JPQL QUERY STATEMENT
	
	//Get By ID
	@Query("select i from ShoeInfo i where i.shoecolour=?1")
	public ShoeInfo queryByColour(@Param("colour")String colour);
	
	//Get Between
	@Query("select i from ShoeInfo i where i.shoeratingsoutof10 between ?1 and ?2")
	public List<ShoeInfo> between(@Param("start")int start,@Param("end")int end);
}
