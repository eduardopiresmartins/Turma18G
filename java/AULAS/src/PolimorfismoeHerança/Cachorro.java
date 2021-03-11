package PolimorfismoeHerança;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom(String somAnimal) {
		return super.emiteSom(somAnimal);
	}

	public String correr() {
		return "Lion";
	}

}