package br.com.fiap.curso.strings;

public class SubString {

	public static void main(String[] args) {

		String mercado = "Hoje preciso ir ao mercado";
		String sub = mercado.substring(5, 12);
		System.out.println("A string ser�: " + sub);

		// � poss�vel criar uma string a partir de um trecho de outra string utilizando
		// o m�todo 'subString'.
		// Este m�todo recebe como par�metro a posi��o inicial (inclusive) e a
		// posi��o final (exclusive) do conjunto de caracteres a serem
		// copiados dastring original. O caracter da posi��o inicial ser� copiado para a
		// nova string,
		// j� o caracter da �ltima posi��o n�o ser� copiado

		
		
		String compra = "Hoje preciso fazer compras";
		String nova = compra.substring(compra.lastIndexOf('c'));
		System.out.println("A string ser�: " + nova);


	}
}
