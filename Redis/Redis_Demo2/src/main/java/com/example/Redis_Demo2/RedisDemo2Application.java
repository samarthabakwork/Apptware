package com.example.Redis_Demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemo2Application.class, args);
	}

}
