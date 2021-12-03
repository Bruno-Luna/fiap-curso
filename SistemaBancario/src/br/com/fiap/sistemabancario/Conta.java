package br.com.fiap.sistemabancario;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Bruno Luna
 * @version 1.0
 */
public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int conta;
	private double saldo;
	
	public Conta() {}
	
	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	/**
	 * Acrescenta um determinado valor ao saldo da conta
	 * @param valor a ser colocado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retirada de um determinado valor do saldo da conta
	 * @param valor que sera subtraido do saldo
	 * @see depositar
	 */
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double getExtrato() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

}
