package br.com.fiap.curso.strings;

public class StringLastIndexOf {

	public static void main(String[] args) {

		String rua = "Rua Dom Vital";
		int index = rua.lastIndexOf('a');
		int palavra = rua.lastIndexOf("Vital");
		System.out.println("O último índice da letra \'a\' é: " + index);
		System.out.println("O índice da palavra \'Vital\' é: " + palavra);
		//Havendo duas palavras ou caracter iguais retornará sempre
		//última ocorrência 
	}

}
