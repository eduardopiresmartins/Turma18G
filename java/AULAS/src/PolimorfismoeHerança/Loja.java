package PolimorfismoeHerança;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Loja {
	
	/*
	 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> produto = new ArrayList();
		Scanner entradaDados = new Scanner(System.in);
		
		produto.add("Maca");
		produto.add("Pera");
		/*produto.add("Mesa");
		produto.add("Cadeira");
		produto.add("Telhado");
		produto.add("Cerveja");*/
		
		String manipulandoProduto = "";
		char opcao;
		
		System.out.println("Lista de nomes: "+ produto);
		System.out.println();
		
		for(int i = 0; i < produto.size(); i++) {
			System.out.print("Cadatro de produto: [S]/[N]");
			opcao = entradaDados.next().toUpperCase().charAt(0);
			entradaDados.nextLine();
			
			if(opcao != 'N') {
				System.out.print("Qual o nome do produto? ");
				manipulandoProduto = entradaDados.nextLine();
				produto.add(manipulandoProduto);
				
				System.out.println("Produto: "+ manipulandoProduto +" produto cadastrado com sucesso!");
			}
			
			if(!(produto.isEmpty())) {
				System.out.println("Lista de nomes: "+ produto);
				System.out.println();
				
				System.out.print("Deseja excluir algum produto: [S]/[N]");
				opcao = entradaDados.next().toUpperCase().charAt(0);
				
				entradaDados.nextLine();
				
				if(opcao != 'N') {
					System.out.print("Qual o nome do produto? ");
					manipulandoProduto = entradaDados.nextLine();
					produto.remove(manipulandoProduto);
					
					i--;
					
					System.out.println("Produto: "+ manipulandoProduto +" excluido com sucesso!");
					
					if(produto.size() == 0) {
						System.out.println("Voce deletou todos os itens de seu estoque");
						
						System.out.println();
						System.out.println("=============================");
						System.out.println("0 | Finalizar a seção");
						System.out.println("1 | Cadastrar um novo produto");
						System.out.print("==> ");
						opcao = entradaDados.next().toUpperCase().charAt(0);
						
						entradaDados.nextLine();
						
						if(opcao == '1') {
							System.out.print("Qual o nome do produto? ");
							manipulandoProduto = entradaDados.nextLine();
							produto.add(manipulandoProduto);
						}
					}
				}
				
			}
			
			System.out.println("Lista de nomes: "+ produto);
			System.out.println();
			
		}
	}

}