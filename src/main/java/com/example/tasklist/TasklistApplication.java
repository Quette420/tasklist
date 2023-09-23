package com.example.tasklist;

import com.example.tasklist.service.props.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(JwtProperties.class)
@SpringBootApplication
public class TasklistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasklistApplication.class, args);
	}

}
