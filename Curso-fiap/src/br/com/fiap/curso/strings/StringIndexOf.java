package br.com.fiap.curso.strings;

public class StringIndexOf {

	public static void main(String[] args) {

		String cidade = "São Paulo, santo que dá nome umas das mais importantes"
				+ "megalópoles do mundo";
		int posicao = cidade.indexOf('á');
		int pos = cidade.indexOf('x');
		System.out.println("O índice do caracter \'a\' é: " + posicao);
		System.out.println("O índice do caracter \'x\' é: " + pos);
		
		//O resultado -1 indica que o caractere‘x’ não está presente na string. 
		//O método indexOf também  pode  ser  utilizado para  procurar  por uma  
		//sequência de caracteres, 
		//para isso, basta passar uma palavra ao invés do caractere:
		
		int palavra = cidade.indexOf("santo");
		System.out.println("O índice da palavra \'santo\' é: " + palavra);

	}

}
