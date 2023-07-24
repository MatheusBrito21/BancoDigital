package com.matt.bancodigital.models;

public class Agencia {
	private int id;
	private int numAgencia;
	
	public Agencia() {}

	public Agencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	
	
	
}
