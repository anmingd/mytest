package com.ming.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apllication {
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Apllication.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}

}
