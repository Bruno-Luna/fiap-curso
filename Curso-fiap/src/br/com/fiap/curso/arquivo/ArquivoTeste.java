package br.com.fiap.curso.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTeste {

	public static void main(String[] args) {

		String nomeArquivo = "produtos.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeArquivo;
		
		
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade - Caixas; Valor");
		conteudo.add("Uva; 100; 19,99");
		conteudo.add("Laranja; 10; 9,99");
		conteudo.add("Batata; 20; 12,29");
		conteudo.add("Abacate; 12; 11,19");
		
		//gravarEstoque(nomeArquivo, caminho, conteudo);
		
		lerEstoque(caminho);
		
	}
	
	public static void gravarEstoque(String nomeArquivo, String caminho, List<String>conteudo) {
		
		FileWriter  stream;
		PrintWriter  print;
		
		try {
			//stream é uma conexão de escrita para o arquivo.
			stream = new FileWriter(caminho);
			//a classe PrintWriter escreverá no arquivo
			print = new PrintWriter(stream);
			
			for(String linha: conteudo) {
				print.println(linha);
			}
			//método para fechar o arquivo.
			print.close();
			stream.close();
			
			System.out.println("O arquivo " + nomeArquivo + " foi salvo em: " + caminho);
		}catch(IOException e){
		
			e.printStackTrace();
		}
		
	}
	
	private static void lerEstoque(String caminho) {
		
		try {
			//abre o arquivo
			FileReader stream = new FileReader(caminho);
			
			//BufferedReader possui o método readLine()
			//Lê uma linha do arquivo e retorna uma String com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);
			
			//Fará a leitura de cada linha do arquivo
			String linha = reader.readLine();
			
			while(linha != null) {
				
				//impressão no console de cada linha
				System.out.println(linha);
				
				//Lê a próxima linha do arquivo
				linha = reader.readLine();
			}
			
			//encerra a leitura
			reader.close();
			//fecha o arquivo
			stream.close();
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
	}

}
