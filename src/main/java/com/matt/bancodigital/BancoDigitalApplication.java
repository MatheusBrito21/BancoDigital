package com.matt.bancodigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class BancoDigitalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);

	}

}
