package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.CarModel;

import jakarta.transaction.Transactional;

public interface CarRepo extends JpaRepository<CarModel, Integer> 
{
	@Query(value="select *from car_model",nativeQuery = true)
	public List<CarModel>getAllData();
	
	@Query(value="select * from car_model where cid=:id",nativeQuery = true)
	public List<CarModel> bycname(@Param("id")int id);
	
	@Query(value="select * from car_model where cid between :start and :end",nativeQuery = true)
	public List<CarModel> startEnd(@Param("start")int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from car_model where cid=?1 and cname=?2",nativeQuery = true)
	Integer deleteID(@Param("id")int cid,@Param("name")String cname);
}
