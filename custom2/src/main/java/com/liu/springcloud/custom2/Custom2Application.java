package com.liu.springcloud.custom2;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
//这个注解不能少，否则能打开hystrix面板，但是没有数据
//面板要与健康模块actuator配合使用
@EnableCircuitBreaker
public class Custom2Application {

	public static void main(String[] args) {
		SpringApplication.run(Custom2Application.class, args);
	}

	@Bean

	Logger.Level feignLoggerLevel() {

		return Logger.Level.FULL;

	}
}
