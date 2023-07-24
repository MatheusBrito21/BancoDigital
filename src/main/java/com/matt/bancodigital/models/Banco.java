package com.matt.bancodigital.models;

import java.util.List;

public class Banco {
	private List<Conta> contas;
	
	public Banco() {}
	
	public Banco(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	
	
}
