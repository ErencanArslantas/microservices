package com.kitaplik.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	// bağlantıların birbirinden haberdar olmasını sağlar

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);

	}
}
