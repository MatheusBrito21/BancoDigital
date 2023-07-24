package com.matt.bancodigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.models.Conta;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BancoDigitalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
		
		Cliente c = new Cliente("Matheus", new Conta(1, 200));
		
		c.consultarSaldo();
		c.depositar(150);
		c.consultarSaldo();
		c.sacar(350);
		c.consultarSaldo();
		
	}

}
