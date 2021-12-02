package br.com.fiap.curso.conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
						
		conta.saldo = 100;
		conta.agencia = 8044;
		conta.conta = 18408;
		

		System.out.println("\t :: Conta Corrente ::\n");
		System.out.println("Agência: " + conta.agencia);
		System.out.println("Conta: " + conta.conta);

		System.out.println("\nSaldo anterior: R$ " + conta.verificarSaldo());
		conta.depositar(400);

		System.out.println("\nSaldo atual: R$ " + conta.verificarSaldo());
		
		Conta poupanca = new Conta(20, 4533, 2233);
		
		System.out.println("\n\t :: Conta Poupança ::\n");
		
		System.out.println("Agência: " + poupanca.agencia);
		System.out.println("Conta: " + poupanca.conta);
		
		poupanca.depositar(800);
		poupanca.sacar(30);
		System.out.println("\nSaldo atual: R$ " + poupanca.verificarSaldo());

	}

}
