package AtividadeClasseObjeto;

public class TesteProdutoEletronico {

	public static void main(String[] args) {

		
		
		ProdutoEletronico robo = new ProdutoEletronico();
		
		robo.setNome("Cyber");
		robo.setModelo("Cyber1");
		robo.setFabricante("Help Connect");
		robo.setAnoFabricacao(2021);
		robo.setLigado(true);
		robo.setNivelBateria(15);
		
		robo.ligar();

	}

}