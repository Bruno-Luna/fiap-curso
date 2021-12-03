package br.com.fiap.sistemabancario;

public class Conta {

	int agencia;
	int conta;
	double saldo;
	
	public Conta() {}
	
	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public double verificarExtrato() {
		return this.saldo;
	}

}
