package AtividadeClasseObjeto;

public class Aviao {

	/*
	 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
	 */
	
	private String modelo;
	private String bandeira;
	private int qtdBancos;
	private boolean estado;
	private double alturaMaxima;
	private double alturaAtual;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private String destino;
	
	public Aviao() {
	}
	
	public Aviao(String modelo, String bandeira, int qtdBancos, boolean estado, double alturaMaxima, double alturaAtual, double velocidadeMaxima, double velocidadeAtual, String destino) {
		this.modelo = modelo;
		this.bandeira = bandeira;
		this.qtdBancos = qtdBancos;
		this.estado = estado;
		this.alturaMaxima = alturaMaxima;
		this.alturaAtual = alturaAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.destino = destino;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public int getQtdBancos() {
		return qtdBancos;
	}
	public void setQtdBancos(int qtdBancos) {
		this.qtdBancos = qtdBancos;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	public double getAlturaAtual() {
		return alturaAtual;
	}
	public void setAlturaAtual(double alturaAtual) {
		this.alturaAtual = alturaAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void statusAviao() {
		if(this.isEstado() != false) {
			System.out.printf("Torre, %s da(o) %s - acaba de decolar, com destino a %s. \n", this.getModelo(), this.getBandeira(), this.getDestino());
			System.out.println();
			
			System.out.printf("Esse avisao esta a %.2f pes de altura, mas ele chega a %.2f pes de altura maxima.\n", this.getAlturaAtual(), this.getAlturaMaxima());
			System.out.printf("Viaja a %.2f nos, mas nesse momento esta a %.2f nos de velocidade \n", this.getVelocidadeMaxima(), this.getVelocidadeAtual());
			System.out.printf("Tem capacidade de transportar ate %d pessoas a bordo\n", this.getQtdBancos());
			
			System.out.println();
			System.out.println("Fonte: https://pt.wikipedia.org/wiki/Airbus_A380#:~:text=O%20A380%20tem%20uma%20cabine,em%20uma%20%C3%BAnica%20classe%20econ%C3%B4mica.");
		
		}else {
			System.out.println("O aviao esta estacionado no hangar.");
		}
	}

}
}
