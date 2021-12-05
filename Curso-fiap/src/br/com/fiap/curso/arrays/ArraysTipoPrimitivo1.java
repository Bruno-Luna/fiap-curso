package br.com.fiap.curso.arrays;

public class ArraysTipoPrimitivo1 {

	public static void main(String[] args) {

		byte num[] = new byte[2];
		//ambas as formas estão corretas ao declarar um array
		float[] numero = new float[3];
			
		numero[0] = 11;
		numero[1] = 22;
		numero[2] = 33;
		System.out.println(numero[2]);
		
		num[0] = 7;
		num[1] = 14;
		System.out.println(num[1]);

	}

}
