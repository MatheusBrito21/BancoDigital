package com.matt.bancodigital.models;

public class Conta {
	private int id;
	private int numConta;
	private double saldoConta;
	
	public Conta() {}

	public Conta(int numConta, double saldoConta) {
		super();
		this.numConta = numConta;
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
	
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	

}
