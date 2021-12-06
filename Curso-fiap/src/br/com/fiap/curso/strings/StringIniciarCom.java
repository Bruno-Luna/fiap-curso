package br.com.fiap.curso.strings;

public class StringIniciarCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Desejo a ti uma ótima semana";
		
		if(frase.startsWith("Desejo")) {
			System.out.println("Iniciou com a palavra \'Desejo\'");
		}else {
			System.out.println("Não iniciou com a palavra \'Desejo\'");

		}
		
		if(frase.endsWith("semana")) {
			System.out.println("Terminou com a palavra \'semana\'");
		}else {
			System.out.println("Não terminou com a palavra \'semana\'");

		}
		
		//Ambos os métodos diferenciam letras maiúsculas e minusculas.
	}

}
