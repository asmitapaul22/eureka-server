package com.eureakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaServer
@PropertySource("classpath:application.yml")
public class EureakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureakaServerApplication.class, args);
	}

}
