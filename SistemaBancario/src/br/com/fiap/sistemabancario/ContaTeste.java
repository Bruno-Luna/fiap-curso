package br.com.fiap.sistemabancario;

public class ContaTeste {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaInvestimento = new Conta(432, 234, 18.888);
		
		contaCorrente.setAgencia(123);
		contaCorrente.setConta(321);
		contaCorrente.depositar(200.0);

		System.out.println(contaCorrente.getExtrato());
		
		contaInvestimento.sacar(2.000);
		System.out.println(contaInvestimento.getExtrato());
		
	}

}
