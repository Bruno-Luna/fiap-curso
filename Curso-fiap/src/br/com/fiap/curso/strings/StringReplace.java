package br.com.fiap.curso.strings;

public class StringReplace {

	public static void main(String[] args) {

		
		String estudo = "Hoje preciso estudar java";
		String replace = estudo.replace("e", "E");
		System.out.println("A string será: " + replace);
		//substituição de uma letra por outra

		
		String frase = "Hoje preciso estudar java";
		String palavra = frase.replace("Hoje", "Agora");
		System.out.println("A string será: " + palavra);
		//substituição de uma palavra por outra
	}

}
