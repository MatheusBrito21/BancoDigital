package com.matt.bancodigital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.repositories.ClienteRepository;
import com.matt.bancodigital.repositories.ContaRepository;

@Service
public class CriarContaService {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ContaRepository contaRepository;
	
	public Cliente criarConta(Cliente cliente) {
		Cliente novoCliente = cliente;
		
		clienteRepository.save(novoCliente);
		
		return novoCliente;
	}
	
}
