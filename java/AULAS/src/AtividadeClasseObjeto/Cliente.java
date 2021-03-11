package AtividadeClasseObjeto;

public class Cliente {

	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private String pedido;
	private int mesasReservadas;
	private int tipoPagamento;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String pedido, int mesasReservadas, int tipoPagamento) {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPedido() {
		return pedido;
	}
	
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	public int getMesasReservadas() {
		return mesasReservadas;
	}
	
	public void setMesasReservadas(int mesasReservadas) {
		this.mesasReservadas = mesasReservadas;
	}
	
	public int getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	public void pagarConta(int opcao) {
		switch(opcao) {
			case 1:
				System.out.println("Pagamento via Debito");
				System.out.println("Transacao finalizada com sucesso, volte sempre!!");
			break;
			
			case 2:
				System.out.println("Pagamento via Credito");
				System.out.println("Transacao finalizada com sucesso, volte sempre!!");
			break;
			
			case 3:
				System.out.println("Pagamento via Pix");
				System.out.println("Transacao finalizada com sucesso, volte sempre!!");
			break;
			
			case 4:
				System.out.println("Pagamento via Dinheiro");
				System.out.println("Transacao finalizada com sucesso, volte sempre!!");
			break;
		}
	}
	
	public void reserva() {
		if(this.getMesasReservadas() > 0) {
			System.out.printf("Ola, %s consta em nosso sistema que voce realizou um agendamento de mesas. Me acompanhei, por favor!\n", this.getNome());
		}else {
			System.out.printf("Ola, %s nao consta agendamento conosco mas nao se preocupe, me acompanhe que irei procurar uma mesa para voce se acomodar!\n", this.getNome());
		}
		System.out.println();
	}
	

}