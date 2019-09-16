package com.kvinod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServeraMain {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServeraMain.class, args);
	}
}
