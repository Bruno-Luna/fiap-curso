package br.com.fiap.curso.exception;

public class ExceptionTeste {

	
	public static void main(String[] args) throws DivisaoPorZeroException{
		
		try { //trecho onde a exceção porde ocorrer
			int num = 10 / 0;
			System.out.println(num);
			
		} catch (Exception e) { //captura da exceção 
			
			//tratamento da exceção.
			System.out.println("Não é possível divisão po zero.");
			e.printStackTrace();
		}
	}
}
