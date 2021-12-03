package br.com.fiap.sistemabancario;

public class ContaTeste {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		/*
		 * Conta contaInvestimento = new Conta(432, 234, 18.888);
		 * 
		 * contaCorrente.setAgencia(123); contaCorrente.setConta(321);
		 * contaCorrente.depositar(200.0);
		 * 
		 * System.out.println(contaCorrente.getExtrato());
		 * 
		 * contaInvestimento.sacar(2.000);
		 * System.out.println(contaInvestimento.getExtrato());
		 */
		contaCorrente.setAgencia(222);
		contaCorrente.setConta(333);
		contaCorrente.depositar(1000);
		contaCorrente.setChequeEspecial(200);
		contaCorrente.setTipo("Pessoa Física");
		
		
		System.out.println("\t :: Banco ::");
		System.out.println("\nTipo de conta: " + contaCorrente.getTipo());
		System.out.println("\nAgência: "+ contaCorrente.getAgencia());
		System.out.println("Conta: "+ contaCorrente.getConta());
		System.out.println("\nDeposito: R$ " + contaCorrente.getExtrato());
		System.out.println("Saldo + cheque Especial: R$ " + contaCorrente.getSaldoDisponivel());

	}

}
