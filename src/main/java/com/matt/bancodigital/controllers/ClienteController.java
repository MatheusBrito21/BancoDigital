package com.matt.bancodigital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.services.ClienteService;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getAllClientes(){
		List<Cliente> lista = service.getAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		Cliente c = service.getCliente(id);
		return ResponseEntity.ok().body(c);
	}
	
	@PostMapping(path = "/criarconta")
	public ResponseEntity<Cliente> criarConta(@RequestBody Cliente c){
		Cliente novoC = service.criarConta(c);
		return ResponseEntity.ok().body(novoC);
	}
	
	@PutMapping(path = "/update/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable int id, @RequestBody Cliente c){
		Cliente upCliente = service.updateCliente(id,c);
		return ResponseEntity.ok().body(upCliente);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable int id){
		service.deleteCliente(id);
		return ResponseEntity.noContent().build();
	}

}
