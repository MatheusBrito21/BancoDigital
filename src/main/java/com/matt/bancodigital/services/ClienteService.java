package com.matt.bancodigital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	

	public Cliente criarConta(Cliente cliente) {
		Cliente novoCliente = cliente;
		
		clienteRepository.save(novoCliente);
		
		return novoCliente;
	}
	
}
