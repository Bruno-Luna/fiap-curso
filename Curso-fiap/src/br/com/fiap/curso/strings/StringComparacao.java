package br.com.fiap.curso.strings;

public class StringComparacao {

	public static void main(String[] args) {
		
		String celular = "XIAOMI";
		String celular2 = "XIAOMI";
		
		if (celular == celular2) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
		//O  resultado  será “Strings são  iguais”,  
		//pois  a  variável celular e celular2 compartilham
		//o mesmo endereço de memória.
		
		
		//Porém, se uma das duas variáveis for instanciada (new), 
		//o operador == não vai funcionar, pois elas compartilham espaços
		// espaços diferentes na memória. 
		//O exemplo abaixo resulta em “Strings diferentes”
		String cor = new String("Amarelo");
		String cor2 = "Amarelo";
		
		if (cor == cor2) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
	
		
		
		// É extremamente   recomendado   sempre   utilizar   os métodos   para   realizar   a   comparação   de   strings,   
		//pois   eles   funcionam independentemente da forma que 
		//a variável foi inicializada. São eles: 'Equals' e 'EqualsIgnoreCase'
		
		// Método equals:compara o conteúdo de duas strings, 
		//diferenciando os caracteres maiúsculos e minúsculos
		String pc = new String("Acer");
		String pc2 = "Acer";

		if (pc.equals(pc2)) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
		
		
		//Método  equalsIgnoreCase:compara  o  conteúdo  de  duas strings,
		//mas  não  diferencia  os  caracteres  maiúsculos  e  minúsculos. 
		//Assim sendo, a string “CaRRo” é igual à string “carro”.
		
		String carro = new String("CaRRo");
		String carro2 = new String("carro");
		if(carro.equalsIgnoreCase(carro2)) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
	
	}
	
}
