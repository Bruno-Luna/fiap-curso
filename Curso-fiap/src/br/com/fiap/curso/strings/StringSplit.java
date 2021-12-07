package br.com.fiap.curso.strings;

public class StringSplit {

	public static void main(String[] args) {
		
		//M�todo split: Este � um m�todo muito �til, 
		//ele separa o valor de uma string em v�rias strings 
		//separadas por um delimitador, que deve ser informado ao m�todo:
		
		String semana = "Essa semana ser� muito proveitosa.";
		String[] palavras = semana.split(" ", 4); //onde ele encontrar o " " (espa�o) far� a 
		//"quebra de Strings/posi��o". O n�mero de parametro � para informar at� quantas posi��es 
		//queremos, ignorando o restante de posi��es caso houver.
		
		System.out.println(palavras[1]); // acessa a posi��o 1 do array de String
		
		for (String p : palavras) {
			System.out.println(p);
		}
		System.out.println("\n\n");
		
		String tech = "Java;Phyton;Kotlin;CSS;JS";
		String[] techs = tech.split(";");
		for (String t : techs) {
			System.out.println(t);
		}
	}
}
