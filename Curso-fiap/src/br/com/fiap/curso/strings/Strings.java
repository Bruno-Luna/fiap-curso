package br.com.fiap.curso.strings;

public class Strings {
	
	
	public static void main(String[] args) {
		
//		String nome = "\t\tFIAP, \n\"A melhor faculdade de tecnologia\"";
//		System.out.println(nome);	
//		System.out.println(nome.length());
		
		
		//Concatenação:
//		String nomeF = "\t Faculdade: \"FIAP\"";
//		String sloganF = "A melhor faculdade de tecnologia";
//		String stringsConcatenada = nomeF + " - " + sloganF;
//		System.out.println(stringsConcatenada);
		
		//Concatenação com operadores:
//		String facul = "\t FIAP";
//		String slogan = "\'A melhor faculdade de tecnologia\'";
//		facul += " - ";
//		facul += slogan;
//		System.out.println(facul);
		
		//Concatecação com o método 'concat':
		String laranja = "Laranja: ";
		String limao = "Limão";
		String vitaC = "\'É rica em vitamina C\'";
		String frase = laranja.concat(vitaC);
		String frase2 = limao.concat(": ").concat(vitaC);
		System.out.println(frase);
		System.out.println(frase2);

	}
	
	
}
