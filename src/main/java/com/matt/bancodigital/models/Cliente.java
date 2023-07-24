package com.matt.bancodigital.models;

public class Cliente {
	
	private int id;
	private String nome;
	private Conta conta;
	
	public Cliente() {}
	
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	

}
