package PolimorfismoeHerança;

public class Preguica extends Animal {
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom(String somAnimal) {
		return super.emiteSom(somAnimal);
	}
	
	public String subirArvore() {
		return "Up!";
	}

}