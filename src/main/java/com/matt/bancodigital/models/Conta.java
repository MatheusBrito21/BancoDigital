package com.matt.bancodigital.models;

public class Conta {
	private int id;
	private int numConta;
	private Agencia agencia;
	private double saldoConta;
	
	public Conta() {}

	public Conta(int numConta, Agencia agencia, double saldoConta) {
		super();
		this.numConta = numConta;
		this.agencia = agencia;
		this.saldoConta = saldoConta;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	

}
