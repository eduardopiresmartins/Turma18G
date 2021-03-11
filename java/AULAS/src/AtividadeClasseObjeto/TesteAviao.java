package AtividadeClasseObjeto;

public class TesteAviao {

		
	
		public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.setModelo("Airbus a380");
		aviao.setBandeira("GOL Linhas Aereas");
		aviao.setQtdBancos(853);
		aviao.setEstado(true);
		aviao.setAlturaMaxima(15700);
		aviao.setAlturaAtual(1000);
		aviao.setVelocidadeMaxima(970);
		aviao.setVelocidadeAtual(350);
		aviao.setDestino("Portugal");
		
		aviao.statusAviao();

	}

}
