package com.matt.bancodigital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.matt.bancodigital.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
