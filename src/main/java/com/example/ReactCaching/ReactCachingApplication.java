package com.example.ReactCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ReactCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactCachingApplication.class, args);
	}

}
