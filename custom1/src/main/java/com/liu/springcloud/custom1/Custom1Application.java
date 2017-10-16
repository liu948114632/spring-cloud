package com.liu.springcloud.custom1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class Custom1Application {

	public static void main(String[] args) {
		SpringApplication.run(Custom1Application.class, args);
	}
}
