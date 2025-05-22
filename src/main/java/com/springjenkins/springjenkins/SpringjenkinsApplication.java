package com.springjenkins.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjenkinsApplication {

	private static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application excecuted");

		SpringApplication.run(SpringjenkinsApplication.class, args);
	}

}
