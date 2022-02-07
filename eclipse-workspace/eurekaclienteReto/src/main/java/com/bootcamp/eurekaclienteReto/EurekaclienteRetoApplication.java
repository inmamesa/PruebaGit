package com.bootcamp.eurekaclienteReto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclienteRetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclienteRetoApplication.class, args);
	}

}
