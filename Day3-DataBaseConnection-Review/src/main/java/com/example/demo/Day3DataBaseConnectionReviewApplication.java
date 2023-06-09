package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title ="Laptops Database",
		version = "1.1.2",
		description = "Laptop Project",
		contact = @Contact(
				name = "Arunkrishna E S",
				email = "arunkrishnaips2003@gmail.com"
				)
		)
)
public class Day3DataBaseConnectionReviewApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(Day3DataBaseConnectionReviewApplication.class, args);
	}

}
