package br.com.fiap.curso.banco;

public class TesteConta {

	public static void main(String[] args) {

		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		
		
		contaCorrente.agencia = 8044;
		contaCorrente.saldo = 123.33;
		contaCorrente.cliente.nome = "Bruno Luna";
		contaCorrente.cliente.idade = 30;
		
		contaPoupanca.agencia = 2233;
		contaPoupanca.saldo = 5432.10;
		contaPoupanca.cliente.nome = "Bruno Luna";
		contaPoupanca.cliente.idade = 30;
		
		System.out.println(contaPoupanca.cliente.nome);
		System.out.println(contaPoupanca.cliente.idade);
		System.out.println(contaPoupanca.agencia);
		System.out.println(contaPoupanca.saldo);
		
	}

}
