package br.com.fiap.curso.repeticao;

import java.util.Scanner;

public class Opcao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String opcao;
		System.out.println("\tSomat�ria entre dois n�meros\n");

		do {
			System.out.println("Insira um n�mero:");
			int num1 = scan.nextInt();
			System.out.println("Insira outro n�mero:");
			int num2 = scan.nextInt();
			int soma = num1 + num2;
			System.out.println("A soma entre eles �: " + soma);
			System.out.println("\nDeseja continuar? (S/N)");
			opcao = scan.next();
		} while(opcao.equalsIgnoreCase("S"));
		scan.close();
		System.out.println("FIM!!");
	}

}
