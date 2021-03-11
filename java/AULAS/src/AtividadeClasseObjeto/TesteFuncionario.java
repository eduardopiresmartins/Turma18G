package AtividadeClasseObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {


Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Kevin Alec Neri Lazzarotto");
		funcionario.setCargo("Programador Java junior");
		funcionario.setSalario(2100);
		funcionario.setRegistrado(true);
		funcionario.setValeTransporte(true);
		funcionario.setValeRefeicao(true);
		funcionario.setValeAlimentacao(true);
		funcionario.setTrabalhar(true);
		
		System.out.printf("Ola, %s \n", funcionario.getNome());
		System.out.printf("Seu cargo e %s \n", funcionario.getCargo());
		System.out.printf("Salario bruto R$ %.2f \n", funcionario.getSalario());
		
		System.out.println();
		System.out.println("Beneficius");
		funcionario.beneficios();
		
		System.out.println();
		
		funcionario.clt();
		
		System.out.println();
		
		System.out.println(funcionario.ponto());
		
		funcionario.setSalario(funcionario.getSalario() - funcionario.salarioLiquido());
		System.out.println("Salario liquido R$"+ funcionario.getSalario());

	}

}