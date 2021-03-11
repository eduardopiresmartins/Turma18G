package PolimorfismoeHerança;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emiteSom(String somAnimal) {
		// TODO Auto-generated method stub
		return super.emiteSom(somAnimal);
	}

	public String correr() {
		return "Spirit";
	}
	
}