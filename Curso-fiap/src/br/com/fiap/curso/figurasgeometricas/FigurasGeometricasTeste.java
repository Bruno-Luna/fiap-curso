package br.com.fiap.curso.figurasgeometricas;

public class FigurasGeometricasTeste {

	public static void main(String[] args) {
		
		
		FigurasGeometricas triangulo = new FigurasGeometricas();
		FigurasGeometricas quadrado = new FigurasGeometricas();
		FigurasGeometricas retangulo = new FigurasGeometricas();
		
		System.out.println("\t:: Calculadora de Figuras geomÈtricas ::\n");
		
		triangulo.inserirBaseTriangulo(44);
		triangulo.inserirAlturaTriangulo(55);
		
		System.out.print("¡rea do triangulo: ");
		System.out.printf("%.2f", triangulo.calcAreaTriangulo());
		
		quadrado.inserirLadoQuadrado(4);
		
		System.out.print("\n\n¡rea do quadrado: ");
		System.out.printf("%.2f", quadrado.calcAreaQuadrado());
		
		retangulo.inserirBaseRetangulo(8);
		retangulo.inserirAlturaRetangulo(3);
		
		System.out.print("\n\n¡rea do ret‚ngulo: ");
		System.out.printf("%.2f", retangulo.calcAreaRetangulo());
		
	}
}
