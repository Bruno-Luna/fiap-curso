package br.com.fiap.curso;

public class Condicionais {

	public static void main(String[] args) {

		int x = 22;
		
		if(x < 20) {
			System.out.println("Menor que vinte.");
		}else if(x > 20 && x < 25){
			System.out.println("OK");
		}else {
			System.out.println("Número descartado");
		}
	}

}
