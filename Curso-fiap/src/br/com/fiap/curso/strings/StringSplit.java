package br.com.fiap.curso.strings;

public class StringSplit {

	public static void main(String[] args) {
		
		//Método split: Este é um método muito útil, 
		//ele separa o valor de uma string em várias strings 
		//separadas por um delimitador, que deve ser informado ao método:
		
		String semana = "Essa semana será muito proveitosa.";
		String[] palavras = semana.split(" ", 4); //onde ele encontrar o " " (espaço) fará a 
		//"quebra de Strings/posição". O número de parametro é para informar até quantas posições 
		//queremos, ignorando o restante de posições caso houver.
		
		System.out.println(palavras[1]); // acessa a posição 1 do array de String
		
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
