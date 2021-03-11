package AtividadeClasseObjeto;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNome("Eduardo Pires Martins");
		conta.setCpf("111.111.111-11");
		conta.setNumeroConta(123456);
		conta.setSaldo(2100);
		
		System.out.println("Conta: "+ conta.getNome());
		System.out.println("CPF: "+ conta.getCpf());
		System.out.println("Numero Conta: "+ conta.getNumeroConta());
		
		System.out.println();
		conta.sacar(2100);
		
		System.out.println();
		conta.depositar(10);

	}

}