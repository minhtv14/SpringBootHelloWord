package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TestDevopsJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDevopsJenkinsApplication.class, args);
	}

}
