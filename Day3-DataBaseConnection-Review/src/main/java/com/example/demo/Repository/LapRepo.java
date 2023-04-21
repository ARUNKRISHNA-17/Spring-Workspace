package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.review.LaptopConfigurations;

public interface LapRepo extends JpaRepository<LaptopConfigurations, Integer> {

}
