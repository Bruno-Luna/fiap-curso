package br.com.fiap.curso.collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		//Interface List e uso de Generics
		//Generics n�o permite tipos primitivos
		
		List<String> linguagens = new ArrayList<String>();
		
		System.out.println(linguagens.isEmpty());
		//verifica se � vazio e retorna true ou false
		
		linguagens.add("Javascript");
		linguagens.add("Java");
		linguagens.add("Cobol");
		linguagens.set(0, "Phyton");
		//substitui um determinado elemento em sua posi��o 
		
		System.out.println(linguagens.isEmpty());
		
		System.out.println(linguagens.size());
		//retorna o tamanho do ArrayList
	}

}
