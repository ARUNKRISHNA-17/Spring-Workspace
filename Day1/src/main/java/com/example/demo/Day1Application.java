package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.JsonIgnore.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day1Application 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		SpringApplication.run(Day1Application.class, args);
		Person obj=new Person(1,"Arunkrishna",19);

		ObjectMapper st=new ObjectMapper();
		String Json=st.writeValueAsString(obj);
		System.out.println(Json);
	}

}
