package com.example.demo.LogRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.LoginData.LogData;

public interface LogRepo extends JpaRepository<LogData, Integer> 
{
	LogData findByusername(String username);
}
