package com.matt.bancodigital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	public Cliente getCliente(int id) {
		Optional<Cliente> c = clienteRepository.findById(id);
		return c.orElseThrow(()-> new RuntimeException("Cliente não encontrado"));
	}
	public List<Cliente> getAll() {
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public Cliente criarConta(Cliente cliente) {
		Cliente novoCliente = cliente;
		clienteRepository.save(novoCliente);
		
		return novoCliente;
	}
	public Cliente updateCliente(int id, Cliente c) {
		Cliente upCliente = getCliente(id);
		upCliente.setConta(c.getConta());
		upCliente.setNome(c.getNome());
	
		return clienteRepository.save(upCliente);
	}
	
	public void deleteCliente(int id) {
		clienteRepository.deleteById(id);
	}

	
}
