package br.com.fiap.curso.strings;

public class StringLowerCaseUpperCase {

	public static void main(String[] args) {

		
		String estudo = "Hoje preciso estudar java";
		String minuscula, maiuscula;
		
		minuscula = estudo.toLowerCase();
		estudo.toLowerCase();
		System.out.println("A string será: " + minuscula);
		
		
		maiuscula = estudo.toUpperCase();
		System.out.println("A string será: " + maiuscula);

	}

}
