package br.com.fiap.curso.strings;

public class StringIndexOf {

	public static void main(String[] args) {

		String cidade = "S�o Paulo, santo que d� nome umas das mais importantes"
				+ "megal�poles do mundo";
		int posicao = cidade.indexOf('�');
		int pos = cidade.indexOf('x');
		System.out.println("O �ndice do caracter \'a\' �: " + posicao);
		System.out.println("O �ndice do caracter \'x\' �: " + pos);
		
		//O resultado -1 indica que o caractere�x� n�o est� presente na string. 
		//O m�todo indexOf tamb�m  pode  ser  utilizado para  procurar  por uma  
		//sequ�ncia de caracteres, 
		//para isso, basta passar uma palavra ao inv�s do caractere:
		
		int palavra = cidade.indexOf("santo");
		System.out.println("O �ndice da palavra \'santo\' �: " + palavra);

	}

}
