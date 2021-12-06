package br.com.fiap.curso.strings;

public class StringCharAt {

	public static void main(String[] args) {

		String frase = "Olá, como vai?";
		char caracter = frase.charAt(2);
		System.out.println("Retornou o caracter: " + caracter);
		
		String phase = "Hello, my name is Bruno";
		phase += "!";
		char search = phase.charAt(23);
		System.out.println("Returned: " + search);

	}

}
