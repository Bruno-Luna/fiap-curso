package br.com.fiap.curso.arrays;

public class ArrayTipoPrimitivo2 {

	public static void main(String[] args) {
		
		char[] letra = {'a', 'b', 'c'};
		boolean[] pergunta= {true, false, false, true};
		int notas[] = new int[] {11, 12, 13};
		//Arrays com os valores pr�-determinados.
		System.out.println(pergunta[2]);
		System.out.println(letra[1]);
		System.out.println(notas[0]);
		
		for(int i = 0; i < letra[i]; i++) {
			System.out.println(letra[i]);
		} //ir� varrer e imprimir todas as posi��es do array
	}
}
