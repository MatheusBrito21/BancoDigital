package com.matt.bancodigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
	}

}
