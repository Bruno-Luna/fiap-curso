package br.com.fiap.curso.exception;

public class ExceptionTeste {

	
	public static void main(String[] args) throws DivisaoPorZeroException{
		
		try { //trecho onde a exce��o porde ocorrer
			int num = 10 / 0;
			System.out.println(num);
			
		} catch (Exception e) { //captura da exce��o 
			
			//tratamento da exce��o.
			System.out.println("N�o � poss�vel divis�o po zero.");
			e.printStackTrace();
		}
	}
}
