package com.matt.bancodigital.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	@OneToOne(cascade = CascadeType.PERSIST)
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
	
	
	public void consultarSaldo() {
		System.out.println("Saldo atual -> R$"+getConta().getSaldoConta());
	}
	
	public void depositar(double valor) {
		getConta().setSaldoConta(this.conta.getSaldoConta() + valor);
	}
	
	public double sacar(double valor) {
		if(valor>getConta().getSaldoConta()) {
			System.out.println("Saldo insuficiente!");
			return 0.0;
		} 
		else {
			getConta().setSaldoConta(this.conta.getSaldoConta() - valor);
			return valor;
		}
	}
	

}
