package com.matt.bancodigital.repositories;

import org.springframework.data.repository.CrudRepository;

import com.matt.bancodigital.models.Banco;

public interface BancoRepository extends CrudRepository<Banco, Integer> {
	

}
