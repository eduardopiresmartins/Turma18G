package AtividadeClasseObjeto;

public class Funcionario {

	
	/*
	 * 4) Crie uma classe funcionário e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto funcionário, defina as
		instancias deste objeto e apresente as informações deste objeto no
		console.
	 */
	
	private String nome;
	private String cargo;
	private double salario;
	private boolean registrado;
	private boolean valeTransporte;
	private boolean valeRefeicao;
	private boolean valeAlimentacao;
	private boolean trabalhar;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String cargo, double salario, boolean registrado, boolean valeTransporte, boolean valeRefeicao, boolean valeAlimentacao, boolean trabalhar) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.registrado = registrado;
		this.valeTransporte = valeTransporte;
		this.valeRefeicao = valeRefeicao;
		this.valeAlimentacao = valeAlimentacao;
		this.trabalhar = trabalhar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isRegistrado() {
		return registrado;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}

	public boolean isValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(boolean valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public boolean isValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(boolean valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}

	public boolean isValeAlimentacao() {
		return valeAlimentacao;
	}

	public void setValeAlimentacao(boolean valeAlimentacao) {
		this.valeAlimentacao = valeAlimentacao;
	}
	
	public boolean isTrabalhar() {
		return this.trabalhar;
	}
	
	public void setTrabalhar(boolean trabalhar) {
		this.trabalhar = trabalhar;
	}
	
	public String ponto() {
		String ponto;
		
		ponto = "Nenhum ponto registrado";
		
		if(this.isTrabalhar() != false) {
			ponto = "Ponto registrado";
		}
		
		return ponto;
	}
	
	public double salarioLiquido() {
		double salario = 0.0;
		
		if(this.isRegistrado() != false) {
			if(this.getSalario() <= 1100.00) {
				salario = this.getSalario() * 0.075;
				
			}else if(this.getSalario() > 1100.00 && this.getSalario() <= 2203.48) {
				salario = this.getSalario() * 0.09;
				
			}else if(this.getSalario() > 2203.48 && this.getSalario() <= 3305.22) {
				salario = this.getSalario() * 0.12;
				
			}else if(this.getSalario() > 3305.22 && this.getSalario() <= 6433.57) {
				salario = this.getSalario() * 0.14;
				
			}else if(this.getSalario() > 6433.57) {
				salario = this.getSalario() - 751.99;
			}
		}else {
			salario = this.getSalario();
			
		}
		
		return salario;
		
	}
	
	public void beneficios() {
		if(this.isValeTransporte() != false) {
			System.out.println("Vale transporte");
		}
		
		if(this.isValeAlimentacao() != false) {
			System.out.println("Vale alimentacao");
		}
		
		if(this.isValeRefeicao() != false) {
			System.out.println("Vale refeicao");
		}
	}
	
	public void clt() {
		if(this.isRegistrado() != false) {
			System.out.println("Voce e registrado com carteira assinada!");
			
		}else {
			System.out.println("Voce nao e registrado!");
		}
	}

}