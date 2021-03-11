package HERANCA;


public class Coordenador extends Pessoa {
	private String cursoCoordendo;
	
	public Coordenador() {
	}
	
	public Coordenador(String nome, int matricula, String cursoCoordendo) {
		super(nome, matricula);
		this.cursoCoordendo = cursoCoordendo;
	}

	public String getCursoCoordendo() {
		return cursoCoordendo;
	}

	public void setCursoCoordendo(String cursoCoordendo) {
		this.cursoCoordendo = cursoCoordendo;
	}
	
}