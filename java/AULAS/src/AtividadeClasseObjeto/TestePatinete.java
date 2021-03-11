package AtividadeClasseObjeto;

public class TestePatinete {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Patinete patinete = new Patinete();
	
	patinete.setQtdRodas(2);
	patinete.setCor("Verde");
	patinete.setTipoRodas("Gel");
	
	System.out.println("Cor: "+ patinete.getCor());
	System.out.println("Quantidade de rodas: "+ patinete.getQtdRodas());
	System.out.println("Tipo de rodas: "+ patinete.getTipoRodas());
	
	System.out.println();
	System.out.println(patinete.andar(true));

	}

}	