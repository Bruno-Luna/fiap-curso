package br.com.fiap.curso;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		String nome;
		double altura, peso, imc;

		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t :: Calculadora - IMC :: \n");
		System.out.println("Digite seu nome:");
		nome = scan.next();
		System.out.println("\nQual o seu peso?");
		peso = scan.nextDouble();
		System.out.println("\nAgora, digite sua altura:");
		altura = scan.nextDouble();
		imc = peso / (altura * altura);

		if (imc >= 18.5 && imc <= 25) {
			System.out.printf("\nPeso ideal " + nome + ". " + "Seu I.M.C é de: " + "%.2f", imc);
		} else {
			System.out.printf("\nPeso fora do normal " + nome + ". " + "Seu I.M.C é de: " + "%.2f", imc);
		}

	}

}
