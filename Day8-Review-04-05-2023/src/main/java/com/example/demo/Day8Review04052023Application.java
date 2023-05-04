package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title ="Shoe Database",
		version = "1.1.2",
		description = "Here You can find your desired product",
		contact = @Contact(
				name = "Arunkrishna E S",
				email = "arunkrishnaips2003@gmail.com"
				)
		)
)
public class Day8Review04052023Application {

	public static void main(String[] args) {
		SpringApplication.run(Day8Review04052023Application.class, args);
	}

}
