package br.com.fiap.curso;

public class Operadores {

	public static void main(String[] args) {

		int num_1 = 10;
		int num_2 = 10;

		int soma = num_1 + num_2;
		int subtracao = num_1 - num_2;
		int multiplicacao = num_1 * num_2;
		int divisao  = num_1 / num_2;
		int mod = num_1 % num_2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.println("Divis�o: " + divisao);
		System.out.println("Resto da divis�o: " + mod);
		
		System.out.println(num_1 != num_2);
		System.out.println(soma < multiplicacao);
		System.out.println(mod > subtracao);


		
		//incremento e decremento:
		
			num_1++;
			System.out.println("Incremento: " + num_1);
			
			num_2--;
			System.out.println("Decremento: " + num_2);
			
			System.out.println(num_1 != num_2);
			
		
	}

}
