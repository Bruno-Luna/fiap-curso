package br.com.fiap.curso.collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		//Interface List e uso de Generics
		//Generics não permite tipos primitivos
		
		List<String> linguagens = new ArrayList<String>();
		
		System.out.println(linguagens.isEmpty());
		//verifica se é vazio e retorna true ou false
		
		linguagens.add("Javascript");
		linguagens.add("Java");
		linguagens.add("Cobol");
		linguagens.set(0, "Phyton");
		//substitui um determinado elemento em sua posição 
		
		System.out.println(linguagens.isEmpty());
		
		System.out.println(linguagens.size());
		//retorna o tamanho do ArrayList
	}

}
