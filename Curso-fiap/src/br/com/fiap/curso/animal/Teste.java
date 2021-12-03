package br.com.fiap.curso.animal;

public class Teste {

	public static void main(String[] args) {

		Animal animal = new Animal();
		
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomocao("Todos se locomovem");
		
		System.out.println(animal.getLocomocao());
		System.out.println(animal.getAlimenta());
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setLatido("AU AU");
		System.out.println(cachorro.getLatido());
		cachorro.setAlimenta("Ração");
		System.out.println(cachorro.getAlimenta());
		
		Passaro passaro = new Passaro();
		passaro.setLocomocao("Voa");
		System.out.println(passaro.getLocomocao());
		passaro.setPia("PI PI");
		System.out.println(passaro.getPia());
		
		Gato gato = new Gato();
		gato.setMiado("Miau");
		System.out.println(gato.getMiado());
		
		Cigarra cigarra = new Cigarra();
		cigarra.setZumbido("Zhiiiii");
		System.out.println(cigarra.getZumbido());
		
	}

}
