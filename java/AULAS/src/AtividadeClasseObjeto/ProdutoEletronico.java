package AtividadeClasseObjeto;

public class ProdutoEletronico {
	
	
	/*
	 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto produto eletrônico,
		defina as instancias deste objeto e apresente as informações deste objeto
		no console.
	 */
	
	private String nome;
	private String modelo;
	private String fabricante;
	private int anoFabricacao;
	private boolean ligado;
	private int nivelBateria;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getNivelBateria() {
		return nivelBateria;
	}
	
	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	
	public void ligar() {
		if(this.isLigado() != false) {
			System.out.printf("Ola humano, eu sou o %s modelo %s fabricado por %s, o que voce ira me ensinar hoje? \n", this.getNome(), this.getModelo(), this.getFabricante());
			
			if(this.getAnoFabricacao() <= 2021) {
				System.out.printf("Eu nasci no ano %d, sou um bebe robo!! \n", this.getAnoFabricacao());
				
			}else if(this.getAnoFabricacao() > 2021 && this.getAnoFabricacao() <= 2017) {
				System.out.printf("Eu nasci no ano %d, sou uma crianca robo!! \n", this.getAnoFabricacao());
				
			}else if(this.getAnoFabricacao() > 2017 && this.getAnoFabricacao() <= 2012) {
				System.out.printf("Eu nasci no ano %d, sou um adolescente robo!! \n", this.getAnoFabricacao());
				
			}else if(this.getAnoFabricacao() >= 2011) {
				System.out.printf("Eu nasci no ano %d, sou um adulto robo!! \n", this.getAnoFabricacao());
				
			}
			
			if(this.getNivelBateria() < 20) {
				System.out.println("Ei humano, atencao bateria a "+ this.getNivelBateria() +"%");
				
			}else {
				System.out.println("Bateria: "+ this.getNivelBateria() +"%");
				
			}
			
		}else {
			System.out.printf("Seu robo %s esta desligado \n", this.getNome());
			
		}
	}

}