package com.matt.bancodigital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.matt.bancodigital.models.Conta;

public interface ContaRepository extends CrudRepository<Conta, Integer> {

}
