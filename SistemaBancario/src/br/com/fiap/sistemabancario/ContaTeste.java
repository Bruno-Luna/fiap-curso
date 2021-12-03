package br.com.fiap.sistemabancario;

public class ContaTeste {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaInvestimento = new Conta(432, 234, 18.888);
		
		contaCorrente.agencia = 123;
		contaCorrente.conta = 321;
		contaCorrente.saldo = 50.0;
		contaCorrente.depositar(200);

		System.out.println(contaCorrente.verificarExtrato());
		
		contaInvestimento.sacar(2.000);
		System.out.println(contaInvestimento.verificarExtrato());
		
	}

}
