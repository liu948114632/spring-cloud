package com.liu.springcloud.custom2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class Custom2Application {

	public static void main(String[] args) {
		SpringApplication.run(Custom2Application.class, args);
	}
}
