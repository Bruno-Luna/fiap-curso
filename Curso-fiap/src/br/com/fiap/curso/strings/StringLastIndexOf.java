package br.com.fiap.curso.strings;

public class StringLastIndexOf {

	public static void main(String[] args) {

		String rua = "Rua Dom Vital";
		int index = rua.lastIndexOf('a');
		int palavra = rua.lastIndexOf("Vital");
		System.out.println("O �ltimo �ndice da letra \'a\' �: " + index);
		System.out.println("O �ndice da palavra \'Vital\' �: " + palavra);
		//Havendo duas palavras ou caracter iguais retornar� sempre
		//�ltima ocorr�ncia 
	}

}
