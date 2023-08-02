package com.matt.bancodigital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.services.ClienteService;

@RestController
@RequestMapping(path = "/operacao")
public class OperacaoContaController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping(path = "/saldo/{id}")
	public ResponseEntity<String> consultarSaldo(@PathVariable int id){
		Cliente cli = service.consultarSaldo(id);
		return ResponseEntity.ok().body(cli.getNome()+"\n"+ cli.consultarSaldo());
	}
	
	@PostMapping(path = "/depositar/{id}/{valor}")
	public ResponseEntity<Cliente> depositar(@PathVariable int id, @PathVariable double valor){
		Cliente cli = service.depositoCliente(id, valor);
		return ResponseEntity.ok().body(cli);
	}
	
	@PutMapping(path = "/sacar/{id}/{valor}")
	public ResponseEntity<String> sacar(@PathVariable int id, @PathVariable double valor){
		Cliente cli = service.sacar(id, valor);
		return ResponseEntity.ok().body(cli.getNome()+"\n"+ cli.consultarSaldo());}

}
