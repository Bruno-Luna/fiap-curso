package br.com.fiap.curso.strings;

public class StringIniciarCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Desejo a ti uma �tima semana";
		
		if(frase.startsWith("Desejo")) {
			System.out.println("Iniciou com a palavra \'Desejo\'");
		}else {
			System.out.println("N�o iniciou com a palavra \'Desejo\'");

		}
		
		if(frase.endsWith("semana")) {
			System.out.println("Terminou com a palavra \'semana\'");
		}else {
			System.out.println("N�o terminou com a palavra \'semana\'");

		}
		
		//Ambos os m�todos diferenciam letras mai�sculas e minusculas.
	}

}
