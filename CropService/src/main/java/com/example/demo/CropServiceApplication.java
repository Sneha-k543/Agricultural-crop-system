package com.example.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableRabbit
public class CropServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropServiceApplication.class, args);
		System.out.println("####################   CropService Running...   ######################");
	}

}
