package com.example.springbootdocker;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerDemoApplication {

	public  static Logger logger= LoggerFactory.getLogger(SpringbootDockerDemoApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Aplication Started");
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
