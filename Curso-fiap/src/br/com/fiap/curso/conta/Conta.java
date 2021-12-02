package br.com.fiap.curso.conta;

public class Conta {

	int agencia;
	int conta;
	double saldo;
	
	
	public Conta() {}

	public Conta(double saldo, int agencia, int conta) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public double verificarSaldo() {
		return saldo;
	}
}
