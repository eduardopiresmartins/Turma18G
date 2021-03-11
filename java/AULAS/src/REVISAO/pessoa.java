package REVISAO;

public class pessoa {

	//classe : pessoa
	//atributos: segurança
	//construtores: como abre a classe, criar, pedreiro
		//sobrecarga
	// encapsulamento -getters and setters - segurança 
	// métodos
	
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char genero;
	
	
	//construtor
	public pessoa(String nome) {
		super ();
		this.nome = nome;
	}
	//construtor 


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
