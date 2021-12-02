package br.com.fiap.curso.figurasgeometricas;

public class FigurasGeometricas {

	// Triangulo, Retângulo e Quadrado 
	double base;
	double lado;
	double altura;
	double areaT;
	double areaQ;
	double areaR;
	
	public FigurasGeometricas() {}
	
	public FigurasGeometricas(double base, double lado, double altura, double areaT, double areaQ, double areaR) {
		this.base = base;
		this.lado = lado;
		this.altura = altura;
		this.areaT = areaT;
		this.areaQ = areaQ;
		this.areaR = areaR;

	}
	
	
	public void inserirBaseTriangulo(double numero) {
		base = base + numero; 
	}
	
	public void inserirAlturaTriangulo(double numero) {
		altura = altura + numero; 
	}
	
	public double calcAreaTriangulo() {
		return areaT = (base * altura) / 2;
	}

	public void inserirLadoQuadrado(double num) {
		lado = lado + num;
	}
	
	public double calcAreaQuadrado() {
		return areaQ = lado * lado;
	}
	
	public void inserirBaseRetangulo(double number) {
		base = base + number;
	}
	
	public void inserirAlturaRetangulo(double number) {
		altura = altura + number;
	}
	
	public double calcAreaRetangulo() {
		return areaR = base * altura;
	}
}
