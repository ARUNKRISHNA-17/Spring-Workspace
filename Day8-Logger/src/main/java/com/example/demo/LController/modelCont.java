package com.example.demo.LController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class modelCont 
{
	Logger log = LoggerFactory.getLogger(modelCont.class);
	@RequestMapping("/")
	public String demo()
	{
		log.info("information message");
		log.warn("warning message");
		log.error("error message");
		log.debug("debug message");
		log.trace("trace message");
		
		return "Completed";
	}
}
