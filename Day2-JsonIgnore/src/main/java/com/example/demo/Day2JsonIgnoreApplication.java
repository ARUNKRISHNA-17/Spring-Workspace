package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2JsonIgnoreApplication
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		SpringApplication.run(Day2JsonIgnoreApplication.class, args);
		Persons per=new Persons(1,"Arunkrishna E S",19);
		ObjectMapper obj=new ObjectMapper();
		String ign=obj.writeValueAsString(per);
		System.out.println(ign);
	}

}
