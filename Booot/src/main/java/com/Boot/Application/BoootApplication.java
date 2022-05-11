package com.Boot.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages ="com.Boot") 
@EnableWebMvc
public class BoootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoootApplication.class, args);
	}

}
