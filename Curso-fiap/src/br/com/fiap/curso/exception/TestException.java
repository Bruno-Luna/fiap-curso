package br.com.fiap.curso.exception;

public class TestException {

	public static void main(String[] args) {

		try {
			int valor = 10 / 0; 
			//divis�o por zero.
			
//			int[] valores = new int[3];
//			System.out.println(valores[4]);
//			//acessar um indice que n�o existe
//			
//			int numero = Integer.parseInt("zero");
//			//convers�o da palavra para um n�mero
//			
//			String nome = null;
//			System.out.println(nome.length());
//			//verificar a quantidade de algo null
			
		}catch (ArithmeticException e) {
			
			System.out.println("N�o � poss�vel divis�o por zero.");
			
			//Mensagem com a lista de erros
			System.out.println(e.getMessage());
			
			//imprime a pilha de erro da exce��o.
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("N�o � possivel acessar a posi��o requerida.");		

		} catch(NullPointerException e) {

			System.out.println("N�o foi possivel retornar o length, vari�vel consta como 'null'");

		} catch(NumberFormatException e) {
			
			System.out.println("N�o foi poss�vel realizar a convers�o.");
	
		} catch(Exception e) { //Exception � o mais generico, caso nenhum dos 'catch' capturar os erros,
							  // o Exception ser� informada.
			
			System.out.println("Erro na execu��o do programa.");
		}
		finally { //sempre ser� lan�ada, independente se o 'catch' for retornado
			System.out.println("Foi encontrado(s) erro(s).");
		}
	}

}
