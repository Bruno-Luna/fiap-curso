package br.com.fiap.curso.collections;

import java.util.ArrayList;
import java.util.List;

public class MetodosArray {

	public static void main(String[] args) {

		List<String> diasSemana = new ArrayList<String>();
		
		diasSemana.add("Domingo");
		diasSemana.add("Segunda");
		diasSemana.add("Terça");
		diasSemana.add("Quarta");
		
		
		System.out.println(diasSemana);
		System.out.println(diasSemana.indexOf("Segunda")); //retorna a posição da string passada no parâmetro
		System.out.println(diasSemana.contains("Domingo")); // retorna true/false caso a string esteja presente
		System.out.println(diasSemana.lastIndexOf("Terça")); // retorna a ultima ocorrência da string
		
		diasSemana.remove(3);
		System.out.println(diasSemana);
		
		
		diasSemana.clear();
		System.out.println(diasSemana.isEmpty());
	}

}
