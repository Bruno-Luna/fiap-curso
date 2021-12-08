package br.com.fiap.curso.exception;

public class TestException {

	public static void main(String[] args) {

		try {
			int valor = 10 / 0; 
			//divisão por zero.
			
//			int[] valores = new int[3];
//			System.out.println(valores[4]);
//			//acessar um indice que não existe
//			
//			int numero = Integer.parseInt("zero");
//			//conversão da palavra para um número
//			
//			String nome = null;
//			System.out.println(nome.length());
//			//verificar a quantidade de algo null
			
		}catch (ArithmeticException e) {
			
			System.out.println("Não é possível divisão por zero.");
			
			//Mensagem com a lista de erros
			System.out.println(e.getMessage());
			
			//imprime a pilha de erro da exceção.
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Não é possivel acessar a posição requerida.");		

		} catch(NullPointerException e) {

			System.out.println("Não foi possivel retornar o length, variável consta como 'null'");

		} catch(NumberFormatException e) {
			
			System.out.println("Não foi possível realizar a conversão.");
	
		} catch(Exception e) { //Exception é o mais generico, caso nenhum dos 'catch' capturar os erros,
							  // o Exception será informada.
			
			System.out.println("Erro na execução do programa.");
		}
		finally { //sempre será lançada, independente se o 'catch' for retornado
			System.out.println("Foi encontrado(s) erro(s).");
		}
	}

}
