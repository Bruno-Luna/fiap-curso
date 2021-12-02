package br.com.fiap.curso.aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String nome = aluno.nome = "Bruno";
		
		System.out.println("\t:: Notas ::\n");

		aluno.inserirNota1(9.8);
		System.out.println("1° Nota: " + aluno.nota1);
		
		aluno.inserirNota2(7.8);
		System.out.println("2° Nota: " + aluno.nota2);
		
		aluno.inserirNota3(9.9);
		System.out.println("3° Nota: " + aluno.nota3);
		
		aluno.inserirNota4(7.9);
		System.out.println("4° Nota: " + aluno.nota4);

		System.out.println("\nMedia final: " + aluno.verificarMediaFinal());
		
		if(aluno.verificarMediaFinal() >= 8) {
			System.out.println("Parabéns, " + nome + "!");
		}else if(aluno.verificarMediaFinal() >= 5 || aluno.verificarMediaFinal() < 8) {
			System.out.println("Satisfatória, " + nome + "!");
		}else {
			System.out.println("Em recuperação, " + nome + "!");
		}


	}
}
