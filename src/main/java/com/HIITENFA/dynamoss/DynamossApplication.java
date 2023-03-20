package com.HIITENFA.dynamoss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class DynamossApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamossApplication.class, args);
	}

}
