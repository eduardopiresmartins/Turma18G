package AtividadeClasseObjeto;

public class Patinete {

		
		/*
		 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes
			esta classe, em seguida crie um objeto patinete, defina as instancias deste
			objeto e apresente as informações deste objeto no console.
		 */
		
		private int qtdRodas;
		private String cor;
		private String tipoRodas;
		
		public Patinete() {
		}
		
		public Patinete(int qtdRodas, String cor, String tipoRodas) {
			this.qtdRodas = qtdRodas;
			this.cor = cor;
			this.tipoRodas = tipoRodas;
		}

		public int getQtdRodas() {
			return qtdRodas;
		}

		public void setQtdRodas(int qtdRodas) {
			this.qtdRodas = qtdRodas;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getTipoRodas() {
			return tipoRodas;
		}

		public void setTipoRodas(String tipoRodas) {
			this.tipoRodas = tipoRodas;
		}
		
		public String andar(boolean andando) {
			String noPe = "";
			
			if(andando != false) {
				noPe = "Panitene em movimento, zummm";
				
			}else {
				noPe = "Viu so, eu falei que ele nao iria brincar com esse patinete!! -_-";
			}
			
			return noPe;
			
		}

	}