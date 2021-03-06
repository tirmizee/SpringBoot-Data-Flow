package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class SpringBootCloudDataFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudDataFlowApplication.class, args);
	}

}
