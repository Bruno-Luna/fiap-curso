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
		//O  resultado  ser� �Strings s�o  iguais�,  
		//pois  a  vari�vel celular e celular2 compartilham
		//o mesmo endere�o de mem�ria.
		
		
		//Por�m, se uma das duas vari�veis for instanciada (new), 
		//o operador == n�o vai funcionar, pois elas compartilham espa�os
		// espa�os diferentes na mem�ria. 
		//O exemplo abaixo resulta em �Strings diferentes�
		String cor = new String("Amarelo");
		String cor2 = "Amarelo";
		
		if (cor == cor2) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
	
		
		
		// � extremamente   recomendado   sempre   utilizar   os m�todos   para   realizar   a   compara��o   de   strings,   
		//pois   eles   funcionam independentemente da forma que 
		//a vari�vel foi inicializada. S�o eles: 'Equals' e 'EqualsIgnoreCase'
		
		// M�todo equals:compara o conte�do de duas strings, 
		//diferenciando os caracteres mai�sculos e min�sculos
		String pc = new String("Acer");
		String pc2 = "Acer";

		if (pc.equals(pc2)) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
		
		
		//M�todo  equalsIgnoreCase:compara  o  conte�do  de  duas strings,
		//mas  n�o  diferencia  os  caracteres  mai�sculos  e  min�sculos. 
		//Assim sendo, a string �CaRRo� � igual � string �carro�.
		
		String carro = new String("CaRRo");
		String carro2 = new String("carro");
		if(carro.equalsIgnoreCase(carro2)) {
			System.out.println("Strings iguais");
		}else {
			System.out.println("Strings diferentes");
		}
	
	}
	
}
