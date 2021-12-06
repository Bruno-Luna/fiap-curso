package br.com.fiap.curso.arrays;

import java.util.Scanner;

public class ArrayAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float soma = 0;
		float[] nota = new float[3];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Insira uma nota:");
			nota[i] = scan.nextFloat();		
			}
		scan.close();
		
		for(int i = 0; i < nota.length; i++) {
			soma += nota[i];
		}

		float media = soma/nota.length;
		System.out.println("Sua média final é: " + media);
	}

}
