package br.com.fiap.curso.collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {

		Map<String, String> cadastro  = new HashMap<String, String>();
		
		cadastro.put("AMDG001","Loyola");
		cadastro.put("AMDG002","Geraldo");
		cadastro.put("AMDG003","Francisco");
		
		System.out.println(cadastro.size());
		System.out.println(cadastro.get("AMDG001"));
		System.out.println(cadastro.containsKey("AMDG003"));
		System.out.println(cadastro.isEmpty());
		System.out.println(cadastro);
		System.out.println(cadastro.values());

	}

}
