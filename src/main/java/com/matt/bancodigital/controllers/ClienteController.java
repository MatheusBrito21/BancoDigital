package com.matt.bancodigital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matt.bancodigital.models.Cliente;
import com.matt.bancodigital.services.ClienteService;

@RestController
@RequestMapping(path = "/criarconta")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@PostMapping
	public ResponseEntity<Cliente> criarConta(@RequestBody Cliente c){
		Cliente novoC = service.criarConta(c);
		return ResponseEntity.ok().body(novoC);
	}

}
