package br.com.fiap.curso.collections;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {

		//A interface Set e a classe HashSet herdam os m�dotos da interface Collections
		
		Set<String> alimento = new HashSet<String>();
		
		System.out.println(alimento.isEmpty());
		alimento.add("Granola");
		alimento.add("Milharina");
		alimento.add("Milharina"); //Se dados duplicados forem inseridos, 
								   //a classe HashSet n�o permite a compila��o 
		alimento.add("Alface");
		System.out.println(alimento);
		System.out.println(alimento.isEmpty());
		System.out.println(alimento.size());
		alimento.remove("Alface");
		System.out.println(alimento);


	}

}
