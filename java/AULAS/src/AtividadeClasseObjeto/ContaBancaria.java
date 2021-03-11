package AtividadeClasseObjeto;

public class ContaBancaria {

	
	/*
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto conta bancaria, defina
		as instancias deste objeto e apresente as informações deste objeto no
		console.
	 */
	
	private int numeroConta;
	private String nome;
	private String cpf;
	private double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numeroConta, String nome, String cpf, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double saque) {
		System.out.println("SISTEMA SAQUE");
		
		if(saque > this.getSaldo()) {
			System.out.printf("O valor R$ %.2f que voce deseja sacar ultrapassa seu saldo atual R$ %.2f \n", saque, this.getSaldo());
			System.out.println("TRANSACAO BLOQUEADA!!");
			
		}else {
			this.setSaldo(this.getSaldo() - saque);
			
			System.out.println("Transacao realizada com sucesso!!");
			System.out.println("=================================");
			System.out.printf("Saque R$ %.2f \n", saque);
			System.out.printf("Saldo atual R$ %.2f \n", this.getSaldo());
			
		}
	}
	
	public void depositar(double deposito) {
		System.out.println("SISTEMA DEPOSITO");
		
		if(deposito > 0) {
			this.setSaldo(this.getSaldo() + deposito);
			
			System.out.println("Transacao realizada com sucesso!!");
			System.out.println("=================================");
			System.out.printf("Deposito R$ %.2f \n", deposito);
			System.out.printf("Saldo atual R$ %.2f \n", this.getSaldo());
			
		}else {
			System.out.println("Valor depositado R$ %.2f invalido!");
			System.out.println("TRANSACAO BLOQUEADA!!");
			
		}
	}
	
}
}
