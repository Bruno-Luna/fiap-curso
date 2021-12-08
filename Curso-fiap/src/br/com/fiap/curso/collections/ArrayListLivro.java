package br.com.fiap.curso.collections;

import java.util.ArrayList;

public class ArrayListLivro {

	public static void main(String[] args) {

		ArrayList livro = new ArrayList();
		double valor = 18.99;
		int valor2 = 2;
		int valor3 = 5;
		
		livro.add(valor);
		livro.add(valor2);
		livro.add("Filoteia");
		
		System.out.println(livro.get(2));
	}

}
