package br.com.fiap.curso.strings;

public class SubString {

	public static void main(String[] args) {

		String mercado = "Hoje preciso ir ao mercado";
		String sub = mercado.substring(5, 12);
		System.out.println("A string será: " + sub);

		// É possível criar uma string a partir de um trecho de outra string utilizando
		// o método 'subString'.
		// Este método recebe como parâmetro a posição inicial (inclusive) e a
		// posição final (exclusive) do conjunto de caracteres a serem
		// copiados dastring original. O caracter da posição inicial será copiado para a
		// nova string,
		// já o caracter da última posição não será copiado

		
		
		String compra = "Hoje preciso fazer compras";
		String nova = compra.substring(compra.lastIndexOf('c'));
		System.out.println("A string será: " + nova);


	}
}
