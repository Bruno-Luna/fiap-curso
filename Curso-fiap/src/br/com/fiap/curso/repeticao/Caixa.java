package br.com.fiap.curso.repeticao;

public class Caixa {
	
	public static void main(String[] args) {
		
		int qtProduto = 5, registro = 0;
		
//		while(registro < qtProduto) {
//			registro++;
//			System.out.println("Produto:  " + registro + " registrado." );
//		}
		
		
//		do {
//			registro++;
//			System.out.println("Produto:  " + registro + " registrado." );
//		}while(registro < qtProduto);
		
		
		for(int i = 1; i <= qtProduto; i++) {
			System.out.println("Produto:  " + i + " registrado." );

		}
	}

}
