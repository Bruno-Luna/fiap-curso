package br.com.fiap.curso.aluno;

public class Aluno {

	int registro;
	String nome;

	double nota1, nota2, nota3, nota4, notaFinal;
	
	public Aluno() {} 
	//Construtor padrão(vazio). Evitará erros ao chamar os atributos. Ao instânciar uma classe
	// precisamos acrescentá-lo
	
	//Construtor de Classe que vai receber parametros e instruções.
	public Aluno(int registro, String nome, double nota1, double nota2, double nota3, double nota4, double notaFinal) {
		this.registro = registro;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.notaFinal = notaFinal;
	}

	
	public void inserirNota1(double valor) {
		nota1 = nota1 + valor;
	}
	
	public void inserirNota2(double valor) {
		nota2 = nota2 + valor;
	}
	
	public void inserirNota3(double valor) {
		nota3 = nota3 + valor;
	}
	
	public void inserirNota4(double valor) {
		nota4 = nota4 + valor;
	}
	
	public double verificarMediaFinal() {
		return notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
}
