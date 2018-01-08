package com.sample.eurekafeign.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignProducerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignProducerClientApplication.class, args);
	}
}
