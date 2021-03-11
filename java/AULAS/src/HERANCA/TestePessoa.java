package HERANCA;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa eduardo = new Pessoa("Eduardo", 13578);
		Funcionario brenda = new Funcionario("Brenda", 13579, "Advogada");
		Pessoa lais = new Funcionario("Laís", 13254, "Esteticista");
		Pessoa reila = new Coordenador("Reila", 6786094, "Nutricionista");
		Funcionario barbara = new Funcionario("Barbara", 13658,"Professora");
		
		System.out.println("Nome: "+ eduardo.getNome());
		System.out.println("Matricula: "+ eduardo.getMatricula());
		
		System.out.println("Nome: "+ brenda.getNome());
		System.out.println("Matricula: "+ brenda.getMatricula());
		System.out.println("Departamento: "+ brenda.getDepartamento());
		
		System.out.println("Nome: "+ lais.getNome());
		System.out.println("Matricula: "+ lais.getMatricula());
		
		System.out.println("Nome: "+ reila.getNome());
		System.out.println("Matricula: "+ reila.getMatricula());
		
		System.out.println("Nome: "+ barbara.getNome());
		System.out.println("Matricula: "+ barbara.getMatricula());
		System.out.println("Departamento: "+ barbara.getDepartamento());
	}

}